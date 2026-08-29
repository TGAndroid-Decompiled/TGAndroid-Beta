package p3;

import f5.d0;
import j3.t1;
import java.nio.charset.Charset;
import java.util.Arrays;
import o3.g;
import o3.k;
import o3.l;
import o3.m;
import o3.t;
import o3.w;
import p8.d;
public final class a implements k {
    public static final int[] f45513p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f45514q;
    public static final byte[] f45515r;
    public static final byte[] f45516s;
    public static final int f45517t;
    public final int f45519b;
    public boolean f45520c;
    public long d;
    public int f45521e;
    public int f45522f;
    public boolean f45523g;
    public long h;
    public int f45525j;
    public long f45526k;
    public m f45527l;
    public w f45528m;
    public t f45529n;
    public boolean f45530o;
    public final byte[] f45518a = new byte[1];
    public int f45524i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f45514q = iArr;
        int i10 = d0.f6579a;
        Charset charset = d.f45658c;
        f45515r = "#!AMR\n".getBytes(charset);
        f45516s = "#!AMR-WB\n".getBytes(charset);
        f45517t = iArr[8];
    }

    public a(int i10) {
        this.f45519b = i10;
    }

    public final int a(l lVar) {
        String str;
        boolean z10;
        lVar.s();
        byte[] bArr = this.f45518a;
        lVar.a(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z10 = this.f45520c) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
                if (z10) {
                    return f45514q[i10];
                }
                return f45513p[i10];
            }
            StringBuilder sb2 = new StringBuilder("Illegal AMR ");
            if (this.f45520c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i10);
            throw t1.a(sb2.toString(), null);
        }
        throw t1.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    public final boolean b(l lVar) {
        lVar.s();
        byte[] bArr = f45515r;
        byte[] bArr2 = new byte[bArr.length];
        lVar.a(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f45520c = false;
            lVar.t(bArr.length);
            return true;
        }
        lVar.s();
        byte[] bArr3 = f45516s;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.a(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f45520c = true;
        lVar.t(bArr3.length);
        return true;
    }

    @Override
    public final int d(o3.l r13, o3.n r14) {
        throw new UnsupportedOperationException("Method not decompiled: p3.a.d(o3.l, o3.n):int");
    }

    @Override
    public final boolean e(l lVar) {
        return b(lVar);
    }

    @Override
    public final void f(long j10, long j11) {
        this.d = 0L;
        this.f45521e = 0;
        this.f45522f = 0;
        if (j10 != 0) {
            t tVar = this.f45529n;
            if (tVar instanceof g) {
                g gVar = (g) tVar;
                this.f45526k = (Math.max(0L, j10 - gVar.f19088b) * 8000000) / gVar.f19090e;
                return;
            }
        }
        this.f45526k = 0L;
    }

    @Override
    public final void i(m mVar) {
        this.f45527l = mVar;
        this.f45528m = mVar.Z1(0, 1);
        mVar.e1();
    }

    @Override
    public final void release() {
    }
}
