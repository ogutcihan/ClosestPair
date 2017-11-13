# ClosestPair
Algorithm Approach

The aim is to calculate the distance between each point to find minimum distance and the closest pair among the given set of points.
In order to achieve this for “n” points, this needs "n2-n" calculations for one dimensions.
In our case this take "d*(n2-n)" for “d” dimensions. By using brute-force algorithm this can be solved O(n2) time

Instructions


Run

Enter Path for input file.

Error Message

Could not find any point for the calculation: Application gives this error when there are no point in input file.

At least 2 points needed for calculation: Application gives this error when there are only one point in input file.

Limitations

Input text file should contain one point per line. For each line, coordinate values should be separated by "\t".

For each point in input file should contain exactly same number of coordinates.

The input file must have at least two point.

No restriction for dimension.

No maximum limit for points.

Predefined test scenarios:

Blank file, One point: If there is only one point in the input file, the application gives "At least 2 points needed."