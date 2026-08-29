package zb;

import java.io.InputStream;
import p2.u;
public final class a {
    public static int f50800f;
    public InputStream f50801a;
    public int f50802b;
    public int f50803c;
    public int d;
    public u f50804e;

    public final int a() {
        char c3;
        if (this.d == 8) {
            this.f50802b = this.f50803c;
            this.f50803c = this.f50801a.read();
            this.d = 0;
            if (this.f50802b == -1) {
                return -1;
            }
        }
        int i10 = this.f50802b;
        int i11 = this.d;
        int i12 = (i10 >> (7 - i11)) & 1;
        this.d = i11 + 1;
        u uVar = this.f50804e;
        if (i12 == 0) {
            c3 = '0';
        } else {
            c3 = '1';
        }
        int i13 = uVar.f45494b;
        char[] cArr = (char[]) uVar.f45495c;
        if (i13 < cArr.length - 1) {
            cArr[i13] = c3;
            uVar.f45494b = i13 + 1;
        }
        f50800f++;
        return i12;
    }

    public final boolean b(String str) {
        boolean z10;
        String str2;
        if (a() == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        f(str, str2);
        return z10;
    }

    public final long c(int i10) {
        if (i10 <= 64) {
            long j10 = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                j10 = (j10 << 1) | a();
            }
            return j10;
        }
        throw new IllegalArgumentException("Can not readByte more then 64 bit");
    }

    public final long d(int i10, String str) {
        long c3 = c(i10);
        f(str, String.valueOf(c3));
        return c3;
    }

    public final int e(String str) {
        int i10 = 0;
        int i11 = 0;
        while (a() == 0) {
            i11++;
        }
        if (i11 > 0) {
            i10 = (int) (((1 << i11) - 1) + c(i11));
        }
        f(str, String.valueOf(i10));
        return i10;
    }

    public final void f(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = f50800f;
        u uVar = this.f50804e;
        String valueOf = String.valueOf(i10 - uVar.f45494b);
        int length = 8 - valueOf.length();
        sb2.append("@".concat(valueOf));
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(' ');
        }
        sb2.append(str);
        int length2 = (100 - sb2.length()) - uVar.f45494b;
        for (int i12 = 0; i12 < length2; i12++) {
            sb2.append(' ');
        }
        sb2.append(uVar);
        sb2.append(" (" + str2 + ")");
        uVar.f45494b = 0;
    }
}
