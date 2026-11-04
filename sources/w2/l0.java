package w2;

import java.util.List;
public final class l0 implements z2.p {
    public final z2.p f57130a;
    public final d2.o1 f57131b;

    public l0(z2.p pVar, d2.o1 o1Var) {
        this.f57130a = pVar;
        this.f57131b = o1Var;
    }

    @Override
    public final boolean a(int i3, long j10) {
        return this.f57130a.a(i3, j10);
    }

    @Override
    public final d2.o1 b() {
        return this.f57131b;
    }

    @Override
    public final int c() {
        return this.f57130a.c();
    }

    @Override
    public final void d(long j10, long j11, long j12, List list, x2.m[] mVarArr) {
        this.f57130a.d(j10, j11, j12, list, mVarArr);
    }

    @Override
    public final int e(d2.v vVar) {
        return this.f57130a.u(this.f57131b.a(vVar));
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof l0)) {
            return this.f57131b.equals(((l0) obj).f57131b);
        }
        return false;
    }

    @Override
    public final void f(boolean z10) {
        this.f57130a.f(z10);
    }

    @Override
    public final d2.v g(int i3) {
        return this.f57131b.d[this.f57130a.i(i3)];
    }

    @Override
    public final void h() {
        this.f57130a.h();
    }

    public final int hashCode() {
        return this.f57131b.hashCode() + (this.f57130a.hashCode() * 31);
    }

    @Override
    public final int i(int i3) {
        return this.f57130a.i(i3);
    }

    @Override
    public final int j(long j10, List list) {
        return this.f57130a.j(j10, list);
    }

    @Override
    public final void k() {
        this.f57130a.k();
    }

    @Override
    public final int l() {
        return this.f57130a.l();
    }

    @Override
    public final int length() {
        return this.f57130a.length();
    }

    @Override
    public final boolean m(long j10, x2.f fVar, List list) {
        return this.f57130a.m(j10, fVar, list);
    }

    @Override
    public final d2.v n() {
        return this.f57131b.d[this.f57130a.l()];
    }

    @Override
    public final int o() {
        return this.f57130a.o();
    }

    @Override
    public final boolean p(int i3, long j10) {
        return this.f57130a.p(i3, j10);
    }

    @Override
    public final void q(float f10) {
        this.f57130a.q(f10);
    }

    @Override
    public final Object r() {
        return this.f57130a.r();
    }

    @Override
    public final void s() {
        this.f57130a.s();
    }

    @Override
    public final void t() {
        this.f57130a.t();
    }

    @Override
    public final int u(int i3) {
        return this.f57130a.u(i3);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        return this.f57130a.equals(((l0) obj).f57130a);
    }
}
