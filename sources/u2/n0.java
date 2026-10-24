package u2;

import java.util.List;
public final class n0 implements x2.p {
    public final x2.p f47818a;
    public final b2.p1 f47819b;

    public n0(x2.p pVar, b2.p1 p1Var) {
        this.f47818a = pVar;
        this.f47819b = p1Var;
    }

    @Override
    public final boolean a(int i10, long j10) {
        return this.f47818a.a(i10, j10);
    }

    @Override
    public final b2.p1 b() {
        return this.f47819b;
    }

    @Override
    public final int c() {
        return this.f47818a.c();
    }

    @Override
    public final boolean d(long j10, v2.f fVar, List list) {
        return this.f47818a.d(j10, fVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f47818a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof n0)) {
            return this.f47819b.equals(((n0) obj).f47819b);
        }
        return false;
    }

    @Override
    public final b2.w f(int i10) {
        return this.f47819b.d[this.f47818a.h(i10)];
    }

    @Override
    public final void g() {
        this.f47818a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f47818a.h(i10);
    }

    public final int hashCode() {
        return this.f47819b.hashCode() + (this.f47818a.hashCode() * 31);
    }

    @Override
    public final int i(long j10, List list) {
        return this.f47818a.i(j10, list);
    }

    @Override
    public final void j() {
        this.f47818a.j();
    }

    @Override
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
        this.f47818a.k(j10, j11, j12, list, mVarArr);
    }

    @Override
    public final int l() {
        return this.f47818a.l();
    }

    @Override
    public final int length() {
        return this.f47818a.length();
    }

    @Override
    public final b2.w m() {
        return this.f47819b.d[this.f47818a.l()];
    }

    @Override
    public final int n() {
        return this.f47818a.n();
    }

    @Override
    public final boolean o(int i10, long j10) {
        return this.f47818a.o(i10, j10);
    }

    @Override
    public final void p(float f7) {
        this.f47818a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f47818a.q();
    }

    @Override
    public final void r() {
        this.f47818a.r();
    }

    @Override
    public final int s(b2.w wVar) {
        return this.f47818a.u(this.f47819b.a(wVar));
    }

    @Override
    public final void t() {
        this.f47818a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f47818a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        return this.f47818a.equals(((n0) obj).f47818a);
    }
}
