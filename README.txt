String Handler
A simple string reverser and state indicator.

Purpose:
To rework a Week 2 Iron Yard assignment. Assignment listed below:
The first part of the assignment is to reverse a string that the user entered. Name the class that implements this functionality StringReverser.

Hint: use the String's toCharArray() method, which returns an array of char:

String userString = "Something";
char[] stringCharacters = userString.toCharArray();
// the stringCharacters array will have every character in the string userString
Restrictions:

Do not google this problem
Do not use the StringBuilder reverse() method
The second part of the assignment is to implement another class. Requirements:

Ask the user to enter a string. If there are multiple words in the string, ask the user to separate them with a space, like they normally would. E.g.: the user could enter my state indicator
Ask the user if what they entered was a variable name, a method name or a class name
Based on what the user says, display them their text back with the appropriate casing and notation. E.g.:
If the input was the name of a variable, display: "myStateIndicator"
If the input was the name of a method, display: "myStateIndicator()"
If the input was the name of a class, display: "MyStateIndicator {}"
Hints:

Look up the String class methods to decide which ones may be the most useful, but here are a couple to pay attention to:
substring()
split()
toUpperCase()
toLowerCase()
length()