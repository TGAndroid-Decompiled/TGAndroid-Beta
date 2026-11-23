package p4;

import a8.ma;
import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import e2.q1;
import e2.s1;
import e2.x1;
import java.util.IdentityHashMap;
import java.util.List;
public final class h1 implements e2.c1 {
    public final e2.c1 f55401a;
    public final IdentityHashMap f55402b = new IdentityHashMap();

    public h1(e2.c1 c1Var) {
        this.f55401a = c1Var;
    }

    @Override
    public final long A() {
        V0();
        return this.f55401a.A();
    }

    @Override
    public final boolean A0() {
        V0();
        return this.f55401a.A0();
    }

    @Override
    public final long B() {
        V0();
        return this.f55401a.B();
    }

    @Override
    public final Looper B0() {
        return this.f55401a.B0();
    }

    @Override
    public final int C() {
        V0();
        return this.f55401a.C();
    }

    @Override
    public final void C0() {
        V0();
        this.f55401a.C0();
    }

    @Override
    public final x1 D() {
        V0();
        return this.f55401a.D();
    }

    @Override
    public final void D0() {
        V0();
        this.f55401a.D0();
    }

    @Override
    public final void E(e2.e eVar, boolean z10) {
        this.f55401a.E(eVar, z10);
    }

    @Override
    public final boolean E0() {
        V0();
        return this.f55401a.E0();
    }

    @Override
    public final void F() {
        V0();
        this.f55401a.F();
    }

    @Override
    public final q1 F0() {
        V0();
        return this.f55401a.F0();
    }

    @Override
    public final float G() {
        V0();
        return this.f55401a.G();
    }

    @Override
    public final long G0() {
        V0();
        return this.f55401a.G0();
    }

    @Override
    public final void H() {
        V0();
        this.f55401a.H();
    }

    @Override
    public final void H0(int i7) {
        V0();
        this.f55401a.H0(i7);
    }

    @Override
    public final e2.e I() {
        V0();
        return this.f55401a.I();
    }

    @Override
    public final void I0() {
        V0();
        this.f55401a.I0();
    }

    @Override
    public final void J(e2.l0 l0Var) {
        V0();
        this.f55401a.J(l0Var);
    }

    @Override
    public final void J0(e2.a1 a1Var) {
        V0();
        synchronized (this.f55402b) {
            try {
                e2.v vVar = (e2.v) this.f55402b.get(a1Var);
                if (vVar == null) {
                    vVar = new e2.v(this, a1Var);
                }
                this.f55401a.J0(vVar);
                this.f55402b.put(a1Var, vVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void K(int i7, boolean z10) {
        V0();
        this.f55401a.K(i7, z10);
    }

    @Override
    public final void K0() {
        V0();
        this.f55401a.K0();
    }

    @Override
    public final e2.o L() {
        V0();
        return this.f55401a.L();
    }

    @Override
    public final void L0(e2.o0 o0Var) {
        V0();
        this.f55401a.L0(o0Var);
    }

    @Override
    public final void M() {
        V0();
        this.f55401a.M();
    }

    @Override
    public final void M0() {
        V0();
        this.f55401a.M0();
    }

    @Override
    public final void N(int i7, int i10) {
        V0();
        this.f55401a.N(i7, i10);
    }

    @Override
    public final e2.o0 N0() {
        V0();
        return this.f55401a.N0();
    }

    @Override
    public final void O(int i7) {
        V0();
        this.f55401a.O(i7);
    }

    @Override
    public final void O0(List list) {
        V0();
        this.f55401a.O0(list);
    }

    @Override
    public final int P() {
        V0();
        return this.f55401a.P();
    }

    @Override
    public final long P0() {
        V0();
        return this.f55401a.P0();
    }

    @Override
    public final boolean Q() {
        return this.f55401a.Q();
    }

    @Override
    public final boolean Q0() {
        V0();
        return this.f55401a.Q0();
    }

    @Override
    public final void R(int i7) {
        V0();
        this.f55401a.R(i7);
    }

    public final m1 R0() {
        boolean z10;
        long j3;
        long j10;
        long j11;
        long j12;
        boolean q02 = q0(16);
        e2.b1 h = h();
        int i7 = 0;
        if (q02 && q()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = -9223372036854775807L;
        if (q02) {
            j3 = getDuration();
        } else {
            j3 = -9223372036854775807L;
        }
        long j14 = 0;
        if (q02) {
            j10 = e0();
        } else {
            j10 = 0;
        }
        if (q02) {
            i7 = z();
        }
        if (q02) {
            j11 = s();
        } else {
            j11 = 0;
        }
        if (q02) {
            j12 = r();
        } else {
            j12 = -9223372036854775807L;
        }
        if (q02) {
            j13 = B();
        }
        if (q02) {
            j14 = G0();
        }
        return new m1(h, z10, elapsedRealtime, j3, j10, i7, j11, j12, j13, j14);
    }

    @Override
    public final void S(int i7, int i10) {
        V0();
        this.f55401a.S(i7, i10);
    }

    public final e2.l0 S0() {
        if (q0(16)) {
            return x();
        }
        return null;
    }

    @Override
    public final void T(SurfaceHolder surfaceHolder) {
        V0();
        this.f55401a.T(surfaceHolder);
    }

    public final e2.l1 T0() {
        if (q0(17)) {
            return z0();
        }
        if (S0() != null) {
            return new g1(this);
        }
        return e2.l1.f10498a;
    }

    @Override
    public final void U(float f10) {
        V0();
        this.f55401a.U(f10);
    }

    public final e2.o0 U0() {
        if (q0(18)) {
            return N0();
        }
        return e2.o0.L;
    }

    @Override
    public final void V() {
        V0();
        this.f55401a.V();
    }

    public final void V0() {
        boolean z10;
        if (Looper.myLooper() == this.f55401a.B0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
    }

    @Override
    public final void W(List list, int i7, long j3) {
        V0();
        this.f55401a.W(list, i7, j3);
    }

    @Override
    public final e2.v0 X() {
        V0();
        return this.f55401a.X();
    }

    @Override
    public final void Y(boolean z10) {
        V0();
        this.f55401a.Y(z10);
    }

    @Override
    public final void Z(int i7) {
        V0();
        this.f55401a.Z(i7);
    }

    @Override
    public final void a() {
        V0();
        this.f55401a.a();
    }

    @Override
    public final long a0() {
        V0();
        return this.f55401a.a0();
    }

    @Override
    public final void b() {
        V0();
        this.f55401a.b();
    }

    @Override
    public final long b0() {
        V0();
        return this.f55401a.b0();
    }

    @Override
    public final void c(long j3) {
        V0();
        this.f55401a.c(j3);
    }

    @Override
    public final void c0(int i7, List list) {
        V0();
        this.f55401a.c0(i7, list);
    }

    @Override
    public final void d(float f10) {
        V0();
        this.f55401a.d(f10);
    }

    @Override
    public final void d0() {
        V0();
        this.f55401a.d0();
    }

    @Override
    public final void e(e2.w0 w0Var) {
        V0();
        this.f55401a.e(w0Var);
    }

    @Override
    public final long e0() {
        V0();
        return this.f55401a.e0();
    }

    @Override
    public final void f() {
        V0();
        this.f55401a.f();
    }

    @Override
    public final boolean f0() {
        V0();
        return this.f55401a.f0();
    }

    @Override
    public final boolean g() {
        V0();
        return this.f55401a.g();
    }

    @Override
    public final void g0(e2.l0 l0Var, long j3) {
        V0();
        this.f55401a.g0(l0Var, j3);
    }

    @Override
    public final long getDuration() {
        V0();
        return this.f55401a.getDuration();
    }

    public final e2.b1 h() {
        int i7;
        boolean z10;
        int i10;
        boolean z11;
        e2.l0 l0Var;
        long j3;
        int i11;
        boolean z12;
        boolean q02 = q0(16);
        boolean q03 = q0(17);
        boolean z13 = false;
        if (q03) {
            i7 = p0();
        } else {
            i7 = 0;
        }
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        if (q03) {
            i10 = C();
        } else {
            i10 = 0;
        }
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ma.p(z11);
        if (q03) {
            e2.l1 z02 = z0();
            if (!z02.p()) {
                if (i7 < z02.o()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ma.p(z12);
                e2.k1 m10 = z02.m(i7, new e2.k1(), 0L);
                if (i10 == h2.l0.i(i10, m10.f10479n, m10.f10480o)) {
                    z13 = true;
                }
                ma.p(z13);
            }
        }
        long j10 = 0;
        if (q02) {
            l0Var = x();
        } else {
            l0Var = null;
        }
        e2.l0 l0Var2 = l0Var;
        if (q02) {
            j3 = n();
        } else {
            j3 = 0;
        }
        if (q02) {
            j10 = b0();
        }
        long j11 = j10;
        int i12 = -1;
        if (q02) {
            i11 = o0();
        } else {
            i11 = -1;
        }
        if (q02) {
            i12 = P();
        }
        return new e2.b1(null, i7, l0Var2, null, i10, j3, j11, i11, i12);
    }

    @Override
    public final void h0() {
        V0();
        this.f55401a.h0();
    }

    @Override
    public final int i() {
        V0();
        return this.f55401a.i();
    }

    @Override
    public final void i0(e2.a1 a1Var) {
        V0();
        synchronized (this.f55402b) {
            e2.a1 a1Var2 = (e2.a1) this.f55402b.remove(a1Var);
            e2.c1 c1Var = this.f55401a;
            if (a1Var2 != null) {
                a1Var = a1Var2;
            }
            c1Var.i0(a1Var);
        }
    }

    @Override
    public final boolean j() {
        V0();
        return this.f55401a.j();
    }

    @Override
    public final void j0(int i7) {
        V0();
        this.f55401a.j0(i7);
    }

    @Override
    public final void k(int i7) {
        V0();
        this.f55401a.k(i7);
    }

    @Override
    public final s1 k0() {
        V0();
        return this.f55401a.k0();
    }

    @Override
    public final e2.w0 l() {
        V0();
        return this.f55401a.l();
    }

    @Override
    public final e2.o0 l0() {
        V0();
        return this.f55401a.l0();
    }

    @Override
    public final int m() {
        V0();
        return this.f55401a.m();
    }

    @Override
    public final g2.c m0() {
        V0();
        return this.f55401a.m0();
    }

    @Override
    public final long n() {
        V0();
        return this.f55401a.n();
    }

    @Override
    public final void n0(e2.l0 l0Var) {
        V0();
        this.f55401a.n0(l0Var);
    }

    @Override
    public final int o() {
        V0();
        return this.f55401a.o();
    }

    @Override
    public final int o0() {
        V0();
        return this.f55401a.o0();
    }

    @Override
    public final void p(int i7, e2.l0 l0Var) {
        V0();
        this.f55401a.p(i7, l0Var);
    }

    @Override
    public final int p0() {
        V0();
        return this.f55401a.p0();
    }

    @Override
    public final boolean q() {
        V0();
        return this.f55401a.q();
    }

    @Override
    public final boolean q0(int i7) {
        V0();
        return this.f55401a.q0(i7);
    }

    @Override
    public final long r() {
        V0();
        return this.f55401a.r();
    }

    @Override
    public final void r0(q1 q1Var) {
        V0();
        this.f55401a.r0(q1Var);
    }

    @Override
    public final long s() {
        V0();
        return this.f55401a.s();
    }

    @Override
    public final void s0(boolean z10) {
        V0();
        this.f55401a.s0(z10);
    }

    @Override
    public final void stop() {
        V0();
        this.f55401a.stop();
    }

    @Override
    public final void t(int i7, long j3) {
        V0();
        this.f55401a.t(i7, j3);
    }

    @Override
    public final void t0(List list, int i7, int i10) {
        V0();
        this.f55401a.t0(list, i7, i10);
    }

    @Override
    public final e2.y0 u() {
        V0();
        return this.f55401a.u();
    }

    @Override
    public final void u0(int i7, int i10) {
        V0();
        this.f55401a.u0(i7, i10);
    }

    @Override
    public final boolean v() {
        V0();
        return this.f55401a.v();
    }

    @Override
    public final void v0(int i7, int i10, int i11) {
        V0();
        this.f55401a.v0(i7, i10, i11);
    }

    @Override
    public final void w() {
        V0();
        this.f55401a.w();
    }

    @Override
    public final boolean w0() {
        V0();
        return this.f55401a.w0();
    }

    @Override
    public final e2.l0 x() {
        V0();
        return this.f55401a.x();
    }

    @Override
    public final int x0() {
        V0();
        return this.f55401a.x0();
    }

    @Override
    public final void y(boolean z10) {
        V0();
        this.f55401a.y(z10);
    }

    @Override
    public final void y0(List list) {
        V0();
        this.f55401a.y0(list);
    }

    @Override
    public final int z() {
        V0();
        return this.f55401a.z();
    }

    @Override
    public final e2.l1 z0() {
        V0();
        return this.f55401a.z0();
    }
}
