package x3;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.d0;
import java.math.BigInteger;
public final class a implements b0 {
    public final b f49270a;

    public a(b bVar) {
        this.f49270a = bVar;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        b bVar = this.f49270a;
        long j10 = bVar.f49272b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.f49304i * j3) / 1000000);
        long j11 = bVar.f49273c;
        c0 c0Var = new c0(j3, d0.i((valueOf.multiply(BigInteger.valueOf(j11 - j10)).divide(BigInteger.valueOf(bVar.f49275f)).longValue() + j10) - 30000, bVar.f49272b, j11 - 1));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        b bVar = this.f49270a;
        return (bVar.f49275f * 1000000) / bVar.d.f49304i;
    }
}
