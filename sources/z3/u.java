package z3;

import a8.ia;
import h2.m0;
public final class u {
    public final r f59699a;
    public final int f59700b;
    public final long[] f59701c;
    public final int[] d;
    public final int f59702e;
    public final long[] f59703f;
    public final int[] f59704g;
    public final int[] h;
    public final long f59705i;
    public final boolean f59706j;

    public u(r rVar, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, int[] iArr3, boolean z9, long j3, int i10) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        ia.f(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        ia.f(z11);
        ia.f(iArr2.length == jArr2.length);
        this.f59699a = rVar;
        this.f59701c = jArr;
        this.d = iArr;
        this.f59702e = i7;
        this.f59703f = jArr2;
        this.f59704g = iArr2;
        this.h = iArr3;
        this.f59706j = z9;
        this.f59705i = j3;
        this.f59700b = i10;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j3) {
        long[] jArr = this.f59703f;
        if (jArr.length <= 0) {
            return -1;
        }
        int i7 = 0;
        if (this.f59706j) {
            return m0.f(jArr, j3, false);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i10 = -1;
        while (i7 <= length) {
            int D = jg.g.D(length, i7, 2, i7);
            if (jArr[iArr[D]] <= j3) {
                i7 = D + 1;
                i10 = D;
            } else {
                length = D - 1;
            }
        }
        if (i10 == -1) {
            return -1;
        }
        long j10 = jArr[iArr[i10]];
        if (j10 == j3) {
            while (i10 > 0 && jArr[iArr[i10 - 1]] == j10) {
                i10--;
            }
        }
        return iArr[i10];
    }

    public final int b(long j3) {
        long[] jArr = this.f59703f;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.f59706j) {
            return m0.b(jArr, j3, true);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i7 = 0;
        int i10 = -1;
        while (i7 <= length) {
            int D = jg.g.D(length, i7, 2, i7);
            if (jArr[iArr[D]] >= j3) {
                length = D - 1;
                i10 = D;
            } else {
                i7 = D + 1;
            }
        }
        if (i10 == -1) {
            return -1;
        }
        long j10 = jArr[iArr[i10]];
        if (j10 == j3) {
            while (i10 < iArr.length - 1) {
                int i11 = i10 + 1;
                if (jArr[iArr[i11]] != j10) {
                    break;
                }
                i10 = i11;
            }
        }
        return iArr[i10];
    }
}
