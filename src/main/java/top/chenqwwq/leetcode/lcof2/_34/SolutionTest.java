package top.chenqwwq.leetcode.lcof2._34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author chenbingxin
 * @date 2021/12/30
 **/
class SolutionTest {

    @Test
    void isAlienSorted() {
        Solution solution = new Solution();
        Assertions.assertTrue(solution.isAlienSorted(new String[]{"hello","leetcode"},"hlabcdefgijkmnopqrstuvwxyz"));
        Assertions.assertTrue(solution.isAlienSorted(new String[]{"hello","hello"},"hlabcdefgijkmnopqrstuvwxyz"));
    }
}