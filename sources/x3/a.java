package x3;

import c3.d0;
import c3.e0;
import c3.f0;
import e2.m0;
import java.math.BigInteger;
public final class a implements e0 {
    public final b f49632a;

    public a(b bVar) {
        this.f49632a = bVar;
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
    public final d0 f(long j10) {
        b bVar = this.f49632a;
        long j11 = bVar.f49634b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.f49662i * j10) / 1000000);
        long j12 = bVar.f49635c;
        f0 f0Var = new f0(j10, m0.j((valueOf.multiply(BigInteger.valueOf(j12 - j11)).divide(BigInteger.valueOf(bVar.f49636f)).longValue() + j11) - 30000, bVar.f49634b, j12 - 1));
        return new d0(f0Var, f0Var);
    }

    @Override
    public final long h() {
        b bVar = this.f49632a;
        return (bVar.f49636f * 1000000) / bVar.d.f49662i;
    }
}
