package u2;

import java.util.List;
public final class m0 implements x2.p {
    public final x2.p f47367a;
    public final b2.p1 f47368b;

    public m0(x2.p pVar, b2.p1 p1Var) {
        this.f47367a = pVar;
        this.f47368b = p1Var;
    }

    @Override
    public final boolean a(int i10, long j10) {
        return this.f47367a.a(i10, j10);
    }

    @Override
    public final b2.p1 b() {
        return this.f47368b;
    }

    @Override
    public final int c() {
        return this.f47367a.c();
    }

    @Override
    public final boolean d(long j10, v2.f fVar, List list) {
        return this.f47367a.d(j10, fVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f47367a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof m0)) {
            return this.f47368b.equals(((m0) obj).f47368b);
        }
        return false;
    }

    @Override
    public final b2.w f(int i10) {
        return this.f47368b.d[this.f47367a.h(i10)];
    }

    @Override
    public final void g() {
        this.f47367a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f47367a.h(i10);
    }

    public final int hashCode() {
        return this.f47368b.hashCode() + (this.f47367a.hashCode() * 31);
    }

    @Override
    public final int i(long j10, List list) {
        return this.f47367a.i(j10, list);
    }

    @Override
    public final void j() {
        this.f47367a.j();
    }

    @Override
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
        this.f47367a.k(j10, j11, j12, list, mVarArr);
    }

    @Override
    public final int l() {
        return this.f47367a.l();
    }

    @Override
    public final int length() {
        return this.f47367a.length();
    }

    @Override
    public final b2.w m() {
        return this.f47368b.d[this.f47367a.l()];
    }

    @Override
    public final int n() {
        return this.f47367a.n();
    }

    @Override
    public final boolean o(int i10, long j10) {
        return this.f47367a.o(i10, j10);
    }

    @Override
    public final void p(float f7) {
        this.f47367a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f47367a.q();
    }

    @Override
    public final void r() {
        this.f47367a.r();
    }

    @Override
    public final int s(b2.w wVar) {
        return this.f47367a.u(this.f47368b.a(wVar));
    }

    @Override
    public final void t() {
        this.f47367a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f47367a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        return this.f47367a.equals(((m0) obj).f47367a);
    }
}
