# Leetcode handbook Java, Scala, and Python

This document provides a comparison of common programming constructs and data structures in Java, Scala, and Python. It is designed to help developers who are familiar with one of these languages to learn the syntax and idioms of the others.

## Versions

- **Java:** 11 or 17
- **Scala:** 2.13 or 3.0
- **Python:** 3.8 or 3.9

## Table of Contents

- [Variables and Data Types](#variables-and-data-types)
- [Control Structures](#control-structures)
- [Functions](#functions)
- [Arrays and Lists](#arrays-and-lists)
- [String Operations](#string-operations)
- [HashMap, Map, and Dictionary](#hashmap-map-and-dictionary)
- [Stack and Queue](#stack-and-queue)
- [Set](#set)
- [PySpark](#pyspark)
- [Scala and Spark](#scala-spark)
- [Patterns included in this repository](#patterns-included-in-this-repository)

## Variables and Data Types

| Concept           | Java                                      | Scala                          | Python           |
|-------------------|-------------------------------------------|-------------------------------|------------------|
| Integer           | `int a = 10;`                             | `val a: Int = 10`             | `a = 10`         |
| Double            | `double b = 20.5;`                        | `val b: Double = 20.5`        | `b = 20.5`       |
| String            | `String s = "hello";`                     | `val s: String = "hello"`     | `s = "hello"`    |
| Boolean           | `boolean flag = true;`                    | `val flag: Boolean = true`    | `flag = True`    |


## Control Structures

| Concept            | Java                                                               | Scala                                                               | Python                     |
|--------------------|--------------------------------------------------------------------|---------------------------------------------------------------------|----------------------------|
| If-else            | `if (a > b) { ... } else { ... }`                                  | `if (a > b) { ... } else { ... }`                                   | `if a > b:\n    ...\nelse:\n    ...` |
| For loop           | `for (int i = 0; i < n; i++) { ... }`                              | `for (i <- 0 until n) { ... }`                                      | `for i in range(n):\n    ...`        |
| While loop         | `while (condition) { ... }`                                        | `while (condition) { ... }`                                         | `while condition:\n    ...`          |
| Switch/Match       | `switch (variable) { case 1: ...; break; ... }`                    | `variable match { case 1 => ... case 2 => ... }`                    | `if variable == 1:\n    ...\nelif variable == 2:\n    ...\nelse:\n    ...` |


## Functions

| Concept             | Java                                                   | Scala                                          | Python                    |
|---------------------|--------------------------------------------------------|-----------------------------------------------|---------------------------|
| Function Definition | `public int add(int a, int b) { return a + b; }`       | `def add(a: Int, b: Int): Int = a + b`        | `def add(a, b):\n    return a + b` |
| Function Call       | `int result = add(5, 3);`                              | `val result = add(5, 3)`                      | `result = add(5, 3)`              |


## Arrays and Lists

| Concept             | Java                                                   | Scala                                          | Python                    |
|---------------------|--------------------------------------------------------|-----------------------------------------------|---------------------------|
| Array Definition    | `int[] arr = new int[]{1, 2, 3};`                      | `val arr = Array(1, 2, 3)`                    | `arr = [1, 2, 3]`         |
| List Definition     | `List<Integer> list = new ArrayList<>();`              | `val list = List(1, 2, 3)`                    | `list = [1, 2, 3]`        |
| Add Element         | `list.add(1);`                                         | `list :+= 1`                                  | `list.append(1)`          |
| Access Element      | `int x = arr[0];`                                      | `val x = arr(0)`                              | `x = arr[0]`              |


## String Operations

| Concept            | Java                                | Scala                              | Python                      |
|--------------------|-------------------------------------|------------------------------------|-----------------------------|
| String Definition  | `String s = "hello";`               | `val s: String = "hello"`          | `s = "hello"`               |
| String Length      | `int len = s.length();`             | `val len = s.length`               | `len_s = len(s)`            |
| Char at Index      | `char c = s.charAt(0);`             | `val c = s(0)`                     | `c = s[0]`                  |
| String Split       | `String[] parts = s.split(" ");`    | `val parts = s.split(" ")`         | `parts = s.split(" ")`      |
| String Join        | `String joined = String.join(",", list);` | `val joined = list.mkString(",")`    | `joined = ",".join(list)`   |


## HashMap, Map, and Dictionary

| Concept             | Java                                                   | Scala                                          | Python                    |
|---------------------|--------------------------------------------------------|-----------------------------------------------|---------------------------|
| Definition          | `Map<String, Integer> map = new HashMap<>();`          | `val map = Map[String, Int]()`                | `map = {}`                |
| Add Key-Value       | `map.put("key", 1);`                                   | `val map = Map("key" -> 1)`                   | `map["key"] = 1`          |
| Get Value           | `int value = map.get("key");`                          | `val value = map("key")`                      | `value = map.get("key")`  |
| Contains Key        | `boolean containsKey = map.containsKey("key");`        | `val containsKey = map.contains("key")`       | `contains_key = "key" in map` |
| Iterate Entries     | `for (Map.Entry<String, Integer> entry : map.entrySet()) { String key = entry.getKey(); int value = entry.getValue(); }` | `for ((key, value) <- map) { ... }`  | `for key, value in map.items():\n    ...` |


## Stack and Queue

| Concept             | Java                                                   | Scala                                          | Python                    |
|---------------------|--------------------------------------------------------|-----------------------------------------------|---------------------------|
| Stack Definition    | `Stack<Integer> stack = new Stack<>();`                | `val stack = scala.collection.mutable.Stack[Int]()` | `stack = []`               |
| Push                | `stack.push(1);`                                       | `stack.push(1)`                                | `stack.append(1)`          |
| Pop                 | `int top = stack.pop();`                               | `val top = stack.pop()`                        | `top = stack.pop()`        |
| Queue Definition    | `Queue<Integer> queue = new LinkedList<>();`           | `val queue = scala.collection.mutable.Queue[Int]()` | `from collections import deque\nqueue = deque()` |
| Enqueue             | `queue.add(1);`                                        | `queue.enqueue(1)`                             | `queue.append(1)`          |
| Dequeue             | `int front = queue.poll();`                            | `val front = queue.dequeue()`                  | `front = queue.popleft()`  |


## Set

| Concept             | Java                                                   | Scala                                          | Python                    |
|---------------------|--------------------------------------------------------|-----------------------------------------------|---------------------------|
| Set Definition      | `Set<Integer> set = new HashSet<>();`                  | `val set = scala.collection.mutable.Set[Int]()` | `set = set()`              |
| Add Element         | `set.add(1);`                                          | `set.add(1)`                                   | `set.add(1)`              |
| Contains Element    | `boolean contains = set.contains(1);`                  | `val contains = set.contains(1)`               | `contains = 1 in set`     |
| Remove Element      | `set.remove(1);`                                       | `set.remove(1)`                                | `set.remove(1)`           |



## PySpark

In PySpark, there isn't a separate `Dataset` API like there is in Scala. In PySpark, the primary abstraction for working with structured and semi-structured data is the `DataFrame`, which is analogous to the `Dataset` in Scala. 

#### Imports and Initialization
```python
from pyspark.sql import SparkSession

spark = SparkSession.builder.appName("Example").getOrCreate()

data = [("John", 28), ("Anna", 23), ("Mike", 35)]
columns = ["Name", "Age"]

df = spark.createDataFrame(data, columns)
```

#### Comparison Table
| Operation                  | SQL                                                                 | DataFrame                                                                                  |
|----------------------------|---------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
| Select                     | `spark.sql("SELECT Name, Age FROM table_name")`                     | `df.select("Name", "Age")`                                                                 |
| Filter                     | `spark.sql("SELECT * FROM table_name WHERE Age > 30")`              | `df.filter(df.Age > 30)`                                                                   |
| Group By                   | `spark.sql("SELECT Name, COUNT(*) FROM table_name GROUP BY Name")`  | `df.groupBy("Name").count()`                                                               |
| Aggregation                | `spark.sql("SELECT AVG(Age) FROM table_name")`                      | `df.agg({"Age": "avg"})`                                                                   |
| Join                       | `spark.sql("SELECT * FROM df1 JOIN df2 ON df1.id = df2.id")`        | `df1.join(df2, df1.id == df2.id)`                                                          |
| Creating Temporary View    | `df.createOrReplaceTempView("table_name")`                          | `df.createOrReplaceTempView("table_name")`                                                 |
| Convert to Pandas DataFrame| Not applicable                                                      | `df.toPandas()`                                                                            |



## Scala Spark

#### Imports and Initialization
```scala
import org.apache.spark.sql.{SparkSession, Row}
import spark.implicits._

val spark = SparkSession.builder.appName("Example").getOrCreate()

val data = Seq(("John", 28), ("Anna", 23), ("Mike", 35))
val df = data.toDF("Name", "Age")
```

#### Comparison Table
| Operation                  | SQL                                                                 | DataFrame                                                                                  | Dataset                                                                                                  |
|----------------------------|---------------------------------------------------------------------|--------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|
| Select                     | `spark.sql("SELECT Name, Age FROM table_name")`                     | `df.select("Name", "Age")`                                                                 | `df.select($"Name", $"Age")`                                                                             |
| Filter                     | `spark.sql("SELECT * FROM table_name WHERE Age > 30")`              | `df.filter($"Age" > 30)`                                                                   | `df.filter($"Age" > 30).as[Row]`                                                                          |
| Group By                   | `spark.sql("SELECT Name, COUNT(*) FROM table_name GROUP BY Name")`  | `df.groupBy("Name").count()`                                                               | `df.groupBy("Name").count().as[Row]`                                                                      |
| Aggregation                | `spark.sql("SELECT AVG(Age) FROM table_name")`                      | `df.agg(Map("Age" -> "avg"))`                                                              | `df.agg(Map("Age" -> "avg")).as[Row]`                                                                     |
| Join                       | `spark.sql("SELECT * FROM df1 JOIN df2 ON df1.id = df2.id")`        | `df1.join(df2, $"id" === $"id")`                                                           | `df1.join(df2, $"id" === $"id").as[Row]`                                                                  |
| Creating Temporary View    | `df.createOrReplaceTempView("table_name")`                          | `df.createOrReplaceTempView("table_name")`                                                 | `df.createOrReplaceTempView("table_name")`                                                               |
| Convert to Scala Collection| Not applicable                                                      | `df.collect()`                                                                            | Not applicable                                                                                           |

In PySpark, operations are primarily done using `DataFrame`, while in Scala, you have both `DataFrame` and `Dataset` APIs available.


## Patterns included in this repository

1. Two Pointers
2. Sliding Window
3. Fast and Slow Pointers (Tortoise and Hare)
4. Merge Intervals
5. Cyclic Sort
6. In-place Reversal of a Linked List
7. Tree Breadth-First Search
8. Tree Depth-First Search
9. Binary Search
10. Two Heaps / Priority Queue
11. Subsets
12. Modified Binary Search
13. Topological Sort
14. K-way Merge
15. 0/1 Knapsack (Dynamic Programming)
16. Longest Common Substring (Dynamic Programming)
17. Top K Elements
18. K-Nearest Neighbors
19. Backtracking
20. Bit Manipulation
21. Graph Traversal (DFS, BFS)
22. Union Find (Disjoint Set)
23. Greedy Algorithms
24. Matrix Manipulation
25. Palindromic Substrings
26. Fibonacci Sequence (Dynamic Programming)
27. Interval Scheduling
28. Count of Range Sum (Divide and Conquer)
29. Trie Data Structure (Prefix Tree)
30. Monotonic Stack
31. Heap 
32. Hashing
33. Sorting Algorithms
34. Searching Algorithms
35. Segment Tree / Binary Indexed Tree

