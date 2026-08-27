package u3;

import d5.g0;

public final class s {

    public final p f48380a;

    public final int f48381b;

    public final long[] f48382c;
    public final int[] d;

    public final int f48383e;

    public final long[] f48384f;

    public final int[] f48385g;
    public final long h;

    public s(p pVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        d5.a.f(iArr.length == jArr2.length);
        d5.a.f(jArr.length == jArr2.length);
        d5.a.f(iArr2.length == jArr2.length);
        this.f48380a = pVar;
        this.f48382c = jArr;
        this.d = iArr;
        this.f48383e = i10;
        this.f48384f = jArr2;
        this.f48385g = iArr2;
        this.h = j10;
        this.f48381b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f48384f;
        for (int iB = g0.b(jArr, j10, true); iB < jArr.length; iB++) {
            if ((this.f48385g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}
