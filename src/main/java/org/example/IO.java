package org.example;

import java.io.*;

public class IO {

    /**
     * Потоковый ввод-вывод (java.io)<br/>
     * - {@link InputStream} - читать байты<br/>
     * - {@link OutputStream} - писать байты<br/>
     * - {@link Reader} - читать символы<br/>
     * - {@link Writer} - писать символы
     * <p>
     * Реализации:<br/>
     * - {@link BufferedReader} - буферизированное чтение<br/>
     * {@code String readLine()} - позволяет прочитать символы до символа перевода строки<br/>
     * {@code Stream<String> lines()} - позволяет представить поток в виде набора строк
     * <p>
     * - {@link BufferedWriter} - буферезированная запись
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */

        reader.close();
        writer.close();
    }
}
