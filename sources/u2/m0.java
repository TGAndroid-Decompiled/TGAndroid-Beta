package u2;

import java.util.List;
public final class m0 implements x2.r {
    public final x2.r f47339a;
    public final b2.l1 f47340b;

    public m0(x2.r rVar, b2.l1 l1Var) {
        this.f47339a = rVar;
        this.f47340b = l1Var;
    }

    @Override
    public final boolean a(int i10, long j3) {
        return this.f47339a.a(i10, j3);
    }

    @Override
    public final b2.l1 b() {
        return this.f47340b;
    }

    @Override
    public final int c() {
        return this.f47339a.c();
    }

    @Override
    public final boolean d(long j3, v2.e eVar, List list) {
        return this.f47339a.d(j3, eVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f47339a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof m0)) {
            return this.f47340b.equals(((m0) obj).f47340b);
        }
        return false;
    }

    @Override
    public final b2.s f(int i10) {
        return this.f47340b.d[this.f47339a.h(i10)];
    }

    @Override
    public final void g() {
        this.f47339a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f47339a.h(i10);
    }

    public final int hashCode() {
        return this.f47340b.hashCode() + (this.f47339a.hashCode() * 31);
    }

    @Override
    public final int i(long j3, List list) {
        return this.f47339a.i(j3, list);
    }

    @Override
    public final void j() {
        this.f47339a.j();
    }

    @Override
    public final void k(long j3, long j10, long j11, List list, v2.l[] lVarArr) {
        this.f47339a.k(j3, j10, j11, list, lVarArr);
    }

    @Override
    public final int l() {
        return this.f47339a.l();
    }

    @Override
    public final int length() {
        return this.f47339a.length();
    }

    @Override
    public final b2.s m() {
        return this.f47340b.d[this.f47339a.l()];
    }

    @Override
    public final int n() {
        return this.f47339a.n();
    }

    @Override
    public final boolean o(int i10, long j3) {
        return this.f47339a.o(i10, j3);
    }

    @Override
    public final void p(float f7) {
        this.f47339a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f47339a.q();
    }

    @Override
    public final void r() {
        this.f47339a.r();
    }

    @Override
    public final int s(b2.s sVar) {
        return this.f47339a.u(this.f47340b.a(sVar));
    }

    @Override
    public final void t() {
        this.f47339a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f47339a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        return this.f47339a.equals(((m0) obj).f47339a);
    }
}
