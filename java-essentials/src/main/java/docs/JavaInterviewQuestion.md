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
name  ───────────────▶    "Durgesh"
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