package com.yq.foundation;

import java.io.*;

public class Test_IO {
    public static void main(String[] args) {
        File file = new File("F:\\JAVA\\a\\b\\c");
        file.mkdirs();
//        readfile("F:\\JAVA\\IdeaProjects\\yq_java_test\\file1.txt");
//        bufferReadFile(file);
    }

    public static void readfile(String file) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream("newfile.txt", true);
            byte[] b;
            b = new byte[100];
            while (fis.read(b) > 0) {
                fos.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void bufferReadFile(File file) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(new File("郭德纲.txt"));
            bis = new BufferedInputStream(fis, 100);
            bos = new BufferedOutputStream(fos, 100);

            byte[] b = new byte[100];
            while (bis.read(b) > 0) {
                bos.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bos.flush();
                bos.close();
                fos.close();
                bis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
