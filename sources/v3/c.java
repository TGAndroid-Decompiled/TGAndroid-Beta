package v3;

import android.util.Pair;
import c3.d0;
import c3.f0;
import e2.m0;
public final class c implements h {
    public final long[] f48361a;
    public final long[] f48362b;
    public final long f48363c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.f48361a = jArr;
        this.f48362b = jArr2;
        this.f48363c = j10 == -9223372036854775807L ? m0.S(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair i(long j10, long[] jArr, long[] jArr2) {
        double d;
        int f7 = m0.f(jArr, j10, true);
        long j11 = jArr[f7];
        long j12 = jArr2[f7];
        int i10 = f7 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        long j14 = jArr2[i10];
        if (j13 == j11) {
            d = 0.0d;
        } else {
            d = (j10 - j11) / (j13 - j11);
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) (d * (j14 - j12))) + j12));
    }

    @Override
    public final long a() {
        return -1L;
    }

    @Override
    public final long b(long j10) {
        return m0.S(((Long) i(j10, this.f48361a, this.f48362b).second).longValue());
    }

    @Override
    public final long c() {
        return 0L;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final d0 f(long j10) {
        Pair i10 = i(m0.h0(m0.j(j10, 0L, this.f48363c)), this.f48362b, this.f48361a);
        f0 f0Var = new f0(m0.S(((Long) i10.first).longValue()), ((Long) i10.second).longValue());
        return new d0(f0Var, f0Var);
    }

    @Override
    public final int g() {
        return -2147483647;
    }

    @Override
    public final long h() {
        return this.f48363c;
    }
}
