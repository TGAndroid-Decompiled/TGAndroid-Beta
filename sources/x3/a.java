package x3;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.d0;
import java.math.BigInteger;
public final class a implements b0 {
    public final b f50785a;

    public a(b bVar) {
        this.f50785a = bVar;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        b bVar = this.f50785a;
        long j10 = bVar.f50787b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.f50819i * j3) / 1000000);
        long j11 = bVar.f50788c;
        c0 c0Var = new c0(j3, d0.i((valueOf.multiply(BigInteger.valueOf(j11 - j10)).divide(BigInteger.valueOf(bVar.f50790f)).longValue() + j10) - 30000, bVar.f50787b, j11 - 1));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        b bVar = this.f50785a;
        return (bVar.f50790f * 1000000) / bVar.d.f50819i;
    }
}
