package y3;

import b8.zb;
import g2.n0;
import k2.p1;
public final class u {
    public final r f59023a;
    public final int f59024b;
    public final long[] f59025c;
    public final int[] d;
    public final int f59026e;
    public final long[] f59027f;
    public final int[] f59028g;
    public final int[] h;
    public final long f59029i;
    public final boolean f59030j;

    public u(r rVar, long[] jArr, int[] iArr, int i3, long[] jArr2, int[] iArr2, int[] iArr3, boolean z10, long j10, int i10) {
        boolean z11;
        boolean z12;
        if (iArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        zb.f(z11);
        if (jArr.length == jArr2.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        zb.f(z12);
        zb.f(iArr2.length == jArr2.length);
        this.f59023a = rVar;
        this.f59025c = jArr;
        this.d = iArr;
        this.f59026e = i3;
        this.f59027f = jArr2;
        this.f59028g = iArr2;
        this.h = iArr3;
        this.f59030j = z10;
        this.f59029i = j10;
        this.f59024b = i10;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f59027f;
        if (jArr.length <= 0) {
            return -1;
        }
        int i3 = 0;
        if (this.f59030j) {
            return n0.f(jArr, j10, false);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i10 = -1;
        while (i3 <= length) {
            int e10 = p1.e(length, i3, 2, i3);
            if (jArr[iArr[e10]] <= j10) {
                i3 = e10 + 1;
                i10 = e10;
            } else {
                length = e10 - 1;
            }
        }
        if (i10 == -1) {
            return -1;
        }
        long j11 = jArr[iArr[i10]];
        if (j11 == j10) {
            while (i10 > 0 && jArr[iArr[i10 - 1]] == j11) {
                i10--;
            }
        }
        return iArr[i10];
    }

    public final int b(long j10) {
        long[] jArr = this.f59027f;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.f59030j) {
            return n0.b(jArr, j10, true);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i3 = 0;
        int i10 = -1;
        while (i3 <= length) {
            int e10 = p1.e(length, i3, 2, i3);
            if (jArr[iArr[e10]] >= j10) {
                length = e10 - 1;
                i10 = e10;
            } else {
                i3 = e10 + 1;
            }
        }
        if (i10 == -1) {
            return -1;
        }
        long j11 = jArr[iArr[i10]];
        if (j11 == j10) {
            while (i10 < iArr.length - 1) {
                int i11 = i10 + 1;
                if (jArr[iArr[i11]] != j11) {
                    break;
                }
                i10 = i11;
            }
        }
        return iArr[i10];
    }
}
