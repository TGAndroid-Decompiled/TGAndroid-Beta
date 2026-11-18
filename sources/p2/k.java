package p2;

import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements o2.i {
    public final n f55122n;

    public k(u uVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(uVar, i0Var, nVar, arrayList, list, list2);
        this.f55122n = nVar;
    }

    @Override
    public final long a(long j3) {
        return this.f55122n.g(j3);
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
    public final long e(long j3, long j10) {
        return this.f55122n.e(j3, j10);
    }

    @Override
    public final long h(long j3, long j10) {
        return this.f55122n.c(j3, j10);
    }

    @Override
    public final long i(long j3, long j10) {
        n nVar = this.f55122n;
        if (nVar.f55131f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.f55133i;
    }

    @Override
    public final j k(long j3) {
        return this.f55122n.h(this, j3);
    }

    @Override
    public final long o(long j3, long j10) {
        return this.f55122n.f(j3, j10);
    }

    @Override
    public final boolean t() {
        return this.f55122n.i();
    }

    @Override
    public final long v() {
        return this.f55122n.d;
    }

    @Override
    public final long y(long j3) {
        return this.f55122n.d(j3);
    }

    @Override
    public final long z(long j3, long j10) {
        return this.f55122n.b(j3, j10);
    }

    @Override
    public final o2.i c() {
        return this;
    }
}
