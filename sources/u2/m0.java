package u2;

import java.util.List;
public final class m0 implements x2.s {
    public final x2.s f43742a;
    public final b2.l1 f43743b;

    public m0(x2.s sVar, b2.l1 l1Var) {
        this.f43742a = sVar;
        this.f43743b = l1Var;
    }

    @Override
    public final boolean a(int i10, long j3) {
        return this.f43742a.a(i10, j3);
    }

    @Override
    public final b2.l1 b() {
        return this.f43743b;
    }

    @Override
    public final int c() {
        return this.f43742a.c();
    }

    @Override
    public final boolean d(long j3, v2.e eVar, List list) {
        return this.f43742a.d(j3, eVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f43742a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof m0)) {
            return this.f43743b.equals(((m0) obj).f43743b);
        }
        return false;
    }

    @Override
    public final b2.s f(int i10) {
        return this.f43743b.d[this.f43742a.h(i10)];
    }

    @Override
    public final void g() {
        this.f43742a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f43742a.h(i10);
    }

    public final int hashCode() {
        return this.f43743b.hashCode() + (this.f43742a.hashCode() * 31);
    }

    @Override
    public final int i(long j3, List list) {
        return this.f43742a.i(j3, list);
    }

    @Override
    public final void j() {
        this.f43742a.j();
    }

    @Override
    public final void k(long j3, long j10, long j11, List list, v2.l[] lVarArr) {
        this.f43742a.k(j3, j10, j11, list, lVarArr);
    }

    @Override
    public final int l() {
        return this.f43742a.l();
    }

    @Override
    public final int length() {
        return this.f43742a.length();
    }

    @Override
    public final b2.s m() {
        return this.f43743b.d[this.f43742a.l()];
    }

    @Override
    public final int n() {
        return this.f43742a.n();
    }

    @Override
    public final boolean o(int i10, long j3) {
        return this.f43742a.o(i10, j3);
    }

    @Override
    public final void p(float f7) {
        this.f43742a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f43742a.q();
    }

    @Override
    public final void r() {
        this.f43742a.r();
    }

    @Override
    public final int s(b2.s sVar) {
        return this.f43742a.u(this.f43743b.a(sVar));
    }

    @Override
    public final void t() {
        this.f43742a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f43742a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        return this.f43742a.equals(((m0) obj).f43742a);
    }
}
