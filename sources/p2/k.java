package p2;

import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements o2.i {
    public final n f55248n;

    public k(u uVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(uVar, i0Var, nVar, arrayList, list, list2);
        this.f55248n = nVar;
    }

    @Override
    public final long a(long j3) {
        return this.f55248n.g(j3);
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final long c(long j3, long j10) {
        return this.f55248n.e(j3, j10);
    }

    @Override
    public final long e(long j3, long j10) {
        return this.f55248n.c(j3, j10);
    }

    @Override
    public final long f(long j3, long j10) {
        n nVar = this.f55248n;
        if (nVar.f55257f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.f55259i;
    }

    @Override
    public final j g(long j3) {
        return this.f55248n.h(this, j3);
    }

    @Override
    public final j h() {
        return null;
    }

    @Override
    public final long n(long j3, long j10) {
        return this.f55248n.f(j3, j10);
    }

    @Override
    public final boolean r() {
        return this.f55248n.i();
    }

    @Override
    public final long s() {
        return this.f55248n.d;
    }

    @Override
    public final long x(long j3) {
        return this.f55248n.d(j3);
    }

    @Override
    public final long z(long j3, long j10) {
        return this.f55248n.b(j3, j10);
    }

    @Override
    public final o2.i d() {
        return this;
    }
}
