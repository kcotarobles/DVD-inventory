# DVD-inventory

The inventory has methods for adding new movies and removing movies, as well as a method which returns a boolean value for whether the movie is already contained in the inventory. There is also a toString() method, and a method which returns the size of the inventory. The inventory utilizes Collections.sort to sort the movies.

The Movie class defines a number of variables including rating, year, duration, title, and price. The rating variable has a getter and a setter method, and all other variables have getters. The rating must be between 0 and 4, the year must be between 1870 and 2015, and the duration must be positive. If any of these are values are outside of their respective ranges, an IllegalArgumentException is thrown. The class also has a toString() method and a method to compare a movie to another movie. 
The Action class extends the Movie class, defining another variable for explosions.
