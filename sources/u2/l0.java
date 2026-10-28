package u2;

import java.util.List;
public final class l0 implements x2.q {
    public final x2.q f49379a;
    public final b2.q1 f49380b;

    public l0(x2.q qVar, b2.q1 q1Var) {
        this.f49379a = qVar;
        this.f49380b = q1Var;
    }

    @Override
    public final boolean a(int i10, long j10) {
        return this.f49379a.a(i10, j10);
    }

    @Override
    public final b2.q1 b() {
        return this.f49380b;
    }

    @Override
    public final int c() {
        return this.f49379a.c();
    }

    @Override
    public final boolean d(long j10, v2.f fVar, List list) {
        return this.f49379a.d(j10, fVar, list);
    }

    @Override
    public final void e(boolean z10) {
        this.f49379a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof l0)) {
            return this.f49380b.equals(((l0) obj).f49380b);
        }
        return false;
    }

    @Override
    public final b2.x f(int i10) {
        return this.f49380b.d[this.f49379a.h(i10)];
    }

    @Override
    public final void g() {
        this.f49379a.g();
    }

    @Override
    public final int h(int i10) {
        return this.f49379a.h(i10);
    }

    public final int hashCode() {
        return this.f49380b.hashCode() + (this.f49379a.hashCode() * 31);
    }

    @Override
    public final int i(long j10, List list) {
        return this.f49379a.i(j10, list);
    }

    @Override
    public final void j() {
        this.f49379a.j();
    }

    @Override
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
        this.f49379a.k(j10, j11, j12, list, mVarArr);
    }

    @Override
    public final int l() {
        return this.f49379a.l();
    }

    @Override
    public final int length() {
        return this.f49379a.length();
    }

    @Override
    public final b2.x m() {
        return this.f49380b.d[this.f49379a.l()];
    }

    @Override
    public final int n() {
        return this.f49379a.n();
    }

    @Override
    public final boolean o(int i10, long j10) {
        return this.f49379a.o(i10, j10);
    }

    @Override
    public final void p(float f7) {
        this.f49379a.p(f7);
    }

    @Override
    public final Object q() {
        return this.f49379a.q();
    }

    @Override
    public final void r() {
        this.f49379a.r();
    }

    @Override
    public final int s(b2.x xVar) {
        return this.f49379a.u(this.f49380b.a(xVar));
    }

    @Override
    public final void t() {
        this.f49379a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f49379a.u(i10);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        return this.f49379a.equals(((l0) obj).f49379a);
    }
}
