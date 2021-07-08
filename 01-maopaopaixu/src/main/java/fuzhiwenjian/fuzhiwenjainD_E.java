package fuzhiwenjian;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 张LL
 * 2021/7/7
 * 复制d盘文件到e盘
 */
public class fuzhiwenjainD_E {

        public static void main(String[] args) {
            fuzhiwenjainD_E demo = new fuzhiwenjainD_E();
            try {
                demo.copyFile();//调用方法
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void copyFile() throws IOException {
            FileInputStream fis = new FileInputStream("d:源文件.txt");
            FileOutputStream fos = new FileOutputStream("e:/目标文件.txt");
            int b = 0;
            while ((b = fis.read()) != -1) {
                fos.write(b);
                fis.close();
                fos.close();
            }
        }

/*
*
*        1。新建文件输入流 ，参数（d盘文件路径-）
*        2.新建文件输出流   参数（e盘文件路径）
*        循环
*        3.输入流对象。read  开始读字节
*        4.输出流对象写，参数为读到的字节
*       循环结束
*
* */
}
