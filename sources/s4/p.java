package s4;

import j3.n0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
public final class p extends n {
    public final x5.k f44030j;
    public final x5.k f44031k;
    public final long f44032l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, x5.k kVar, x5.k kVar2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.f44030j = kVar;
        this.f44031k = kVar2;
        this.f44032l = j13;
    }

    @Override
    public final j a(m mVar) {
        x5.k kVar = this.f44030j;
        if (kVar != null) {
            n0 n0Var = mVar.f44022a;
            return new j(0L, -1L, kVar.b(n0Var.f8739n, n0Var.f8735a, 0L, 0L));
        }
        return this.f44035a;
    }

    @Override
    public final long d(long j10) {
        List list = this.f44026f;
        if (list != null) {
            return list.size();
        }
        long j11 = this.f44032l;
        if (j11 != -1) {
            return (j11 - this.d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f44036b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = t8.a.f44617a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j10) {
        long j11;
        long j12 = this.d;
        List list = this.f44026f;
        if (list != null) {
            j11 = ((q) list.get((int) (j10 - j12))).f44033a;
        } else {
            j11 = (j10 - j12) * this.e;
        }
        long j13 = j11;
        n0 n0Var = kVar.f44022a;
        String str = n0Var.f8735a;
        return new j(0L, -1L, this.f44031k.b(n0Var.f8739n, str, j10, j13));
    }
}
