package t3;

import d5.g0;
import m3.s;
import m3.u;

public final class h implements f {

    public final long f48039a;

    public final int f48040b;

    public final long f48041c;
    public final long d;

    public final long f48042e;

    public final long[] f48043f;

    public h(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f48039a = j10;
        this.f48040b = i10;
        this.f48041c = j11;
        this.f48043f = jArr;
        this.d = j12;
        this.f48042e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override
    public final long a(long j10) {
        long j11 = j10 - this.f48039a;
        if (!e() || j11 <= this.f48040b) {
            return 0L;
        }
        long[] jArr = this.f48043f;
        d5.a.j(jArr);
        double d = (j11 * 256.0d) / this.d;
        int iE = g0.e(jArr, (long) d, true);
        long j12 = this.f48041c;
        long j13 = (((long) iE) * j12) / 100;
        long j14 = jArr[iE];
        int i10 = iE + 1;
        long j15 = (j12 * ((long) i10)) / 100;
        long j16 = iE == 99 ? 256L : jArr[i10];
        return Math.round((j14 == j16 ? 0.0d : (d - j14) / (j16 - j14)) * (j15 - j13)) + j13;
    }

    @Override
    public final long d() {
        return this.f48042e;
    }

    @Override
    public final boolean e() {
        return this.f48043f != null;
    }

    @Override
    public final s h(long j10) {
        double d;
        double d10;
        boolean zE = e();
        int i10 = this.f48040b;
        long j11 = this.f48039a;
        if (!zE) {
            u uVar = new u(0L, j11 + ((long) i10));
            return new s(uVar, uVar);
        }
        long jI = g0.i(j10, 0L, this.f48041c);
        double d11 = (jI * 100.0d) / this.f48041c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d = 256.0d;
        } else if (d11 >= 100.0d) {
            d = 256.0d;
            d12 = 256.0d;
        } else {
            int i11 = (int) d11;
            long[] jArr = this.f48043f;
            d5.a.j(jArr);
            double d13 = jArr[i11];
            if (i11 == 99) {
                d = 256.0d;
                d10 = 256.0d;
            } else {
                d = 256.0d;
                d10 = jArr[i11 + 1];
            }
            d12 = ((d10 - d13) * (d11 - ((double) i11))) + d13;
        }
        long j12 = this.d;
        u uVar2 = new u(jI, j11 + g0.i(Math.round((d12 / d) * j12), i10, j12 - 1));
        return new s(uVar2, uVar2);
    }

    @Override
    public final long i() {
        return this.f48041c;
    }
}
