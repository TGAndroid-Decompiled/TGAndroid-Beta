package r3;

import h5.d0;
public final class q implements s {
    public final long[] f43267a;
    public final long[] f43268b;
    public final long f43269c;
    public final boolean d;

    public q(long j10, long[] jArr, long[] jArr2) {
        boolean z4;
        boolean z10;
        if (jArr.length == jArr2.length) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        int length = jArr2.length;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10 && jArr2[0] > 0) {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f43267a = jArr3;
            long[] jArr4 = new long[i10];
            this.f43268b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f43267a = jArr;
            this.f43268b = jArr2;
        }
        this.f43269c = j10;
    }

    @Override
    public final boolean c() {
        return this.d;
    }

    @Override
    public final r f(long j10) {
        if (!this.d) {
            t tVar = t.f43272c;
            return new r(tVar, tVar);
        }
        long[] jArr = this.f43268b;
        int e = d0.e(jArr, j10, true);
        long j11 = jArr[e];
        long[] jArr2 = this.f43267a;
        t tVar2 = new t(j11, jArr2[e]);
        if (j11 != j10 && e != jArr.length - 1) {
            int i10 = e + 1;
            return new r(tVar2, new t(jArr[i10], jArr2[i10]));
        }
        return new r(tVar2, tVar2);
    }

    @Override
    public final long g() {
        return this.f43269c;
    }
}
