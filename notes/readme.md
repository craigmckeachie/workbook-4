# Workbook 4 Notes

- Classes have things they

  - responsibilities (knows, dos)
  - know (fields, field members, attributes, properties, data, memory)
  - do (method = verb = do something)

- New = create an instance of a class = instantiate an instance of a class

  > new= create = instantiate

- Classes have:

  - fields
  - constructors
  - getters
  - setters
  - methods

- class = noun = PascalCasing
- method = verb = camelCasing
  - can be named verbNoun

---

The most common pattern for naming tests in Java using the "should" syntax typically follows this structure:

[UnitOfWork]_[Scenario]_[ExpectedBehavior]
Where:

- [UnitOfWork]: The name of the method or class being tested.
- [Scenario]: A specific condition or input being tested.
- [ExpectedBehavior]: What the method or class should do in that scenario.
And the "should" often appears within the [ExpectedBehavior] part.

Here are some examples:

Calculator_addTwoPositiveNumbers_shouldReturnSum
StringUtil_isNullOrEmpty_withNullString_shouldReturnTrue
UserService_createUser_withValidInput_shouldPersistUser
ShoppingCart_addItem_newItem_shouldIncreaseItemCount
Key characteristics of this pattern:

Readability: It clearly communicates what is being tested and what the expected outcome is.
Focus on Behavior: It emphasizes the behavior of the unit under test.
Consistency: Using a consistent naming pattern makes your test suite easier to understand and navigate.


----

## YouTube

### Clases
- Subscribers
- Likes
- Dislikes
- Videos
- Comments
- Channels
- Users
- Shares
- Views


### Has A Relationship

Users
  Subscriptions List<Channels>
  Channels List<Channel>
Videos
  CreatedBy:User
  List<Likes>
  List<Dislikes>
  List<Comments>
