package cn.gzsxt;

public class TestGit {

	public static void main(String[] args) {
		System.out.println("TestGit2初始化提交！");
		System.out.println("hello world --->git!");
		System.out.println("git上直接修改，模拟另一个同事提交的，第三次提交!");
	}
	
	public void testBranch() {
		System.out.println("dev新分支上的第一行代码，第一次提交！");
		System.out.println("dev新分支上模拟同事的修改，第二次提交！");
		System.out.println("模拟冲突，模拟本地仓库的修改第七次提交！");
	}
}
