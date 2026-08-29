package v3;

import android.util.Pair;
import f5.d0;
import o3.s;
import o3.u;
public final class c implements f {
    public final long[] f49331a;
    public final long[] f49332b;
    public final long f49333c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.f49331a = jArr;
        this.f49332b = jArr2;
        this.f49333c = j10 == -9223372036854775807L ? d0.H(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair d(long j10, long[] jArr, long[] jArr2) {
        double d;
        int e10 = d0.e(jArr, j10, true);
        long j11 = jArr[e10];
        long j12 = jArr2[e10];
        int i10 = e10 + 1;
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
        return d0.H(((Long) d(j10, this.f49331a, this.f49332b).second).longValue());
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final s g(long j10) {
        Pair d = d(d0.S(d0.i(j10, 0L, this.f49333c)), this.f49332b, this.f49331a);
        u uVar = new u(d0.H(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new s(uVar, uVar);
    }

    @Override
    public final long h() {
        return this.f49333c;
    }
}
