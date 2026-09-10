package v3;

import android.util.Pair;
import c3.a0;
import c3.c0;
import e2.d0;
public final class c implements f {
    public final long[] f42889a;
    public final long[] f42890b;
    public final long f42891c;

    public c(long j3, long[] jArr, long[] jArr2) {
        this.f42889a = jArr;
        this.f42890b = jArr2;
        this.f42891c = j3 == -9223372036854775807L ? d0.Q(jArr2[jArr2.length - 1]) : j3;
    }

    public static Pair b(long j3, long[] jArr, long[] jArr2) {
        double d;
        int e = d0.e(jArr, j3, true);
        long j10 = jArr[e];
        long j11 = jArr2[e];
        int i10 = e + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        long j12 = jArr[i10];
        long j13 = jArr2[i10];
        if (j12 == j10) {
            d = 0.0d;
        } else {
            d = (j3 - j10) / (j12 - j10);
        }
        return Pair.create(Long.valueOf(j3), Long.valueOf(((long) (d * (j13 - j11))) + j11));
    }

    @Override
    public final long a(long j3) {
        return d0.Q(((Long) b(j3, this.f42889a, this.f42890b).second).longValue());
    }

    @Override
    public final long d() {
        return -1L;
    }

    @Override
    public final long e() {
        return 0L;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        Pair b10 = b(d0.e0(d0.i(j3, 0L, this.f42891c)), this.f42890b, this.f42889a);
        c0 c0Var = new c0(d0.Q(((Long) b10.first).longValue()), ((Long) b10.second).longValue());
        return new a0(c0Var, c0Var);
    }

    @Override
    public final int k() {
        return -2147483647;
    }

    @Override
    public final long l() {
        return this.f42891c;
    }
}
