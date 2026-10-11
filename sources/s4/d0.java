package s4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public class d0 extends p0 {
    public int A;
    public c0 B;
    public final i2.m0 C;
    public final a0 D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int f47736o;
    public b0 f47737p;
    public androidx.emoji2.text.g f47738q;
    public boolean f47739r;
    public boolean f47740s;
    public boolean f47741t;
    public boolean f47742u;
    public boolean v;
    public boolean f47743w;
    public final boolean f47744x;
    public int f47745y;
    public boolean f47746z;

    public d0() {
        this(1, false);
    }

    public void A0(a1 a1Var, b0 b0Var, a0.h hVar) {
        int i10 = b0Var.d;
        if (i10 >= 0 && i10 < a1Var.b()) {
            hVar.b(i10, Math.max(0, b0Var.f47718g));
        }
    }

    public final int B0(a1 a1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f47738q;
            boolean z10 = this.f47744x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && a1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return Math.abs(((q0) K0.getLayoutParams()).b() - ((q0) J0.getLayoutParams()).b()) + 1;
                }
                return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
            }
            return 0;
        }
        return 0;
    }

    public final int C0(a1 a1Var) {
        int max;
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f47738q;
            boolean z10 = this.f47744x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && a1Var.b() != 0 && K0 != null && J0 != null) {
                int min = Math.min(((q0) K0.getLayoutParams()).b(), ((q0) J0.getLayoutParams()).b());
                int max2 = Math.max(((q0) K0.getLayoutParams()).b(), ((q0) J0.getLayoutParams()).b());
                if (z12) {
                    max = Math.max(0, (a1Var.b() - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!z10) {
                    return max;
                }
                return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((q0) K0.getLayoutParams()).b() - ((q0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
            }
        }
        return 0;
    }

    public final int D0(a1 a1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f47738q;
            boolean z10 = this.f47744x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && a1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return a1Var.b();
                }
                return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((q0) K0.getLayoutParams()).b() - ((q0) J0.getLayoutParams()).b()) + 1)) * a1Var.b());
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
        if (i10 < p0.H(q(0))) {
            z10 = true;
        }
        if (z10 != this.v) {
            i11 = -1;
        }
        if (this.f47736o == 0) {
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
                            if (i10 == 130 && this.f47736o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f47736o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f47736o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f47736o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f47736o != 1 && Y0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f47736o == 1 || !Y0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void G0() {
        if (this.f47737p == null) {
            ?? obj = new Object();
            obj.f47713a = true;
            obj.h = 0;
            obj.f47719i = 0;
            obj.f47721k = null;
            this.f47737p = obj;
        }
    }

    public final int H0(pf.e eVar, b0 b0Var, a1 a1Var, boolean z10) {
        int i10 = b0Var.f47715c;
        int i11 = b0Var.f47718g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                b0Var.f47718g = i11 + i10;
            }
            c1(eVar, b0Var);
        }
        int i12 = b0Var.f47715c + b0Var.h;
        while (true) {
            if ((!b0Var.f47722l && i12 <= 0) || !b0Var.b(a1Var)) {
                break;
            }
            a0 a0Var = this.D;
            a0Var.f47695a = 0;
            a0Var.f47696b = false;
            a0Var.f47697c = false;
            a0Var.d = false;
            Z0(eVar, a1Var, b0Var, a0Var);
            if (!a0Var.f47696b) {
                int i13 = b0Var.f47714b;
                int i14 = a0Var.f47695a;
                b0Var.f47714b = (b0Var.f47717f * i14) + i13;
                if (!a0Var.f47697c || b0Var.f47721k != null || !a1Var.f47703g) {
                    b0Var.f47715c -= i14;
                    i12 -= i14;
                }
                int i15 = b0Var.f47718g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    b0Var.f47718g = i16;
                    int i17 = b0Var.f47715c;
                    if (i17 < 0) {
                        b0Var.f47718g = i16 + i17;
                    }
                    c1(eVar, b0Var);
                }
                if (z10 && a0Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - b0Var.f47715c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((q0) P0.getLayoutParams()).b();
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
        return ((q0) P0.getLayoutParams()).b();
    }

    public final int M0() {
        View P0 = P0(r() - 1, -1, true, false);
        if (P0 == null) {
            return -1;
        }
        return ((q0) P0.getLayoutParams()).b();
    }

    public final int N0() {
        View P0 = P0(r() - 1, -1, false, true);
        if (P0 == null) {
            return -1;
        }
        return ((q0) P0.getLayoutParams()).b();
    }

    public final View O0(int i10, int i11) {
        int i12;
        int i13;
        G0();
        if (i11 > i10 || i11 < i10) {
            if (this.f47738q.d(q(i10)) < this.f47738q.j()) {
                i12 = 16644;
                i13 = 16388;
            } else {
                i12 = 4161;
                i13 = 4097;
            }
            if (this.f47736o == 0) {
                return this.f47855c.k(i10, i11, i12, i13);
            }
            return this.d.k(i10, i11, i12, i13);
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
        if (this.f47736o == 0) {
            return this.f47855c.k(i10, i11, i12, i13);
        }
        return this.d.k(i10, i11, i12, i13);
    }

    public View Q0(pf.e eVar, a1 a1Var, int i10, int i11, int i12) {
        int j3;
        int i13;
        G0();
        if (this.f47739r) {
            j3 = 0;
        } else {
            j3 = this.f47738q.j();
        }
        int f7 = this.f47738q.f();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q6 = q(i10);
            int H = p0.H(q6);
            if (H >= 0 && H < i12) {
                if (((q0) q6.getLayoutParams()).f47870a.j()) {
                    if (view2 == null) {
                        view2 = q6;
                    }
                } else if (this.f47738q.d(q6) < f7 && this.f47738q.a(q6) >= j3) {
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
    public View R(View view, int i10, pf.e eVar, a1 a1Var) {
        int F0;
        View O0;
        View U0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.f47738q.k() * 0.33333334f), false, a1Var);
            b0 b0Var = this.f47737p;
            b0Var.f47718g = Integer.MIN_VALUE;
            b0Var.f47713a = false;
            H0(eVar, b0Var, a1Var, true);
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

    public final int S0(int i10, pf.e eVar, a1 a1Var, boolean z10) {
        int f7;
        int f10;
        if (this.G && this.H && (f7 = this.f47738q.f() - i10) > 0) {
            int i11 = -g1(-f7, eVar, a1Var);
            int i12 = i10 + i11;
            if (z10 && (f10 = this.f47738q.f() - i12) > 0) {
                this.f47738q.n(f10);
                return f10 + i11;
            }
            return i11;
        }
        return 0;
    }

    public final int T0(int i10, pf.e eVar, a1 a1Var, boolean z10) {
        int X0;
        int j3;
        if (this.G && (X0 = i10 - X0()) > 0) {
            int i11 = -g1(X0, eVar, a1Var);
            int i12 = i10 + i11;
            if (z10 && (j3 = i12 - this.f47738q.j()) > 0) {
                this.f47738q.n(-j3);
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

    public int W0(a1 a1Var) {
        if (a1Var.f47698a != -1) {
            return this.f47738q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f47738q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f47854b;
        WeakHashMap weakHashMap = r0.i0.f46856a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Z0(pf.e eVar, a1 a1Var, b0 b0Var, a0 a0Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        View c10 = b0Var.c(eVar);
        if (c10 == null) {
            a0Var.f47696b = true;
            return;
        }
        q0 q0Var = (q0) c10.getLayoutParams();
        if (b0Var.f47721k == null) {
            boolean z12 = this.v;
            if (b0Var.f47717f == -1) {
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
            if (b0Var.f47717f == -1) {
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
        a0Var.f47695a = this.f47738q.b(c10);
        if (this.f47736o == 1) {
            if (Y0()) {
                i13 = this.f47863m - E();
                i10 = i13 - this.f47738q.c(c10);
            } else {
                i10 = D();
                i13 = this.f47738q.c(c10) + i10;
            }
            if (b0Var.f47717f == -1) {
                i11 = b0Var.f47714b;
                i12 = i11 - a0Var.f47695a;
            } else {
                i12 = b0Var.f47714b;
                i11 = a0Var.f47695a + i12;
            }
        } else {
            int F = F();
            int c11 = this.f47738q.c(c10) + F;
            if (b0Var.f47717f == -1) {
                int i14 = b0Var.f47714b;
                int i15 = i14 - a0Var.f47695a;
                i13 = i14;
                i11 = c11;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = b0Var.f47714b;
                int i17 = a0Var.f47695a + i16;
                i10 = i16;
                i11 = c11;
                i12 = F;
                i13 = i17;
            }
        }
        p0.O(c10, i10, i12, i13, i11);
        if (q0Var.f47870a.j() || q0Var.f47870a.m()) {
            a0Var.f47697c = true;
        }
        a0Var.d = c10.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f47854b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(pf.e r18, s4.a1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: s4.d0.b0(pf.e, s4.a1):void");
    }

    public void b1(View view, View view2, int i10, int i11) {
        boolean z10;
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = p0.H(view);
        int H2 = p0.H(view2);
        if (H < H2) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (this.v) {
            if (z10) {
                h1(H2, this.f47738q.f() - (this.f47738q.b(view) + this.f47738q.d(view2)));
                return;
            }
            h1(H2, this.f47738q.f() - this.f47738q.a(view2));
        } else if (z10) {
            h1(H2, this.f47738q.d(view2));
        } else {
            h1(H2, this.f47738q.a(view2) - this.f47738q.b(view));
        }
    }

    @Override
    public void c0(a1 a1Var) {
        this.B = null;
        this.f47745y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.g();
    }

    public final void c1(pf.e eVar, b0 b0Var) {
        d1 T;
        d1 T2;
        if (b0Var.f47713a && !b0Var.f47722l) {
            int i10 = b0Var.f47718g;
            int i11 = b0Var.f47719i;
            if (b0Var.f47717f == -1) {
                int r10 = r();
                if (i10 >= 0) {
                    int e7 = (this.f47738q.e() - i10) + i11;
                    if (this.v) {
                        for (int i12 = 0; i12 < r10; i12++) {
                            View q6 = q(i12);
                            if (q6 != null && (T2 = this.f47854b.T(q6)) != null && !T2.r() && (this.f47738q.d(q6) < e7 || this.f47738q.m(q6) < e7)) {
                                d1(eVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = r10 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View q10 = q(i14);
                        if (q10 != null && (T = this.f47854b.T(q10)) != null && !T.r() && (this.f47738q.d(q10) < e7 || this.f47738q.m(q10) < e7)) {
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
        if (!this.f47742u && this.f47736o == 0) {
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
        if (!this.f47742u && this.f47736o == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final c0 e0() {
        c0 c0Var = this.B;
        if (c0Var != null) {
            ?? obj = new Object();
            obj.f47725a = c0Var.f47725a;
            obj.f47726b = c0Var.f47726b;
            obj.f47727c = c0Var.f47727c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            G0();
            boolean z10 = this.f47740s ^ this.v;
            obj2.f47727c = z10;
            if (z10) {
                View U0 = U0();
                obj2.f47726b = this.f47738q.f() - this.f47738q.a(U0);
                obj2.f47725a = ((q0) U0.getLayoutParams()).b();
                return obj2;
            }
            View V0 = V0();
            obj2.f47725a = p0.H(V0);
            obj2.f47726b = this.f47738q.d(V0) - this.f47738q.j();
            return obj2;
        }
        obj2.f47725a = -1;
        return obj2;
    }

    public void e1(pf.e eVar, int i10, int i11) {
        d1 T;
        d1 T2;
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int r10 = r();
            if (this.v) {
                int i13 = r10 - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View q6 = q(i14);
                    if (q6 != null && (T2 = this.f47854b.T(q6)) != null && !T2.r() && (this.f47738q.a(q6) > i12 || this.f47738q.l(q6) > i12)) {
                        d1(eVar, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < r10; i15++) {
                View q10 = q(i15);
                if (q10 != null && (T = this.f47854b.T(q10)) != null && !T.r() && (this.f47738q.a(q10) > i12 || this.f47738q.l(q10) > i12)) {
                    d1(eVar, 0, i15);
                    return;
                }
            }
        }
    }

    public final void f1() {
        if (this.f47736o != 1 && Y0()) {
            this.v = !this.f47741t;
        } else {
            this.v = this.f47741t;
        }
    }

    public final int g1(int i10, pf.e eVar, a1 a1Var) {
        int i11;
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.f47737p.f47713a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        m1(i11, abs, true, a1Var);
        b0 b0Var = this.f47737p;
        int H0 = H0(eVar, b0Var, a1Var, false) + b0Var.f47718g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i10 = i11 * H0;
        }
        this.f47738q.n(-i10);
        this.f47737p.f47720j = i10;
        return i10;
    }

    @Override
    public int h(a1 a1Var) {
        return C0(a1Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override
    public int i(a1 a1Var) {
        return D0(a1Var);
    }

    public void i1(int i10, int i11, boolean z10) {
        if (this.f47745y == i10 && this.A == i11 && this.f47746z == z10) {
            return;
        }
        this.f47745y = i10;
        this.A = i11;
        this.f47746z = z10;
        c0 c0Var = this.B;
        if (c0Var != null) {
            c0Var.f47725a = -1;
        }
        l0();
    }

    @Override
    public int j(a1 a1Var) {
        return B0(a1Var);
    }

    public final void j1(int i10) {
        g0 g0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(hg.c.h(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 == this.f47736o && this.f47738q != null) {
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                g0Var = new g0(this, 1);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            g0Var = new g0(this, 0);
        }
        this.f47738q = g0Var;
        this.C.f11785f = g0Var;
        this.f47736o = i10;
        l0();
    }

    @Override
    public int k(a1 a1Var) {
        return C0(a1Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.f47741t) {
            return;
        }
        this.f47741t = z10;
        l0();
    }

    @Override
    public int l(a1 a1Var) {
        return D0(a1Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.f47743w == z10) {
            return;
        }
        this.f47743w = z10;
        l0();
    }

    @Override
    public final View m(int i10) {
        int r10 = r();
        if (r10 != 0) {
            int H = i10 - p0.H(q(0));
            if (H >= 0 && H < r10) {
                View q6 = q(H);
                if (p0.H(q6) == i10) {
                    return q6;
                }
            }
            int r11 = r();
            for (int i11 = 0; i11 < r11; i11++) {
                View q10 = q(i11);
                d1 U = RecyclerView.U(q10);
                if (U != null && U.c() == i10 && !U.r() && (this.f47854b.f3165u0.f47703g || !U.j())) {
                    return q10;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int m0(int i10, pf.e eVar, a1 a1Var) {
        if (this.f47736o == 1) {
            return 0;
        }
        return g1(i10, eVar, a1Var);
    }

    public final void m1(int i10, int i11, boolean z10, a1 a1Var) {
        boolean z11;
        int i12;
        int j3;
        b0 b0Var = this.f47737p;
        boolean z12 = false;
        int i13 = 1;
        if (this.f47738q.h() == 0 && this.f47738q.e() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        b0Var.f47722l = z11;
        this.f47737p.f47717f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(a1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z12 = true;
        }
        b0 b0Var2 = this.f47737p;
        if (z12) {
            i12 = max2;
        } else {
            i12 = max;
        }
        b0Var2.h = i12;
        if (!z12) {
            max = max2;
        }
        b0Var2.f47719i = max;
        if (z12) {
            b0Var2.h = this.f47738q.g() + i12;
            View U0 = U0();
            b0 b0Var3 = this.f47737p;
            if (this.v) {
                i13 = -1;
            }
            b0Var3.f47716e = i13;
            int H = p0.H(U0);
            b0 b0Var4 = this.f47737p;
            b0Var3.d = H + b0Var4.f47716e;
            b0Var4.f47714b = this.f47738q.a(U0);
            j3 = this.f47738q.a(U0) - this.f47738q.f();
        } else {
            View V0 = V0();
            b0 b0Var5 = this.f47737p;
            b0Var5.h = this.f47738q.j() + b0Var5.h;
            b0 b0Var6 = this.f47737p;
            if (!this.v) {
                i13 = -1;
            }
            b0Var6.f47716e = i13;
            int H2 = p0.H(V0);
            b0 b0Var7 = this.f47737p;
            b0Var6.d = H2 + b0Var7.f47716e;
            b0Var7.f47714b = this.f47738q.d(V0);
            j3 = (-this.f47738q.d(V0)) + this.f47738q.j();
        }
        b0 b0Var8 = this.f47737p;
        b0Var8.f47715c = i11;
        if (z10) {
            b0Var8.f47715c = i11 - j3;
        }
        b0Var8.f47718g = j3;
    }

    @Override
    public q0 n() {
        return new q0(-2, -2);
    }

    @Override
    public void n0(int i10) {
        this.f47745y = i10;
        this.A = Integer.MIN_VALUE;
        c0 c0Var = this.B;
        if (c0Var != null) {
            c0Var.f47725a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        int i12;
        this.f47737p.f47715c = this.f47738q.f() - i11;
        b0 b0Var = this.f47737p;
        if (this.v) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        b0Var.f47716e = i12;
        b0Var.d = i10;
        b0Var.f47717f = 1;
        b0Var.f47714b = i11;
        b0Var.f47718g = Integer.MIN_VALUE;
    }

    @Override
    public int o0(int i10, pf.e eVar, a1 a1Var) {
        if (this.f47736o == 0) {
            return 0;
        }
        return g1(i10, eVar, a1Var);
    }

    public final void o1(int i10, int i11) {
        int i12;
        this.f47737p.f47715c = i11 - this.f47738q.j();
        b0 b0Var = this.f47737p;
        b0Var.d = i10;
        if (this.v) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        b0Var.f47716e = i12;
        b0Var.f47717f = -1;
        b0Var.f47714b = i11;
        b0Var.f47718g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, a1 a1Var, int i10) {
        e0 e0Var = new e0(recyclerView.getContext());
        e0Var.f47917a = i10;
        w0(e0Var);
    }

    @Override
    public boolean y0() {
        if (this.B == null && this.f47740s == this.f47743w) {
            return true;
        }
        return false;
    }

    public void z0(a1 a1Var, int[] iArr) {
        int i10;
        int W0 = W0(a1Var);
        if (this.f47737p.f47717f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public d0(int i10, boolean z10) {
        this.f47736o = 1;
        this.f47739r = false;
        this.f47741t = false;
        this.f47742u = false;
        this.v = false;
        this.f47743w = false;
        this.f47744x = true;
        this.f47745y = -1;
        this.f47746z = true;
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

    public void a1(pf.e eVar, a1 a1Var, i2.m0 m0Var, int i10) {
    }
}
