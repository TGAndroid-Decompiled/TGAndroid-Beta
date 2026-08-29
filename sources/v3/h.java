package v3;

import f5.d0;
import o3.s;
import o3.u;
public final class h implements f {
    public final long f49355a;
    public final int f49356b;
    public final long f49357c;
    public final long d;
    public final long f49358e;
    public final long[] f49359f;

    public h(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f49355a = j10;
        this.f49356b = i10;
        this.f49357c = j11;
        this.f49359f = jArr;
        this.d = j12;
        this.f49358e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override
    public final long a() {
        return this.f49358e;
    }

    @Override
    public final long b(long j10) {
        long j11;
        double d;
        long j12 = j10 - this.f49355a;
        if (c() && j12 > this.f49356b) {
            long[] jArr = this.f49359f;
            f5.a.j(jArr);
            double d10 = (j12 * 256.0d) / this.d;
            int e10 = d0.e(jArr, (long) d10, true);
            long j13 = this.f49357c;
            long j14 = (e10 * j13) / 100;
            long j15 = jArr[e10];
            int i10 = e10 + 1;
            long j16 = (j13 * i10) / 100;
            if (e10 == 99) {
                j11 = 256;
            } else {
                j11 = jArr[i10];
            }
            if (j15 == j11) {
                d = 0.0d;
            } else {
                d = (d10 - j15) / (j11 - j15);
            }
            return Math.round(d * (j16 - j14)) + j14;
        }
        return 0L;
    }

    @Override
    public final boolean c() {
        if (this.f49359f != null) {
            return true;
        }
        return false;
    }

    @Override
    public final s g(long j10) {
        double d;
        double d10;
        boolean c3 = c();
        int i10 = this.f49356b;
        long j11 = this.f49355a;
        if (!c3) {
            u uVar = new u(0L, j11 + i10);
            return new s(uVar, uVar);
        }
        long i11 = d0.i(j10, 0L, this.f49357c);
        double d11 = (i11 * 100.0d) / this.f49357c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d = 256.0d;
        } else if (d11 >= 100.0d) {
            d = 256.0d;
            d12 = 256.0d;
        } else {
            int i12 = (int) d11;
            long[] jArr = this.f49359f;
            f5.a.j(jArr);
            double d13 = jArr[i12];
            if (i12 == 99) {
                d = 256.0d;
                d10 = 256.0d;
            } else {
                d = 256.0d;
                d10 = jArr[i12 + 1];
            }
            d12 = ((d10 - d13) * (d11 - i12)) + d13;
        }
        long j12 = this.d;
        u uVar2 = new u(i11, j11 + d0.i(Math.round((d12 / d) * j12), i10, j12 - 1));
        return new s(uVar2, uVar2);
    }

    @Override
    public final long h() {
        return this.f49357c;
    }
}
