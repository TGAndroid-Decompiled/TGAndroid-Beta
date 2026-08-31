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
    public static final int[] f46922p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f46923q;
    public static final byte[] f46924r;
    public static final byte[] f46925s;
    public static final int f46926t;
    public final int f46928b;
    public boolean f46929c;
    public long d;
    public int f46930e;
    public int f46931f;
    public boolean f46932g;
    public long h;
    public int f46934j;
    public long f46935k;
    public m f46936l;
    public v f46937m;
    public s f46938n;
    public boolean f46939o;
    public final byte[] f46927a = new byte[1];
    public int f46933i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f46923q = iArr;
        int i10 = d0.f7237a;
        Charset charset = d.f46738c;
        f46924r = "#!AMR\n".getBytes(charset);
        f46925s = "#!AMR-WB\n".getBytes(charset);
        f46926t = iArr[8];
    }

    public a(int i10) {
        this.f46928b = i10;
    }

    public final int a(l lVar) {
        String str;
        boolean z4;
        lVar.r();
        byte[] bArr = this.f46927a;
        lVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z4 = this.f46929c) && (i10 < 10 || i10 > 13)) || (!z4 && (i10 < 12 || i10 > 14)))) {
                if (z4) {
                    return f46923q[i10];
                }
                return f46922p[i10];
            }
            StringBuilder sb = new StringBuilder("Illegal AMR ");
            if (this.f46929c) {
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
        lVar.r();
        byte[] bArr = f46924r;
        byte[] bArr2 = new byte[bArr.length];
        lVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f46929c = false;
            lVar.s(bArr.length);
            return true;
        }
        lVar.r();
        byte[] bArr3 = f46925s;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.b(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f46929c = true;
        lVar.s(bArr3.length);
        return true;
    }

    @Override
    public final void d(long j10, long j11) {
        this.d = 0L;
        this.f46930e = 0;
        this.f46931f = 0;
        if (j10 != 0) {
            s sVar = this.f46938n;
            if (sVar instanceof g) {
                g gVar = (g) sVar;
                this.f46935k = (Math.max(0L, j10 - gVar.f46549b) * 8000000) / gVar.f46551e;
                return;
            }
        }
        this.f46935k = 0L;
    }

    @Override
    public final void e(m mVar) {
        this.f46936l = mVar;
        this.f46937m = mVar.i2(0, 1);
        mVar.i1();
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
