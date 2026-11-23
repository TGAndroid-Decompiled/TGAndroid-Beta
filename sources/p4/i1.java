package p4;

import a8.la;
import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import e2.s1;
import e2.x1;
import java.util.IdentityHashMap;
import java.util.List;
public final class i1 implements e2.c1 {
    public final e2.c1 f55332a;
    public final IdentityHashMap f55333b = new IdentityHashMap();

    public i1(e2.c1 c1Var) {
        this.f55332a = c1Var;
    }

    @Override
    public final long A() {
        V0();
        return this.f55332a.A();
    }

    @Override
    public final Looper A0() {
        return this.f55332a.A0();
    }

    @Override
    public final int B() {
        V0();
        return this.f55332a.B();
    }

    @Override
    public final void B0() {
        V0();
        this.f55332a.B0();
    }

    @Override
    public final x1 C() {
        V0();
        return this.f55332a.C();
    }

    @Override
    public final void C0() {
        V0();
        this.f55332a.C0();
    }

    @Override
    public final void D(e2.e eVar, boolean z10) {
        this.f55332a.D(eVar, z10);
    }

    @Override
    public final boolean D0() {
        V0();
        return this.f55332a.D0();
    }

    @Override
    public final void E() {
        V0();
        this.f55332a.E();
    }

    @Override
    public final e2.q1 E0() {
        V0();
        return this.f55332a.E0();
    }

    @Override
    public final float F() {
        V0();
        return this.f55332a.F();
    }

    @Override
    public final long F0() {
        V0();
        return this.f55332a.F0();
    }

    @Override
    public final void G() {
        V0();
        this.f55332a.G();
    }

    @Override
    public final void G0(int i7) {
        V0();
        this.f55332a.G0(i7);
    }

    @Override
    public final e2.e H() {
        V0();
        return this.f55332a.H();
    }

    @Override
    public final void H0() {
        V0();
        this.f55332a.H0();
    }

    @Override
    public final void I(e2.l0 l0Var) {
        V0();
        this.f55332a.I(l0Var);
    }

    @Override
    public final void I0(e2.a1 a1Var) {
        V0();
        synchronized (this.f55333b) {
            try {
                e2.v vVar = (e2.v) this.f55333b.get(a1Var);
                if (vVar == null) {
                    vVar = new e2.v(this, a1Var);
                }
                this.f55332a.I0(vVar);
                this.f55333b.put(a1Var, vVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void J(int i7, boolean z10) {
        V0();
        this.f55332a.J(i7, z10);
    }

    @Override
    public final void J0() {
        V0();
        this.f55332a.J0();
    }

    @Override
    public final e2.o K() {
        V0();
        return this.f55332a.K();
    }

    @Override
    public final void K0(e2.o0 o0Var) {
        V0();
        this.f55332a.K0(o0Var);
    }

    @Override
    public final void L() {
        V0();
        this.f55332a.L();
    }

    @Override
    public final void L0() {
        V0();
        this.f55332a.L0();
    }

    @Override
    public final void M(int i7, int i10) {
        V0();
        this.f55332a.M(i7, i10);
    }

    @Override
    public final e2.o0 M0() {
        V0();
        return this.f55332a.M0();
    }

    @Override
    public final void N(int i7) {
        V0();
        this.f55332a.N(i7);
    }

    @Override
    public final void N0(List list) {
        V0();
        this.f55332a.N0(list);
    }

    @Override
    public final int O() {
        V0();
        return this.f55332a.O();
    }

    @Override
    public final long O0() {
        V0();
        return this.f55332a.O0();
    }

    @Override
    public final boolean P() {
        return this.f55332a.P();
    }

    @Override
    public final boolean P0() {
        V0();
        return this.f55332a.P0();
    }

    @Override
    public final void Q(int i7) {
        V0();
        this.f55332a.Q(i7);
    }

    public final e2.b1 Q0() {
        int i7;
        boolean z10;
        int i10;
        boolean z11;
        e2.l0 l0Var;
        long j3;
        int i11;
        boolean z12;
        boolean p02 = p0(16);
        boolean p03 = p0(17);
        boolean z13 = false;
        if (p03) {
            i7 = o0();
        } else {
            i7 = 0;
        }
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
        if (p03) {
            i10 = B();
        } else {
            i10 = 0;
        }
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        la.p(z11);
        if (p03) {
            e2.l1 y02 = y0();
            if (!y02.p()) {
                if (i7 < y02.o()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                la.p(z12);
                e2.k1 m10 = y02.m(i7, new e2.k1(), 0L);
                if (i10 == h2.l0.i(i10, m10.f10518n, m10.f10519o)) {
                    z13 = true;
                }
                la.p(z13);
            }
        }
        long j10 = 0;
        if (p02) {
            l0Var = w();
        } else {
            l0Var = null;
        }
        e2.l0 l0Var2 = l0Var;
        if (p02) {
            j3 = l();
        } else {
            j3 = 0;
        }
        if (p02) {
            j10 = a0();
        }
        long j11 = j10;
        int i12 = -1;
        if (p02) {
            i11 = n0();
        } else {
            i11 = -1;
        }
        if (p02) {
            i12 = O();
        }
        return new e2.b1(null, i7, l0Var2, null, i10, j3, j11, i11, i12);
    }

    @Override
    public final void R(int i7, int i10) {
        V0();
        this.f55332a.R(i7, i10);
    }

    public final n1 R0() {
        boolean z10;
        long j3;
        long j10;
        long j11;
        long j12;
        boolean p02 = p0(16);
        e2.b1 Q0 = Q0();
        int i7 = 0;
        if (p02 && p()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = -9223372036854775807L;
        if (p02) {
            j3 = getDuration();
        } else {
            j3 = -9223372036854775807L;
        }
        long j14 = 0;
        if (p02) {
            j10 = d0();
        } else {
            j10 = 0;
        }
        if (p02) {
            i7 = y();
        }
        if (p02) {
            j11 = r();
        } else {
            j11 = 0;
        }
        if (p02) {
            j12 = q();
        } else {
            j12 = -9223372036854775807L;
        }
        if (p02) {
            j13 = A();
        }
        if (p02) {
            j14 = F0();
        }
        return new n1(Q0, z10, elapsedRealtime, j3, j10, i7, j11, j12, j13, j14);
    }

    @Override
    public final void S(SurfaceHolder surfaceHolder) {
        V0();
        this.f55332a.S(surfaceHolder);
    }

    public final e2.l0 S0() {
        if (p0(16)) {
            return w();
        }
        return null;
    }

    @Override
    public final void T(float f10) {
        V0();
        this.f55332a.T(f10);
    }

    public final e2.l1 T0() {
        if (p0(17)) {
            return y0();
        }
        if (S0() != null) {
            return new h1(this);
        }
        return e2.l1.f10537a;
    }

    @Override
    public final void U() {
        V0();
        this.f55332a.U();
    }

    public final e2.o0 U0() {
        if (p0(18)) {
            return M0();
        }
        return e2.o0.L;
    }

    @Override
    public final void V(List list, int i7, long j3) {
        V0();
        this.f55332a.V(list, i7, j3);
    }

    public final void V0() {
        boolean z10;
        if (Looper.myLooper() == this.f55332a.A0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
    }

    @Override
    public final e2.v0 W() {
        V0();
        return this.f55332a.W();
    }

    @Override
    public final void X(boolean z10) {
        V0();
        this.f55332a.X(z10);
    }

    @Override
    public final void Y(int i7) {
        V0();
        this.f55332a.Y(i7);
    }

    @Override
    public final long Z() {
        V0();
        return this.f55332a.Z();
    }

    @Override
    public final void a() {
        V0();
        this.f55332a.a();
    }

    @Override
    public final long a0() {
        V0();
        return this.f55332a.a0();
    }

    @Override
    public final void b() {
        V0();
        this.f55332a.b();
    }

    @Override
    public final void b0(int i7, List list) {
        V0();
        this.f55332a.b0(i7, list);
    }

    @Override
    public final void c(long j3) {
        V0();
        this.f55332a.c(j3);
    }

    @Override
    public final void c0() {
        V0();
        this.f55332a.c0();
    }

    @Override
    public final void d(float f10) {
        V0();
        this.f55332a.d(f10);
    }

    @Override
    public final long d0() {
        V0();
        return this.f55332a.d0();
    }

    @Override
    public final void e(e2.w0 w0Var) {
        V0();
        this.f55332a.e(w0Var);
    }

    @Override
    public final boolean e0() {
        V0();
        return this.f55332a.e0();
    }

    @Override
    public final void f() {
        V0();
        this.f55332a.f();
    }

    @Override
    public final void f0(e2.l0 l0Var, long j3) {
        V0();
        this.f55332a.f0(l0Var, j3);
    }

    @Override
    public final boolean g() {
        V0();
        return this.f55332a.g();
    }

    @Override
    public final void g0() {
        V0();
        this.f55332a.g0();
    }

    @Override
    public final long getDuration() {
        V0();
        return this.f55332a.getDuration();
    }

    @Override
    public final boolean h() {
        V0();
        return this.f55332a.h();
    }

    @Override
    public final void h0(e2.a1 a1Var) {
        V0();
        synchronized (this.f55333b) {
            e2.a1 a1Var2 = (e2.a1) this.f55333b.remove(a1Var);
            e2.c1 c1Var = this.f55332a;
            if (a1Var2 != null) {
                a1Var = a1Var2;
            }
            c1Var.h0(a1Var);
        }
    }

    @Override
    public final int i() {
        V0();
        return this.f55332a.i();
    }

    @Override
    public final void i0(int i7) {
        V0();
        this.f55332a.i0(i7);
    }

    @Override
    public final e2.w0 j() {
        V0();
        return this.f55332a.j();
    }

    @Override
    public final s1 j0() {
        V0();
        return this.f55332a.j0();
    }

    @Override
    public final void k(int i7) {
        V0();
        this.f55332a.k(i7);
    }

    @Override
    public final e2.o0 k0() {
        V0();
        return this.f55332a.k0();
    }

    @Override
    public final long l() {
        V0();
        return this.f55332a.l();
    }

    @Override
    public final g2.c l0() {
        V0();
        return this.f55332a.l0();
    }

    @Override
    public final int m() {
        V0();
        return this.f55332a.m();
    }

    @Override
    public final void m0(e2.l0 l0Var) {
        V0();
        this.f55332a.m0(l0Var);
    }

    @Override
    public final int n() {
        V0();
        return this.f55332a.n();
    }

    @Override
    public final int n0() {
        V0();
        return this.f55332a.n0();
    }

    @Override
    public final void o(int i7, e2.l0 l0Var) {
        V0();
        this.f55332a.o(i7, l0Var);
    }

    @Override
    public final int o0() {
        V0();
        return this.f55332a.o0();
    }

    @Override
    public final boolean p() {
        V0();
        return this.f55332a.p();
    }

    @Override
    public final boolean p0(int i7) {
        V0();
        return this.f55332a.p0(i7);
    }

    @Override
    public final long q() {
        V0();
        return this.f55332a.q();
    }

    @Override
    public final void q0(e2.q1 q1Var) {
        V0();
        this.f55332a.q0(q1Var);
    }

    @Override
    public final long r() {
        V0();
        return this.f55332a.r();
    }

    @Override
    public final void r0(boolean z10) {
        V0();
        this.f55332a.r0(z10);
    }

    @Override
    public final void s(int i7, long j3) {
        V0();
        this.f55332a.s(i7, j3);
    }

    @Override
    public final void s0(List list, int i7, int i10) {
        V0();
        this.f55332a.s0(list, i7, i10);
    }

    @Override
    public final void stop() {
        V0();
        this.f55332a.stop();
    }

    @Override
    public final e2.y0 t() {
        V0();
        return this.f55332a.t();
    }

    @Override
    public final void t0(int i7, int i10) {
        V0();
        this.f55332a.t0(i7, i10);
    }

    @Override
    public final boolean u() {
        V0();
        return this.f55332a.u();
    }

    @Override
    public final void u0(int i7, int i10, int i11) {
        V0();
        this.f55332a.u0(i7, i10, i11);
    }

    @Override
    public final void v() {
        V0();
        this.f55332a.v();
    }

    @Override
    public final boolean v0() {
        V0();
        return this.f55332a.v0();
    }

    @Override
    public final e2.l0 w() {
        V0();
        return this.f55332a.w();
    }

    @Override
    public final int w0() {
        V0();
        return this.f55332a.w0();
    }

    @Override
    public final void x(boolean z10) {
        V0();
        this.f55332a.x(z10);
    }

    @Override
    public final void x0(List list) {
        V0();
        this.f55332a.x0(list);
    }

    @Override
    public final int y() {
        V0();
        return this.f55332a.y();
    }

    @Override
    public final e2.l1 y0() {
        V0();
        return this.f55332a.y0();
    }

    @Override
    public final long z() {
        V0();
        return this.f55332a.z();
    }

    @Override
    public final boolean z0() {
        V0();
        return this.f55332a.z0();
    }
}
