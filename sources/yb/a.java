package yb;

import java.io.InputStream;
import n2.v;

public final class a {

    public static int f49816f;

    public InputStream f49817a;

    public int f49818b;

    public int f49819c;
    public int d;

    public v f49820e;

    public final int a() {
        if (this.d == 8) {
            this.f49818b = this.f49819c;
            this.f49819c = this.f49817a.read();
            this.d = 0;
            if (this.f49818b == -1) {
                return -1;
            }
        }
        int i10 = this.f49818b;
        int i11 = this.d;
        int i12 = (i10 >> (7 - i11)) & 1;
        this.d = i11 + 1;
        v vVar = this.f49820e;
        char c10 = i12 == 0 ? '0' : '1';
        int i13 = vVar.f18186b;
        char[] cArr = (char[]) vVar.f18187c;
        if (i13 < cArr.length - 1) {
            cArr[i13] = c10;
            vVar.f18186b = i13 + 1;
        }
        f49816f++;
        return i12;
    }

    public final boolean b(String str) {
        boolean z10 = a() != 0;
        f(str, z10 ? "1" : "0");
        return z10;
    }

    public final long c(int i10) {
        if (i10 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long jA = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            jA = (jA << 1) | ((long) a());
        }
        return jA;
    }

    public final long d(int i10, String str) {
        long jC = c(i10);
        f(str, String.valueOf(jC));
        return jC;
    }

    public final int e(String str) {
        int iC = 0;
        int i10 = 0;
        while (a() == 0) {
            i10++;
        }
        if (i10 > 0) {
            iC = (int) (((long) ((1 << i10) - 1)) + c(i10));
        }
        f(str, String.valueOf(iC));
        return iC;
    }

    public final void f(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = f49816f;
        v vVar = this.f49820e;
        String strValueOf = String.valueOf(i10 - vVar.f18186b);
        int length = 8 - strValueOf.length();
        sb2.append("@".concat(strValueOf));
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(' ');
        }
        sb2.append(str);
        int length2 = (100 - sb2.length()) - vVar.f18186b;
        for (int i12 = 0; i12 < length2; i12++) {
            sb2.append(' ');
        }
        sb2.append(vVar);
        sb2.append(" (" + str2 + ")");
        vVar.f18186b = 0;
    }
}
