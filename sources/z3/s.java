package z3;

import h5.d0;
public final class s {
    public final p f51076a;
    public final int f51077b;
    public final long[] f51078c;
    public final int[] d;
    public final int f51079e;
    public final long[] f51080f;
    public final int[] f51081g;
    public final long h;

    public s(p pVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z4;
        boolean z10;
        if (iArr.length == jArr2.length) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        h5.a.f(z10);
        h5.a.f(iArr2.length == jArr2.length);
        this.f51076a = pVar;
        this.f51078c = jArr;
        this.d = iArr;
        this.f51079e = i10;
        this.f51080f = jArr2;
        this.f51081g = iArr2;
        this.h = j10;
        this.f51077b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f51080f;
        for (int b10 = d0.b(jArr, j10, true); b10 < jArr.length; b10++) {
            if ((this.f51081g[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }
}
