package u3;

import d5.f0;
public final class r {
    public final o f48082a;
    public final int f48083b;
    public final long[] f48084c;
    public final int[] d;
    public final int f48085e;
    public final long[] f48086f;
    public final int[] f48087g;
    public final long h;

    public r(o oVar, long[] jArr, int[] iArr, int i9, long[] jArr2, int[] iArr2, long j10) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        d5.a.f(z11);
        d5.a.f(iArr2.length == jArr2.length);
        this.f48082a = oVar;
        this.f48084c = jArr;
        this.d = iArr;
        this.f48085e = i9;
        this.f48086f = jArr2;
        this.f48087g = iArr2;
        this.h = j10;
        this.f48083b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f48086f;
        for (int b10 = f0.b(jArr, j10, true); b10 < jArr.length; b10++) {
            if ((this.f48087g[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }
}
