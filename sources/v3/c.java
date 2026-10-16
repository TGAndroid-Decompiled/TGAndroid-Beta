package v3;

import android.util.Pair;
import c3.a0;
import c3.c0;
import e2.m0;
public final class c implements h {
    public final long[] f46526a;
    public final long[] f46527b;
    public final long f46528c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.f46526a = jArr;
        this.f46527b = jArr2;
        this.f46528c = j10 == -9223372036854775807L ? m0.S(jArr2[jArr2.length - 1]) : j10;
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
    public final long a(long j10) {
        return m0.S(((Long) i(j10, this.f46526a, this.f46527b).second).longValue());
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
    public final a0 f(long j10) {
        Pair i10 = i(m0.h0(m0.j(j10, 0L, this.f46528c)), this.f46527b, this.f46526a);
        c0 c0Var = new c0(m0.S(((Long) i10.first).longValue()), ((Long) i10.second).longValue());
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int g() {
        return -2147483647;
    }

    @Override
    public final long h() {
        return this.f46528c;
    }
}
