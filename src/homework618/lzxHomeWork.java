package homework618;

import java.util.Arrays;

public class lzxHomeWork {
    /**从键盘输入8个整数存放在一个数组中,将奇数和偶数分别存入到两个不同的数组中,
     * 并按奇数、偶数交替的顺序输出这两个数组中的所有数据
     * 先交替输出，如果奇数个数多，则再输出剩下的奇数，
     * 如果偶数个数多，则再输出剩下的偶数。
     * 提示与要求:
     * (1)定义一个数组存储从键盘输入的8个整数，
     * 先判断这8个整数中奇数和偶数的个数,才能定义存储奇数和偶数的数组的长度;
     * (2)把一个大的数组分别存放在奇数和偶数数组中并交替输出的过程定义为方法*/
    public static void main(String[] args) {
        //用户随机输入8个数字
        int a[] = {4,5,6,7,8,9,2,10};
        System.out.println("用户输入的八个数字为："+ Arrays.toString(a));
        fenlei(a);
    }

    public static void fenlei(int[] a){
        int ji = 0;
        int ou = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                ji++;
            }else if(a[i]%2==0){
                ou++;
            }
        }
        //定义奇数、偶数数组
        int jishu[] = new int[ji];
        int oushu[] = new int[ou];
        //将数字分别放入两个数组中
        int m = 0;
        int n = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                jishu[m] = a[i];
                m++;
            }else if(a[i]%2==0){
                oushu[n] = a[i];
                n++;
            }
        }
        System.out.println("奇数数组为："+Arrays.toString(jishu));
        System.out.println("偶数数组为："+Arrays.toString(oushu));
        //if语法判断不同情况，并交替输出奇数偶数
        System.out.println("数组交替输出为：");
        if(m>n){
            for(int i=0;i<n;i++){
                System.out.print(jishu[i]+"\t");
                System.out.print(oushu[i]+"\t");
            }
            for(int i=n;i<m;i++){
                System.out.print(jishu[i]+"\t");
            }
        }else if(m<n){
            for(int i=0;i<m;i++){
                System.out.print(jishu[i]+"\t");
                System.out.print(oushu[i]+"\t");
            }
            for(int i=m;i<n;i++){
                System.out.print(oushu[i]+"\t");
            }
        }else if(m==n){
            for(int i=0;i<m;i++){
                System.out.print(jishu[i]+"\t");
                System.out.print(oushu[i]+"\t");
            }
        }
    }

}
