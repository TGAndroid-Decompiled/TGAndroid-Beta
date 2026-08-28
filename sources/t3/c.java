package t3;

import android.util.Pair;
import d5.f0;
import m3.s;
import m3.u;
public final class c implements f {
    public final long[] f47604a;
    public final long[] f47605b;
    public final long f47606c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.f47604a = jArr;
        this.f47605b = jArr2;
        this.f47606c = j10 == -9223372036854775807L ? f0.H(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair b(long j10, long[] jArr, long[] jArr2) {
        double d;
        int e10 = f0.e(jArr, j10, true);
        long j11 = jArr[e10];
        long j12 = jArr2[e10];
        int i9 = e10 + 1;
        if (i9 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i9];
        long j14 = jArr2[i9];
        if (j13 == j11) {
            d = 0.0d;
        } else {
            d = (j10 - j11) / (j13 - j11);
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) (d * (j14 - j12))) + j12));
    }

    @Override
    public final long a(long j10) {
        return f0.H(((Long) b(j10, this.f47604a, this.f47605b).second).longValue());
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
        Pair b10 = b(f0.S(f0.i(j10, 0L, this.f47606c)), this.f47605b, this.f47604a);
        u uVar = new u(f0.H(((Long) b10.first).longValue()), ((Long) b10.second).longValue());
        return new s(uVar, uVar);
    }

    @Override
    public final long i() {
        return this.f47606c;
    }
}
