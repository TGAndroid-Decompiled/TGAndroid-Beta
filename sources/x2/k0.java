package x2;

import java.util.List;
public final class k0 implements a3.u {
    public final a3.u f58389a;
    public final e2.m1 f58390b;

    public k0(a3.u uVar, e2.m1 m1Var) {
        this.f58389a = uVar;
        this.f58390b = m1Var;
    }

    @Override
    public final boolean a(int i7, long j3) {
        return this.f58389a.a(i7, j3);
    }

    @Override
    public final int b(e2.u uVar) {
        return this.f58389a.u(this.f58390b.a(uVar));
    }

    @Override
    public final e2.m1 c() {
        return this.f58390b;
    }

    @Override
    public final int d() {
        return this.f58389a.d();
    }

    @Override
    public final void e(long j3, long j10, long j11, List list, y2.m[] mVarArr) {
        this.f58389a.e(j3, j10, j11, list, mVarArr);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof k0)) {
            return this.f58390b.equals(((k0) obj).f58390b);
        }
        return false;
    }

    @Override
    public final void f(boolean z9) {
        this.f58389a.f(z9);
    }

    @Override
    public final e2.u g(int i7) {
        return this.f58390b.d[this.f58389a.i(i7)];
    }

    @Override
    public final void h() {
        this.f58389a.h();
    }

    public final int hashCode() {
        return this.f58390b.hashCode() + (this.f58389a.hashCode() * 31);
    }

    @Override
    public final int i(int i7) {
        return this.f58389a.i(i7);
    }

    @Override
    public final int j(long j3, List list) {
        return this.f58389a.j(j3, list);
    }

    @Override
    public final boolean k(long j3, y2.f fVar, List list) {
        return this.f58389a.k(j3, fVar, list);
    }

    @Override
    public final void l() {
        this.f58389a.l();
    }

    @Override
    public final int length() {
        return this.f58389a.length();
    }

    @Override
    public final int m() {
        return this.f58389a.m();
    }

    @Override
    public final e2.u n() {
        return this.f58390b.d[this.f58389a.m()];
    }

    @Override
    public final int o() {
        return this.f58389a.o();
    }

    @Override
    public final boolean p(int i7, long j3) {
        return this.f58389a.p(i7, j3);
    }

    @Override
    public final void q(float f10) {
        this.f58389a.q(f10);
    }

    @Override
    public final Object r() {
        return this.f58389a.r();
    }

    @Override
    public final void s() {
        this.f58389a.s();
    }

    @Override
    public final void t() {
        this.f58389a.t();
    }

    @Override
    public final int u(int i7) {
        return this.f58389a.u(i7);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        return this.f58389a.equals(((k0) obj).f58389a);
    }
}
