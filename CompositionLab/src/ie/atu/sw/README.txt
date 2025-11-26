1). Aggregations contains the "has a" rule so sharing is okay here. Composition is the exlusive ownership or the "part of" rule.
For aggregation, the "part" object is usually created outside the "whole" project and passed into it via a constructor parameter.
The Composition "part" object is usually created inside the "whole" object's constructor, linking their lifecycles tightly.

2). You would choose composition over inheritance if a class has functionality provided by another class.
This would be the case here as inheritance would be chosen when a subclass is a specialized type of its superclass.

3). Encapsulation strengthens composition relationships by enforcing the strong ownership and dependency that defines composition. 
It does this by controlling access to the contained object.

4). The advantages of testing using composition woulf be that it would directly lead to loosely coupled code, which would then make classes
easier to isolate, test and maintain. 
 