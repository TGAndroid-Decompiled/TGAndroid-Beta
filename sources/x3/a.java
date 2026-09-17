package x3;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.d0;
import java.math.BigInteger;
public final class a implements b0 {
    public final b f48774a;

    public a(b bVar) {
        this.f48774a = bVar;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        b bVar = this.f48774a;
        long j10 = bVar.f48776b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.f48808i * j3) / 1000000);
        long j11 = bVar.f48777c;
        c0 c0Var = new c0(j3, d0.i((valueOf.multiply(BigInteger.valueOf(j11 - j10)).divide(BigInteger.valueOf(bVar.f48779f)).longValue() + j10) - 30000, bVar.f48776b, j11 - 1));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        b bVar = this.f48774a;
        return (bVar.f48779f * 1000000) / bVar.d.f48808i;
    }
}
