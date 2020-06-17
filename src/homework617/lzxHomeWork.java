package homework617;

public class lzxHomeWork {

    public static void main(String[] args) {
        dysjx(5);
        System.out.println("等腰三角形已经打印已完成");
        zssum(100);
        System.out.println("质数求和已计算完成");
    }

    //打印等腰三角形
    public static void dysjx(int a){
        for(int i=1;i<=a;i++){
            for(int j=a-i;j>0;j--){   //判断每一行*号左边的空格数量
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){   //条件控制输出每一行*号的个数
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //求1到100之内所有的质数之和
    public static void zssum(int b){
        int sum = 0;
        for(int i=2;i<=b;i++){
            int x = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    x++;   //数字能被整除的次数
                }
            }
            if(x==2){
                sum = sum + i;
            }
        }
        System.out.println("1到100之内所有质数求和为"+sum);
    }
}
