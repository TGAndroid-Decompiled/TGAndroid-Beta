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
    public static final int[] f46953p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f46954q;
    public static final byte[] f46955r;
    public static final byte[] f46956s;
    public static final int f46957t;
    public final int f46959b;
    public boolean f46960c;
    public long d;
    public int f46961e;
    public int f46962f;
    public boolean f46963g;
    public long h;
    public int f46965j;
    public long f46966k;
    public m f46967l;
    public v f46968m;
    public s f46969n;
    public boolean f46970o;
    public final byte[] f46958a = new byte[1];
    public int f46964i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f46954q = iArr;
        int i10 = d0.f7237a;
        Charset charset = d.f46769c;
        f46955r = "#!AMR\n".getBytes(charset);
        f46956s = "#!AMR-WB\n".getBytes(charset);
        f46957t = iArr[8];
    }

    public a(int i10) {
        this.f46959b = i10;
    }

    public final int a(l lVar) {
        String str;
        boolean z4;
        lVar.r();
        byte[] bArr = this.f46958a;
        lVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z4 = this.f46960c) && (i10 < 10 || i10 > 13)) || (!z4 && (i10 < 12 || i10 > 14)))) {
                if (z4) {
                    return f46954q[i10];
                }
                return f46953p[i10];
            }
            StringBuilder sb = new StringBuilder("Illegal AMR ");
            if (this.f46960c) {
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
        byte[] bArr = f46955r;
        byte[] bArr2 = new byte[bArr.length];
        lVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f46960c = false;
            lVar.s(bArr.length);
            return true;
        }
        lVar.r();
        byte[] bArr3 = f46956s;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.b(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f46960c = true;
        lVar.s(bArr3.length);
        return true;
    }

    @Override
    public final void d(long j10, long j11) {
        this.d = 0L;
        this.f46961e = 0;
        this.f46962f = 0;
        if (j10 != 0) {
            s sVar = this.f46969n;
            if (sVar instanceof g) {
                g gVar = (g) sVar;
                this.f46966k = (Math.max(0L, j10 - gVar.f46580b) * 8000000) / gVar.f46582e;
                return;
            }
        }
        this.f46966k = 0L;
    }

    @Override
    public final void e(m mVar) {
        this.f46967l = mVar;
        this.f46968m = mVar.i2(0, 1);
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
