package u2;

import java.util.List;
public final class k0 implements x2.r {
    public final x2.r f48846a;
    public final b2.l1 f48847b;

    public k0(x2.r rVar, b2.l1 l1Var) {
        this.f48846a = rVar;
        this.f48847b = l1Var;
    }

    @Override
    public final boolean a(int i10, long j3) {
        return this.f48846a.a(i10, j3);
    }

    @Override
    public final b2.l1 b() {
        return this.f48847b;
    }

    @Override
    public final int c() {
        return this.f48846a.c();
    }

    @Override
    public final boolean d(long j3, v2.e eVar, List list) {
        return this.f48846a.d(j3, eVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f48846a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof k0)) {
            return this.f48847b.equals(((k0) obj).f48847b);
        }
        return false;
    }

    @Override
    public final b2.s f(int i10) {
        return this.f48847b.d[this.f48846a.h(i10)];
    }

    @Override
    public final void g() {
        this.f48846a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f48846a.h(i10);
    }

    public final int hashCode() {
        return this.f48847b.hashCode() + (this.f48846a.hashCode() * 31);
    }

    @Override
    public final int i(long j3, List list) {
        return this.f48846a.i(j3, list);
    }

    @Override
    public final void j() {
        this.f48846a.j();
    }

    @Override
    public final void k(long j3, long j10, long j11, List list, v2.l[] lVarArr) {
        this.f48846a.k(j3, j10, j11, list, lVarArr);
    }

    @Override
    public final int l() {
        return this.f48846a.l();
    }

    @Override
    public final int length() {
        return this.f48846a.length();
    }

    @Override
    public final b2.s m() {
        return this.f48847b.d[this.f48846a.l()];
    }

    @Override
    public final int n() {
        return this.f48846a.n();
    }

    @Override
    public final boolean o(int i10, long j3) {
        return this.f48846a.o(i10, j3);
    }

    @Override
    public final void p(float f7) {
        this.f48846a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f48846a.q();
    }

    @Override
    public final void r() {
        this.f48846a.r();
    }

    @Override
    public final int s(b2.s sVar) {
        return this.f48846a.u(this.f48847b.a(sVar));
    }

    @Override
    public final void t() {
        this.f48846a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f48846a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        return this.f48846a.equals(((k0) obj).f48846a);
    }
}
