package w3;

import e2.d0;
public final class s {
    public final p f44853a;
    public final int f44854b;
    public final long[] f44855c;
    public final int[] d;
    public final int e;
    public final long[] f44856f;
    public final int[] f44857g;
    public final long h;

    public s(p pVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j3) {
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
        this.f44853a = pVar;
        this.f44855c = jArr;
        this.d = iArr;
        this.e = i10;
        this.f44856f = jArr2;
        this.f44857g = iArr2;
        this.h = j3;
        this.f44854b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j3) {
        long[] jArr = this.f44856f;
        for (int a2 = d0.a(jArr, j3, true); a2 < jArr.length; a2++) {
            if ((this.f44857g[a2] & 1) != 0) {
                return a2;
            }
        }
        return -1;
    }
}
