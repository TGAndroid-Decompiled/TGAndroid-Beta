package u2;

import java.util.List;
public final class l0 implements x2.q {
    public final x2.q f49922a;
    public final b2.p1 f49923b;

    public l0(x2.q qVar, b2.p1 p1Var) {
        this.f49922a = qVar;
        this.f49923b = p1Var;
    }

    @Override
    public final boolean a(int i10, long j10) {
        return this.f49922a.a(i10, j10);
    }

    @Override
    public final b2.p1 b() {
        return this.f49923b;
    }

    @Override
    public final int c() {
        return this.f49922a.c();
    }

    @Override
    public final boolean d(long j10, v2.f fVar, List list) {
        return this.f49922a.d(j10, fVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f49922a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof l0)) {
            return this.f49923b.equals(((l0) obj).f49923b);
        }
        return false;
    }

    @Override
    public final b2.x f(int i10) {
        return this.f49923b.d[this.f49922a.h(i10)];
    }

    @Override
    public final void g() {
        this.f49922a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f49922a.h(i10);
    }

    public final int hashCode() {
        return this.f49923b.hashCode() + (this.f49922a.hashCode() * 31);
    }

    @Override
    public final int i(long j10, List list) {
        return this.f49922a.i(j10, list);
    }

    @Override
    public final void j() {
        this.f49922a.j();
    }

    @Override
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
        this.f49922a.k(j10, j11, j12, list, mVarArr);
    }

    @Override
    public final int l() {
        return this.f49922a.l();
    }

    @Override
    public final int length() {
        return this.f49922a.length();
    }

    @Override
    public final b2.x m() {
        return this.f49923b.d[this.f49922a.l()];
    }

    @Override
    public final int n() {
        return this.f49922a.n();
    }

    @Override
    public final boolean o(int i10, long j10) {
        return this.f49922a.o(i10, j10);
    }

    @Override
    public final void p(float f7) {
        this.f49922a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f49922a.q();
    }

    @Override
    public final void r() {
        this.f49922a.r();
    }

    @Override
    public final int s(b2.x xVar) {
        return this.f49922a.u(this.f49923b.a(xVar));
    }

    @Override
    public final void t() {
        this.f49922a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f49922a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        return this.f49922a.equals(((l0) obj).f49922a);
    }
}
