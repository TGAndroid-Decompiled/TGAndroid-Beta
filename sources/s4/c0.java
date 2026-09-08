package s4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public class c0 extends o0 {
    public int A;
    public b0 B;
    public final i2.l0 C;
    public final z D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int f45754o;
    public a0 f45755p;
    public androidx.emoji2.text.g f45756q;
    public boolean f45757r;
    public boolean f45758s;
    public boolean f45759t;
    public boolean f45760u;
    public boolean v;
    public boolean f45761w;
    public final boolean f45762x;
    public int f45763y;
    public boolean f45764z;

    public c0() {
        this(1, false);
    }

    public void A0(z0 z0Var, a0 a0Var, a0.h hVar) {
        int i10 = a0Var.d;
        if (i10 >= 0 && i10 < z0Var.b()) {
            hVar.b(i10, Math.max(0, a0Var.f45736g));
        }
    }

    public final int B0(z0 z0Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f45756q;
            boolean z10 = this.f45762x;
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
            androidx.emoji2.text.g gVar = this.f45756q;
            boolean z10 = this.f45762x;
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
            androidx.emoji2.text.g gVar = this.f45756q;
            boolean z10 = this.f45762x;
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
        if (this.f45754o == 0) {
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
                            if (i10 == 130 && this.f45754o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f45754o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f45754o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f45754o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f45754o != 1 && Y0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f45754o == 1 || !Y0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void G0() {
        if (this.f45755p == null) {
            ?? obj = new Object();
            obj.f45731a = true;
            obj.h = 0;
            obj.f45737i = 0;
            obj.f45739k = null;
            this.f45755p = obj;
        }
    }

    public final int H0(pf.e eVar, a0 a0Var, z0 z0Var, boolean z10) {
        int i10 = a0Var.f45733c;
        int i11 = a0Var.f45736g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                a0Var.f45736g = i11 + i10;
            }
            c1(eVar, a0Var);
        }
        int i12 = a0Var.f45733c + a0Var.h;
        while (true) {
            if ((!a0Var.f45740l && i12 <= 0) || !a0Var.b(z0Var)) {
                break;
            }
            z zVar = this.D;
            zVar.f45940a = 0;
            zVar.f45941b = false;
            zVar.f45942c = false;
            zVar.d = false;
            Z0(eVar, z0Var, a0Var, zVar);
            if (!zVar.f45941b) {
                int i13 = a0Var.f45732b;
                int i14 = zVar.f45940a;
                a0Var.f45732b = (a0Var.f45735f * i14) + i13;
                if (!zVar.f45942c || a0Var.f45739k != null || !z0Var.f45948g) {
                    a0Var.f45733c -= i14;
                    i12 -= i14;
                }
                int i15 = a0Var.f45736g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    a0Var.f45736g = i16;
                    int i17 = a0Var.f45733c;
                    if (i17 < 0) {
                        a0Var.f45736g = i16 + i17;
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
        return i10 - a0Var.f45733c;
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
            if (this.f45756q.d(q(i10)) < this.f45756q.j()) {
                i12 = 16644;
                i13 = 16388;
            } else {
                i12 = 4161;
                i13 = 4097;
            }
            if (this.f45754o == 0) {
                return this.f45871c.C(i10, i11, i12, i13);
            }
            return this.d.C(i10, i11, i12, i13);
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
        if (this.f45754o == 0) {
            return this.f45871c.C(i10, i11, i12, i13);
        }
        return this.d.C(i10, i11, i12, i13);
    }

    public View Q0(pf.e eVar, z0 z0Var, int i10, int i11, int i12) {
        int j3;
        int i13;
        G0();
        if (this.f45757r) {
            j3 = 0;
        } else {
            j3 = this.f45756q.j();
        }
        int f7 = this.f45756q.f();
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
                if (((p0) q6.getLayoutParams()).f45885a.j()) {
                    if (view2 == null) {
                        view2 = q6;
                    }
                } else if (this.f45756q.d(q6) < f7 && this.f45756q.a(q6) >= j3) {
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
    public View R(View view, int i10, pf.e eVar, z0 z0Var) {
        int F0;
        View O0;
        View U0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.f45756q.k() * 0.33333334f), false, z0Var);
            a0 a0Var = this.f45755p;
            a0Var.f45736g = Integer.MIN_VALUE;
            a0Var.f45731a = false;
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

    public final int S0(int i10, pf.e eVar, z0 z0Var, boolean z10) {
        int f7;
        int f10;
        if (this.G && this.H && (f7 = this.f45756q.f() - i10) > 0) {
            int i11 = -g1(-f7, eVar, z0Var);
            int i12 = i10 + i11;
            if (z10 && (f10 = this.f45756q.f() - i12) > 0) {
                this.f45756q.n(f10);
                return f10 + i11;
            }
            return i11;
        }
        return 0;
    }

    public final int T0(int i10, pf.e eVar, z0 z0Var, boolean z10) {
        int X0;
        int j3;
        if (this.G && (X0 = i10 - X0()) > 0) {
            int i11 = -g1(X0, eVar, z0Var);
            int i12 = i10 + i11;
            if (z10 && (j3 = i12 - this.f45756q.j()) > 0) {
                this.f45756q.n(-j3);
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
        if (z0Var.f45943a != -1) {
            return this.f45756q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f45756q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f45870b;
        WeakHashMap weakHashMap = r0.i0.f44725a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Z0(pf.e eVar, z0 z0Var, a0 a0Var, z zVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        View c10 = a0Var.c(eVar);
        if (c10 == null) {
            zVar.f45941b = true;
            return;
        }
        p0 p0Var = (p0) c10.getLayoutParams();
        if (a0Var.f45739k == null) {
            boolean z12 = this.v;
            if (a0Var.f45735f == -1) {
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
            if (a0Var.f45735f == -1) {
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
        zVar.f45940a = this.f45756q.b(c10);
        if (this.f45754o == 1) {
            if (Y0()) {
                i13 = this.f45879m - E();
                i10 = i13 - this.f45756q.c(c10);
            } else {
                i10 = D();
                i13 = this.f45756q.c(c10) + i10;
            }
            if (a0Var.f45735f == -1) {
                i11 = a0Var.f45732b;
                i12 = i11 - zVar.f45940a;
            } else {
                i12 = a0Var.f45732b;
                i11 = zVar.f45940a + i12;
            }
        } else {
            int F = F();
            int c11 = this.f45756q.c(c10) + F;
            if (a0Var.f45735f == -1) {
                int i14 = a0Var.f45732b;
                int i15 = i14 - zVar.f45940a;
                i13 = i14;
                i11 = c11;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = a0Var.f45732b;
                int i17 = zVar.f45940a + i16;
                i10 = i16;
                i11 = c11;
                i12 = F;
                i13 = i17;
            }
        }
        o0.O(c10, i10, i12, i13, i11);
        if (p0Var.f45885a.j() || p0Var.f45885a.m()) {
            zVar.f45942c = true;
        }
        zVar.d = c10.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f45870b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(pf.e r18, s4.z0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: s4.c0.b0(pf.e, s4.z0):void");
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
                h1(H2, this.f45756q.f() - (this.f45756q.b(view) + this.f45756q.d(view2)));
                return;
            }
            h1(H2, this.f45756q.f() - this.f45756q.a(view2));
        } else if (c10 == 65535) {
            h1(H2, this.f45756q.d(view2));
        } else {
            h1(H2, this.f45756q.a(view2) - this.f45756q.b(view));
        }
    }

    @Override
    public void c0(z0 z0Var) {
        this.B = null;
        this.f45763y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.g();
    }

    public final void c1(pf.e eVar, a0 a0Var) {
        c1 T;
        c1 T2;
        if (a0Var.f45731a && !a0Var.f45740l) {
            int i10 = a0Var.f45736g;
            int i11 = a0Var.f45737i;
            if (a0Var.f45735f == -1) {
                int r10 = r();
                if (i10 >= 0) {
                    int e7 = (this.f45756q.e() - i10) + i11;
                    if (this.v) {
                        for (int i12 = 0; i12 < r10; i12++) {
                            View q6 = q(i12);
                            if (q6 != null && (T2 = this.f45870b.T(q6)) != null && !T2.r() && (this.f45756q.d(q6) < e7 || this.f45756q.m(q6) < e7)) {
                                d1(eVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = r10 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View q10 = q(i14);
                        if (q10 != null && (T = this.f45870b.T(q10)) != null && !T.r() && (this.f45756q.d(q10) < e7 || this.f45756q.m(q10) < e7)) {
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
        if (!this.f45760u && this.f45754o == 0) {
            return true;
        }
        return false;
    }

    public final void d1(pf.e eVar, int i10, int i11) {
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
        if (!this.f45760u && this.f45754o == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final b0 e0() {
        b0 b0Var = this.B;
        if (b0Var != null) {
            ?? obj = new Object();
            obj.f45744a = b0Var.f45744a;
            obj.f45745b = b0Var.f45745b;
            obj.f45746c = b0Var.f45746c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            G0();
            boolean z10 = this.f45758s ^ this.v;
            obj2.f45746c = z10;
            if (z10) {
                View U0 = U0();
                obj2.f45745b = this.f45756q.f() - this.f45756q.a(U0);
                obj2.f45744a = ((p0) U0.getLayoutParams()).b();
                return obj2;
            }
            View V0 = V0();
            obj2.f45744a = o0.H(V0);
            obj2.f45745b = this.f45756q.d(V0) - this.f45756q.j();
            return obj2;
        }
        obj2.f45744a = -1;
        return obj2;
    }

    public void e1(pf.e eVar, int i10, int i11) {
        c1 T;
        c1 T2;
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int r10 = r();
            if (this.v) {
                int i13 = r10 - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View q6 = q(i14);
                    if (q6 != null && (T2 = this.f45870b.T(q6)) != null && !T2.r() && (this.f45756q.a(q6) > i12 || this.f45756q.l(q6) > i12)) {
                        d1(eVar, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < r10; i15++) {
                View q10 = q(i15);
                if (q10 != null && (T = this.f45870b.T(q10)) != null && !T.r() && (this.f45756q.a(q10) > i12 || this.f45756q.l(q10) > i12)) {
                    d1(eVar, 0, i15);
                    return;
                }
            }
        }
    }

    public final void f1() {
        if (this.f45754o != 1 && Y0()) {
            this.v = !this.f45759t;
        } else {
            this.v = this.f45759t;
        }
    }

    public final int g1(int i10, pf.e eVar, z0 z0Var) {
        int i11;
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.f45755p.f45731a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        m1(i11, abs, true, z0Var);
        a0 a0Var = this.f45755p;
        int H0 = H0(eVar, a0Var, z0Var, false) + a0Var.f45736g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i10 = i11 * H0;
        }
        this.f45756q.n(-i10);
        this.f45755p.f45738j = i10;
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
        if (this.f45763y == i10 && this.A == i11 && this.f45764z == z10) {
            return;
        }
        this.f45763y = i10;
        this.A = i11;
        this.f45764z = z10;
        b0 b0Var = this.B;
        if (b0Var != null) {
            b0Var.f45744a = -1;
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
            throw new IllegalArgumentException(i2.g.i(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 == this.f45754o && this.f45756q != null) {
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
        this.f45756q = f0Var;
        this.C.f11653f = f0Var;
        this.f45754o = i10;
        l0();
    }

    @Override
    public int k(z0 z0Var) {
        return C0(z0Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.f45759t) {
            return;
        }
        this.f45759t = z10;
        l0();
    }

    @Override
    public int l(z0 z0Var) {
        return D0(z0Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.f45761w == z10) {
            return;
        }
        this.f45761w = z10;
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
                if (U != null && U.c() == i10 && !U.r() && (this.f45870b.f1918t0.f45948g || !U.j())) {
                    return q10;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int m0(int i10, pf.e eVar, z0 z0Var) {
        if (this.f45754o == 1) {
            return 0;
        }
        return g1(i10, eVar, z0Var);
    }

    public final void m1(int i10, int i11, boolean z10, z0 z0Var) {
        boolean z11;
        int i12;
        int j3;
        a0 a0Var = this.f45755p;
        boolean z12 = false;
        int i13 = 1;
        if (this.f45756q.h() == 0 && this.f45756q.e() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        a0Var.f45740l = z11;
        this.f45755p.f45735f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(z0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z12 = true;
        }
        a0 a0Var2 = this.f45755p;
        if (z12) {
            i12 = max2;
        } else {
            i12 = max;
        }
        a0Var2.h = i12;
        if (!z12) {
            max = max2;
        }
        a0Var2.f45737i = max;
        if (z12) {
            a0Var2.h = this.f45756q.g() + i12;
            View U0 = U0();
            a0 a0Var3 = this.f45755p;
            if (this.v) {
                i13 = -1;
            }
            a0Var3.f45734e = i13;
            int H = o0.H(U0);
            a0 a0Var4 = this.f45755p;
            a0Var3.d = H + a0Var4.f45734e;
            a0Var4.f45732b = this.f45756q.a(U0);
            j3 = this.f45756q.a(U0) - this.f45756q.f();
        } else {
            View V0 = V0();
            a0 a0Var5 = this.f45755p;
            a0Var5.h = this.f45756q.j() + a0Var5.h;
            a0 a0Var6 = this.f45755p;
            if (!this.v) {
                i13 = -1;
            }
            a0Var6.f45734e = i13;
            int H2 = o0.H(V0);
            a0 a0Var7 = this.f45755p;
            a0Var6.d = H2 + a0Var7.f45734e;
            a0Var7.f45732b = this.f45756q.d(V0);
            j3 = (-this.f45756q.d(V0)) + this.f45756q.j();
        }
        a0 a0Var8 = this.f45755p;
        a0Var8.f45733c = i11;
        if (z10) {
            a0Var8.f45733c = i11 - j3;
        }
        a0Var8.f45736g = j3;
    }

    @Override
    public p0 n() {
        return new p0(-2, -2);
    }

    @Override
    public void n0(int i10) {
        this.f45763y = i10;
        this.A = Integer.MIN_VALUE;
        b0 b0Var = this.B;
        if (b0Var != null) {
            b0Var.f45744a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        int i12;
        this.f45755p.f45733c = this.f45756q.f() - i11;
        a0 a0Var = this.f45755p;
        if (this.v) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        a0Var.f45734e = i12;
        a0Var.d = i10;
        a0Var.f45735f = 1;
        a0Var.f45732b = i11;
        a0Var.f45736g = Integer.MIN_VALUE;
    }

    @Override
    public int o0(int i10, pf.e eVar, z0 z0Var) {
        if (this.f45754o == 0) {
            return 0;
        }
        return g1(i10, eVar, z0Var);
    }

    public final void o1(int i10, int i11) {
        int i12;
        this.f45755p.f45733c = i11 - this.f45756q.j();
        a0 a0Var = this.f45755p;
        a0Var.d = i10;
        if (this.v) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        a0Var.f45734e = i12;
        a0Var.f45735f = -1;
        a0Var.f45732b = i11;
        a0Var.f45736g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, z0 z0Var, int i10) {
        d0 d0Var = new d0(recyclerView.getContext());
        d0Var.f45934a = i10;
        w0(d0Var);
    }

    @Override
    public boolean y0() {
        if (this.B == null && this.f45758s == this.f45761w) {
            return true;
        }
        return false;
    }

    public void z0(z0 z0Var, int[] iArr) {
        int i10;
        int W0 = W0(z0Var);
        if (this.f45755p.f45735f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public c0(int i10, boolean z10) {
        this.f45754o = 1;
        this.f45757r = false;
        this.f45759t = false;
        this.f45760u = false;
        this.v = false;
        this.f45761w = false;
        this.f45762x = true;
        this.f45763y = -1;
        this.f45764z = true;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        i2.l0 l0Var = new i2.l0();
        l0Var.g();
        this.C = l0Var;
        this.D = new Object();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i10);
        k1(z10);
    }

    public void a1(pf.e eVar, z0 z0Var, i2.l0 l0Var, int i10) {
    }
}
