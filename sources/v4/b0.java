package v4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public class b0 extends n0 {
    public int A;
    public a0 B;
    public final l2.o0 C;
    public final n2.j D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int f56920o;
    public z f56921p;
    public androidx.emoji2.text.g f56922q;
    public boolean f56923r;
    public boolean f56924s;
    public boolean f56925t;
    public boolean f56926u;
    public boolean v;
    public boolean f56927w;
    public final boolean f56928x;
    public int f56929y;
    public boolean f56930z;

    public b0() {
        this(1, false);
    }

    public void A0(a1 a1Var, z zVar, h2.f fVar) {
        int i7 = zVar.d;
        if (i7 >= 0 && i7 < a1Var.b()) {
            fVar.b(i7, Math.max(0, zVar.f57115g));
        }
    }

    public final int B0(a1 a1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f56922q;
            boolean z9 = this.f56928x;
            boolean z10 = !z9;
            View K0 = K0(z10);
            View J0 = J0(z10);
            if (r() != 0 && a1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z9) {
                    return Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1;
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
            androidx.emoji2.text.g gVar = this.f56922q;
            boolean z9 = this.f56928x;
            boolean z10 = !z9;
            View K0 = K0(z10);
            View J0 = J0(z10);
            boolean z11 = this.v;
            if (r() != 0 && a1Var.b() != 0 && K0 != null && J0 != null) {
                int min = Math.min(((o0) K0.getLayoutParams()).b(), ((o0) J0.getLayoutParams()).b());
                int max2 = Math.max(((o0) K0.getLayoutParams()).b(), ((o0) J0.getLayoutParams()).b());
                if (z11) {
                    max = Math.max(0, (a1Var.b() - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!z9) {
                    return max;
                }
                return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
            }
        }
        return 0;
    }

    public final int D0(a1 a1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f56922q;
            boolean z9 = this.f56928x;
            boolean z10 = !z9;
            View K0 = K0(z10);
            View J0 = J0(z10);
            if (r() != 0 && a1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z9) {
                    return a1Var.b();
                }
                return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1)) * a1Var.b());
            }
            return 0;
        }
        return 0;
    }

    public final PointF E0(int i7) {
        if (r() == 0) {
            return null;
        }
        boolean z9 = false;
        int i10 = 1;
        if (i7 < n0.H(q(0))) {
            z9 = true;
        }
        if (z9 != this.v) {
            i10 = -1;
        }
        if (this.f56920o == 0) {
            return new PointF(i10, 0.0f);
        }
        return new PointF(0.0f, i10);
    }

    public final int F0(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 17) {
                    if (i7 != 33) {
                        if (i7 != 66) {
                            if (i7 == 130 && this.f56920o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f56920o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f56920o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f56920o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f56920o != 1 && Y0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f56920o == 1 || !Y0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void G0() {
        if (this.f56921p == null) {
            ?? obj = new Object();
            obj.f57110a = true;
            obj.h = 0;
            obj.f57116i = 0;
            obj.f57118k = null;
            this.f56921p = obj;
        }
    }

    public final int H0(v0 v0Var, z zVar, a1 a1Var, boolean z9) {
        int i7 = zVar.f57112c;
        int i10 = zVar.f57115g;
        if (i10 != Integer.MIN_VALUE) {
            if (i7 < 0) {
                zVar.f57115g = i10 + i7;
            }
            c1(v0Var, zVar);
        }
        int i11 = zVar.f57112c + zVar.h;
        while (true) {
            if ((!zVar.f57119l && i11 <= 0) || !zVar.b(a1Var)) {
                break;
            }
            n2.j jVar = this.D;
            jVar.f20220a = 0;
            jVar.f20221b = false;
            jVar.f20222c = false;
            jVar.d = false;
            Z0(v0Var, a1Var, zVar, jVar);
            if (!jVar.f20221b) {
                int i12 = zVar.f57111b;
                int i13 = jVar.f20220a;
                zVar.f57111b = (zVar.f57114f * i13) + i12;
                if (!jVar.f20222c || zVar.f57118k != null || !a1Var.f56910g) {
                    zVar.f57112c -= i13;
                    i11 -= i13;
                }
                int i14 = zVar.f57115g;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + i13;
                    zVar.f57115g = i15;
                    int i16 = zVar.f57112c;
                    if (i16 < 0) {
                        zVar.f57115g = i15 + i16;
                    }
                    c1(v0Var, zVar);
                }
                if (z9 && jVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i7 - zVar.f57112c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((o0) P0.getLayoutParams()).b();
    }

    public final View J0(boolean z9) {
        if (this.v) {
            return P0(0, r(), z9, true);
        }
        return P0(r() - 1, -1, z9, true);
    }

    public final View K0(boolean z9) {
        if (this.v) {
            return P0(r() - 1, -1, z9, true);
        }
        return P0(0, r(), z9, true);
    }

    public final int L0() {
        View P0 = P0(0, r(), false, true);
        if (P0 == null) {
            return -1;
        }
        return ((o0) P0.getLayoutParams()).b();
    }

    public final int M0() {
        View P0 = P0(r() - 1, -1, true, false);
        if (P0 == null) {
            return -1;
        }
        return ((o0) P0.getLayoutParams()).b();
    }

    public final int N0() {
        View P0 = P0(r() - 1, -1, false, true);
        if (P0 == null) {
            return -1;
        }
        return ((o0) P0.getLayoutParams()).b();
    }

    public final View O0(int i7, int i10) {
        int i11;
        int i12;
        G0();
        if (i10 > i7 || i10 < i7) {
            if (this.f56922q.d(q(i7)) < this.f56922q.j()) {
                i11 = 16644;
                i12 = 16388;
            } else {
                i11 = 4161;
                i12 = 4097;
            }
            if (this.f56920o == 0) {
                return this.f57040c.d(i7, i10, i11, i12);
            }
            return this.d.d(i7, i10, i11, i12);
        }
        return q(i7);
    }

    public final View P0(int i7, int i10, boolean z9, boolean z10) {
        int i11;
        G0();
        int i12 = 320;
        if (z9) {
            i11 = 24579;
        } else {
            i11 = 320;
        }
        if (!z10) {
            i12 = 0;
        }
        if (this.f56920o == 0) {
            return this.f57040c.d(i7, i10, i11, i12);
        }
        return this.d.d(i7, i10, i11, i12);
    }

    public View Q0(v0 v0Var, a1 a1Var, int i7, int i10, int i11) {
        int j3;
        int i12;
        G0();
        if (this.f56923r) {
            j3 = 0;
        } else {
            j3 = this.f56922q.j();
        }
        int f10 = this.f56922q.f();
        if (i10 > i7) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        View view = null;
        View view2 = null;
        while (i7 != i10) {
            View q10 = q(i7);
            int H = n0.H(q10);
            if (H >= 0 && H < i11) {
                if (((o0) q10.getLayoutParams()).f57051a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else if (this.f56922q.d(q10) < f10 && this.f56922q.a(q10) >= j3) {
                    return q10;
                } else {
                    if (view == null) {
                        view = q10;
                    }
                }
            }
            i7 += i12;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override
    public View R(View view, int i7, v0 v0Var, a1 a1Var) {
        int F0;
        View O0;
        View U0;
        f1();
        if (r() != 0 && (F0 = F0(i7)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.f56922q.k() * 0.33333334f), false, a1Var);
            z zVar = this.f56921p;
            zVar.f57115g = Integer.MIN_VALUE;
            zVar.f57110a = false;
            H0(v0Var, zVar, a1Var, true);
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

    public final int S0(int i7, v0 v0Var, a1 a1Var, boolean z9) {
        int f10;
        int f11;
        if (this.G && this.H && (f10 = this.f56922q.f() - i7) > 0) {
            int i10 = -g1(-f10, v0Var, a1Var);
            int i11 = i7 + i10;
            if (z9 && (f11 = this.f56922q.f() - i11) > 0) {
                this.f56922q.n(f11);
                return f11 + i10;
            }
            return i10;
        }
        return 0;
    }

    public final int T0(int i7, v0 v0Var, a1 a1Var, boolean z9) {
        int X0;
        int j3;
        if (this.G && (X0 = i7 - X0()) > 0) {
            int i10 = -g1(X0, v0Var, a1Var);
            int i11 = i7 + i10;
            if (z9 && (j3 = i11 - this.f56922q.j()) > 0) {
                this.f56922q.n(-j3);
                return i10 - j3;
            }
            return i10;
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
        int i7;
        if (this.v) {
            i7 = r() - 1;
        } else {
            i7 = 0;
        }
        return q(i7);
    }

    public int W0(a1 a1Var) {
        if (a1Var.f56905a != -1) {
            return this.f56922q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f56922q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f57039b;
        WeakHashMap weakHashMap = r0.i0.f54097a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Z0(v0 v0Var, a1 a1Var, z zVar, n2.j jVar) {
        boolean z9;
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z10;
        View c10 = zVar.c(v0Var);
        if (c10 == null) {
            jVar.f20221b = true;
            return;
        }
        o0 o0Var = (o0) c10.getLayoutParams();
        if (zVar.f57118k == null) {
            boolean z11 = this.v;
            if (zVar.f57114f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                a(-1, c10, false);
            } else {
                a(0, c10, false);
            }
        } else {
            boolean z12 = this.v;
            if (zVar.f57114f == -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z12 == z9) {
                a(-1, c10, true);
            } else {
                a(0, c10, true);
            }
        }
        P(c10);
        jVar.f20220a = this.f56922q.b(c10);
        if (this.f56920o == 1) {
            if (Y0()) {
                i12 = this.f57048m - E();
                i7 = i12 - this.f56922q.c(c10);
            } else {
                i7 = D();
                i12 = this.f56922q.c(c10) + i7;
            }
            if (zVar.f57114f == -1) {
                i10 = zVar.f57111b;
                i11 = i10 - jVar.f20220a;
            } else {
                i11 = zVar.f57111b;
                i10 = jVar.f20220a + i11;
            }
        } else {
            int F = F();
            int c11 = this.f56922q.c(c10) + F;
            if (zVar.f57114f == -1) {
                int i13 = zVar.f57111b;
                int i14 = i13 - jVar.f20220a;
                i12 = i13;
                i10 = c11;
                i7 = i14;
                i11 = F;
            } else {
                int i15 = zVar.f57111b;
                int i16 = jVar.f20220a + i15;
                i7 = i15;
                i10 = c11;
                i11 = F;
                i12 = i16;
            }
        }
        n0.O(c10, i7, i11, i12, i10);
        if (o0Var.f57051a.j() || o0Var.f57051a.m()) {
            jVar.f20222c = true;
        }
        jVar.d = c10.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f57039b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(v4.v0 r18, v4.a1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: v4.b0.b0(v4.v0, v4.a1):void");
    }

    public void b1(View view, View view2, int i7, int i10) {
        boolean z9;
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = n0.H(view);
        int H2 = n0.H(view2);
        if (H < H2) {
            z9 = true;
        } else {
            z9 = true;
        }
        if (this.v) {
            if (z9) {
                h1(H2, this.f56922q.f() - (this.f56922q.b(view) + this.f56922q.d(view2)));
                return;
            }
            h1(H2, this.f56922q.f() - this.f56922q.a(view2));
        } else if (z9) {
            h1(H2, this.f56922q.d(view2));
        } else {
            h1(H2, this.f56922q.a(view2) - this.f56922q.b(view));
        }
    }

    @Override
    public void c0(a1 a1Var) {
        this.B = null;
        this.f56929y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.g();
    }

    public final void c1(v0 v0Var, z zVar) {
        d1 T;
        d1 T2;
        if (zVar.f57110a && !zVar.f57119l) {
            int i7 = zVar.f57115g;
            int i10 = zVar.f57116i;
            if (zVar.f57114f == -1) {
                int r10 = r();
                if (i7 >= 0) {
                    int e10 = (this.f56922q.e() - i7) + i10;
                    if (this.v) {
                        for (int i11 = 0; i11 < r10; i11++) {
                            View q10 = q(i11);
                            if (q10 != null && (T2 = this.f57039b.T(q10)) != null && !T2.r() && (this.f56922q.d(q10) < e10 || this.f56922q.m(q10) < e10)) {
                                d1(v0Var, 0, i11);
                                return;
                            }
                        }
                        return;
                    }
                    int i12 = r10 - 1;
                    for (int i13 = i12; i13 >= 0; i13--) {
                        View q11 = q(i13);
                        if (q11 != null && (T = this.f57039b.T(q11)) != null && !T.r() && (this.f56922q.d(q11) < e10 || this.f56922q.m(q11) < e10)) {
                            d1(v0Var, i12, i13);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            e1(v0Var, i7, i10);
        }
    }

    @Override
    public final boolean d() {
        if (!this.f56926u && this.f56920o == 0) {
            return true;
        }
        return false;
    }

    public final void d1(v0 v0Var, int i7, int i10) {
        if (i7 != i10) {
            if (i10 > i7) {
                for (int i11 = i10 - 1; i11 >= i7; i11--) {
                    i0(i11, v0Var);
                }
                return;
            }
            while (i7 > i10) {
                i0(i7, v0Var);
                i7--;
            }
        }
    }

    @Override
    public boolean e() {
        if (!this.f56926u && this.f56920o == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final a0 e0() {
        a0 a0Var = this.B;
        if (a0Var != null) {
            ?? obj = new Object();
            obj.f56902a = a0Var.f56902a;
            obj.f56903b = a0Var.f56903b;
            obj.f56904c = a0Var.f56904c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            G0();
            boolean z9 = this.f56924s ^ this.v;
            obj2.f56904c = z9;
            if (z9) {
                View U0 = U0();
                obj2.f56903b = this.f56922q.f() - this.f56922q.a(U0);
                obj2.f56902a = ((o0) U0.getLayoutParams()).b();
                return obj2;
            }
            View V0 = V0();
            obj2.f56902a = n0.H(V0);
            obj2.f56903b = this.f56922q.d(V0) - this.f56922q.j();
            return obj2;
        }
        obj2.f56902a = -1;
        return obj2;
    }

    public void e1(v0 v0Var, int i7, int i10) {
        d1 T;
        d1 T2;
        if (i7 >= 0) {
            int i11 = i7 - i10;
            int r10 = r();
            if (this.v) {
                int i12 = r10 - 1;
                for (int i13 = i12; i13 >= 0; i13--) {
                    View q10 = q(i13);
                    if (q10 != null && (T2 = this.f57039b.T(q10)) != null && !T2.r() && (this.f56922q.a(q10) > i11 || this.f56922q.l(q10) > i11)) {
                        d1(v0Var, i12, i13);
                        return;
                    }
                }
                return;
            }
            for (int i14 = 0; i14 < r10; i14++) {
                View q11 = q(i14);
                if (q11 != null && (T = this.f57039b.T(q11)) != null && !T.r() && (this.f56922q.a(q11) > i11 || this.f56922q.l(q11) > i11)) {
                    d1(v0Var, 0, i14);
                    return;
                }
            }
        }
    }

    public final void f1() {
        if (this.f56920o != 1 && Y0()) {
            this.v = !this.f56925t;
        } else {
            this.v = this.f56925t;
        }
    }

    public final int g1(int i7, v0 v0Var, a1 a1Var) {
        int i10;
        if (r() == 0 || i7 == 0) {
            return 0;
        }
        G0();
        this.f56921p.f57110a = true;
        if (i7 > 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int abs = Math.abs(i7);
        m1(i10, abs, true, a1Var);
        z zVar = this.f56921p;
        int H0 = H0(v0Var, zVar, a1Var, false) + zVar.f57115g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i7 = i10 * H0;
        }
        this.f56922q.n(-i7);
        this.f56921p.f57117j = i7;
        return i7;
    }

    @Override
    public int h(a1 a1Var) {
        return C0(a1Var);
    }

    public void h1(int i7, int i10) {
        i1(i7, i10, this.v);
    }

    @Override
    public int i(a1 a1Var) {
        return D0(a1Var);
    }

    public void i1(int i7, int i10, boolean z9) {
        if (this.f56929y == i7 && this.A == i10 && this.f56930z == z9) {
            return;
        }
        this.f56929y = i7;
        this.A = i10;
        this.f56930z = z9;
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0Var.f56902a = -1;
        }
        l0();
    }

    @Override
    public int j(a1 a1Var) {
        return B0(a1Var);
    }

    public final void j1(int i7) {
        e0 e0Var;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(jg.g.j(i7, "invalid orientation:"));
        }
        b(null);
        if (i7 == this.f56920o && this.f56922q != null) {
            return;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                e0Var = new e0(this, 1);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            e0Var = new e0(this, 0);
        }
        this.f56922q = e0Var;
        this.C.f17975f = e0Var;
        this.f56920o = i7;
        l0();
    }

    @Override
    public int k(a1 a1Var) {
        return C0(a1Var);
    }

    public void k1(boolean z9) {
        b(null);
        if (z9 == this.f56925t) {
            return;
        }
        this.f56925t = z9;
        l0();
    }

    @Override
    public int l(a1 a1Var) {
        return D0(a1Var);
    }

    public void l1(boolean z9) {
        b(null);
        if (this.f56927w == z9) {
            return;
        }
        this.f56927w = z9;
        l0();
    }

    @Override
    public final View m(int i7) {
        int r10 = r();
        if (r10 != 0) {
            int H = i7 - n0.H(q(0));
            if (H >= 0 && H < r10) {
                View q10 = q(H);
                if (n0.H(q10) == i7) {
                    return q10;
                }
            }
            int r11 = r();
            for (int i10 = 0; i10 < r11; i10++) {
                View q11 = q(i10);
                d1 U = RecyclerView.U(q11);
                if (U != null && U.c() == i7 && !U.r() && (this.f57039b.f2867u0.f56910g || !U.j())) {
                    return q11;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int m0(int i7, v0 v0Var, a1 a1Var) {
        if (this.f56920o == 1) {
            return 0;
        }
        return g1(i7, v0Var, a1Var);
    }

    public final void m1(int i7, int i10, boolean z9, a1 a1Var) {
        boolean z10;
        int i11;
        int j3;
        z zVar = this.f56921p;
        boolean z11 = false;
        int i12 = 1;
        if (this.f56922q.h() == 0 && this.f56922q.e() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zVar.f57119l = z10;
        this.f56921p.f57114f = i7;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(a1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i7 == 1) {
            z11 = true;
        }
        z zVar2 = this.f56921p;
        if (z11) {
            i11 = max2;
        } else {
            i11 = max;
        }
        zVar2.h = i11;
        if (!z11) {
            max = max2;
        }
        zVar2.f57116i = max;
        if (z11) {
            zVar2.h = this.f56922q.g() + i11;
            View U0 = U0();
            z zVar3 = this.f56921p;
            if (this.v) {
                i12 = -1;
            }
            zVar3.f57113e = i12;
            int H = n0.H(U0);
            z zVar4 = this.f56921p;
            zVar3.d = H + zVar4.f57113e;
            zVar4.f57111b = this.f56922q.a(U0);
            j3 = this.f56922q.a(U0) - this.f56922q.f();
        } else {
            View V0 = V0();
            z zVar5 = this.f56921p;
            zVar5.h = this.f56922q.j() + zVar5.h;
            z zVar6 = this.f56921p;
            if (!this.v) {
                i12 = -1;
            }
            zVar6.f57113e = i12;
            int H2 = n0.H(V0);
            z zVar7 = this.f56921p;
            zVar6.d = H2 + zVar7.f57113e;
            zVar7.f57111b = this.f56922q.d(V0);
            j3 = (-this.f56922q.d(V0)) + this.f56922q.j();
        }
        z zVar8 = this.f56921p;
        zVar8.f57112c = i10;
        if (z9) {
            zVar8.f57112c = i10 - j3;
        }
        zVar8.f57115g = j3;
    }

    @Override
    public o0 n() {
        return new o0(-2, -2);
    }

    @Override
    public void n0(int i7) {
        this.f56929y = i7;
        this.A = Integer.MIN_VALUE;
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0Var.f56902a = -1;
        }
        l0();
    }

    public final void n1(int i7, int i10) {
        int i11;
        this.f56921p.f57112c = this.f56922q.f() - i10;
        z zVar = this.f56921p;
        if (this.v) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        zVar.f57113e = i11;
        zVar.d = i7;
        zVar.f57114f = 1;
        zVar.f57111b = i10;
        zVar.f57115g = Integer.MIN_VALUE;
    }

    @Override
    public int o0(int i7, v0 v0Var, a1 a1Var) {
        if (this.f56920o == 0) {
            return 0;
        }
        return g1(i7, v0Var, a1Var);
    }

    public final void o1(int i7, int i10) {
        int i11;
        this.f56921p.f57112c = i10 - this.f56922q.j();
        z zVar = this.f56921p;
        zVar.d = i7;
        if (this.v) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        zVar.f57113e = i11;
        zVar.f57114f = -1;
        zVar.f57111b = i10;
        zVar.f57115g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, a1 a1Var, int i7) {
        c0 c0Var = new c0(recyclerView.getContext());
        c0Var.f57120a = i7;
        w0(c0Var);
    }

    @Override
    public boolean y0() {
        if (this.B == null && this.f56924s == this.f56927w) {
            return true;
        }
        return false;
    }

    public void z0(a1 a1Var, int[] iArr) {
        int i7;
        int W0 = W0(a1Var);
        if (this.f56921p.f57114f == -1) {
            i7 = 0;
        } else {
            i7 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i7;
    }

    public b0(int i7, boolean z9) {
        this.f56920o = 1;
        this.f56923r = false;
        this.f56925t = false;
        this.f56926u = false;
        this.v = false;
        this.f56927w = false;
        this.f56928x = true;
        this.f56929y = -1;
        this.f56930z = true;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        l2.o0 o0Var = new l2.o0();
        o0Var.g();
        this.C = o0Var;
        this.D = new Object();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i7);
        k1(z9);
    }

    public void a1(v0 v0Var, a1 a1Var, l2.o0 o0Var, int i7) {
    }
}
