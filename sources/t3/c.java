package t3;

import android.util.Pair;
import d5.g0;
import m3.s;
import m3.u;

public final class c implements f {

    public final long[] f48015a;

    public final long[] f48016b;

    public final long f48017c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.f48015a = jArr;
        this.f48016b = jArr2;
        this.f48017c = j10 == -9223372036854775807L ? g0.H(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair b(long j10, long[] jArr, long[] jArr2) {
        int iE = g0.e(jArr, j10, true);
        long j11 = jArr[iE];
        long j12 = jArr2[iE];
        int i10 = iE + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override
    public final long a(long j10) {
        return g0.H(((Long) b(j10, this.f48015a, this.f48016b).second).longValue());
    }

    @Override
    public final long d() {
        return -1L;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final s h(long j10) {
        Pair pairB = b(g0.S(g0.i(j10, 0L, this.f48017c)), this.f48016b, this.f48015a);
        u uVar = new u(g0.H(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue());
        return new s(uVar, uVar);
    }

    @Override
    public final long i() {
        return this.f48017c;
    }
}
