CONTENTS OF THIS FILE
---------------------

 * Introduction
 * Problem
 * Input Format
 * Sample Input
 * Sample Output
 * Installation
 * Maintainers

#Introduction

*This problem can be accessed at [HackerRank] (https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup, "Practice")*

## Problem

You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.

For example, given the array arr = [7,1,3,2,4,5,6]  we perform the following steps:

        i   arr                     swap (indices)
        0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
        1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
        2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
        3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
        4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
        5   [1, 2, 3, 4, 5, 6, 7]

It took 5 swaps to sort the array

## Input Format

The first line contains an integer, n , the size of arr.
The second line contains n space-separated integers arr[i].

## Sample Input

    4
    4 3 1 2

## Sample Output

    3


## Installation


Install as you would normally clone a Github Repository. Code is written in Java 11 and is ran as a Console Program. 

## Maintainers

Current Maintainers:

Zachary Mollenhour - [linkedin](https://www.linkedin.com/in/zacharymollenhour)

This little project is part of a repository of HackerRank Interview Practice Questions.

You can reach me at `zacharymmollenhour@gmail.com` or through the linkedin above. 

## Pull requests welcome!

Spotted an error? Something doesn't make sense? Send me a [pull
request](https://github.com/zacharymollenhour/HackerRank/pulls)! Please avoid making
stylistic changes though -- they are unlikely to be accepted. Thanks!
