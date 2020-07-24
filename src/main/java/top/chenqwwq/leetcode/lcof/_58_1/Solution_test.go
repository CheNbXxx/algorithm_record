package _58_1

import "testing"

/**
  @user: chenqwwq
  @date: 2020/7/24
*/

func Test_reverseWords(t *testing.T) {
	type args struct {
		s string
	}
	tests := []struct {
		name string
		args args
		want string
	}{
		/**
		示例 1：

		输入: "the sky is blue"
		输出: "blue is sky the"
		示例 2：

		输入: "  hello world!  "
		输出: "world! hello"
		解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
		示例 3：

		输入: "a good   example"
		输出: "example good a"
		解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。

		来源：力扣（LeetCode）
		链接：https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof
		著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
		*/
		{
			name: "a good   example",
			args: args{
				s: "a good   example",
			},
			want: "example good a",
		},
		{
			name: "  hello world!  ",
			args: args{
				s: "  hello world!  ",
			},
			want: "world! hello",
		},
		{
			name: "",
			args: args{
				s: "the sky is blue",
			},
			want: "blue is sky the",
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := reverseWords(tt.args.s); got != tt.want {
				t.Errorf("reverseWords() = %v, want %v", got, tt.want)
			}
		})
	}
}
