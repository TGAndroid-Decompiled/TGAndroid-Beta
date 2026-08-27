package ue;

import java.io.FilterInputStream;
import java.io.IOException;

public abstract class a extends se.a {
    public static String b(int i10, int i11, byte[] bArr) {
        try {
            String str = new String(bArr, i10, i11, "ISO-8859-1");
            int iIndexOf = str.indexOf(0);
            return iIndexOf < 0 ? str : str.substring(0, iIndexOf);
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean c(FilterInputStream filterInputStream) throws IOException {
        filterInputStream.mark(3);
        try {
            return filterInputStream.read() == 84 && filterInputStream.read() == 65 && filterInputStream.read() == 71;
        } finally {
            filterInputStream.reset();
        }
    }
}
