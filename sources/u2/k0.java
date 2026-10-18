package u2;

import java.util.List;
public final class k0 implements x2.p {
    public final x2.p f47392a;
    public final b2.p1 f47393b;

    public k0(x2.p pVar, b2.p1 p1Var) {
        this.f47392a = pVar;
        this.f47393b = p1Var;
    }

    @Override
    public final boolean a(int i10, long j10) {
        return this.f47392a.a(i10, j10);
    }

    @Override
    public final b2.p1 b() {
        return this.f47393b;
    }

    @Override
    public final int c() {
        return this.f47392a.c();
    }

    @Override
    public final boolean d(long j10, v2.f fVar, List list) {
        return this.f47392a.d(j10, fVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f47392a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof k0)) {
            return this.f47393b.equals(((k0) obj).f47393b);
        }
        return false;
    }

    @Override
    public final b2.w f(int i10) {
        return this.f47393b.d[this.f47392a.h(i10)];
    }

    @Override
    public final void g() {
        this.f47392a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f47392a.h(i10);
    }

    public final int hashCode() {
        return this.f47393b.hashCode() + (this.f47392a.hashCode() * 31);
    }

    @Override
    public final int i(long j10, List list) {
        return this.f47392a.i(j10, list);
    }

    @Override
    public final void j() {
        this.f47392a.j();
    }

    @Override
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
        this.f47392a.k(j10, j11, j12, list, mVarArr);
    }

    @Override
    public final int l() {
        return this.f47392a.l();
    }

    @Override
    public final int length() {
        return this.f47392a.length();
    }

    @Override
    public final b2.w m() {
        return this.f47393b.d[this.f47392a.l()];
    }

    @Override
    public final int n() {
        return this.f47392a.n();
    }

    @Override
    public final boolean o(int i10, long j10) {
        return this.f47392a.o(i10, j10);
    }

    @Override
    public final void p(float f7) {
        this.f47392a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f47392a.q();
    }

    @Override
    public final void r() {
        this.f47392a.r();
    }

    @Override
    public final int s(b2.w wVar) {
        return this.f47392a.u(this.f47393b.a(wVar));
    }

    @Override
    public final void t() {
        this.f47392a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f47392a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        return this.f47392a.equals(((k0) obj).f47392a);
    }
}
