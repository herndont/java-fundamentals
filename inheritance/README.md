# Lab06 Inheritance and Interfaces

### Feature Tasks
    - Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars, and a price 
    category (i.e. number of dollar signs). a. Implement a reasonable toString method for Restaurants. b. Test your 
    toString method. c. Write a test to create an instance of Restaurant and ensure that its toString is 
    working properly.
    - Create a class to represent a Review. Each Review should have a body, an author, and a number of stars. a. 
    Implement a reasonable toString method for Reviews. b. Test your toString method. c. Write a test to create an 
    instance of Review and ensure that its toString is working properly.
    - A Review should be about a single Restaurant. Choose an implementation for this, and implement it. Some 
    considerations: a. Should a Review know which Restaurant it is about? b. Should a Restaurant know which Reviews 
    are about it? c. Is a Restaurant a special type of Review? Is a Review a special type of Restaurant? Is there 
    common functionality that unites them? d. Update your toString and constructor methods appropriately, and also 
    update your testing code to test this new functionality.
    - Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and 
    associate that review with this Restaurant. The specific methodology for this will vary, depending on the 
    implementation you chose above. a. Add tests to ensure that when you call addReview, the association is created 
    between the Restaurant and the Review.
    - When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your 
    addReview method updates the Restaurant star rating appropriately, and add tests. (In particular, ensure that if 
    you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the 
    restaurant does not update.)

### Architecture
    Each Class currently has their own class file and test file as well. The functions for each class are written within
    the class instantiation on the class file.
    
## Testing 
    I have not been able to figure out the testing portion of these classes and functions yet. I will need to go back
    and rework this section.
