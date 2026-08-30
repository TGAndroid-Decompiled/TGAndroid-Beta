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
    public static final int[] f43962p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f43963q;
    public static final byte[] f43964r;
    public static final byte[] f43965s;
    public static final int f43966t;
    public final int f43968b;
    public boolean f43969c;
    public long d;
    public int e;
    public int f43970f;
    public boolean f43971g;
    public long h;
    public int f43973j;
    public long f43974k;
    public m f43975l;
    public v f43976m;
    public s f43977n;
    public boolean f43978o;
    public final byte[] f43967a = new byte[1];
    public int f43972i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f43963q = iArr;
        int i10 = d0.f6937a;
        Charset charset = d.f43389c;
        f43964r = "#!AMR\n".getBytes(charset);
        f43965s = "#!AMR-WB\n".getBytes(charset);
        f43966t = iArr[8];
    }

    public a(int i10) {
        this.f43968b = i10;
    }

    public final int a(l lVar) {
        String str;
        boolean z4;
        lVar.t();
        byte[] bArr = this.f43967a;
        lVar.c(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z4 = this.f43969c) && (i10 < 10 || i10 > 13)) || (!z4 && (i10 < 12 || i10 > 14)))) {
                if (z4) {
                    return f43963q[i10];
                }
                return f43962p[i10];
            }
            StringBuilder sb = new StringBuilder("Illegal AMR ");
            if (this.f43969c) {
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
        lVar.t();
        byte[] bArr = f43964r;
        byte[] bArr2 = new byte[bArr.length];
        lVar.c(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f43969c = false;
            lVar.u(bArr.length);
            return true;
        }
        lVar.t();
        byte[] bArr3 = f43965s;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.c(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f43969c = true;
        lVar.u(bArr3.length);
        return true;
    }

    @Override
    public final void d(long j10, long j11) {
        this.d = 0L;
        this.e = 0;
        this.f43970f = 0;
        if (j10 != 0) {
            s sVar = this.f43977n;
            if (sVar instanceof g) {
                g gVar = (g) sVar;
                this.f43974k = (Math.max(0L, j10 - gVar.f43216b) * 8000000) / gVar.e;
                return;
            }
        }
        this.f43974k = 0L;
    }

    @Override
    public final void e(m mVar) {
        this.f43975l = mVar;
        this.f43976m = mVar.c2(0, 1);
        mVar.f1();
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
