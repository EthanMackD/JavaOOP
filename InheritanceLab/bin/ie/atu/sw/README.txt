1. Publication is abstract because it is representing a generality rather than a specific type of publication.
There is no implementation in this class because there is no one way to cite a publication. If we were to try and create a new publication
we would get an error that states that we cannot instantiate the type Publication. Java will not allow creation of an instance of an abstract class directly.

2. Book extends the general Publication fields such as title and year which are attributes specific to books. The likes of publisher and isbn are specific to Book, which would not make sense
for other publication types, but are essential for books specifically. 

3. This allows us to store any type of Publication through the "is-a" relationship. A book is a publication because the class extends Publication. The same applies
with JournalArticle as it also extends Publication. We will not need separate fields in the Citation class because the Publication field can handle all types when getCitation() is called.

4. Citation contains or uses authors, but a citation is not a type of author. The relationship here would be ownership.
A book is a specialised type of publication. It shares all of the characteristics of publications but adds book specific details.
So, you would use the "is-a" rule when you are modelling specialisation and you would use the "has-a" rule when you are modelling relationships
where one thing contains, uses, or is made up of other things.