package t3;

import d5.f0;
import m3.s;
import m3.u;
public final class h implements f {
    public final long f47628a;
    public final int f47629b;
    public final long f47630c;
    public final long d;
    public final long f47631e;
    public final long[] f47632f;

    public h(long j10, int i9, long j11, long j12, long[] jArr) {
        this.f47628a = j10;
        this.f47629b = i9;
        this.f47630c = j11;
        this.f47632f = jArr;
        this.d = j12;
        this.f47631e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override
    public final long a(long j10) {
        long j11;
        double d;
        long j12 = j10 - this.f47628a;
        if (e() && j12 > this.f47629b) {
            long[] jArr = this.f47632f;
            d5.a.j(jArr);
            double d9 = (j12 * 256.0d) / this.d;
            int e10 = f0.e(jArr, (long) d9, true);
            long j13 = this.f47630c;
            long j14 = (e10 * j13) / 100;
            long j15 = jArr[e10];
            int i9 = e10 + 1;
            long j16 = (j13 * i9) / 100;
            if (e10 == 99) {
                j11 = 256;
            } else {
                j11 = jArr[i9];
            }
            if (j15 == j11) {
                d = 0.0d;
            } else {
                d = (d9 - j15) / (j11 - j15);
            }
            return Math.round(d * (j16 - j14)) + j14;
        }
        return 0L;
    }

    @Override
    public final long d() {
        return this.f47631e;
    }

    @Override
    public final boolean e() {
        if (this.f47632f != null) {
            return true;
        }
        return false;
    }

    @Override
    public final s h(long j10) {
        double d;
        double d9;
        boolean e10 = e();
        int i9 = this.f47629b;
        long j11 = this.f47628a;
        if (!e10) {
            u uVar = new u(0L, j11 + i9);
            return new s(uVar, uVar);
        }
        long i10 = f0.i(j10, 0L, this.f47630c);
        double d10 = (i10 * 100.0d) / this.f47630c;
        double d11 = 0.0d;
        if (d10 <= 0.0d) {
            d = 256.0d;
        } else if (d10 >= 100.0d) {
            d = 256.0d;
            d11 = 256.0d;
        } else {
            int i11 = (int) d10;
            long[] jArr = this.f47632f;
            d5.a.j(jArr);
            double d12 = jArr[i11];
            if (i11 == 99) {
                d = 256.0d;
                d9 = 256.0d;
            } else {
                d = 256.0d;
                d9 = jArr[i11 + 1];
            }
            d11 = ((d9 - d12) * (d10 - i11)) + d12;
        }
        long j12 = this.d;
        u uVar2 = new u(i10, j11 + f0.i(Math.round((d11 / d) * j12), i9, j12 - 1));
        return new s(uVar2, uVar2);
    }

    @Override
    public final long i() {
        return this.f47630c;
    }
}
