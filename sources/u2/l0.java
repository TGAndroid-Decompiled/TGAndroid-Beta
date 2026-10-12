package u2;

import java.util.List;
public final class l0 implements x2.p {
    public final x2.p f45965a;
    public final b2.q1 f45966b;

    public l0(x2.p pVar, b2.q1 q1Var) {
        this.f45965a = pVar;
        this.f45966b = q1Var;
    }

    @Override
    public final boolean a(int i10, long j10) {
        return this.f45965a.a(i10, j10);
    }

    @Override
    public final b2.q1 b() {
        return this.f45966b;
    }

    @Override
    public final int c() {
        return this.f45965a.c();
    }

    @Override
    public final boolean d(long j10, v2.f fVar, List list) {
        return this.f45965a.d(j10, fVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f45965a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof l0)) {
            return this.f45966b.equals(((l0) obj).f45966b);
        }
        return false;
    }

    @Override
    public final b2.x f(int i10) {
        return this.f45966b.d[this.f45965a.h(i10)];
    }

    @Override
    public final void g() {
        this.f45965a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f45965a.h(i10);
    }

    public final int hashCode() {
        return this.f45966b.hashCode() + (this.f45965a.hashCode() * 31);
    }

    @Override
    public final int i(long j10, List list) {
        return this.f45965a.i(j10, list);
    }

    @Override
    public final void j() {
        this.f45965a.j();
    }

    @Override
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
        this.f45965a.k(j10, j11, j12, list, mVarArr);
    }

    @Override
    public final int l() {
        return this.f45965a.l();
    }

    @Override
    public final int length() {
        return this.f45965a.length();
    }

    @Override
    public final b2.x m() {
        return this.f45966b.d[this.f45965a.l()];
    }

    @Override
    public final int n() {
        return this.f45965a.n();
    }

    @Override
    public final boolean o(int i10, long j10) {
        return this.f45965a.o(i10, j10);
    }

    @Override
    public final void p(float f7) {
        this.f45965a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f45965a.q();
    }

    @Override
    public final void r() {
        this.f45965a.r();
    }

    @Override
    public final int s(b2.x xVar) {
        return this.f45965a.u(this.f45966b.a(xVar));
    }

    @Override
    public final void t() {
        this.f45965a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f45965a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        return this.f45965a.equals(((l0) obj).f45965a);
    }
}
