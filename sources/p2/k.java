package p2;

import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements o2.i {
    public final n f53135n;

    public k(u uVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(uVar, i0Var, nVar, arrayList, list, list2);
        this.f53135n = nVar;
    }

    @Override
    public final long a(long j3) {
        return this.f53135n.g(j3);
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final long d(long j3, long j10) {
        return this.f53135n.e(j3, j10);
    }

    @Override
    public final long e(long j3, long j10) {
        return this.f53135n.c(j3, j10);
    }

    @Override
    public final j f() {
        return null;
    }

    @Override
    public final long g(long j3, long j10) {
        n nVar = this.f53135n;
        if (nVar.f53144f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.f53146i;
    }

    @Override
    public final j h(long j3) {
        return this.f53135n.h(this, j3);
    }

    @Override
    public final long o(long j3, long j10) {
        return this.f53135n.f(j3, j10);
    }

    @Override
    public final boolean t() {
        return this.f53135n.i();
    }

    @Override
    public final long u() {
        return this.f53135n.d;
    }

    @Override
    public final long x(long j3) {
        return this.f53135n.d(j3);
    }

    @Override
    public final long z(long j3, long j10) {
        return this.f53135n.b(j3, j10);
    }

    @Override
    public final o2.i c() {
        return this;
    }
}
