# Lab06 Inheritance and Interfaces
(lab07 is also located below)

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

# Lab07 Inheritance and Interfaces Part II

### Feature Tasks
    - The users want shops! Create a Shop class; a Shop should have a name, description, and number of dollar signs.
            -Implement a reasonable toString method for Shops. Add tests for the basics of your Shop class.
    - The users also want to review shops!
            -It would be great if a Review could be about either a Shop or a Restaurant. Choose an implementation, and 
            make this possible.
            -Ensure that your Shop class has an instance method to add a review about that shop, and that it works just
             as well as the Restaurant instance method with the same purpose.
            -Write tests for this functionality.
    - The users want theaters! Create a Theater class; a Theater should have a name and all of the movies currently 
    showing there. (Strings are fine for the movies; no need to create another class.)
            -Write addMovie and removeMovie methods that allow the theater to update which movies are being shown.
            -Implement a reasonable toString method for Theaters.
            -Test your Theater functionality.
    - Review all the things!
            - Ensure that your Theater is just as reviewable as your Restaurant and your Shop.
            - Test this functionality.
    - Users are frustrated: they like having a body, an author, and a number of stars, but when they’re reviewing a 
    Theater, they also want to specify which movie they saw.   
            -Some reviews should now have a String movie instance variable, to hold which movie that reviewer is 
            referencing.
            -Make sure that someone reviewing a Restaurant or a Shop doesn’t have to include which movie they saw!
            -It’s also okay if someone doesn’t want to include the movie they saw when they’re reviewing a theater 
            (maybe they just went in for the popcorn). d- Add testing for any new functionality you’ve created.    



### Architecture
    Each Class currently has their own class file and test file as well. The functions for each class are written within
    the class instantiation on the class file.
    
## Testing 
    I will need to go back and figure out the testing of these classes. Some of the in class lecture on 4/23/19 gave me 
    some good examples and I will go back and use these to test the viability of the methods in use.