package s3;

import h5.d0;
import j3.r1;
import java.nio.charset.Charset;
import java.util.Arrays;
import r3.g;
import r3.k;
import r3.l;
import r3.m;
import r3.s;
import r3.v;
import r8.d;
public final class a implements k {
    public static final int[] f44027p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f44028q;
    public static final byte[] f44029r;
    public static final byte[] f44030s;
    public static final int f44031t;
    public final int f44033b;
    public boolean f44034c;
    public long d;
    public int e;
    public int f44035f;
    public boolean f44036g;
    public long h;
    public int f44038j;
    public long f44039k;
    public m f44040l;
    public v f44041m;
    public s f44042n;
    public boolean f44043o;
    public final byte[] f44032a = new byte[1];
    public int f44037i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f44028q = iArr;
        int i10 = d0.f6924a;
        Charset charset = d.f43413c;
        f44029r = "#!AMR\n".getBytes(charset);
        f44030s = "#!AMR-WB\n".getBytes(charset);
        f44031t = iArr[8];
    }

    public a(int i10) {
        this.f44033b = i10;
    }

    public final int a(l lVar) {
        String str;
        boolean z4;
        lVar.m();
        byte[] bArr = this.f44032a;
        lVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z4 = this.f44034c) && (i10 < 10 || i10 > 13)) || (!z4 && (i10 < 12 || i10 > 14)))) {
                if (z4) {
                    return f44028q[i10];
                }
                return f44027p[i10];
            }
            StringBuilder sb = new StringBuilder("Illegal AMR ");
            if (this.f44034c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb.append(str);
            sb.append(" frame type ");
            sb.append(i10);
            throw r1.a(sb.toString(), null);
        }
        throw r1.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    public final boolean b(l lVar) {
        lVar.m();
        byte[] bArr = f44029r;
        byte[] bArr2 = new byte[bArr.length];
        lVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f44034c = false;
            lVar.n(bArr.length);
            return true;
        }
        lVar.m();
        byte[] bArr3 = f44030s;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.b(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f44034c = true;
        lVar.n(bArr3.length);
        return true;
    }

    @Override
    public final void d(long j10, long j11) {
        this.d = 0L;
        this.e = 0;
        this.f44035f = 0;
        if (j10 != 0) {
            s sVar = this.f44042n;
            if (sVar instanceof g) {
                g gVar = (g) sVar;
                this.f44039k = (Math.max(0L, j10 - gVar.f43240b) * 8000000) / gVar.e;
                return;
            }
        }
        this.f44039k = 0L;
    }

    @Override
    public final void e(m mVar) {
        this.f44040l = mVar;
        this.f44041m = mVar.d2(0, 1);
        mVar.j1();
    }

    @Override
    public final int h(r3.l r13, org.telegram.ui.Components.jb r14) {
        throw new UnsupportedOperationException("Method not decompiled: s3.a.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        return b(lVar);
    }

    @Override
    public final void release() {
    }
}
