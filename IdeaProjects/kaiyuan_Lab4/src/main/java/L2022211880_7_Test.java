//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class L2022211880_7_Test {
    public L2022211880_7_Test() {
    }

    @Test
    public void testSmallestStringWithSwapsGeneral() {
        Solution7 solution = new Solution7();
        List<List<Integer>> pairs = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2));
        String result = solution.smallestStringWithSwaps("dcab", pairs);
        Assert.assertEquals("测试失败：期望输出为 'bacd'，实际输出为 '" + result + "'", "bacd", result);
    }

    @Test
    public void testSmallestStringWithSwapsNoSwaps() {
        Solution7 solution = new Solution7();
        List<List<Integer>> pairs = new ArrayList();
        String result = solution.smallestStringWithSwaps("abc", pairs);
        Assert.assertEquals("测试失败：期望输出为 'abc'，实际输出为 '" + result + "'", "abc", result);
    }

    @Test
    public void testSmallestStringWithSwapsAllSwaps() {
        Solution7 solution = new Solution7();
        List<List<Integer>> pairs = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2), Arrays.asList(2, 3));
        String result = solution.smallestStringWithSwaps("dcba", pairs);
        Assert.assertEquals("测试失败：期望输出为 'abcd'，实际输出为 '" + result + "'", "abcd", result);
    }

    @Test
    public void testSmallestStringWithSwapsEmptyString() {
        Solution7 solution = new Solution7();
        List<List<Integer>> pairs = Arrays.asList(Arrays.asList(0, 1));
        String result = solution.smallestStringWithSwaps("", pairs);
        Assert.assertEquals("测试失败：期望输出为 ''，实际输出为 '" + result + "'", "", result);
    }
}
