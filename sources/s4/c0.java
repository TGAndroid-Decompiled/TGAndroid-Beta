package s4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public class c0 extends p0 {
    public int A;
    public b0 B;
    public final i2.p0 C;
    public final k2.l D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int f47743o;
    public a0 f47744p;
    public androidx.emoji2.text.g f47745q;
    public boolean f47746r;
    public boolean f47747s;
    public boolean f47748t;
    public boolean f47749u;
    public boolean v;
    public boolean f47750w;
    public final boolean f47751x;
    public int f47752y;
    public boolean f47753z;

    public c0() {
        this(1, false);
    }

    public void A0(b1 b1Var, a0 a0Var, e2.f fVar) {
        int i10 = a0Var.d;
        if (i10 >= 0 && i10 < b1Var.b()) {
            fVar.b(i10, Math.max(0, a0Var.f47710g));
        }
    }

    public final int B0(b1 b1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f47745q;
            boolean z10 = this.f47751x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && b1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return Math.abs(((q0) K0.getLayoutParams()).b() - ((q0) J0.getLayoutParams()).b()) + 1;
                }
                return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
            }
            return 0;
        }
        return 0;
    }

    public final int C0(b1 b1Var) {
        int max;
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f47745q;
            boolean z10 = this.f47751x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && b1Var.b() != 0 && K0 != null && J0 != null) {
                int min = Math.min(((q0) K0.getLayoutParams()).b(), ((q0) J0.getLayoutParams()).b());
                int max2 = Math.max(((q0) K0.getLayoutParams()).b(), ((q0) J0.getLayoutParams()).b());
                if (z12) {
                    max = Math.max(0, (b1Var.b() - max2) - 1);
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

    public final int D0(b1 b1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f47745q;
            boolean z10 = this.f47751x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && b1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return b1Var.b();
                }
                return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((q0) K0.getLayoutParams()).b() - ((q0) J0.getLayoutParams()).b()) + 1)) * b1Var.b());
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
        if (this.f47743o == 0) {
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
                            if (i10 == 130 && this.f47743o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f47743o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f47743o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f47743o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f47743o != 1 && Y0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f47743o == 1 || !Y0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void G0() {
        if (this.f47744p == null) {
            ?? obj = new Object();
            obj.f47706a = true;
            obj.h = 0;
            obj.f47711i = 0;
            obj.f47713k = null;
            this.f47744p = obj;
        }
    }

    public final int H0(rf.e eVar, a0 a0Var, b1 b1Var, boolean z10) {
        int i10 = a0Var.f47708c;
        int i11 = a0Var.f47710g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                a0Var.f47710g = i11 + i10;
            }
            c1(eVar, a0Var);
        }
        int i12 = a0Var.f47708c + a0Var.h;
        while (true) {
            if ((!a0Var.f47714l && i12 <= 0) || !a0Var.b(b1Var)) {
                break;
            }
            k2.l lVar = this.D;
            lVar.f16200a = 0;
            lVar.f16201b = false;
            lVar.f16202c = false;
            lVar.d = false;
            Z0(eVar, b1Var, a0Var, lVar);
            if (!lVar.f16201b) {
                int i13 = a0Var.f47707b;
                int i14 = lVar.f16200a;
                a0Var.f47707b = (a0Var.f47709f * i14) + i13;
                if (!lVar.f16202c || a0Var.f47713k != null || !b1Var.f47733g) {
                    a0Var.f47708c -= i14;
                    i12 -= i14;
                }
                int i15 = a0Var.f47710g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    a0Var.f47710g = i16;
                    int i17 = a0Var.f47708c;
                    if (i17 < 0) {
                        a0Var.f47710g = i16 + i17;
                    }
                    c1(eVar, a0Var);
                }
                if (z10 && lVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - a0Var.f47708c;
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
            if (this.f47745q.d(q(i10)) < this.f47745q.j()) {
                i12 = 16644;
                i13 = 16388;
            } else {
                i12 = 4161;
                i13 = 4097;
            }
            if (this.f47743o == 0) {
                return this.f47855c.M(i10, i11, i12, i13);
            }
            return this.d.M(i10, i11, i12, i13);
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
        if (this.f47743o == 0) {
            return this.f47855c.M(i10, i11, i12, i13);
        }
        return this.d.M(i10, i11, i12, i13);
    }

    public View Q0(rf.e eVar, b1 b1Var, int i10, int i11, int i12) {
        int j10;
        int i13;
        G0();
        if (this.f47746r) {
            j10 = 0;
        } else {
            j10 = this.f47745q.j();
        }
        int f7 = this.f47745q.f();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q5 = q(i10);
            int H = p0.H(q5);
            if (H >= 0 && H < i12) {
                if (((q0) q5.getLayoutParams()).f47867a.j()) {
                    if (view2 == null) {
                        view2 = q5;
                    }
                } else if (this.f47745q.d(q5) < f7 && this.f47745q.a(q5) >= j10) {
                    return q5;
                } else {
                    if (view == null) {
                        view = q5;
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
    public View R(View view, int i10, rf.e eVar, b1 b1Var) {
        int F0;
        View O0;
        View U0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            n1(F0, (int) (this.f47745q.k() * 0.33333334f), false, b1Var);
            a0 a0Var = this.f47744p;
            a0Var.f47710g = Integer.MIN_VALUE;
            a0Var.f47706a = false;
            H0(eVar, a0Var, b1Var, true);
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

    public final int S0(int i10, rf.e eVar, b1 b1Var, boolean z10) {
        int f7;
        int f10;
        if (this.G && this.H && (f7 = this.f47745q.f() - i10) > 0) {
            int i11 = -g1(-f7, eVar, b1Var);
            int i12 = i10 + i11;
            if (z10 && (f10 = this.f47745q.f() - i12) > 0) {
                this.f47745q.n(f10);
                return f10 + i11;
            }
            return i11;
        }
        return 0;
    }

    public final int T0(int i10, rf.e eVar, b1 b1Var, boolean z10) {
        int X0;
        int j10;
        if (this.G && (X0 = i10 - X0()) > 0) {
            int i11 = -g1(X0, eVar, b1Var);
            int i12 = i10 + i11;
            if (z10 && (j10 = i12 - this.f47745q.j()) > 0) {
                this.f47745q.n(-j10);
                return i11 - j10;
            }
            return i11;
        }
        return 0;
    }

    public final View U0() {
        int r6;
        if (this.v) {
            r6 = 0;
        } else {
            r6 = r() - 1;
        }
        return q(r6);
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

    public int W0(b1 b1Var) {
        if (b1Var.f47729a != -1) {
            return this.f47745q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f47745q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f47854b;
        WeakHashMap weakHashMap = r0.i0.f47143a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Z0(rf.e eVar, b1 b1Var, a0 a0Var, k2.l lVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        View c10 = a0Var.c(eVar);
        if (c10 == null) {
            lVar.f16201b = true;
            return;
        }
        q0 q0Var = (q0) c10.getLayoutParams();
        if (a0Var.f47713k == null) {
            boolean z12 = this.v;
            if (a0Var.f47709f == -1) {
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
            if (a0Var.f47709f == -1) {
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
        lVar.f16200a = this.f47745q.b(c10);
        if (this.f47743o == 1) {
            if (Y0()) {
                i13 = this.f47862m - E();
                i10 = i13 - this.f47745q.c(c10);
            } else {
                i10 = D();
                i13 = this.f47745q.c(c10) + i10;
            }
            if (a0Var.f47709f == -1) {
                i11 = a0Var.f47707b;
                i12 = i11 - lVar.f16200a;
            } else {
                i12 = a0Var.f47707b;
                i11 = lVar.f16200a + i12;
            }
        } else {
            int F = F();
            int c11 = this.f47745q.c(c10) + F;
            if (a0Var.f47709f == -1) {
                int i14 = a0Var.f47707b;
                int i15 = i14 - lVar.f16200a;
                i13 = i14;
                i11 = c11;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = a0Var.f47707b;
                int i17 = lVar.f16200a + i16;
                i10 = i16;
                i11 = c11;
                i12 = F;
                i13 = i17;
            }
        }
        p0.O(c10, i10, i12, i13, i11);
        if (q0Var.f47867a.j() || q0Var.f47867a.m()) {
            lVar.f16202c = true;
        }
        lVar.d = c10.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f47854b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(rf.e r18, s4.b1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: s4.c0.b0(rf.e, s4.b1):void");
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
                h1(H2, this.f47745q.f() - (this.f47745q.b(view) + this.f47745q.d(view2)));
                return;
            }
            h1(H2, this.f47745q.f() - this.f47745q.a(view2));
        } else if (z10) {
            h1(H2, this.f47745q.d(view2));
        } else {
            h1(H2, this.f47745q.a(view2) - this.f47745q.b(view));
        }
    }

    @Override
    public void c0(b1 b1Var) {
        this.B = null;
        this.f47752y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.g();
    }

    public final void c1(rf.e eVar, a0 a0Var) {
        e1 T;
        e1 T2;
        if (a0Var.f47706a && !a0Var.f47714l) {
            int i10 = a0Var.f47710g;
            int i11 = a0Var.f47711i;
            if (a0Var.f47709f == -1) {
                int r6 = r();
                if (i10 >= 0) {
                    int e = (this.f47745q.e() - i10) + i11;
                    if (this.v) {
                        for (int i12 = 0; i12 < r6; i12++) {
                            View q5 = q(i12);
                            if (q5 != null && (T2 = this.f47854b.T(q5)) != null && !T2.r() && (this.f47745q.d(q5) < e || this.f47745q.m(q5) < e)) {
                                d1(eVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = r6 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View q9 = q(i14);
                        if (q9 != null && (T = this.f47854b.T(q9)) != null && !T.r() && (this.f47745q.d(q9) < e || this.f47745q.m(q9) < e)) {
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
        if (!this.f47749u && this.f47743o == 0) {
            return true;
        }
        return false;
    }

    public final void d1(rf.e eVar, int i10, int i11) {
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
        if (!this.f47749u && this.f47743o == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final b0 e0() {
        b0 b0Var = this.B;
        if (b0Var != null) {
            ?? obj = new Object();
            obj.f47726a = b0Var.f47726a;
            obj.f47727b = b0Var.f47727b;
            obj.f47728c = b0Var.f47728c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            G0();
            boolean z10 = this.f47747s ^ this.v;
            obj2.f47728c = z10;
            if (z10) {
                View U0 = U0();
                obj2.f47727b = this.f47745q.f() - this.f47745q.a(U0);
                obj2.f47726a = ((q0) U0.getLayoutParams()).b();
                return obj2;
            }
            View V0 = V0();
            obj2.f47726a = p0.H(V0);
            obj2.f47727b = this.f47745q.d(V0) - this.f47745q.j();
            return obj2;
        }
        obj2.f47726a = -1;
        return obj2;
    }

    public void e1(rf.e eVar, int i10, int i11) {
        e1 T;
        e1 T2;
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int r6 = r();
            if (this.v) {
                int i13 = r6 - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View q5 = q(i14);
                    if (q5 != null && (T2 = this.f47854b.T(q5)) != null && !T2.r() && (this.f47745q.a(q5) > i12 || this.f47745q.l(q5) > i12)) {
                        d1(eVar, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < r6; i15++) {
                View q9 = q(i15);
                if (q9 != null && (T = this.f47854b.T(q9)) != null && !T.r() && (this.f47745q.a(q9) > i12 || this.f47745q.l(q9) > i12)) {
                    d1(eVar, 0, i15);
                    return;
                }
            }
        }
    }

    public final void f1() {
        if (this.f47743o != 1 && Y0()) {
            this.v = !this.f47748t;
        } else {
            this.v = this.f47748t;
        }
    }

    public final int g1(int i10, rf.e eVar, b1 b1Var) {
        int i11;
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.f47744p.f47706a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        n1(i11, abs, true, b1Var);
        a0 a0Var = this.f47744p;
        int H0 = H0(eVar, a0Var, b1Var, false) + a0Var.f47710g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i10 = i11 * H0;
        }
        this.f47745q.n(-i10);
        this.f47744p.f47712j = i10;
        return i10;
    }

    @Override
    public int h(b1 b1Var) {
        return C0(b1Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override
    public int i(b1 b1Var) {
        return D0(b1Var);
    }

    public void i1(int i10, int i11, boolean z10) {
        if (this.f47752y == i10 && this.A == i11 && this.f47753z == z10) {
            return;
        }
        this.f47752y = i10;
        this.A = i11;
        this.f47753z = z10;
        b0 b0Var = this.B;
        if (b0Var != null) {
            b0Var.f47726a = -1;
        }
        l0();
    }

    @Override
    public int j(b1 b1Var) {
        return B0(b1Var);
    }

    public final void j1() {
        this.G = true;
    }

    @Override
    public int k(b1 b1Var) {
        return C0(b1Var);
    }

    public final void k1(int i10) {
        f0 f0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(ic.a.i(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 == this.f47743o && this.f47745q != null) {
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
        this.f47745q = f0Var;
        this.C.f13699f = f0Var;
        this.f47743o = i10;
        l0();
    }

    @Override
    public int l(b1 b1Var) {
        return D0(b1Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (z10 == this.f47748t) {
            return;
        }
        this.f47748t = z10;
        l0();
    }

    @Override
    public final View m(int i10) {
        int r6 = r();
        if (r6 != 0) {
            int H = i10 - p0.H(q(0));
            if (H >= 0 && H < r6) {
                View q5 = q(H);
                if (p0.H(q5) == i10) {
                    return q5;
                }
            }
            int r10 = r();
            for (int i11 = 0; i11 < r10; i11++) {
                View q9 = q(i11);
                e1 U = RecyclerView.U(q9);
                if (U != null && U.c() == i10 && !U.r() && (this.f47854b.f3080u0.f47733g || !U.j())) {
                    return q9;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int m0(int i10, rf.e eVar, b1 b1Var) {
        if (this.f47743o == 1) {
            return 0;
        }
        return g1(i10, eVar, b1Var);
    }

    public void m1(boolean z10) {
        b(null);
        if (this.f47750w == z10) {
            return;
        }
        this.f47750w = z10;
        l0();
    }

    @Override
    public q0 n() {
        return new q0(-2, -2);
    }

    @Override
    public void n0(int i10) {
        this.f47752y = i10;
        this.A = Integer.MIN_VALUE;
        b0 b0Var = this.B;
        if (b0Var != null) {
            b0Var.f47726a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11, boolean z10, b1 b1Var) {
        boolean z11;
        int i12;
        int j10;
        a0 a0Var = this.f47744p;
        boolean z12 = false;
        int i13 = 1;
        if (this.f47745q.h() == 0 && this.f47745q.e() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        a0Var.f47714l = z11;
        this.f47744p.f47709f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(b1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z12 = true;
        }
        a0 a0Var2 = this.f47744p;
        if (z12) {
            i12 = max2;
        } else {
            i12 = max;
        }
        a0Var2.h = i12;
        if (!z12) {
            max = max2;
        }
        a0Var2.f47711i = max;
        if (z12) {
            a0Var2.h = this.f47745q.g() + i12;
            View U0 = U0();
            a0 a0Var3 = this.f47744p;
            if (this.v) {
                i13 = -1;
            }
            a0Var3.e = i13;
            int H = p0.H(U0);
            a0 a0Var4 = this.f47744p;
            a0Var3.d = H + a0Var4.e;
            a0Var4.f47707b = this.f47745q.a(U0);
            j10 = this.f47745q.a(U0) - this.f47745q.f();
        } else {
            View V0 = V0();
            a0 a0Var5 = this.f47744p;
            a0Var5.h = this.f47745q.j() + a0Var5.h;
            a0 a0Var6 = this.f47744p;
            if (!this.v) {
                i13 = -1;
            }
            a0Var6.e = i13;
            int H2 = p0.H(V0);
            a0 a0Var7 = this.f47744p;
            a0Var6.d = H2 + a0Var7.e;
            a0Var7.f47707b = this.f47745q.d(V0);
            j10 = (-this.f47745q.d(V0)) + this.f47745q.j();
        }
        a0 a0Var8 = this.f47744p;
        a0Var8.f47708c = i11;
        if (z10) {
            a0Var8.f47708c = i11 - j10;
        }
        a0Var8.f47710g = j10;
    }

    @Override
    public int o0(int i10, rf.e eVar, b1 b1Var) {
        if (this.f47743o == 0) {
            return 0;
        }
        return g1(i10, eVar, b1Var);
    }

    public final void o1(int i10, int i11) {
        int i12;
        this.f47744p.f47708c = this.f47745q.f() - i11;
        a0 a0Var = this.f47744p;
        if (this.v) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        a0Var.e = i12;
        a0Var.d = i10;
        a0Var.f47709f = 1;
        a0Var.f47707b = i11;
        a0Var.f47710g = Integer.MIN_VALUE;
    }

    public final void p1(int i10, int i11) {
        int i12;
        this.f47744p.f47708c = i11 - this.f47745q.j();
        a0 a0Var = this.f47744p;
        a0Var.d = i10;
        if (this.v) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        a0Var.e = i12;
        a0Var.f47709f = -1;
        a0Var.f47707b = i11;
        a0Var.f47710g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, b1 b1Var, int i10) {
        d0 d0Var = new d0(recyclerView.getContext());
        d0Var.f47715a = i10;
        w0(d0Var);
    }

    @Override
    public boolean y0() {
        if (this.B == null && this.f47747s == this.f47750w) {
            return true;
        }
        return false;
    }

    public void z0(b1 b1Var, int[] iArr) {
        int i10;
        int W0 = W0(b1Var);
        if (this.f47744p.f47709f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public c0(int i10, boolean z10) {
        this.f47743o = 1;
        this.f47746r = false;
        this.f47748t = false;
        this.f47749u = false;
        this.v = false;
        this.f47750w = false;
        this.f47751x = true;
        this.f47752y = -1;
        this.f47753z = true;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        i2.p0 p0Var = new i2.p0();
        p0Var.g();
        this.C = p0Var;
        this.D = new Object();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        k1(i10);
        l1(z10);
    }

    public void a1(rf.e eVar, b1 b1Var, i2.p0 p0Var, int i10) {
    }
}
