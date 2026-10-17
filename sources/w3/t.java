package w3;

import e2.m0;
import v7.u6;
public final class t {
    public final q f48595a;
    public final int f48596b;
    public final long[] f48597c;
    public final int[] d;
    public final int e;
    public final long[] f48598f;
    public final int[] f48599g;
    public final int[] h;
    public final long f48600i;
    public final boolean f48601j;

    public t(q qVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, int[] iArr3, boolean z10, long j10, int i11) {
        boolean z11;
        boolean z12;
        if (iArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        if (jArr.length == jArr2.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        u6.g(z12);
        u6.g(iArr2.length == jArr2.length);
        this.f48595a = qVar;
        this.f48597c = jArr;
        this.d = iArr;
        this.e = i10;
        this.f48598f = jArr2;
        this.f48599g = iArr2;
        this.h = iArr3;
        this.f48601j = z10;
        this.f48600i = j10;
        this.f48596b = i11;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f48598f;
        if (jArr.length <= 0) {
            return -1;
        }
        int i10 = 0;
        if (this.f48601j) {
            return m0.f(jArr, j10, false);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i11 = -1;
        while (i10 <= length) {
            int C = i0.a.C(length, i10, 2, i10);
            if (jArr[iArr[C]] <= j10) {
                i10 = C + 1;
                i11 = C;
            } else {
                length = C - 1;
            }
        }
        if (i11 == -1) {
            return -1;
        }
        long j11 = jArr[iArr[i11]];
        if (j11 == j10) {
            while (i11 > 0 && jArr[iArr[i11 - 1]] == j11) {
                i11--;
            }
        }
        return iArr[i11];
    }

    public final int b(long j10) {
        long[] jArr = this.f48598f;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.f48601j) {
            return m0.b(jArr, j10, true);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i10 = 0;
        int i11 = -1;
        while (i10 <= length) {
            int C = i0.a.C(length, i10, 2, i10);
            if (jArr[iArr[C]] >= j10) {
                length = C - 1;
                i11 = C;
            } else {
                i10 = C + 1;
            }
        }
        if (i11 == -1) {
            return -1;
        }
        long j11 = jArr[iArr[i11]];
        if (j11 == j10) {
            while (i11 < iArr.length - 1) {
                int i12 = i11 + 1;
                if (jArr[iArr[i12]] != j11) {
                    break;
                }
                i11 = i12;
            }
        }
        return iArr[i11];
    }
}
