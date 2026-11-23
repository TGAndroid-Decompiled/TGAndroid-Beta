package p2;

import e2.u;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import org.telegram.ui.md0;
public final class p extends n {
    public final md0 f55180j;
    public final md0 f55181k;
    public final long f55182l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, md0 md0Var, md0 md0Var2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.f55180j = md0Var;
        this.f55181k = md0Var2;
        this.f55182l = j12;
    }

    @Override
    public final j a(m mVar) {
        md0 md0Var = this.f55180j;
        if (md0Var != null) {
            u uVar = mVar.f55170a;
            return new j(0L, md0Var.m(uVar.f10789j, 0L, 0L, uVar.f10782a), -1L);
        }
        return this.f55186a;
    }

    @Override
    public final long d(long j3) {
        List list = this.f55176f;
        if (list != null) {
            return list.size();
        }
        long j10 = this.f55182l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f55187b));
        BigInteger multiply2 = BigInteger.valueOf(this.f55175e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i7 = j9.a.f17362a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j3) {
        long j10;
        long j11 = this.d;
        List list = this.f55176f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).f55183a;
        } else {
            j10 = (j3 - j11) * this.f55175e;
        }
        long j12 = j10;
        u uVar = kVar.f55170a;
        String str = uVar.f10782a;
        return new j(0L, this.f55181k.m(uVar.f10789j, j3, j12, str), -1L);
    }
}
