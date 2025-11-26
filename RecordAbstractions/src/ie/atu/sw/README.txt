1). Java Records demonstrate the principle of abstraction by hiding complex implementation details from the user. 
    They allow you to define a data-carrying class in a single, concise line of code, abstracting away the boilerplate you would normally have to write.

2). The boilerplate code that Records eliminate would be Canonical constructors, Accessor methods to retrieve the value of each field. Instead of writing getName() and getAge(), a record automatically provides name() and age().
    and Standard Object Methods such as the implementations of the equals(), hashCode(), and toString() methods.

3). Records are designed as immutable data carriers because their fields are final, preventing state changes. 
    This immutability relates to abstraction by enforcing a clear separation between a record's external, declared state and its internal, unchangeable representation.
    
4). You would choose a record over a class when the primary purpose of the object is to act as a simple, immutable data carrier. 
    An example would be a Data Transfer Object (DTO's).