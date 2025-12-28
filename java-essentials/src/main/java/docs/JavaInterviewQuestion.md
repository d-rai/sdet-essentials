<p align="center">
  <b>Java Interview Question</b>
</p>

---

### 1. What is the difference between JDK, JRE, and JVM?

```
JDK (Java Development Kit) -> contains tools for developing Java applications
JRE (Java Runtime Environment) -> provides environment to execute Java programs
JVM (Java Virtual Machine) -> executes bytecode and provides platform independence
```

### 2. Why main method must be static?

```
Because JVM does not create an object of the class.
It needs a static entry point to start execution.
```

### 3. Difference between Primitive and Reference Types?

```
Primitive types store actual values, while reference types store addresses of objects.
```

### 4. Difference between Stack vs Heap?

```
Stack stores method calls, local variables, and object references,
while heap stores the actual objects.
```

### 5. Where is String Stored?

```
The reference is stored in stack, and the String object is stored in heap (String pool).

int count = 10;
String name = "Durgesh";

Stack                      Heap
-----                      -----
name  --------------->    "Durgesh"
count = 10

```

### 6. Why Java is Memory-Safe?

```
Java is memory-safe because it prevents direct memory access and manages memory automatically.
```

### 7. Is Java pass-by-value or pass-by-reference?

```
Java is strictly pass-by-value. It does NOT support pass-by-reference.
```

### 8. Why static method cannot access non-static variables?

```
Because static methods belong to the class and do not have access to instance-specific data without an object.
```

### 9. What final really means?

```
final means cannot be changed after assignment.

final int x = 10;
x = 20; //  compile error

final List<String> list = new ArrayList<>();
list.add("A");     // allowed
list = new ArrayList<>(); // not allowed
```

### 10. Can we modify final object?

```
Yes, if the object is mutable. Final only prevents reassignment. (final protects the reference, not the object.)
final List<String> names = new ArrayList<>();
names.add("Durgesh");   // allowed
names.add("Amit");     //  allowed

names = new ArrayList<>(); // not-allowed(Reference reassignment is blocked by final) compile-time error


Stack                     Heap
-----                     -----
names -------------->    ArrayList object
                                  |
                           elementData (Object[])
                                |
                                |-- [0] -----> "Durgesh"
                                |-- [1] -----> "Amit"


```