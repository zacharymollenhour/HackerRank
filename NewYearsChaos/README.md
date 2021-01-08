CONTENTS OF THIS FILE
---------------------

 * Introduction
 * Problem
 * Input Format
 * Sample Input
 * Sample Output
 * Explanation
 * Installation
 * Maintainers

#Introduction

*This problem can be accessed at [HackerRank] (https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup, "Practice")*

## Problem

It is New Year's Day and people are in line for the Wonderland rollercoaster ride. Each person wears a sticker indicating their initial position in the queue. Initial positions increment by 1 from 1 at the front of the line to n at the back.

Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line. One person can bribe at most two others. For example, if n=8 and Person 5 bribes Person 4, the queue will look like this: 1,2,3,5,4,6,7,8.

Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state. If anyone has bribed more than two people, the line is too chaotic to compute the answer.

## Input Format

The first line contains an integer t, the number of test cases.

Each of the next t pairs of lines are as follows:
- The first line contains an integer t, the number of people in the queue
- The second line has n space-separated integers describing the final state of the queue.

## Sample Input

2
5
2 1 5 3 4
5
2 5 1 3 4

## Sample Output

3
Too chaotic

## Explanation

The Initial State:
![alt text](https://s3.amazonaws.com/hr-challenge-images/494/1451665589-31d436ba19-pic11.png)

After person 5 moves one position ahead by bribing person 4:
![alt text](https://s3.amazonaws.com/hr-challenge-images/494/1451665679-6504422ed9-pic2.png)

Now person 5 moves another position ahead by bribing person 3:
![alt text](https://s3.amazonaws.com/hr-challenge-images/494/1451665818-27bd62bb0d-pic3.png)

And person 2 moves one position ahead by bribing person 1:
![alt text](https://s3.amazonaws.com/hr-challenge-images/494/1451666025-02a2395a00-pic5.png)

So the final state is 2,1,5,3,4 after three bribing operations

## Installation

Install as you would normally clone a Github Repository. Code is written in Java 11 and is ran as a Console Program. 

## Maintainers

Current Maintainers:

* Zachary Mollenhour - [linkedin](https://www.linkedin.com/in/zacharymollenhour)

This little project is part of a repository of HackerRank Interview Practice Questions. For this solution
we take an approach towards the problem by comparing array values to expected values and adding to a counter. 

You can reach me at `zacharymmollenhour@gmail.com` or through the linkedin above. 

## Pull requests welcome!

Spotted an error? Something doesn't make sense? Send me a [pull
request](https://github.com/zacharymollenhour/HackerRank/pulls)! Please avoid making
stylistic changes though -- they are unlikely to be accepted. Thanks!
