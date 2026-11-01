package u2;

import java.util.List;
public final class l0 implements x2.q {
    public final x2.q f49936a;
    public final b2.p1 f49937b;

    public l0(x2.q qVar, b2.p1 p1Var) {
        this.f49936a = qVar;
        this.f49937b = p1Var;
    }

    @Override
    public final boolean a(int i10, long j10) {
        return this.f49936a.a(i10, j10);
    }

    @Override
    public final b2.p1 b() {
        return this.f49937b;
    }

    @Override
    public final int c() {
        return this.f49936a.c();
    }

    @Override
    public final boolean d(long j10, v2.f fVar, List list) {
        return this.f49936a.d(j10, fVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f49936a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof l0)) {
            return this.f49937b.equals(((l0) obj).f49937b);
        }
        return false;
    }

    @Override
    public final b2.x f(int i10) {
        return this.f49937b.d[this.f49936a.h(i10)];
    }

    @Override
    public final void g() {
        this.f49936a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f49936a.h(i10);
    }

    public final int hashCode() {
        return this.f49937b.hashCode() + (this.f49936a.hashCode() * 31);
    }

    @Override
    public final int i(long j10, List list) {
        return this.f49936a.i(j10, list);
    }

    @Override
    public final void j() {
        this.f49936a.j();
    }

    @Override
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
        this.f49936a.k(j10, j11, j12, list, mVarArr);
    }

    @Override
    public final int l() {
        return this.f49936a.l();
    }

    @Override
    public final int length() {
        return this.f49936a.length();
    }

    @Override
    public final b2.x m() {
        return this.f49937b.d[this.f49936a.l()];
    }

    @Override
    public final int n() {
        return this.f49936a.n();
    }

    @Override
    public final boolean o(int i10, long j10) {
        return this.f49936a.o(i10, j10);
    }

    @Override
    public final void p(float f7) {
        this.f49936a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f49936a.q();
    }

    @Override
    public final void r() {
        this.f49936a.r();
    }

    @Override
    public final int s(b2.x xVar) {
        return this.f49936a.u(this.f49937b.a(xVar));
    }

    @Override
    public final void t() {
        this.f49936a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f49936a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        return this.f49936a.equals(((l0) obj).f49936a);
    }
}
