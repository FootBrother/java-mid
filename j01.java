class Data {
    private String name;
    private Test score; // 内部类别变量

    public Data(String name, int english, int math) {// Data 类的构造函数
        this.name = name;
        score = new Test(english, math);
    }

    class Test {// 内部类别 Test
        private int english;
        private int math;

        public Test(int eng, int m) {// Test 类的构造函数
            english = eng;
            math = m;
        }

        public double avg() {// 计算平均成绩
            return (english + math) / 2.0;
        }

        public void show() {// 显示成绩和判断是否全部及格
            System.out.println("name: " + name);
            System.out.println("english score: " + english);
            System.out.println("math score: " + math);
            System.out.println("avg: " + avg());
            if (english < 60 && math < 60) {
                System.out.println("All fall");
            } else if (english >= 60 && math >= 60) {
                System.out.println("you are all pass");
            } else if (english < 60) {
                System.out.println("english is fall");
            } else if (math < 60) {
                System.out.println("math is fall");
            }
        }
    }

    public void show() {// 显示学生信息
        score.show();
    }
}

public class j01 {
    public static void main(String[] args) {
        Data stu1 = new Data("annie", 55, 56);
        Data stu2 = new Data("james", 85, 96);
        stu1.show();
        System.out.println("---------------");
        stu2.show();
    }
}

// Data stu1 = new Data("annie", 85,56)
// Data stu2 = new Data("james", 85,96)
// stu1.show()

// 輸出
// name: annie
// english score:85
// math score :56
// avg: 70.5
// math is fall