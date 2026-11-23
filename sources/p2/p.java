package p2;

import e2.u;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import org.telegram.ui.Components.i61;
public final class p extends n {
    public final i61 f55261j;
    public final i61 f55262k;
    public final long f55263l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, i61 i61Var, i61 i61Var2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.f55261j = i61Var;
        this.f55262k = i61Var2;
        this.f55263l = j12;
    }

    @Override
    public final j a(m mVar) {
        i61 i61Var = this.f55261j;
        if (i61Var != null) {
            u uVar = mVar.f55251a;
            return new j(0L, i61Var.o(uVar.f10750j, 0L, 0L, uVar.f10743a), -1L);
        }
        return this.f55267a;
    }

    @Override
    public final long d(long j3) {
        List list = this.f55257f;
        if (list != null) {
            return list.size();
        }
        long j10 = this.f55263l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f55268b));
        BigInteger multiply2 = BigInteger.valueOf(this.f55256e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i7 = j9.a.f17428a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final j h(k kVar, long j3) {
        long j10;
        long j11 = this.d;
        List list = this.f55257f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).f55264a;
        } else {
            j10 = (j3 - j11) * this.f55256e;
        }
        long j12 = j10;
        u uVar = kVar.f55251a;
        String str = uVar.f10743a;
        return new j(0L, this.f55262k.o(uVar.f10750j, j3, j12, str), -1L);
    }
}
