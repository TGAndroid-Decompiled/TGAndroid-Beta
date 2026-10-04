package w3;

import e2.d0;
public final class r {
    public final o f48586a;
    public final int f48587b;
    public final long[] f48588c;
    public final int[] d;
    public final int f48589e;
    public final long[] f48590f;
    public final int[] f48591g;
    public final long h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j3) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        e2.d.b(iArr2.length == jArr2.length);
        this.f48586a = oVar;
        this.f48588c = jArr;
        this.d = iArr;
        this.f48589e = i10;
        this.f48590f = jArr2;
        this.f48591g = iArr2;
        this.h = j3;
        this.f48587b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j3) {
        long[] jArr = this.f48590f;
        for (int a2 = d0.a(jArr, j3, true); a2 < jArr.length; a2++) {
            if ((this.f48591g[a2] & 1) != 0) {
                return a2;
            }
        }
        return -1;
    }
}
