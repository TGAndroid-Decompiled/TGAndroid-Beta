package u2;

import java.util.List;
public final class l0 implements x2.p {
    public final x2.p f47372a;
    public final b2.p1 f47373b;

    public l0(x2.p pVar, b2.p1 p1Var) {
        this.f47372a = pVar;
        this.f47373b = p1Var;
    }

    @Override
    public final boolean a(int i10, long j10) {
        return this.f47372a.a(i10, j10);
    }

    @Override
    public final b2.p1 b() {
        return this.f47373b;
    }

    @Override
    public final int c() {
        return this.f47372a.c();
    }

    @Override
    public final boolean d(long j10, v2.f fVar, List list) {
        return this.f47372a.d(j10, fVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f47372a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof l0)) {
            return this.f47373b.equals(((l0) obj).f47373b);
        }
        return false;
    }

    @Override
    public final b2.w f(int i10) {
        return this.f47373b.d[this.f47372a.h(i10)];
    }

    @Override
    public final void g() {
        this.f47372a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f47372a.h(i10);
    }

    public final int hashCode() {
        return this.f47373b.hashCode() + (this.f47372a.hashCode() * 31);
    }

    @Override
    public final int i(long j10, List list) {
        return this.f47372a.i(j10, list);
    }

    @Override
    public final void j() {
        this.f47372a.j();
    }

    @Override
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
        this.f47372a.k(j10, j11, j12, list, mVarArr);
    }

    @Override
    public final int l() {
        return this.f47372a.l();
    }

    @Override
    public final int length() {
        return this.f47372a.length();
    }

    @Override
    public final b2.w m() {
        return this.f47373b.d[this.f47372a.l()];
    }

    @Override
    public final int n() {
        return this.f47372a.n();
    }

    @Override
    public final boolean o(int i10, long j10) {
        return this.f47372a.o(i10, j10);
    }

    @Override
    public final void p(float f7) {
        this.f47372a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f47372a.q();
    }

    @Override
    public final void r() {
        this.f47372a.r();
    }

    @Override
    public final int s(b2.w wVar) {
        return this.f47372a.u(this.f47373b.a(wVar));
    }

    @Override
    public final void t() {
        this.f47372a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f47372a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        return this.f47372a.equals(((l0) obj).f47372a);
    }
}
