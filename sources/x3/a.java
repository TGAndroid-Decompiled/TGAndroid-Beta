package x3;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.d0;
import java.math.BigInteger;
public final class a implements b0 {
    public final b f45244a;

    public a(b bVar) {
        this.f45244a = bVar;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        b bVar = this.f45244a;
        long j10 = bVar.f45246b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.f45274i * j3) / 1000000);
        long j11 = bVar.f45247c;
        c0 c0Var = new c0(j3, d0.i((valueOf.multiply(BigInteger.valueOf(j11 - j10)).divide(BigInteger.valueOf(bVar.f45248f)).longValue() + j10) - 30000, bVar.f45246b, j11 - 1));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        b bVar = this.f45244a;
        return (bVar.f45248f * 1000000) / bVar.d.f45274i;
    }
}
