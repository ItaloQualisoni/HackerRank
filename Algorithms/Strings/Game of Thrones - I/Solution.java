import java.io.*;
/*
Problem: Given a string. tell whether any anagram of given sub-string will be palindrome
Approach: Suppose length of given string is l. then, If any anagram of given string will be palindrome if X[i] = X[l-1-i] where X is given string. So, every character has to be repeated even number of time . only one of the character can happen odd number of times which will occur in middle of string .
*/

public class Solution {

    public static void solve(Input in, PrintWriter out) throws IOException {
        String s = in.next();
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        int odd = 0;
        for (int count : counts) {
            if (count % 2 == 1) {
                odd++;
            }
        }
        out.println(odd <= 1 ? "YES" : "NO");
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        solve(new Input(new BufferedReader(new InputStreamReader(System.in))), out);
        out.close();
    }

    static class Input {
        BufferedReader in;
        StringBuilder sb = new StringBuilder();

        public Input(BufferedReader in) {
            this.in = in;
        }

        public Input(String s) {
            this.in = new BufferedReader(new StringReader(s));
        }

        public String next() throws IOException {
            sb.setLength(0);
            while (true) {
                int c = in.read();
                if (c == -1) {
                    return null;
                }
                if (" \n\r\t".indexOf(c) == -1) {
                    sb.append((char)c);
                    break;
                }
            }
            while (true) {
                int c = in.read();
                if (c == -1 || " \n\r\t".indexOf(c) != -1) {
                    break;
                }
                sb.append((char)c);
            }
            return sb.toString();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}
