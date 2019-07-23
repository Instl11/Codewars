public class Remote_6 {

    public static void main(String[] args) {

        System.out.println(tvRemote("Co"));

    }

    public static int tvRemote(final String words) {

        char[][] remote = {{'a', 'b', 'c', 'd', 'e', '1', '2', '3'},
                           {'f', 'g', 'h', 'i', 'j', '4', '5', '6'},
                           {'k', 'l', 'm', 'n', 'o', '7', '8', '9'},
                           {'p', 'q', 'r', 's', 't', '.', '@', '0'},
                           {'u', 'v', 'w', 'x', 'y', 'z', '_', '/'},
                           {'+', ' '}};

        int sum = 0;
        int x = 0;
        int y = 0;
        boolean capslock = false;

        char[] chars = words.toCharArray();

        loop:
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < remote.length; j++) {
                for (int k = 0, xMinusX, yMinusY; k < remote[j].length; k++) {
                    if ((Character.isUpperCase(chars[i]) && !capslock) || (Character.isLowerCase(chars[i]) && capslock)) {
                        sum += (x <= 4 ? x : (x == 5 ? 3 : (x == 6 ? 2 : 1)));
                        x = 0;
                        yMinusY = Math.abs(5 - y);
                        sum += (yMinusY <= 3 ? yMinusY : (yMinusY == 4 ? 2 : 1));
                        y = 5;
                        sum++;
                        capslock = !capslock;
                    }
                    if (Character.toLowerCase(chars[i]) == remote[j][k]) {
                        xMinusX = Math.abs(k - x);
                        sum += xMinusX <= 4 ? xMinusX : (xMinusX == 5 ? 3 : (xMinusX == 6 ? 2 : 1));
                        x = k;
                        yMinusY = Math.abs(j - y);
                        sum += yMinusY <= 3 ? yMinusY : (yMinusY == 4 ? 2 : 1);
                        y = j;
                        sum++;
                        continue loop;
                    }
                }
            }
        }
        return sum;
    }
}