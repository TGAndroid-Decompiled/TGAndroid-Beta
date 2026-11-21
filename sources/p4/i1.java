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
    public final e2.c1 f55328a;
    public final IdentityHashMap f55329b = new IdentityHashMap();

    public i1(e2.c1 c1Var) {
        this.f55328a = c1Var;
    }

    @Override
    public final long A() {
        V0();
        return this.f55328a.A();
    }

    @Override
    public final Looper A0() {
        return this.f55328a.A0();
    }

    @Override
    public final int B() {
        V0();
        return this.f55328a.B();
    }

    @Override
    public final void B0() {
        V0();
        this.f55328a.B0();
    }

    @Override
    public final x1 C() {
        V0();
        return this.f55328a.C();
    }

    @Override
    public final void C0() {
        V0();
        this.f55328a.C0();
    }

    @Override
    public final void D(e2.e eVar, boolean z10) {
        this.f55328a.D(eVar, z10);
    }

    @Override
    public final boolean D0() {
        V0();
        return this.f55328a.D0();
    }

    @Override
    public final void E() {
        V0();
        this.f55328a.E();
    }

    @Override
    public final e2.q1 E0() {
        V0();
        return this.f55328a.E0();
    }

    @Override
    public final float F() {
        V0();
        return this.f55328a.F();
    }

    @Override
    public final long F0() {
        V0();
        return this.f55328a.F0();
    }

    @Override
    public final void G() {
        V0();
        this.f55328a.G();
    }

    @Override
    public final void G0(int i7) {
        V0();
        this.f55328a.G0(i7);
    }

    @Override
    public final e2.e H() {
        V0();
        return this.f55328a.H();
    }

    @Override
    public final void H0() {
        V0();
        this.f55328a.H0();
    }

    @Override
    public final void I(e2.l0 l0Var) {
        V0();
        this.f55328a.I(l0Var);
    }

    @Override
    public final void I0(e2.a1 a1Var) {
        V0();
        synchronized (this.f55329b) {
            try {
                e2.v vVar = (e2.v) this.f55329b.get(a1Var);
                if (vVar == null) {
                    vVar = new e2.v(this, a1Var);
                }
                this.f55328a.I0(vVar);
                this.f55329b.put(a1Var, vVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void J(int i7, boolean z10) {
        V0();
        this.f55328a.J(i7, z10);
    }

    @Override
    public final void J0() {
        V0();
        this.f55328a.J0();
    }

    @Override
    public final e2.o K() {
        V0();
        return this.f55328a.K();
    }

    @Override
    public final void K0(e2.o0 o0Var) {
        V0();
        this.f55328a.K0(o0Var);
    }

    @Override
    public final void L() {
        V0();
        this.f55328a.L();
    }

    @Override
    public final void L0() {
        V0();
        this.f55328a.L0();
    }

    @Override
    public final void M(int i7, int i10) {
        V0();
        this.f55328a.M(i7, i10);
    }

    @Override
    public final e2.o0 M0() {
        V0();
        return this.f55328a.M0();
    }

    @Override
    public final void N(int i7) {
        V0();
        this.f55328a.N(i7);
    }

    @Override
    public final void N0(List list) {
        V0();
        this.f55328a.N0(list);
    }

    @Override
    public final int O() {
        V0();
        return this.f55328a.O();
    }

    @Override
    public final long O0() {
        V0();
        return this.f55328a.O0();
    }

    @Override
    public final boolean P() {
        return this.f55328a.P();
    }

    @Override
    public final boolean P0() {
        V0();
        return this.f55328a.P0();
    }

    @Override
    public final void Q(int i7) {
        V0();
        this.f55328a.Q(i7);
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
                if (i10 == h2.l0.i(i10, m10.f10515n, m10.f10516o)) {
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
        this.f55328a.R(i7, i10);
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
        this.f55328a.S(surfaceHolder);
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
        this.f55328a.T(f10);
    }

    public final e2.l1 T0() {
        if (p0(17)) {
            return y0();
        }
        if (S0() != null) {
            return new h1(this);
        }
        return e2.l1.f10534a;
    }

    @Override
    public final void U() {
        V0();
        this.f55328a.U();
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
        this.f55328a.V(list, i7, j3);
    }

    public final void V0() {
        boolean z10;
        if (Looper.myLooper() == this.f55328a.A0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
    }

    @Override
    public final e2.v0 W() {
        V0();
        return this.f55328a.W();
    }

    @Override
    public final void X(boolean z10) {
        V0();
        this.f55328a.X(z10);
    }

    @Override
    public final void Y(int i7) {
        V0();
        this.f55328a.Y(i7);
    }

    @Override
    public final long Z() {
        V0();
        return this.f55328a.Z();
    }

    @Override
    public final void a() {
        V0();
        this.f55328a.a();
    }

    @Override
    public final long a0() {
        V0();
        return this.f55328a.a0();
    }

    @Override
    public final void b() {
        V0();
        this.f55328a.b();
    }

    @Override
    public final void b0(int i7, List list) {
        V0();
        this.f55328a.b0(i7, list);
    }

    @Override
    public final void c(long j3) {
        V0();
        this.f55328a.c(j3);
    }

    @Override
    public final void c0() {
        V0();
        this.f55328a.c0();
    }

    @Override
    public final void d(float f10) {
        V0();
        this.f55328a.d(f10);
    }

    @Override
    public final long d0() {
        V0();
        return this.f55328a.d0();
    }

    @Override
    public final void e(e2.w0 w0Var) {
        V0();
        this.f55328a.e(w0Var);
    }

    @Override
    public final boolean e0() {
        V0();
        return this.f55328a.e0();
    }

    @Override
    public final void f() {
        V0();
        this.f55328a.f();
    }

    @Override
    public final void f0(e2.l0 l0Var, long j3) {
        V0();
        this.f55328a.f0(l0Var, j3);
    }

    @Override
    public final boolean g() {
        V0();
        return this.f55328a.g();
    }

    @Override
    public final void g0() {
        V0();
        this.f55328a.g0();
    }

    @Override
    public final long getDuration() {
        V0();
        return this.f55328a.getDuration();
    }

    @Override
    public final boolean h() {
        V0();
        return this.f55328a.h();
    }

    @Override
    public final void h0(e2.a1 a1Var) {
        V0();
        synchronized (this.f55329b) {
            e2.a1 a1Var2 = (e2.a1) this.f55329b.remove(a1Var);
            e2.c1 c1Var = this.f55328a;
            if (a1Var2 != null) {
                a1Var = a1Var2;
            }
            c1Var.h0(a1Var);
        }
    }

    @Override
    public final int i() {
        V0();
        return this.f55328a.i();
    }

    @Override
    public final void i0(int i7) {
        V0();
        this.f55328a.i0(i7);
    }

    @Override
    public final e2.w0 j() {
        V0();
        return this.f55328a.j();
    }

    @Override
    public final s1 j0() {
        V0();
        return this.f55328a.j0();
    }

    @Override
    public final void k(int i7) {
        V0();
        this.f55328a.k(i7);
    }

    @Override
    public final e2.o0 k0() {
        V0();
        return this.f55328a.k0();
    }

    @Override
    public final long l() {
        V0();
        return this.f55328a.l();
    }

    @Override
    public final g2.c l0() {
        V0();
        return this.f55328a.l0();
    }

    @Override
    public final int m() {
        V0();
        return this.f55328a.m();
    }

    @Override
    public final void m0(e2.l0 l0Var) {
        V0();
        this.f55328a.m0(l0Var);
    }

    @Override
    public final int n() {
        V0();
        return this.f55328a.n();
    }

    @Override
    public final int n0() {
        V0();
        return this.f55328a.n0();
    }

    @Override
    public final void o(int i7, e2.l0 l0Var) {
        V0();
        this.f55328a.o(i7, l0Var);
    }

    @Override
    public final int o0() {
        V0();
        return this.f55328a.o0();
    }

    @Override
    public final boolean p() {
        V0();
        return this.f55328a.p();
    }

    @Override
    public final boolean p0(int i7) {
        V0();
        return this.f55328a.p0(i7);
    }

    @Override
    public final long q() {
        V0();
        return this.f55328a.q();
    }

    @Override
    public final void q0(e2.q1 q1Var) {
        V0();
        this.f55328a.q0(q1Var);
    }

    @Override
    public final long r() {
        V0();
        return this.f55328a.r();
    }

    @Override
    public final void r0(boolean z10) {
        V0();
        this.f55328a.r0(z10);
    }

    @Override
    public final void s(int i7, long j3) {
        V0();
        this.f55328a.s(i7, j3);
    }

    @Override
    public final void s0(List list, int i7, int i10) {
        V0();
        this.f55328a.s0(list, i7, i10);
    }

    @Override
    public final void stop() {
        V0();
        this.f55328a.stop();
    }

    @Override
    public final e2.y0 t() {
        V0();
        return this.f55328a.t();
    }

    @Override
    public final void t0(int i7, int i10) {
        V0();
        this.f55328a.t0(i7, i10);
    }

    @Override
    public final boolean u() {
        V0();
        return this.f55328a.u();
    }

    @Override
    public final void u0(int i7, int i10, int i11) {
        V0();
        this.f55328a.u0(i7, i10, i11);
    }

    @Override
    public final void v() {
        V0();
        this.f55328a.v();
    }

    @Override
    public final boolean v0() {
        V0();
        return this.f55328a.v0();
    }

    @Override
    public final e2.l0 w() {
        V0();
        return this.f55328a.w();
    }

    @Override
    public final int w0() {
        V0();
        return this.f55328a.w0();
    }

    @Override
    public final void x(boolean z10) {
        V0();
        this.f55328a.x(z10);
    }

    @Override
    public final void x0(List list) {
        V0();
        this.f55328a.x0(list);
    }

    @Override
    public final int y() {
        V0();
        return this.f55328a.y();
    }

    @Override
    public final e2.l1 y0() {
        V0();
        return this.f55328a.y0();
    }

    @Override
    public final long z() {
        V0();
        return this.f55328a.z();
    }

    @Override
    public final boolean z0() {
        V0();
        return this.f55328a.z0();
    }
}
