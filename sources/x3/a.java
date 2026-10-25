package x3;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.n0;
import java.math.BigInteger;
public final class a implements b0 {
    public final b f51361a;

    public a(b bVar) {
        this.f51361a = bVar;
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
        b bVar = this.f51361a;
        long j11 = bVar.f51363b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.f51391i * j10) / 1000000);
        long j12 = bVar.f51364c;
        c0 c0Var = new c0(j10, n0.j((valueOf.multiply(BigInteger.valueOf(j12 - j11)).divide(BigInteger.valueOf(bVar.f51365f)).longValue() + j11) - 30000, bVar.f51363b, j12 - 1));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        b bVar = this.f51361a;
        return (bVar.f51365f * 1000000) / bVar.d.f51391i;
    }
}
