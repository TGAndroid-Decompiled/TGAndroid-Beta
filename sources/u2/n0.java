package u2;

import java.util.List;
public final class n0 implements x2.r {
    public final x2.r f42392a;
    public final b2.l1 f42393b;

    public n0(x2.r rVar, b2.l1 l1Var) {
        this.f42392a = rVar;
        this.f42393b = l1Var;
    }

    @Override
    public final boolean a(int i10, long j3) {
        return this.f42392a.a(i10, j3);
    }

    @Override
    public final b2.l1 b() {
        return this.f42393b;
    }

    @Override
    public final int c() {
        return this.f42392a.c();
    }

    @Override
    public final boolean d(long j3, v2.e eVar, List list) {
        return this.f42392a.d(j3, eVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f42392a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof n0)) {
            return this.f42393b.equals(((n0) obj).f42393b);
        }
        return false;
    }

    @Override
    public final b2.s f(int i10) {
        return this.f42393b.d[this.f42392a.h(i10)];
    }

    @Override
    public final void g() {
        this.f42392a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f42392a.h(i10);
    }

    public final int hashCode() {
        return this.f42393b.hashCode() + (this.f42392a.hashCode() * 31);
    }

    @Override
    public final int i(long j3, List list) {
        return this.f42392a.i(j3, list);
    }

    @Override
    public final void j() {
        this.f42392a.j();
    }

    @Override
    public final void k(long j3, long j10, long j11, List list, v2.l[] lVarArr) {
        this.f42392a.k(j3, j10, j11, list, lVarArr);
    }

    @Override
    public final int l() {
        return this.f42392a.l();
    }

    @Override
    public final int length() {
        return this.f42392a.length();
    }

    @Override
    public final b2.s m() {
        return this.f42393b.d[this.f42392a.l()];
    }

    @Override
    public final int n() {
        return this.f42392a.n();
    }

    @Override
    public final boolean o(int i10, long j3) {
        return this.f42392a.o(i10, j3);
    }

    @Override
    public final void p(float f7) {
        this.f42392a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f42392a.q();
    }

    @Override
    public final void r() {
        this.f42392a.r();
    }

    @Override
    public final int s(b2.s sVar) {
        return this.f42392a.u(this.f42393b.a(sVar));
    }

    @Override
    public final void t() {
        this.f42392a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f42392a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        return this.f42392a.equals(((n0) obj).f42392a);
    }
}
