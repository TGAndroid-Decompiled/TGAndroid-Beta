package w3;

import a8.yb;
import e2.n0;
public final class t {
    public final q f50826a;
    public final int f50827b;
    public final long[] f50828c;
    public final int[] d;
    public final int e;
    public final long[] f50829f;
    public final int[] f50830g;
    public final int[] h;
    public final long f50831i;
    public final boolean f50832j;

    public t(q qVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, int[] iArr3, boolean z10, long j10, int i11) {
        boolean z11;
        boolean z12;
        if (iArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        yb.g(z11);
        if (jArr.length == jArr2.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        yb.g(z12);
        yb.g(iArr2.length == jArr2.length);
        this.f50826a = qVar;
        this.f50828c = jArr;
        this.d = iArr;
        this.e = i10;
        this.f50829f = jArr2;
        this.f50830g = iArr2;
        this.h = iArr3;
        this.f50832j = z10;
        this.f50831i = j10;
        this.f50827b = i11;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f50829f;
        if (jArr.length <= 0) {
            return -1;
        }
        int i10 = 0;
        if (this.f50832j) {
            return n0.f(jArr, j10, false);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i11 = -1;
        while (i10 <= length) {
            int A = ic.a.A(length, i10, 2, i10);
            if (jArr[iArr[A]] <= j10) {
                i10 = A + 1;
                i11 = A;
            } else {
                length = A - 1;
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
        long[] jArr = this.f50829f;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.f50832j) {
            return n0.b(jArr, j10, true);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i10 = 0;
        int i11 = -1;
        while (i10 <= length) {
            int A = ic.a.A(length, i10, 2, i10);
            if (jArr[iArr[A]] >= j10) {
                length = A - 1;
                i11 = A;
            } else {
                i10 = A + 1;
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
