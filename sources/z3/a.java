package z3;

import e3.a0;
import e3.b0;
import e3.c0;
import g2.n0;
import java.math.BigInteger;
public final class a implements b0 {
    public final b f59650a;

    public a(b bVar) {
        this.f59650a = bVar;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final a0 f(long j10) {
        b bVar = this.f59650a;
        long j11 = bVar.f59652b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.f59685i * j10) / 1000000);
        long j12 = bVar.f59653c;
        c0 c0Var = new c0(j10, n0.j((valueOf.multiply(BigInteger.valueOf(j12 - j11)).divide(BigInteger.valueOf(bVar.f59655f)).longValue() + j11) - 30000, bVar.f59652b, j12 - 1));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        b bVar = this.f59650a;
        return (bVar.f59655f * 1000000) / bVar.d.f59685i;
    }
}
