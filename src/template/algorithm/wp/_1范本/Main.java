package template.algorithm.wp._1范本;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import static java.util.Arrays.deepToString;

public class Main {
    /**
     * 当运行未知的Java程序的时候，
     * 该程序可能有恶意代码（删除系统文件、重启系统等），
     * 为了防止运行恶意代码对系统产生影响，
     * 需要对运行的代码的权限进行控制，
     * 这时候就要启用Java安全管理器。
     */
    static boolean LOCAL = System.getSecurityManager() == null;
    static boolean TO_FILE = true;
    Scanner sc = new Scanner(System.in);

    void run() {

    }

    void debug(Object... os) {
        System.err.println(deepToString(os));
    }

    public static void main(String[] args) {
        if (LOCAL) {
            try {
                new Main();
                System.setIn(new FileInputStream("./input/in.txt"));
            } catch (FileNotFoundException e) {
                LOCAL = false;
            }
        }
        if (TO_FILE) {
            try {
                System.setOut(new PrintStream("./output/out.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        new Main().run();
    }

}
