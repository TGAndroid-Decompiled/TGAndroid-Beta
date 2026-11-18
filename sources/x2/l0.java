package x2;

import java.util.List;
public final class l0 implements a3.u {
    public final a3.u f60137a;
    public final e2.m1 f60138b;

    public l0(a3.u uVar, e2.m1 m1Var) {
        this.f60137a = uVar;
        this.f60138b = m1Var;
    }

    @Override
    public final boolean a(int i7, long j3) {
        return this.f60137a.a(i7, j3);
    }

    @Override
    public final int b(e2.u uVar) {
        return this.f60137a.u(this.f60138b.a(uVar));
    }

    @Override
    public final e2.m1 c() {
        return this.f60138b;
    }

    @Override
    public final int d() {
        return this.f60137a.d();
    }

    @Override
    public final void e(long j3, long j10, long j11, List list, y2.m[] mVarArr) {
        this.f60137a.e(j3, j10, j11, list, mVarArr);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof l0)) {
            return this.f60138b.equals(((l0) obj).f60138b);
        }
        return false;
    }

    @Override
    public final void f(boolean z10) {
        this.f60137a.f(z10);
    }

    @Override
    public final e2.u g(int i7) {
        return this.f60138b.d[this.f60137a.i(i7)];
    }

    @Override
    public final void h() {
        this.f60137a.h();
    }

    public final int hashCode() {
        return this.f60138b.hashCode() + (this.f60137a.hashCode() * 31);
    }

    @Override
    public final int i(int i7) {
        return this.f60137a.i(i7);
    }

    @Override
    public final int j(long j3, List list) {
        return this.f60137a.j(j3, list);
    }

    @Override
    public final boolean k(long j3, y2.f fVar, List list) {
        return this.f60137a.k(j3, fVar, list);
    }

    @Override
    public final void l() {
        this.f60137a.l();
    }

    @Override
    public final int length() {
        return this.f60137a.length();
    }

    @Override
    public final int m() {
        return this.f60137a.m();
    }

    @Override
    public final e2.u n() {
        return this.f60138b.d[this.f60137a.m()];
    }

    @Override
    public final int o() {
        return this.f60137a.o();
    }

    @Override
    public final boolean p(int i7, long j3) {
        return this.f60137a.p(i7, j3);
    }

    @Override
    public final void q(float f10) {
        this.f60137a.q(f10);
    }

    @Override
    public final Object r() {
        return this.f60137a.r();
    }

    @Override
    public final void s() {
        this.f60137a.s();
    }

    @Override
    public final void t() {
        this.f60137a.t();
    }

    @Override
    public final int u(int i7) {
        return this.f60137a.u(i7);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        return this.f60137a.equals(((l0) obj).f60137a);
    }
}
