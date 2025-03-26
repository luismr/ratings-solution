package com.ratings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testEmptyRatings() {
        assertEquals(-1, Solution.solution(0, new int[][]{}));
    }

    @Test
    void testSingleRating() {
        assertEquals(1, Solution.solution(1, new int[][]{{1, 5}}));
    }

    @Test
    void testMultipleRatingsSameDish() {
        assertEquals(1, Solution.solution(3, new int[][]{
            {1, 5},
            {1, 4},
            {1, 3}
        }));
    }

    @Test
    void testMultipleDishesDifferentAverages() {
        assertEquals(2, Solution.solution(4, new int[][]{
            {1, 3},
            {1, 4},
            {2, 5},
            {2, 5}
        }));
    }

    @Test
    void testMultipleDishesSameAverage() {
        assertEquals(1, Solution.solution(4, new int[][]{
            {1, 5},
            {1, 5},
            {2, 5},
            {2, 5}
        }));
    }

    @Test
    void testComplexCase() {
        assertEquals(3, Solution.solution(6, new int[][]{
            {1, 3},
            {1, 4},
            {2, 2},
            {2, 2},
            {3, 5},
            {3, 5}
        }));
    }
} 