package p2;

import e2.u;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import org.telegram.ui.ly0;
public final class p extends n {
    public final ly0 f53160j;
    public final ly0 f53161k;
    public final long f53162l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, ly0 ly0Var, ly0 ly0Var2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.f53160j = ly0Var;
        this.f53161k = ly0Var2;
        this.f53162l = j12;
    }

    @Override
    public final j a(m mVar) {
        ly0 ly0Var = this.f53160j;
        if (ly0Var != null) {
            u uVar = mVar.f53150a;
            return new j(0L, ly0Var.m(uVar.f10611j, 0L, 0L, uVar.f10604a), -1L);
        }
        return this.f53166a;
    }

    @Override
    public final long d(long j3) {
        List list = this.f53156f;
        if (list != null) {
            return list.size();
        }
        long j10 = this.f53162l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f53167b));
        BigInteger multiply2 = BigInteger.valueOf(this.f53155e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i7 = j9.a.f16599a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j3) {
        long j10;
        long j11 = this.d;
        List list = this.f53156f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).f53163a;
        } else {
            j10 = (j3 - j11) * this.f53155e;
        }
        long j12 = j10;
        u uVar = kVar.f53150a;
        String str = uVar.f10604a;
        return new j(0L, this.f53161k.m(uVar.f10611j, j3, j12, str), -1L);
    }
}
