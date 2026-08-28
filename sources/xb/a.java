package xb;

import java.io.InputStream;
import n2.w;
public final class a {
    public static int f49100f;
    public InputStream f49101a;
    public int f49102b;
    public int f49103c;
    public int d;
    public w f49104e;

    public final int a() {
        char c10;
        if (this.d == 8) {
            this.f49102b = this.f49103c;
            this.f49103c = this.f49101a.read();
            this.d = 0;
            if (this.f49102b == -1) {
                return -1;
            }
        }
        int i9 = this.f49102b;
        int i10 = this.d;
        int i11 = (i9 >> (7 - i10)) & 1;
        this.d = i10 + 1;
        w wVar = this.f49104e;
        if (i11 == 0) {
            c10 = '0';
        } else {
            c10 = '1';
        }
        int i12 = wVar.f18360b;
        char[] cArr = (char[]) wVar.f18361c;
        if (i12 < cArr.length - 1) {
            cArr[i12] = c10;
            wVar.f18360b = i12 + 1;
        }
        f49100f++;
        return i11;
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

    public final long c(int i9) {
        if (i9 <= 64) {
            long j10 = 0;
            for (int i10 = 0; i10 < i9; i10++) {
                j10 = (j10 << 1) | a();
            }
            return j10;
        }
        throw new IllegalArgumentException("Can not readByte more then 64 bit");
    }

    public final long d(int i9, String str) {
        long c10 = c(i9);
        f(str, String.valueOf(c10));
        return c10;
    }

    public final int e(String str) {
        int i9 = 0;
        int i10 = 0;
        while (a() == 0) {
            i10++;
        }
        if (i10 > 0) {
            i9 = (int) (((1 << i10) - 1) + c(i10));
        }
        f(str, String.valueOf(i9));
        return i9;
    }

    public final void f(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int i9 = f49100f;
        w wVar = this.f49104e;
        String valueOf = String.valueOf(i9 - wVar.f18360b);
        int length = 8 - valueOf.length();
        sb2.append("@".concat(valueOf));
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(' ');
        }
        sb2.append(str);
        int length2 = (100 - sb2.length()) - wVar.f18360b;
        for (int i11 = 0; i11 < length2; i11++) {
            sb2.append(' ');
        }
        sb2.append(wVar);
        sb2.append(" (" + str2 + ")");
        wVar.f18360b = 0;
    }
}
