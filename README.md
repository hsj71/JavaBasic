# JavaBasic
```
An object is a software bundle of related state and behavior.
A class is the blueprint from which individual objects are created.
Object-oriented programming allows classes to inherit commonly used state and behavior from other classes.
Interface is a group of related methods with empty bodies
A package is a namespace that organizes a set of related classes and interfaces.
packages as being similar to different folders on your computer.
```

### When to Use Nested Classes, Local Classes, Anonymous Classes, and Lambda Expressions
```
1. Local class: Use it if you need to create more than one instance of a class, access its constructor, or introduce a new, named type (because, for example, you need to invoke additional methods later).

2. Anonymous class: Use it if you need to declare fields or additional methods.

3. Lambda expression:
Use it if you are encapsulating a single unit of behavior that you want to pass to other code. For example, you would use a lambda expression if you want a certain action performed on each element of a collection, when a process is completed, or when a process encounters an error.
Use it if you need a simple instance of a functional interface and none of the preceding criteria apply (for example, you do not need a constructor, a named type, fields, or additional methods).

4. Nested class: Use it if your requirements are similar to those of a local class, you want to make the type more widely available, and you don't require access to local variables or method parameters.

5. Use a non-static nested class (or inner class) if you require access to an enclosing instance's non-public fields and methods. Use a static nested class if you don't require this access.
```


