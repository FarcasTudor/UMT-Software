# UMT-Software

<h3 align="center"><i> Documentation </i></h3>
<ol>
  <li>In the main function, I called the method testCases() from class TestCases, where I tried to give some examples of test points (cartesian coordinates), which can form rectangles.I used the annotation "@Test" for method testCases() to use the JUnit testing framework so that JUnit will know to run this method as a test case.</li>
  <li>I have created a class named "Point" that contains 2 values: x and y, that are the cartesian coordinates of a point. Because the text didn't specify if the coordinates are integers or not, I have chosen to work with double data type.</li>
  <li>In the Main class, I have the numberOfRectangles() method that solves the given problem. This method takes an array of "Point" objects as input and returns an integer value (the number of rectangles can be formed using the points given).</li>
  <li>In the numberOfRectangles() method, I start by creating a HashSet of "Point" objects for easier search of elements.</li>
  <li>After that, I loop through all possible pairs of "Point" objects, check whether they form a diagonal of a rectangle, and if they do, check whether the other two corners of the rectangle are in the HashSet. If this condition is verified, I increment the count variable, meaning I found another rectangle. </li>
  <li>Finally, the method returns the value of count divided by 2, because each rectangle is counted twice (once for each diagonal).</li>
  <li>The time complexity of the code is O(n^2), where n is the number of "Point" objects in the input array. This is because the code uses two nested for loops to iterate through all possible pairs of Point objects, resulting in O(n^2) time complexity.</li>
  <li>The space complexity of the code is O(n) because it creates a HashSet of "Point" objects that is proportional to the size of the input array.</li>
</ol>
