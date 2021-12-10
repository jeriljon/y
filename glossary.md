## Refresher Glossary: 

+ Lambda: A short block of code that takes in parameters and returns a value. They are similar to methods, but 
they do not need a name. Lambda expression can be implemented right in the body of a method.
    - parameter -> expression
    - https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
    - Class name :: Method name
+ Functional interface: Interface that contains only one abstract unimplemented method. 
A functional interface can contain default and static methods, which do have an implementation, in addition
  to the single unimplemented method.

+ Optional: A container object in Java which may or may not contain a null value. If a value is present, 
isPresent() will return true, and get() will return the value. https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html
  
+ Consumer: An Operation in Java that accepts a single input argument and returns no result. This is a
functional interface. Consumer is expected to operate via side-effects, unlike most other functional interfaces.
https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
  
+ Predicate: A functional interface which accepts an argument and returns a boolean.
https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
  
+ Double Colon (::) Operator: Also known as method reference operator, is used to call a method by referring to it 
with the help of its class directly. They behave exactly as lambda expressions. The only difference it has from lambda expression is that this uses direct
  reference to the method by name instead of providing a delegate to the method.

