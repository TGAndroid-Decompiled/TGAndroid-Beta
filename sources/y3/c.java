package y3;

import android.util.Pair;
import f3.a0;
import f3.c0;
import h2.l0;
public final class c implements h {
    public final long[] f60147a;
    public final long[] f60148b;
    public final long f60149c;

    public c(long j3, long[] jArr, long[] jArr2) {
        this.f60147a = jArr;
        this.f60148b = jArr2;
        this.f60149c = j3 == -9223372036854775807L ? l0.S(jArr2[jArr2.length - 1]) : j3;
    }

    public static Pair i(long j3, long[] jArr, long[] jArr2) {
        double d;
        int f10 = l0.f(jArr, j3, true);
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
    public final long a() {
        return -1L;
    }

    @Override
    public final long b(long j3) {
        return l0.S(((Long) i(j3, this.f60147a, this.f60148b).second).longValue());
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
    public final a0 f(long j3) {
        Pair i7 = i(l0.h0(l0.j(j3, 0L, this.f60149c)), this.f60148b, this.f60147a);
        c0 c0Var = new c0(l0.S(((Long) i7.first).longValue()), ((Long) i7.second).longValue());
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int g() {
        return -2147483647;
    }

    @Override
    public final long h() {
        return this.f60149c;
    }
}
