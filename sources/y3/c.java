package y3;

import android.util.Pair;
import f3.b0;
import f3.d0;
import h2.m0;
public final class c implements h {
    public final long[] f58837a;
    public final long[] f58838b;
    public final long f58839c;

    public c(long j3, long[] jArr, long[] jArr2) {
        this.f58837a = jArr;
        this.f58838b = jArr2;
        this.f58839c = j3 == -9223372036854775807L ? m0.S(jArr2[jArr2.length - 1]) : j3;
    }

    public static Pair i(long j3, long[] jArr, long[] jArr2) {
        double d;
        int f10 = m0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long j11 = jArr2[f10];
        int i7 = f10 + 1;
        if (i7 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        long j12 = jArr[i7];
        long j13 = jArr2[i7];
        if (j12 == j10) {
            d = 0.0d;
        } else {
            d = (j3 - j10) / (j12 - j10);
        }
        return Pair.create(Long.valueOf(j3), Long.valueOf(((long) (d * (j13 - j11))) + j11));
    }

    @Override
    public final long a(long j3) {
        return m0.S(((Long) i(j3, this.f58837a, this.f58838b).second).longValue());
    }

    @Override
    public final long b() {
        return -1L;
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
    public final b0 f(long j3) {
        Pair i7 = i(m0.h0(m0.j(j3, 0L, this.f58839c)), this.f58838b, this.f58837a);
        d0 d0Var = new d0(m0.S(((Long) i7.first).longValue()), ((Long) i7.second).longValue());
        return new b0(d0Var, d0Var);
    }

    @Override
    public final int g() {
        return -2147483647;
    }

    @Override
    public final long h() {
        return this.f58839c;
    }
}
