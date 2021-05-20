package top.chenqwwq.leetcode.topic.recursion._124;

import top.chenqwwq.leetcode.common.TreeNode;

/**
 * 124. 二叉树中的最大路径和
 * 路径 被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。同一个节点在一条路径序列中 至多出现一次 。该路径 至少包含一个 节点，且不一定经过根节点。
 * <p>
 * 路径和 是路径中各节点值的总和。
 * <p>
 * 给你一个二叉树的根节点 root ，返回其 最大路径和 。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [1,2,3]
 * 输出：6
 * 解释：最优路径是 2 -> 1 -> 3 ，路径和为 2 + 1 + 3 = 6
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [-10,9,20,null,null,15,7]
 * 输出：42
 * 解释：最优路径是 15 -> 20 -> 7 ，路径和为 15 + 20 + 7 = 42
 * <p>
 * <p>
 * 提示：
 * <p>
 * 树中节点数目范围是 [1, 3 * 104]
 * -1000 <= Node.val <= 1000
 *
 * @author chen
 * @date 2021-05-20
 **/
public class Solution {
	int ans = Integer.MIN_VALUE;
	final int minValue = -Integer.MAX_VALUE / 2 + 20000;

	public int maxPathSum(TreeNode root) {
		if (root == null) {
			return -1;
		}
		dfs(root);
		return ans;
	}

	/**
	 * 返回的是带 root 节点的最大路径和
	 */
	public int dfs(TreeNode root) {
		if (root == null) {
			return minValue;
		}
		// 获取 left/right 节点的最大单路径
		final int left = dfs(root.left);
		final int right = dfs(root.right);

		// 不经过父节点
		ans = max(ans, left + right + root.val, root.val, root.val + left, root.val + right);
		return max(root.val, root.val + left, root.val + right);
	}

	private int max(int... nums) {
		int max = Integer.MIN_VALUE;
		for (int i : nums) {
			max = Math.max(max, i);
		}
		return max;
	}
}
