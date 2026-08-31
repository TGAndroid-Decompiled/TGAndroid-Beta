package s4;

import j3.n0;
import java.util.ArrayList;
import java.util.List;
import s8.v;
public final class k extends m implements r4.h {
    public final n f46985n;

    public k(n0 n0Var, v vVar, n nVar, ArrayList arrayList, List list, List list2) {
        super(n0Var, vVar, nVar, arrayList, list, list2);
        this.f46985n = nVar;
    }

    @Override
    public final boolean A() {
        return this.f46985n.i();
    }

    @Override
    public final long C() {
        return this.f46985n.d;
    }

    @Override
    public final long F(long j10) {
        return this.f46985n.d(j10);
    }

    @Override
    public final long I(long j10, long j11) {
        return this.f46985n.b(j10, j11);
    }

    @Override
    public final long a(long j10) {
        return this.f46985n.g(j10);
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
    public final long h(long j10, long j11) {
        return this.f46985n.e(j10, j11);
    }

    @Override
    public final long m(long j10, long j11) {
        return this.f46985n.c(j10, j11);
    }

    @Override
    public final long n(long j10, long j11) {
        n nVar = this.f46985n;
        if (nVar.f46994f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.f46996i;
    }

    @Override
    public final j p(long j10) {
        return this.f46985n.h(this, j10);
    }

    @Override
    public final long t(long j10, long j11) {
        return this.f46985n.f(j10, j11);
    }

    @Override
    public final r4.h c() {
        return this;
    }
}
