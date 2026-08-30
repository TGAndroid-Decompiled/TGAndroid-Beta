package s4;

import j3.n0;
import java.util.ArrayList;
import java.util.List;
import s8.v;
public final class k extends m implements r4.h {
    public final n f44019n;

    public k(n0 n0Var, v vVar, n nVar, ArrayList arrayList, List list, List list2) {
        super(n0Var, vVar, nVar, arrayList, list, list2);
        this.f44019n = nVar;
    }

    @Override
    public final long S() {
        return this.f44019n.d;
    }

    @Override
    public final long U(long j10) {
        return this.f44019n.d(j10);
    }

    @Override
    public final long W(long j10, long j11) {
        return this.f44019n.b(j10, j11);
    }

    @Override
    public final long a(long j10) {
        return this.f44019n.g(j10);
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
    public final long e(long j10, long j11) {
        return this.f44019n.e(j10, j11);
    }

    @Override
    public final long j(long j10, long j11) {
        return this.f44019n.c(j10, j11);
    }

    @Override
    public final long k(long j10, long j11) {
        n nVar = this.f44019n;
        if (nVar.f44026f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.f44028i;
    }

    @Override
    public final j l(long j10) {
        return this.f44019n.h(this, j10);
    }

    @Override
    public final long q(long j10, long j11) {
        return this.f44019n.f(j10, j11);
    }

    @Override
    public final boolean w() {
        return this.f44019n.i();
    }

    @Override
    public final r4.h c() {
        return this;
    }
}
