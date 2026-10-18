package x3;

import c3.b0;
import c3.c0;
import c3.d0;
import e2.m0;
import java.math.BigInteger;
public final class a implements c0 {
    public final b f49181a;

    public a(b bVar) {
        this.f49181a = bVar;
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
    public final b0 f(long j10) {
        b bVar = this.f49181a;
        long j11 = bVar.f49183b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.f49211i * j10) / 1000000);
        long j12 = bVar.f49184c;
        d0 d0Var = new d0(j10, m0.j((valueOf.multiply(BigInteger.valueOf(j12 - j11)).divide(BigInteger.valueOf(bVar.f49185f)).longValue() + j11) - 30000, bVar.f49183b, j12 - 1));
        return new b0(d0Var, d0Var);
    }

    @Override
    public final long h() {
        b bVar = this.f49181a;
        return (bVar.f49185f * 1000000) / bVar.d.f49211i;
    }
}
