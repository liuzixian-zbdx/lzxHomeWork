package homework620;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class lzxHomeWork {
    public static void main(String[] args) throws IOException {
        //首先创建一个文件字节输入流来读取数据
        FileInputStream in = new FileInputStream("a.txt");
        //创建一个文件字节输出流来写数据
        FileOutputStream out = new FileOutputStream("b.txt");
        //创建一个字节数组作为缓冲区，通过定义长度来规定每次读取的大小
        byte[] bytes = new byte[10];
        int len = -1;
        //读取a.txt中的数据
        while ((len = in.read(bytes))!=-1) {
            out.write(bytes, 0, len);  //将数据写入b.txt
        }
        in.close();
        out.close();
    }

}
