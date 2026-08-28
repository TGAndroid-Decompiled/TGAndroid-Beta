package p2;

import com.googlecode.mp4parser.e;
public abstract class c extends e {
    static {
        yb.c.a(c.class);
    }

    public static byte[] d(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i9 = 0; i9 < Math.min(4, str.length()); i9++) {
                bArr[i9] = (byte) str.charAt(i9);
            }
        }
        return bArr;
    }
}
