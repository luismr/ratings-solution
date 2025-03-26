package com.ratings;

import java.util.*;

public class Solution {
    record Rating(double sum, double count) {
        Rating add(Rating other) {
            return new Rating(sum + other.sum, count + other.count);
        }
        
        double average() {
            return sum / count;
        }
    }

    public static int solution(int n, int[][] ratings) {
        return Arrays.stream(ratings)
            .collect(java.util.stream.Collectors.groupingBy(
                rating -> rating[0],  // dish ID as key
                java.util.stream.Collectors.collectingAndThen(
                    java.util.stream.Collectors.reducing(
                        new Rating(0, 0),
                        rating -> new Rating(rating[1], 1),
                        Rating::add
                    ),
                    Rating::average
                )
            ))
            .entrySet()
            .stream()
            .min((e1, e2) -> {
                int valueCompare = -Double.compare(e1.getValue(), e2.getValue()); // Reversed for highest average
                return valueCompare != 0 ? valueCompare : Integer.compare(e1.getKey(), e2.getKey());
            })
            .map(Map.Entry::getKey)
            .orElse(-1);
    }

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            // Read number of reviews
            int n = scanner.nextInt();
            
            // Read ratings using Stream
            int[][] ratings = java.util.stream.IntStream.range(0, n)
                .mapToObj(i -> new int[]{scanner.nextInt(), scanner.nextInt()})
                .toArray(int[][]::new);
            
            // Get and print result
            System.out.println(solution(n, ratings));
        }
    }
} 