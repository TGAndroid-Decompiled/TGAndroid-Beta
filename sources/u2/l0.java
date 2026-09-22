package u2;

import java.util.List;
public final class l0 implements x2.r {
    public final x2.r f43413a;
    public final b2.l1 f43414b;

    public l0(x2.r rVar, b2.l1 l1Var) {
        this.f43413a = rVar;
        this.f43414b = l1Var;
    }

    @Override
    public final boolean a(int i10, long j3) {
        return this.f43413a.a(i10, j3);
    }

    @Override
    public final b2.l1 b() {
        return this.f43414b;
    }

    @Override
    public final int c() {
        return this.f43413a.c();
    }

    @Override
    public final boolean d(long j3, v2.e eVar, List list) {
        return this.f43413a.d(j3, eVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f43413a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof l0)) {
            return this.f43414b.equals(((l0) obj).f43414b);
        }
        return false;
    }

    @Override
    public final b2.s f(int i10) {
        return this.f43414b.d[this.f43413a.h(i10)];
    }

    @Override
    public final void g() {
        this.f43413a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f43413a.h(i10);
    }

    public final int hashCode() {
        return this.f43414b.hashCode() + (this.f43413a.hashCode() * 31);
    }

    @Override
    public final int i(long j3, List list) {
        return this.f43413a.i(j3, list);
    }

    @Override
    public final void j() {
        this.f43413a.j();
    }

    @Override
    public final void k(long j3, long j10, long j11, List list, v2.l[] lVarArr) {
        this.f43413a.k(j3, j10, j11, list, lVarArr);
    }

    @Override
    public final int l() {
        return this.f43413a.l();
    }

    @Override
    public final int length() {
        return this.f43413a.length();
    }

    @Override
    public final b2.s m() {
        return this.f43414b.d[this.f43413a.l()];
    }

    @Override
    public final int n() {
        return this.f43413a.n();
    }

    @Override
    public final boolean o(int i10, long j3) {
        return this.f43413a.o(i10, j3);
    }

    @Override
    public final void p(float f7) {
        this.f43413a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f43413a.q();
    }

    @Override
    public final void r() {
        this.f43413a.r();
    }

    @Override
    public final int s(b2.s sVar) {
        return this.f43413a.u(this.f43414b.a(sVar));
    }

    @Override
    public final void t() {
        this.f43413a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f43413a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        return this.f43413a.equals(((l0) obj).f43413a);
    }
}
