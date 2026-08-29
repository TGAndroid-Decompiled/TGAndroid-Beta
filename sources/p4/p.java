package p4;

import j3.t0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
public final class p extends n {
    public final v5.l f45589j;
    public final v5.l f45590k;
    public final long f45591l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, v5.l lVar, v5.l lVar2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.f45589j = lVar;
        this.f45590k = lVar2;
        this.f45591l = j13;
    }

    @Override
    public final j a(m mVar) {
        v5.l lVar = this.f45589j;
        if (lVar != null) {
            t0 t0Var = mVar.f45579a;
            return new j(0L, -1L, lVar.a(t0Var.f10802n, t0Var.f10797a, 0L, 0L));
        }
        return this.f45595a;
    }

    @Override
    public final long d(long j10) {
        List list = this.f45585f;
        if (list != null) {
            return list.size();
        }
        long j11 = this.f45591l;
        if (j11 != -1) {
            return (j11 - this.d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f45596b));
        BigInteger multiply2 = BigInteger.valueOf(this.f45584e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = r8.a.f47085a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j10) {
        long j11;
        long j12 = this.d;
        List list = this.f45585f;
        if (list != null) {
            j11 = ((q) list.get((int) (j10 - j12))).f45592a;
        } else {
            j11 = (j10 - j12) * this.f45584e;
        }
        long j13 = j11;
        t0 t0Var = kVar.f45579a;
        String str = t0Var.f10797a;
        return new j(0L, -1L, this.f45590k.a(t0Var.f10802n, str, j10, j13));
    }
}
