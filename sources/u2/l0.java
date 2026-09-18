package u2;

import java.util.List;
public final class l0 implements x2.r {
    public final x2.r f43445a;
    public final b2.l1 f43446b;

    public l0(x2.r rVar, b2.l1 l1Var) {
        this.f43445a = rVar;
        this.f43446b = l1Var;
    }

    @Override
    public final boolean a(int i10, long j3) {
        return this.f43445a.a(i10, j3);
    }

    @Override
    public final b2.l1 b() {
        return this.f43446b;
    }

    @Override
    public final int c() {
        return this.f43445a.c();
    }

    @Override
    public final boolean d(long j3, v2.e eVar, List list) {
        return this.f43445a.d(j3, eVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f43445a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof l0)) {
            return this.f43446b.equals(((l0) obj).f43446b);
        }
        return false;
    }

    @Override
    public final b2.s f(int i10) {
        return this.f43446b.d[this.f43445a.h(i10)];
    }

    @Override
    public final void g() {
        this.f43445a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f43445a.h(i10);
    }

    public final int hashCode() {
        return this.f43446b.hashCode() + (this.f43445a.hashCode() * 31);
    }

    @Override
    public final int i(long j3, List list) {
        return this.f43445a.i(j3, list);
    }

    @Override
    public final void j() {
        this.f43445a.j();
    }

    @Override
    public final void k(long j3, long j10, long j11, List list, v2.l[] lVarArr) {
        this.f43445a.k(j3, j10, j11, list, lVarArr);
    }

    @Override
    public final int l() {
        return this.f43445a.l();
    }

    @Override
    public final int length() {
        return this.f43445a.length();
    }

    @Override
    public final b2.s m() {
        return this.f43446b.d[this.f43445a.l()];
    }

    @Override
    public final int n() {
        return this.f43445a.n();
    }

    @Override
    public final boolean o(int i10, long j3) {
        return this.f43445a.o(i10, j3);
    }

    @Override
    public final void p(float f7) {
        this.f43445a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f43445a.q();
    }

    @Override
    public final void r() {
        this.f43445a.r();
    }

    @Override
    public final int s(b2.s sVar) {
        return this.f43445a.u(this.f43446b.a(sVar));
    }

    @Override
    public final void t() {
        this.f43445a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f43445a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        return this.f43445a.equals(((l0) obj).f43445a);
    }
}
