package p4;

import j3.t0;
import java.util.ArrayList;
import java.util.List;
import q8.z;
public final class k extends m implements o4.i {
    public final n f45576n;

    public k(t0 t0Var, z zVar, n nVar, ArrayList arrayList, List list, List list2) {
        super(t0Var, zVar, nVar, arrayList, list, list2);
        this.f45576n = nVar;
    }

    @Override
    public final long F(long j10) {
        return this.f45576n.d(j10);
    }

    @Override
    public final long H(long j10, long j11) {
        return this.f45576n.b(j10, j11);
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final long b(long j10) {
        return this.f45576n.g(j10);
    }

    @Override
    public final j d() {
        return null;
    }

    @Override
    public final long g(long j10, long j11) {
        return this.f45576n.e(j10, j11);
    }

    @Override
    public final long n(long j10, long j11) {
        return this.f45576n.c(j10, j11);
    }

    @Override
    public final long o(long j10, long j11) {
        n nVar = this.f45576n;
        if (nVar.f45585f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.f45587i;
    }

    @Override
    public final j p(long j10) {
        return this.f45576n.h(this, j10);
    }

    @Override
    public final long r(long j10, long j11) {
        return this.f45576n.f(j10, j11);
    }

    @Override
    public final boolean y() {
        return this.f45576n.i();
    }

    @Override
    public final long z() {
        return this.f45576n.d;
    }

    @Override
    public final o4.i c() {
        return this;
    }
}
