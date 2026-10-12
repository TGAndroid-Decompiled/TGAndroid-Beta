package w3;

import e2.m0;
import v7.u6;
public final class u {
    public final r f47189a;
    public final int f47190b;
    public final long[] f47191c;
    public final int[] d;
    public final int e;
    public final long[] f47192f;
    public final int[] f47193g;
    public final int[] h;
    public final long f47194i;
    public final boolean f47195j;

    public u(r rVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, int[] iArr3, boolean z10, long j10, int i11) {
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
        this.f47189a = rVar;
        this.f47191c = jArr;
        this.d = iArr;
        this.e = i10;
        this.f47192f = jArr2;
        this.f47193g = iArr2;
        this.h = iArr3;
        this.f47195j = z10;
        this.f47194i = j10;
        this.f47190b = i11;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f47192f;
        if (jArr.length <= 0) {
            return -1;
        }
        int i10 = 0;
        if (this.f47195j) {
            return m0.f(jArr, j10, false);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i11 = -1;
        while (i10 <= length) {
            int z10 = i2.d.z(length, i10, 2, i10);
            if (jArr[iArr[z10]] <= j10) {
                i10 = z10 + 1;
                i11 = z10;
            } else {
                length = z10 - 1;
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
        long[] jArr = this.f47192f;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.f47195j) {
            return m0.b(jArr, j10, true);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i10 = 0;
        int i11 = -1;
        while (i10 <= length) {
            int z10 = i2.d.z(length, i10, 2, i10);
            if (jArr[iArr[z10]] >= j10) {
                length = z10 - 1;
                i11 = z10;
            } else {
                i10 = z10 + 1;
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
