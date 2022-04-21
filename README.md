# SapiensAcademyFinalProject
5 small real world examples of OOp design patterns

Design Patterns represent the best practices used by experienced object-oriented
software developers. Design patterns are solutions to general problems that
software developers faced during software development. These solutions were
obtained by trial and error by numerous software developers over quite a substantial
period.

It’s important to understand that design patterns were never meant to be hacked
together shortcuts to be applied in a haphazard, “one-size-fits-all” manner to your
code. There is ultimately no substitute for genuine problem-solving ability in software
engineering

## Singleton

Singleton is a creational design pattern that allows us to ensure that a class has a
single instance, while providing a global access point to that instance.
Generally, the Singleton design pattern is not so used that much due to many issues
that are caused by using them in your code such as refactoring issues, inversion of
control issues, etc. All in all, the action of modifying already written and functioning
code is a problem since it can cause many issues that were not introduced originally.
These days we have many more effective ways of working around needing a single
instance restriction, such as dependency injection, that we don’t need the use of a
Singleton.

## Observer

Observer is a behavioral design pattern that allows you to define a subscription
mechanism to notify multiple objects of any event that happens to the object they
are observing.

This design is used when there is one-to-many relationship between objects such as
if one object is modified, its dependent objects are notified automatically.
Encapsulating the core components in what we call a Subject, and the variable
components in an Observer, we can also see this as the “View” part of a MVC
(Model-View-Controller).

## Composite

Composite is a structural design pattern that allows you to compose objects into tree
structures and work with those structures as if they were individual objects.

This simplifies the treatment of the created objects, since they all have a common
interface, they are all treated the same way. A clear example of the extended use of
this pattern occurs in 2D programming environments for graphical applications. A
video game can contain different “layers” of sprites and it is possible to invoke a
method that acts on all this layer of sprites at the same time.


## Simple Factory

A Simple Factory Pattern is one that returns an instance of one of several possible
classes, depending on the data provided to it. This implies that the classes it returns
have same parent class and methods, but each of them performs tasks differently
for different kind of data.

![Alt text](relative/path/to/img.jpg?raw=true "Title")

In the above image, you can see to subclasses ChildClass1 and ChildClass2, both
have the same parent ParentClass. This means that Factory can return any of the
child classes instance. Both subclasses can have very different implementations
depending on the requirements. The method in the Factory class decides which
class needs to return.


## Factory Method

The factory design pattern is commonly used where we need to create a loosely
coupled system. It’s used to create an instance and reuse it.

It allows us to create objects by specifying their common interface at run time without
imposing their concrete class creation logic. We use Factory method when there
should be a set of classes which implement a common interface, you don’t know
which object to create until run time, and initializing objects is somewhat expensive.

## Has-A

In Java, everything revolves around Classes and Objects. So, we must know about
relationships between these classes and objects to model or design any software
application.

There are various relationships that exist in Java, the ones we are interested in right
now are Aggregation, Composition and Delegation, I will explain them here and see
the use case I developed with these relations
