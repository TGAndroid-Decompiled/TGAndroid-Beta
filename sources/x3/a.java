package x3;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.d0;
import java.math.BigInteger;
public final class a implements b0 {
    public final b f49255a;

    public a(b bVar) {
        this.f49255a = bVar;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        b bVar = this.f49255a;
        long j10 = bVar.f49257b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.f49289i * j3) / 1000000);
        long j11 = bVar.f49258c;
        c0 c0Var = new c0(j3, d0.i((valueOf.multiply(BigInteger.valueOf(j11 - j10)).divide(BigInteger.valueOf(bVar.f49260f)).longValue() + j10) - 30000, bVar.f49257b, j11 - 1));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        b bVar = this.f49255a;
        return (bVar.f49260f * 1000000) / bVar.d.f49289i;
    }
}
