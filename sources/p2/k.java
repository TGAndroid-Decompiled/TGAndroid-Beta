package p2;

import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements o2.i {
    public final n f54553n;

    public k(u uVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(uVar, i0Var, nVar, arrayList, list, list2);
        this.f54553n = nVar;
    }

    @Override
    public final long D(long j3, long j10) {
        n nVar = this.f54553n;
        if (nVar.f54562f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.f54564i;
    }

    @Override
    public final j E(long j3) {
        return this.f54553n.h(this, j3);
    }

    @Override
    public final long L(long j3, long j10) {
        return this.f54553n.f(j3, j10);
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final long b(long j3) {
        return this.f54553n.g(j3);
    }

    @Override
    public final j d() {
        return null;
    }

    @Override
    public final boolean g0() {
        return this.f54553n.i();
    }

    @Override
    public final long i(long j3, long j10) {
        return this.f54553n.e(j3, j10);
    }

    @Override
    public final long k0() {
        return this.f54553n.d;
    }

    @Override
    public final long t0(long j3) {
        return this.f54553n.d(j3);
    }

    @Override
    public final long v0(long j3, long j10) {
        return this.f54553n.b(j3, j10);
    }

    @Override
    public final long y(long j3, long j10) {
        return this.f54553n.c(j3, j10);
    }

    @Override
    public final o2.i c() {
        return this;
    }
}
