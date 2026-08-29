package w3;

import f5.d0;
public final class r {
    public final o f49741a;
    public final int f49742b;
    public final long[] f49743c;
    public final int[] d;
    public final int f49744e;
    public final long[] f49745f;
    public final int[] f49746g;
    public final long h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        f5.a.f(z11);
        f5.a.f(iArr2.length == jArr2.length);
        this.f49741a = oVar;
        this.f49743c = jArr;
        this.d = iArr;
        this.f49744e = i10;
        this.f49745f = jArr2;
        this.f49746g = iArr2;
        this.h = j10;
        this.f49742b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f49745f;
        for (int b10 = d0.b(jArr, j10, true); b10 < jArr.length; b10++) {
            if ((this.f49746g[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }
}
