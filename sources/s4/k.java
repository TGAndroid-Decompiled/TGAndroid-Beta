package s4;

import j3.n0;
import java.util.ArrayList;
import java.util.List;
import s8.v;
public final class k extends m implements r4.h {
    public final n f44084n;

    public k(n0 n0Var, v vVar, n nVar, ArrayList arrayList, List list, List list2) {
        super(n0Var, vVar, nVar, arrayList, list, list2);
        this.f44084n = nVar;
    }

    @Override
    public final long G(long j10, long j11) {
        return this.f44084n.c(j10, j11);
    }

    @Override
    public final long K(long j10, long j11) {
        n nVar = this.f44084n;
        if (nVar.f44091f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.f44093i;
    }

    @Override
    public final long N1(long j10) {
        return this.f44084n.d(j10);
    }

    @Override
    public final long P1(long j10, long j11) {
        return this.f44084n.b(j10, j11);
    }

    @Override
    public final j V(long j10) {
        return this.f44084n.h(this, j10);
    }

    @Override
    public final long a(long j10) {
        return this.f44084n.g(j10);
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final j d() {
        return null;
    }

    @Override
    public final long p(long j10, long j11) {
        return this.f44084n.e(j10, j11);
    }

    @Override
    public final boolean q1() {
        return this.f44084n.i();
    }

    @Override
    public final long u0(long j10, long j11) {
        return this.f44084n.f(j10, j11);
    }

    @Override
    public final long x1() {
        return this.f44084n.d;
    }

    @Override
    public final r4.h c() {
        return this;
    }
}
