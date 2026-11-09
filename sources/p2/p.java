package p2;

import e2.u;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import org.telegram.ui.ky0;
public final class p extends n {
    public final ky0 f53161j;
    public final ky0 f53162k;
    public final long f53163l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, ky0 ky0Var, ky0 ky0Var2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.f53161j = ky0Var;
        this.f53162k = ky0Var2;
        this.f53163l = j12;
    }

    @Override
    public final j a(m mVar) {
        ky0 ky0Var = this.f53161j;
        if (ky0Var != null) {
            u uVar = mVar.f53151a;
            return new j(0L, ky0Var.m(uVar.f10606j, 0L, 0L, uVar.f10599a), -1L);
        }
        return this.f53167a;
    }

    @Override
    public final long d(long j3) {
        List list = this.f53157f;
        if (list != null) {
            return list.size();
        }
        long j10 = this.f53163l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f53168b));
        BigInteger multiply2 = BigInteger.valueOf(this.f53156e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i7 = j9.a.f16599a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j3) {
        long j10;
        long j11 = this.d;
        List list = this.f53157f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).f53164a;
        } else {
            j10 = (j3 - j11) * this.f53156e;
        }
        long j12 = j10;
        u uVar = kVar.f53151a;
        String str = uVar.f10599a;
        return new j(0L, this.f53162k.m(uVar.f10606j, j3, j12, str), -1L);
    }
}
