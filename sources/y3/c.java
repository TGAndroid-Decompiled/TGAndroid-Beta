package y3;

import android.util.Pair;
import h5.d0;
import r3.r;
import r3.t;
public final class c implements f {
    public final long[] f50717a;
    public final long[] f50718b;
    public final long f50719c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.f50717a = jArr;
        this.f50718b = jArr2;
        this.f50719c = j10 == -9223372036854775807L ? d0.G(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair d(long j10, long[] jArr, long[] jArr2) {
        double d;
        int e6 = d0.e(jArr, j10, true);
        long j11 = jArr[e6];
        long j12 = jArr2[e6];
        int i10 = e6 + 1;
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
        return d0.G(((Long) d(j10, this.f50717a, this.f50718b).second).longValue());
    }

    @Override
    public final long b() {
        return -1L;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final r f(long j10) {
        Pair d = d(d0.S(d0.i(j10, 0L, this.f50719c)), this.f50718b, this.f50717a);
        t tVar = new t(d0.G(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new r(tVar, tVar);
    }

    @Override
    public final long g() {
        return this.f50719c;
    }
}
