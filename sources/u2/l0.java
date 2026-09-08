package u2;

import java.util.List;
public final class l0 implements x2.r {
    public final x2.r f46759a;
    public final b2.l1 f46760b;

    public l0(x2.r rVar, b2.l1 l1Var) {
        this.f46759a = rVar;
        this.f46760b = l1Var;
    }

    @Override
    public final boolean a(int i10, long j3) {
        return this.f46759a.a(i10, j3);
    }

    @Override
    public final b2.l1 b() {
        return this.f46760b;
    }

    @Override
    public final int c() {
        return this.f46759a.c();
    }

    @Override
    public final boolean d(long j3, v2.e eVar, List list) {
        return this.f46759a.d(j3, eVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f46759a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof l0)) {
            return this.f46760b.equals(((l0) obj).f46760b);
        }
        return false;
    }

    @Override
    public final b2.s f(int i10) {
        return this.f46760b.d[this.f46759a.h(i10)];
    }

    @Override
    public final void g() {
        this.f46759a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f46759a.h(i10);
    }

    public final int hashCode() {
        return this.f46760b.hashCode() + (this.f46759a.hashCode() * 31);
    }

    @Override
    public final int i(long j3, List list) {
        return this.f46759a.i(j3, list);
    }

    @Override
    public final void j() {
        this.f46759a.j();
    }

    @Override
    public final void k(long j3, long j10, long j11, List list, v2.l[] lVarArr) {
        this.f46759a.k(j3, j10, j11, list, lVarArr);
    }

    @Override
    public final int l() {
        return this.f46759a.l();
    }

    @Override
    public final int length() {
        return this.f46759a.length();
    }

    @Override
    public final b2.s m() {
        return this.f46760b.d[this.f46759a.l()];
    }

    @Override
    public final int n() {
        return this.f46759a.n();
    }

    @Override
    public final boolean o(int i10, long j3) {
        return this.f46759a.o(i10, j3);
    }

    @Override
    public final void p(float f7) {
        this.f46759a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f46759a.q();
    }

    @Override
    public final void r() {
        this.f46759a.r();
    }

    @Override
    public final int s(b2.s sVar) {
        return this.f46759a.u(this.f46760b.a(sVar));
    }

    @Override
    public final void t() {
        this.f46759a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f46759a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        return this.f46759a.equals(((l0) obj).f46759a);
    }
}
