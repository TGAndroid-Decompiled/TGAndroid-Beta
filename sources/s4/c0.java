package s4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public class c0 extends o0 {
    public int A;
    public b0 B;
    public final i2.m0 C;
    public final z D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int f42949o;
    public a0 f42950p;
    public androidx.emoji2.text.g f42951q;
    public boolean f42952r;
    public boolean f42953s;
    public boolean f42954t;
    public boolean f42955u;
    public boolean v;
    public boolean f42956w;
    public final boolean f42957x;
    public int f42958y;
    public boolean f42959z;

    public c0() {
        this(1, false);
    }

    public void A0(z0 z0Var, a0 a0Var, a0.h hVar) {
        int i10 = a0Var.d;
        if (i10 >= 0 && i10 < z0Var.b()) {
            hVar.b(i10, Math.max(0, a0Var.f42932g));
        }
    }

    public final int B0(z0 z0Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f42951q;
            boolean z10 = this.f42957x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && z0Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return Math.abs(((p0) K0.getLayoutParams()).b() - ((p0) J0.getLayoutParams()).b()) + 1;
                }
                return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
            }
            return 0;
        }
        return 0;
    }

    public final int C0(z0 z0Var) {
        int max;
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f42951q;
            boolean z10 = this.f42957x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && z0Var.b() != 0 && K0 != null && J0 != null) {
                int min = Math.min(((p0) K0.getLayoutParams()).b(), ((p0) J0.getLayoutParams()).b());
                int max2 = Math.max(((p0) K0.getLayoutParams()).b(), ((p0) J0.getLayoutParams()).b());
                if (z12) {
                    max = Math.max(0, (z0Var.b() - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!z10) {
                    return max;
                }
                return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((p0) K0.getLayoutParams()).b() - ((p0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
            }
        }
        return 0;
    }

    public final int D0(z0 z0Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f42951q;
            boolean z10 = this.f42957x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && z0Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return z0Var.b();
                }
                return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((p0) K0.getLayoutParams()).b() - ((p0) J0.getLayoutParams()).b()) + 1)) * z0Var.b());
            }
            return 0;
        }
        return 0;
    }

    public final PointF E0(int i10) {
        if (r() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < o0.H(q(0))) {
            z10 = true;
        }
        if (z10 != this.v) {
            i11 = -1;
        }
        if (this.f42949o == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }

    public final int F0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130 && this.f42949o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f42949o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f42949o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f42949o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f42949o != 1 && Y0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f42949o == 1 || !Y0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void G0() {
        if (this.f42950p == null) {
            ?? obj = new Object();
            obj.f42928a = true;
            obj.h = 0;
            obj.f42933i = 0;
            obj.f42935k = null;
            this.f42950p = obj;
        }
    }

    public final int H0(of.e eVar, a0 a0Var, z0 z0Var, boolean z10) {
        int i10 = a0Var.f42930c;
        int i11 = a0Var.f42932g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                a0Var.f42932g = i11 + i10;
            }
            c1(eVar, a0Var);
        }
        int i12 = a0Var.f42930c + a0Var.h;
        while (true) {
            if ((!a0Var.f42936l && i12 <= 0) || !a0Var.b(z0Var)) {
                break;
            }
            z zVar = this.D;
            zVar.f43116a = 0;
            zVar.f43117b = false;
            zVar.f43118c = false;
            zVar.d = false;
            Z0(eVar, z0Var, a0Var, zVar);
            if (!zVar.f43117b) {
                int i13 = a0Var.f42929b;
                int i14 = zVar.f43116a;
                a0Var.f42929b = (a0Var.f42931f * i14) + i13;
                if (!zVar.f43118c || a0Var.f42935k != null || !z0Var.f43123g) {
                    a0Var.f42930c -= i14;
                    i12 -= i14;
                }
                int i15 = a0Var.f42932g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    a0Var.f42932g = i16;
                    int i17 = a0Var.f42930c;
                    if (i17 < 0) {
                        a0Var.f42932g = i16 + i17;
                    }
                    c1(eVar, a0Var);
                }
                if (z10 && zVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - a0Var.f42930c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((p0) P0.getLayoutParams()).b();
    }

    public final View J0(boolean z10) {
        if (this.v) {
            return P0(0, r(), z10, true);
        }
        return P0(r() - 1, -1, z10, true);
    }

    public final View K0(boolean z10) {
        if (this.v) {
            return P0(r() - 1, -1, z10, true);
        }
        return P0(0, r(), z10, true);
    }

    public final int L0() {
        View P0 = P0(0, r(), false, true);
        if (P0 == null) {
            return -1;
        }
        return ((p0) P0.getLayoutParams()).b();
    }

    public final int M0() {
        View P0 = P0(r() - 1, -1, true, false);
        if (P0 == null) {
            return -1;
        }
        return ((p0) P0.getLayoutParams()).b();
    }

    public final int N0() {
        View P0 = P0(r() - 1, -1, false, true);
        if (P0 == null) {
            return -1;
        }
        return ((p0) P0.getLayoutParams()).b();
    }

    public final View O0(int i10, int i11) {
        int i12;
        int i13;
        G0();
        if (i11 > i10 || i11 < i10) {
            if (this.f42951q.d(q(i10)) < this.f42951q.j()) {
                i12 = 16644;
                i13 = 16388;
            } else {
                i12 = 4161;
                i13 = 4097;
            }
            if (this.f42949o == 0) {
                return this.f43055c.v(i10, i11, i12, i13);
            }
            return this.d.v(i10, i11, i12, i13);
        }
        return q(i10);
    }

    public final View P0(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        G0();
        int i13 = 320;
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (!z11) {
            i13 = 0;
        }
        if (this.f42949o == 0) {
            return this.f43055c.v(i10, i11, i12, i13);
        }
        return this.d.v(i10, i11, i12, i13);
    }

    public View Q0(of.e eVar, z0 z0Var, int i10, int i11, int i12) {
        int j3;
        int i13;
        G0();
        if (this.f42952r) {
            j3 = 0;
        } else {
            j3 = this.f42951q.j();
        }
        int f7 = this.f42951q.f();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q6 = q(i10);
            int H = o0.H(q6);
            if (H >= 0 && H < i12) {
                if (((p0) q6.getLayoutParams()).f43067a.j()) {
                    if (view2 == null) {
                        view2 = q6;
                    }
                } else if (this.f42951q.d(q6) < f7 && this.f42951q.a(q6) >= j3) {
                    return q6;
                } else {
                    if (view == null) {
                        view = q6;
                    }
                }
            }
            i10 += i13;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override
    public View R(View view, int i10, of.e eVar, z0 z0Var) {
        int F0;
        View O0;
        View U0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.f42951q.k() * 0.33333334f), false, z0Var);
            a0 a0Var = this.f42950p;
            a0Var.f42932g = Integer.MIN_VALUE;
            a0Var.f42928a = false;
            H0(eVar, a0Var, z0Var, true);
            if (F0 == -1) {
                if (this.v) {
                    O0 = O0(r() - 1, -1);
                } else {
                    O0 = O0(0, r());
                }
            } else if (this.v) {
                O0 = O0(0, r());
            } else {
                O0 = O0(r() - 1, -1);
            }
            if (F0 == -1) {
                U0 = V0();
            } else {
                U0 = U0();
            }
            if (U0.hasFocusable()) {
                if (O0 != null) {
                    return U0;
                }
            } else {
                return O0;
            }
        }
        return null;
    }

    public int R0() {
        return 0;
    }

    public final int S0(int i10, of.e eVar, z0 z0Var, boolean z10) {
        int f7;
        int f10;
        if (this.G && this.H && (f7 = this.f42951q.f() - i10) > 0) {
            int i11 = -g1(-f7, eVar, z0Var);
            int i12 = i10 + i11;
            if (z10 && (f10 = this.f42951q.f() - i12) > 0) {
                this.f42951q.n(f10);
                return f10 + i11;
            }
            return i11;
        }
        return 0;
    }

    public final int T0(int i10, of.e eVar, z0 z0Var, boolean z10) {
        int X0;
        int j3;
        if (this.G && (X0 = i10 - X0()) > 0) {
            int i11 = -g1(X0, eVar, z0Var);
            int i12 = i10 + i11;
            if (z10 && (j3 = i12 - this.f42951q.j()) > 0) {
                this.f42951q.n(-j3);
                return i11 - j3;
            }
            return i11;
        }
        return 0;
    }

    public final View U0() {
        int r10;
        if (this.v) {
            r10 = 0;
        } else {
            r10 = r() - 1;
        }
        return q(r10);
    }

    public final View V0() {
        int i10;
        if (this.v) {
            i10 = r() - 1;
        } else {
            i10 = 0;
        }
        return q(i10);
    }

    public int W0(z0 z0Var) {
        if (z0Var.f43119a != -1) {
            return this.f42951q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f42951q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f43054b;
        WeakHashMap weakHashMap = r0.i0.f42129a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Z0(of.e eVar, z0 z0Var, a0 a0Var, z zVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        View c10 = a0Var.c(eVar);
        if (c10 == null) {
            zVar.f43117b = true;
            return;
        }
        p0 p0Var = (p0) c10.getLayoutParams();
        if (a0Var.f42935k == null) {
            boolean z12 = this.v;
            if (a0Var.f42931f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                a(c10, -1, false);
            } else {
                a(c10, 0, false);
            }
        } else {
            boolean z13 = this.v;
            if (a0Var.f42931f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                a(c10, -1, true);
            } else {
                a(c10, 0, true);
            }
        }
        P(c10);
        zVar.f43116a = this.f42951q.b(c10);
        if (this.f42949o == 1) {
            if (Y0()) {
                i13 = this.f43062m - E();
                i10 = i13 - this.f42951q.c(c10);
            } else {
                i10 = D();
                i13 = this.f42951q.c(c10) + i10;
            }
            if (a0Var.f42931f == -1) {
                i11 = a0Var.f42929b;
                i12 = i11 - zVar.f43116a;
            } else {
                i12 = a0Var.f42929b;
                i11 = zVar.f43116a + i12;
            }
        } else {
            int F = F();
            int c11 = this.f42951q.c(c10) + F;
            if (a0Var.f42931f == -1) {
                int i14 = a0Var.f42929b;
                int i15 = i14 - zVar.f43116a;
                i13 = i14;
                i11 = c11;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = a0Var.f42929b;
                int i17 = zVar.f43116a + i16;
                i10 = i16;
                i11 = c11;
                i12 = F;
                i13 = i17;
            }
        }
        o0.O(c10, i10, i12, i13, i11);
        if (p0Var.f43067a.j() || p0Var.f43067a.m()) {
            zVar.f43118c = true;
        }
        zVar.d = c10.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f43054b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(of.e r18, s4.z0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: s4.c0.b0(of.e, s4.z0):void");
    }

    public void b1(View view, View view2, int i10, int i11) {
        char c10;
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = o0.H(view);
        int H2 = o0.H(view2);
        if (H < H2) {
            c10 = 1;
        } else {
            c10 = 65535;
        }
        if (this.v) {
            if (c10 == 1) {
                h1(H2, this.f42951q.f() - (this.f42951q.b(view) + this.f42951q.d(view2)));
                return;
            }
            h1(H2, this.f42951q.f() - this.f42951q.a(view2));
        } else if (c10 == 65535) {
            h1(H2, this.f42951q.d(view2));
        } else {
            h1(H2, this.f42951q.a(view2) - this.f42951q.b(view));
        }
    }

    @Override
    public void c0(z0 z0Var) {
        this.B = null;
        this.f42958y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.g();
    }

    public final void c1(of.e eVar, a0 a0Var) {
        c1 T;
        c1 T2;
        if (a0Var.f42928a && !a0Var.f42936l) {
            int i10 = a0Var.f42932g;
            int i11 = a0Var.f42933i;
            if (a0Var.f42931f == -1) {
                int r10 = r();
                if (i10 >= 0) {
                    int e = (this.f42951q.e() - i10) + i11;
                    if (this.v) {
                        for (int i12 = 0; i12 < r10; i12++) {
                            View q6 = q(i12);
                            if (q6 != null && (T2 = this.f43054b.T(q6)) != null && !T2.r() && (this.f42951q.d(q6) < e || this.f42951q.m(q6) < e)) {
                                d1(eVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = r10 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View q10 = q(i14);
                        if (q10 != null && (T = this.f43054b.T(q10)) != null && !T.r() && (this.f42951q.d(q10) < e || this.f42951q.m(q10) < e)) {
                            d1(eVar, i13, i14);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            e1(eVar, i10, i11);
        }
    }

    @Override
    public final boolean d() {
        if (!this.f42955u && this.f42949o == 0) {
            return true;
        }
        return false;
    }

    public final void d1(of.e eVar, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                for (int i12 = i11 - 1; i12 >= i10; i12--) {
                    i0(i12, eVar);
                }
                return;
            }
            while (i10 > i11) {
                i0(i10, eVar);
                i10--;
            }
        }
    }

    @Override
    public boolean e() {
        if (!this.f42955u && this.f42949o == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final b0 e0() {
        b0 b0Var = this.B;
        if (b0Var != null) {
            ?? obj = new Object();
            obj.f42940a = b0Var.f42940a;
            obj.f42941b = b0Var.f42941b;
            obj.f42942c = b0Var.f42942c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            G0();
            boolean z10 = this.f42953s ^ this.v;
            obj2.f42942c = z10;
            if (z10) {
                View U0 = U0();
                obj2.f42941b = this.f42951q.f() - this.f42951q.a(U0);
                obj2.f42940a = ((p0) U0.getLayoutParams()).b();
                return obj2;
            }
            View V0 = V0();
            obj2.f42940a = o0.H(V0);
            obj2.f42941b = this.f42951q.d(V0) - this.f42951q.j();
            return obj2;
        }
        obj2.f42940a = -1;
        return obj2;
    }

    public void e1(of.e eVar, int i10, int i11) {
        c1 T;
        c1 T2;
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int r10 = r();
            if (this.v) {
                int i13 = r10 - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View q6 = q(i14);
                    if (q6 != null && (T2 = this.f43054b.T(q6)) != null && !T2.r() && (this.f42951q.a(q6) > i12 || this.f42951q.l(q6) > i12)) {
                        d1(eVar, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < r10; i15++) {
                View q10 = q(i15);
                if (q10 != null && (T = this.f43054b.T(q10)) != null && !T.r() && (this.f42951q.a(q10) > i12 || this.f42951q.l(q10) > i12)) {
                    d1(eVar, 0, i15);
                    return;
                }
            }
        }
    }

    public final void f1() {
        if (this.f42949o != 1 && Y0()) {
            this.v = !this.f42954t;
        } else {
            this.v = this.f42954t;
        }
    }

    public final int g1(int i10, of.e eVar, z0 z0Var) {
        int i11;
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.f42950p.f42928a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        m1(i11, abs, true, z0Var);
        a0 a0Var = this.f42950p;
        int H0 = H0(eVar, a0Var, z0Var, false) + a0Var.f42932g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i10 = i11 * H0;
        }
        this.f42951q.n(-i10);
        this.f42950p.f42934j = i10;
        return i10;
    }

    @Override
    public int h(z0 z0Var) {
        return C0(z0Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override
    public int i(z0 z0Var) {
        return D0(z0Var);
    }

    public void i1(int i10, int i11, boolean z10) {
        if (this.f42958y == i10 && this.A == i11 && this.f42959z == z10) {
            return;
        }
        this.f42958y = i10;
        this.A = i11;
        this.f42959z = z10;
        b0 b0Var = this.B;
        if (b0Var != null) {
            b0Var.f42940a = -1;
        }
        l0();
    }

    @Override
    public int j(z0 z0Var) {
        return B0(z0Var);
    }

    public final void j1(int i10) {
        f0 f0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(hg.c.h(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 == this.f42949o && this.f42951q != null) {
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                f0Var = new f0(this, 1);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            f0Var = new f0(this, 0);
        }
        this.f42951q = f0Var;
        this.C.f10769f = f0Var;
        this.f42949o = i10;
        l0();
    }

    @Override
    public int k(z0 z0Var) {
        return C0(z0Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.f42954t) {
            return;
        }
        this.f42954t = z10;
        l0();
    }

    @Override
    public int l(z0 z0Var) {
        return D0(z0Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.f42956w == z10) {
            return;
        }
        this.f42956w = z10;
        l0();
    }

    @Override
    public final View m(int i10) {
        int r10 = r();
        if (r10 != 0) {
            int H = i10 - o0.H(q(0));
            if (H >= 0 && H < r10) {
                View q6 = q(H);
                if (o0.H(q6) == i10) {
                    return q6;
                }
            }
            int r11 = r();
            for (int i11 = 0; i11 < r11; i11++) {
                View q10 = q(i11);
                c1 U = RecyclerView.U(q10);
                if (U != null && U.c() == i10 && !U.r() && (this.f43054b.f2855t0.f43123g || !U.j())) {
                    return q10;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int m0(int i10, of.e eVar, z0 z0Var) {
        if (this.f42949o == 1) {
            return 0;
        }
        return g1(i10, eVar, z0Var);
    }

    public final void m1(int i10, int i11, boolean z10, z0 z0Var) {
        boolean z11;
        int i12;
        int j3;
        a0 a0Var = this.f42950p;
        boolean z12 = false;
        int i13 = 1;
        if (this.f42951q.h() == 0 && this.f42951q.e() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        a0Var.f42936l = z11;
        this.f42950p.f42931f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(z0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z12 = true;
        }
        a0 a0Var2 = this.f42950p;
        if (z12) {
            i12 = max2;
        } else {
            i12 = max;
        }
        a0Var2.h = i12;
        if (!z12) {
            max = max2;
        }
        a0Var2.f42933i = max;
        if (z12) {
            a0Var2.h = this.f42951q.g() + i12;
            View U0 = U0();
            a0 a0Var3 = this.f42950p;
            if (this.v) {
                i13 = -1;
            }
            a0Var3.e = i13;
            int H = o0.H(U0);
            a0 a0Var4 = this.f42950p;
            a0Var3.d = H + a0Var4.e;
            a0Var4.f42929b = this.f42951q.a(U0);
            j3 = this.f42951q.a(U0) - this.f42951q.f();
        } else {
            View V0 = V0();
            a0 a0Var5 = this.f42950p;
            a0Var5.h = this.f42951q.j() + a0Var5.h;
            a0 a0Var6 = this.f42950p;
            if (!this.v) {
                i13 = -1;
            }
            a0Var6.e = i13;
            int H2 = o0.H(V0);
            a0 a0Var7 = this.f42950p;
            a0Var6.d = H2 + a0Var7.e;
            a0Var7.f42929b = this.f42951q.d(V0);
            j3 = (-this.f42951q.d(V0)) + this.f42951q.j();
        }
        a0 a0Var8 = this.f42950p;
        a0Var8.f42930c = i11;
        if (z10) {
            a0Var8.f42930c = i11 - j3;
        }
        a0Var8.f42932g = j3;
    }

    @Override
    public p0 n() {
        return new p0(-2, -2);
    }

    @Override
    public void n0(int i10) {
        this.f42958y = i10;
        this.A = Integer.MIN_VALUE;
        b0 b0Var = this.B;
        if (b0Var != null) {
            b0Var.f42940a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        int i12;
        this.f42950p.f42930c = this.f42951q.f() - i11;
        a0 a0Var = this.f42950p;
        if (this.v) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        a0Var.e = i12;
        a0Var.d = i10;
        a0Var.f42931f = 1;
        a0Var.f42929b = i11;
        a0Var.f42932g = Integer.MIN_VALUE;
    }

    @Override
    public int o0(int i10, of.e eVar, z0 z0Var) {
        if (this.f42949o == 0) {
            return 0;
        }
        return g1(i10, eVar, z0Var);
    }

    public final void o1(int i10, int i11) {
        int i12;
        this.f42950p.f42930c = i11 - this.f42951q.j();
        a0 a0Var = this.f42950p;
        a0Var.d = i10;
        if (this.v) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        a0Var.e = i12;
        a0Var.f42931f = -1;
        a0Var.f42929b = i11;
        a0Var.f42932g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, z0 z0Var, int i10) {
        d0 d0Var = new d0(recyclerView.getContext());
        d0Var.f43111a = i10;
        w0(d0Var);
    }

    @Override
    public boolean y0() {
        if (this.B == null && this.f42953s == this.f42956w) {
            return true;
        }
        return false;
    }

    public void z0(z0 z0Var, int[] iArr) {
        int i10;
        int W0 = W0(z0Var);
        if (this.f42950p.f42931f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public c0(int i10, boolean z10) {
        this.f42949o = 1;
        this.f42952r = false;
        this.f42954t = false;
        this.f42955u = false;
        this.v = false;
        this.f42956w = false;
        this.f42957x = true;
        this.f42958y = -1;
        this.f42959z = true;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        i2.m0 m0Var = new i2.m0();
        m0Var.g();
        this.C = m0Var;
        this.D = new Object();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i10);
        k1(z10);
    }

    public void a1(of.e eVar, z0 z0Var, i2.m0 m0Var, int i10) {
    }
}
