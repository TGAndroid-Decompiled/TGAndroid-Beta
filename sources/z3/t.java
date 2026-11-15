package z3;

import a8.ja;
import h2.l0;
public final class t {
    public final q f60906a;
    public final int f60907b;
    public final long[] f60908c;
    public final int[] d;
    public final int f60909e;
    public final long[] f60910f;
    public final int[] f60911g;
    public final int[] h;
    public final long f60912i;
    public final boolean f60913j;

    public t(q qVar, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, int[] iArr3, boolean z10, long j3, int i10) {
        boolean z11;
        boolean z12;
        if (iArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        ja.f(z11);
        if (jArr.length == jArr2.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        ja.f(z12);
        ja.f(iArr2.length == jArr2.length);
        this.f60906a = qVar;
        this.f60908c = jArr;
        this.d = iArr;
        this.f60909e = i7;
        this.f60910f = jArr2;
        this.f60911g = iArr2;
        this.h = iArr3;
        this.f60913j = z10;
        this.f60912i = j3;
        this.f60907b = i10;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j3) {
        long[] jArr = this.f60910f;
        if (jArr.length <= 0) {
            return -1;
        }
        int i7 = 0;
        if (this.f60913j) {
            return l0.f(jArr, j3, false);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i10 = -1;
        while (i7 <= length) {
            int e10 = i5.c.e(length, i7, 2, i7);
            if (jArr[iArr[e10]] <= j3) {
                i7 = e10 + 1;
                i10 = e10;
            } else {
                length = e10 - 1;
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
        long[] jArr = this.f60910f;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.f60913j) {
            return l0.b(jArr, j3, true);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i7 = 0;
        int i10 = -1;
        while (i7 <= length) {
            int e10 = i5.c.e(length, i7, 2, i7);
            if (jArr[iArr[e10]] >= j3) {
                length = e10 - 1;
                i10 = e10;
            } else {
                i7 = e10 + 1;
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
