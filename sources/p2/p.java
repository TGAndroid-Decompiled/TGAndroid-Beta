package p2;

import e2.u;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import org.telegram.ui.hy0;
public final class p extends n {
    public final hy0 f53149j;
    public final hy0 f53150k;
    public final long f53151l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, hy0 hy0Var, hy0 hy0Var2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.f53149j = hy0Var;
        this.f53150k = hy0Var2;
        this.f53151l = j12;
    }

    @Override
    public final j a(m mVar) {
        hy0 hy0Var = this.f53149j;
        if (hy0Var != null) {
            u uVar = mVar.f53139a;
            return new j(0L, hy0Var.m(uVar.f10606j, 0L, 0L, uVar.f10599a), -1L);
        }
        return this.f53155a;
    }

    @Override
    public final long d(long j3) {
        List list = this.f53145f;
        if (list != null) {
            return list.size();
        }
        long j10 = this.f53151l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f53156b));
        BigInteger multiply2 = BigInteger.valueOf(this.f53144e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i7 = j9.a.f16599a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j3) {
        long j10;
        long j11 = this.d;
        List list = this.f53145f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).f53152a;
        } else {
            j10 = (j3 - j11) * this.f53144e;
        }
        long j12 = j10;
        u uVar = kVar.f53139a;
        String str = uVar.f10599a;
        return new j(0L, this.f53150k.m(uVar.f10606j, j3, j12, str), -1L);
    }
}
