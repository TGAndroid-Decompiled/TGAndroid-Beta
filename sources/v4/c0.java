package v4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public class c0 extends p0 {
    public int A;
    public b0 B;
    public final l2.l0 C;
    public final n2.j D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int f59113o;
    public a0 f59114p;
    public androidx.emoji2.text.g f59115q;
    public boolean f59116r;
    public boolean f59117s;
    public boolean f59118t;
    public boolean f59119u;
    public boolean v;
    public boolean f59120w;
    public final boolean f59121x;
    public int f59122y;
    public boolean f59123z;

    public c0() {
        this(1, false);
    }

    public void A0(c1 c1Var, a0 a0Var, h2.f fVar) {
        int i7 = a0Var.d;
        if (i7 >= 0 && i7 < c1Var.b()) {
            fVar.b(i7, Math.max(0, a0Var.f59088g));
        }
    }

    public final int B0(c1 c1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f59115q;
            boolean z10 = this.f59121x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && c1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return Math.abs(((q0) K0.getLayoutParams()).b() - ((q0) J0.getLayoutParams()).b()) + 1;
                }
                return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
            }
            return 0;
        }
        return 0;
    }

    public final int C0(c1 c1Var) {
        int max;
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f59115q;
            boolean z10 = this.f59121x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && c1Var.b() != 0 && K0 != null && J0 != null) {
                int min = Math.min(((q0) K0.getLayoutParams()).b(), ((q0) J0.getLayoutParams()).b());
                int max2 = Math.max(((q0) K0.getLayoutParams()).b(), ((q0) J0.getLayoutParams()).b());
                if (z12) {
                    max = Math.max(0, (c1Var.b() - max2) - 1);
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

    public final int D0(c1 c1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f59115q;
            boolean z10 = this.f59121x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && c1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return c1Var.b();
                }
                return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((q0) K0.getLayoutParams()).b() - ((q0) J0.getLayoutParams()).b()) + 1)) * c1Var.b());
            }
            return 0;
        }
        return 0;
    }

    public final PointF E0(int i7) {
        if (r() == 0) {
            return null;
        }
        boolean z10 = false;
        int i10 = 1;
        if (i7 < p0.H(q(0))) {
            z10 = true;
        }
        if (z10 != this.v) {
            i10 = -1;
        }
        if (this.f59113o == 0) {
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
                            if (i7 == 130 && this.f59113o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f59113o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f59113o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f59113o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f59113o != 1 && Y0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f59113o == 1 || !Y0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void G0() {
        if (this.f59114p == null) {
            ?? obj = new Object();
            obj.f59083a = true;
            obj.h = 0;
            obj.f59089i = 0;
            obj.f59091k = null;
            this.f59114p = obj;
        }
    }

    public final int H0(x0 x0Var, a0 a0Var, c1 c1Var, boolean z10) {
        int i7 = a0Var.f59085c;
        int i10 = a0Var.f59088g;
        if (i10 != Integer.MIN_VALUE) {
            if (i7 < 0) {
                a0Var.f59088g = i10 + i7;
            }
            c1(x0Var, a0Var);
        }
        int i11 = a0Var.f59085c + a0Var.h;
        while (true) {
            if ((!a0Var.f59092l && i11 <= 0) || !a0Var.b(c1Var)) {
                break;
            }
            n2.j jVar = this.D;
            jVar.f21164a = 0;
            jVar.f21165b = false;
            jVar.f21166c = false;
            jVar.d = false;
            Z0(x0Var, c1Var, a0Var, jVar);
            if (!jVar.f21165b) {
                int i12 = a0Var.f59084b;
                int i13 = jVar.f21164a;
                a0Var.f59084b = (a0Var.f59087f * i13) + i12;
                if (!jVar.f21166c || a0Var.f59091k != null || !c1Var.f59129g) {
                    a0Var.f59085c -= i13;
                    i11 -= i13;
                }
                int i14 = a0Var.f59088g;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + i13;
                    a0Var.f59088g = i15;
                    int i16 = a0Var.f59085c;
                    if (i16 < 0) {
                        a0Var.f59088g = i15 + i16;
                    }
                    c1(x0Var, a0Var);
                }
                if (z10 && jVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i7 - a0Var.f59085c;
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

    public final View O0(int i7, int i10) {
        int i11;
        int i12;
        G0();
        if (i10 > i7 || i10 < i7) {
            if (this.f59115q.d(q(i7)) < this.f59115q.j()) {
                i11 = 16644;
                i12 = 16388;
            } else {
                i11 = 4161;
                i12 = 4097;
            }
            if (this.f59113o == 0) {
                return this.f59247c.d(i7, i10, i11, i12);
            }
            return this.d.d(i7, i10, i11, i12);
        }
        return q(i7);
    }

    public final View P0(int i7, int i10, boolean z10, boolean z11) {
        int i11;
        G0();
        int i12 = 320;
        if (z10) {
            i11 = 24579;
        } else {
            i11 = 320;
        }
        if (!z11) {
            i12 = 0;
        }
        if (this.f59113o == 0) {
            return this.f59247c.d(i7, i10, i11, i12);
        }
        return this.d.d(i7, i10, i11, i12);
    }

    public View Q0(x0 x0Var, c1 c1Var, int i7, int i10, int i11) {
        int j3;
        int i12;
        G0();
        if (this.f59116r) {
            j3 = 0;
        } else {
            j3 = this.f59115q.j();
        }
        int f10 = this.f59115q.f();
        if (i10 > i7) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        View view = null;
        View view2 = null;
        while (i7 != i10) {
            View q10 = q(i7);
            int H = p0.H(q10);
            if (H >= 0 && H < i11) {
                if (((q0) q10.getLayoutParams()).f59261a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else if (this.f59115q.d(q10) < f10 && this.f59115q.a(q10) >= j3) {
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
    public View R(View view, int i7, x0 x0Var, c1 c1Var) {
        int F0;
        View O0;
        View U0;
        f1();
        if (r() != 0 && (F0 = F0(i7)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.f59115q.k() * 0.33333334f), false, c1Var);
            a0 a0Var = this.f59114p;
            a0Var.f59088g = Integer.MIN_VALUE;
            a0Var.f59083a = false;
            H0(x0Var, a0Var, c1Var, true);
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

    public final int S0(int i7, x0 x0Var, c1 c1Var, boolean z10) {
        int f10;
        int f11;
        if (this.G && this.H && (f10 = this.f59115q.f() - i7) > 0) {
            int i10 = -g1(-f10, x0Var, c1Var);
            int i11 = i7 + i10;
            if (z10 && (f11 = this.f59115q.f() - i11) > 0) {
                this.f59115q.n(f11);
                return f11 + i10;
            }
            return i10;
        }
        return 0;
    }

    public final int T0(int i7, x0 x0Var, c1 c1Var, boolean z10) {
        int X0;
        int j3;
        if (this.G && (X0 = i7 - X0()) > 0) {
            int i10 = -g1(X0, x0Var, c1Var);
            int i11 = i7 + i10;
            if (z10 && (j3 = i11 - this.f59115q.j()) > 0) {
                this.f59115q.n(-j3);
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

    public int W0(c1 c1Var) {
        if (c1Var.f59124a != -1) {
            return this.f59115q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f59115q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f59246b;
        WeakHashMap weakHashMap = r0.i0.f56285a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Z0(x0 x0Var, c1 c1Var, a0 a0Var, n2.j jVar) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z11;
        View c10 = a0Var.c(x0Var);
        if (c10 == null) {
            jVar.f21165b = true;
            return;
        }
        q0 q0Var = (q0) c10.getLayoutParams();
        if (a0Var.f59091k == null) {
            boolean z12 = this.v;
            if (a0Var.f59087f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                a(-1, c10, false);
            } else {
                a(0, c10, false);
            }
        } else {
            boolean z13 = this.v;
            if (a0Var.f59087f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                a(-1, c10, true);
            } else {
                a(0, c10, true);
            }
        }
        P(c10);
        jVar.f21164a = this.f59115q.b(c10);
        if (this.f59113o == 1) {
            if (Y0()) {
                i12 = this.f59255m - E();
                i7 = i12 - this.f59115q.c(c10);
            } else {
                i7 = D();
                i12 = this.f59115q.c(c10) + i7;
            }
            if (a0Var.f59087f == -1) {
                i10 = a0Var.f59084b;
                i11 = i10 - jVar.f21164a;
            } else {
                i11 = a0Var.f59084b;
                i10 = jVar.f21164a + i11;
            }
        } else {
            int F = F();
            int c11 = this.f59115q.c(c10) + F;
            if (a0Var.f59087f == -1) {
                int i13 = a0Var.f59084b;
                int i14 = i13 - jVar.f21164a;
                i12 = i13;
                i10 = c11;
                i7 = i14;
                i11 = F;
            } else {
                int i15 = a0Var.f59084b;
                int i16 = jVar.f21164a + i15;
                i7 = i15;
                i10 = c11;
                i11 = F;
                i12 = i16;
            }
        }
        p0.O(c10, i7, i11, i12, i10);
        if (q0Var.f59261a.j() || q0Var.f59261a.m()) {
            jVar.f21166c = true;
        }
        jVar.d = c10.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f59246b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(v4.x0 r18, v4.c1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: v4.c0.b0(v4.x0, v4.c1):void");
    }

    public void b1(View view, View view2, int i7, int i10) {
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
                h1(H2, this.f59115q.f() - (this.f59115q.b(view) + this.f59115q.d(view2)));
                return;
            }
            h1(H2, this.f59115q.f() - this.f59115q.a(view2));
        } else if (z10) {
            h1(H2, this.f59115q.d(view2));
        } else {
            h1(H2, this.f59115q.a(view2) - this.f59115q.b(view));
        }
    }

    @Override
    public void c0(c1 c1Var) {
        this.B = null;
        this.f59122y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.g();
    }

    public final void c1(x0 x0Var, a0 a0Var) {
        f1 T;
        f1 T2;
        if (a0Var.f59083a && !a0Var.f59092l) {
            int i7 = a0Var.f59088g;
            int i10 = a0Var.f59089i;
            if (a0Var.f59087f == -1) {
                int r10 = r();
                if (i7 >= 0) {
                    int e10 = (this.f59115q.e() - i7) + i10;
                    if (this.v) {
                        for (int i11 = 0; i11 < r10; i11++) {
                            View q10 = q(i11);
                            if (q10 != null && (T2 = this.f59246b.T(q10)) != null && !T2.r() && (this.f59115q.d(q10) < e10 || this.f59115q.m(q10) < e10)) {
                                d1(x0Var, 0, i11);
                                return;
                            }
                        }
                        return;
                    }
                    int i12 = r10 - 1;
                    for (int i13 = i12; i13 >= 0; i13--) {
                        View q11 = q(i13);
                        if (q11 != null && (T = this.f59246b.T(q11)) != null && !T.r() && (this.f59115q.d(q11) < e10 || this.f59115q.m(q11) < e10)) {
                            d1(x0Var, i12, i13);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            e1(x0Var, i7, i10);
        }
    }

    @Override
    public final boolean d() {
        if (!this.f59119u && this.f59113o == 0) {
            return true;
        }
        return false;
    }

    public final void d1(x0 x0Var, int i7, int i10) {
        if (i7 != i10) {
            if (i10 > i7) {
                for (int i11 = i10 - 1; i11 >= i7; i11--) {
                    i0(i11, x0Var);
                }
                return;
            }
            while (i7 > i10) {
                i0(i7, x0Var);
                i7--;
            }
        }
    }

    @Override
    public boolean e() {
        if (!this.f59119u && this.f59113o == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final b0 e0() {
        b0 b0Var = this.B;
        if (b0Var != null) {
            ?? obj = new Object();
            obj.f59102a = b0Var.f59102a;
            obj.f59103b = b0Var.f59103b;
            obj.f59104c = b0Var.f59104c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            G0();
            boolean z10 = this.f59117s ^ this.v;
            obj2.f59104c = z10;
            if (z10) {
                View U0 = U0();
                obj2.f59103b = this.f59115q.f() - this.f59115q.a(U0);
                obj2.f59102a = ((q0) U0.getLayoutParams()).b();
                return obj2;
            }
            View V0 = V0();
            obj2.f59102a = p0.H(V0);
            obj2.f59103b = this.f59115q.d(V0) - this.f59115q.j();
            return obj2;
        }
        obj2.f59102a = -1;
        return obj2;
    }

    public void e1(x0 x0Var, int i7, int i10) {
        f1 T;
        f1 T2;
        if (i7 >= 0) {
            int i11 = i7 - i10;
            int r10 = r();
            if (this.v) {
                int i12 = r10 - 1;
                for (int i13 = i12; i13 >= 0; i13--) {
                    View q10 = q(i13);
                    if (q10 != null && (T2 = this.f59246b.T(q10)) != null && !T2.r() && (this.f59115q.a(q10) > i11 || this.f59115q.l(q10) > i11)) {
                        d1(x0Var, i12, i13);
                        return;
                    }
                }
                return;
            }
            for (int i14 = 0; i14 < r10; i14++) {
                View q11 = q(i14);
                if (q11 != null && (T = this.f59246b.T(q11)) != null && !T.r() && (this.f59115q.a(q11) > i11 || this.f59115q.l(q11) > i11)) {
                    d1(x0Var, 0, i14);
                    return;
                }
            }
        }
    }

    public final void f1() {
        if (this.f59113o != 1 && Y0()) {
            this.v = !this.f59118t;
        } else {
            this.v = this.f59118t;
        }
    }

    public final int g1(int i7, x0 x0Var, c1 c1Var) {
        int i10;
        if (r() == 0 || i7 == 0) {
            return 0;
        }
        G0();
        this.f59114p.f59083a = true;
        if (i7 > 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int abs = Math.abs(i7);
        m1(i10, abs, true, c1Var);
        a0 a0Var = this.f59114p;
        int H0 = H0(x0Var, a0Var, c1Var, false) + a0Var.f59088g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i7 = i10 * H0;
        }
        this.f59115q.n(-i7);
        this.f59114p.f59090j = i7;
        return i7;
    }

    @Override
    public int h(c1 c1Var) {
        return C0(c1Var);
    }

    public void h1(int i7, int i10) {
        i1(i7, i10, this.v);
    }

    @Override
    public int i(c1 c1Var) {
        return D0(c1Var);
    }

    public void i1(int i7, int i10, boolean z10) {
        if (this.f59122y == i7 && this.A == i10 && this.f59123z == z10) {
            return;
        }
        this.f59122y = i7;
        this.A = i10;
        this.f59123z = z10;
        b0 b0Var = this.B;
        if (b0Var != null) {
            b0Var.f59102a = -1;
        }
        l0();
    }

    @Override
    public int j(c1 c1Var) {
        return B0(c1Var);
    }

    public final void j1(int i7) {
        g0 g0Var;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(i5.c.i(i7, "invalid orientation:"));
        }
        b(null);
        if (i7 == this.f59113o && this.f59115q != null) {
            return;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                g0Var = new g0(this, 1);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            g0Var = new g0(this, 0);
        }
        this.f59115q = g0Var;
        this.C.f19461f = g0Var;
        this.f59113o = i7;
        l0();
    }

    @Override
    public int k(c1 c1Var) {
        return C0(c1Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.f59118t) {
            return;
        }
        this.f59118t = z10;
        l0();
    }

    @Override
    public int l(c1 c1Var) {
        return D0(c1Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.f59120w == z10) {
            return;
        }
        this.f59120w = z10;
        l0();
    }

    @Override
    public final View m(int i7) {
        int r10 = r();
        if (r10 != 0) {
            int H = i7 - p0.H(q(0));
            if (H >= 0 && H < r10) {
                View q10 = q(H);
                if (p0.H(q10) == i7) {
                    return q10;
                }
            }
            int r11 = r();
            for (int i10 = 0; i10 < r11; i10++) {
                View q11 = q(i10);
                f1 U = RecyclerView.U(q11);
                if (U != null && U.c() == i7 && !U.r() && (this.f59246b.f2829v0.f59129g || !U.j())) {
                    return q11;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int m0(int i7, x0 x0Var, c1 c1Var) {
        if (this.f59113o == 1) {
            return 0;
        }
        return g1(i7, x0Var, c1Var);
    }

    public final void m1(int i7, int i10, boolean z10, c1 c1Var) {
        boolean z11;
        int i11;
        int j3;
        a0 a0Var = this.f59114p;
        boolean z12 = false;
        int i12 = 1;
        if (this.f59115q.h() == 0 && this.f59115q.e() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        a0Var.f59092l = z11;
        this.f59114p.f59087f = i7;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(c1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i7 == 1) {
            z12 = true;
        }
        a0 a0Var2 = this.f59114p;
        if (z12) {
            i11 = max2;
        } else {
            i11 = max;
        }
        a0Var2.h = i11;
        if (!z12) {
            max = max2;
        }
        a0Var2.f59089i = max;
        if (z12) {
            a0Var2.h = this.f59115q.g() + i11;
            View U0 = U0();
            a0 a0Var3 = this.f59114p;
            if (this.v) {
                i12 = -1;
            }
            a0Var3.f59086e = i12;
            int H = p0.H(U0);
            a0 a0Var4 = this.f59114p;
            a0Var3.d = H + a0Var4.f59086e;
            a0Var4.f59084b = this.f59115q.a(U0);
            j3 = this.f59115q.a(U0) - this.f59115q.f();
        } else {
            View V0 = V0();
            a0 a0Var5 = this.f59114p;
            a0Var5.h = this.f59115q.j() + a0Var5.h;
            a0 a0Var6 = this.f59114p;
            if (!this.v) {
                i12 = -1;
            }
            a0Var6.f59086e = i12;
            int H2 = p0.H(V0);
            a0 a0Var7 = this.f59114p;
            a0Var6.d = H2 + a0Var7.f59086e;
            a0Var7.f59084b = this.f59115q.d(V0);
            j3 = (-this.f59115q.d(V0)) + this.f59115q.j();
        }
        a0 a0Var8 = this.f59114p;
        a0Var8.f59085c = i10;
        if (z10) {
            a0Var8.f59085c = i10 - j3;
        }
        a0Var8.f59088g = j3;
    }

    @Override
    public q0 n() {
        return new q0(-2, -2);
    }

    @Override
    public void n0(int i7) {
        this.f59122y = i7;
        this.A = Integer.MIN_VALUE;
        b0 b0Var = this.B;
        if (b0Var != null) {
            b0Var.f59102a = -1;
        }
        l0();
    }

    public final void n1(int i7, int i10) {
        int i11;
        this.f59114p.f59085c = this.f59115q.f() - i10;
        a0 a0Var = this.f59114p;
        if (this.v) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        a0Var.f59086e = i11;
        a0Var.d = i7;
        a0Var.f59087f = 1;
        a0Var.f59084b = i10;
        a0Var.f59088g = Integer.MIN_VALUE;
    }

    @Override
    public int o0(int i7, x0 x0Var, c1 c1Var) {
        if (this.f59113o == 0) {
            return 0;
        }
        return g1(i7, x0Var, c1Var);
    }

    public final void o1(int i7, int i10) {
        int i11;
        this.f59114p.f59085c = i10 - this.f59115q.j();
        a0 a0Var = this.f59114p;
        a0Var.d = i7;
        if (this.v) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        a0Var.f59086e = i11;
        a0Var.f59087f = -1;
        a0Var.f59084b = i10;
        a0Var.f59088g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, c1 c1Var, int i7) {
        d0 d0Var = new d0(recyclerView.getContext());
        d0Var.f59105a = i7;
        w0(d0Var);
    }

    @Override
    public boolean y0() {
        if (this.B == null && this.f59117s == this.f59120w) {
            return true;
        }
        return false;
    }

    public void z0(c1 c1Var, int[] iArr) {
        int i7;
        int W0 = W0(c1Var);
        if (this.f59114p.f59087f == -1) {
            i7 = 0;
        } else {
            i7 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i7;
    }

    public c0(int i7, boolean z10) {
        this.f59113o = 1;
        this.f59116r = false;
        this.f59118t = false;
        this.f59119u = false;
        this.v = false;
        this.f59120w = false;
        this.f59121x = true;
        this.f59122y = -1;
        this.f59123z = true;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        l2.l0 l0Var = new l2.l0();
        l0Var.g();
        this.C = l0Var;
        this.D = new Object();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i7);
        k1(z10);
    }

    public void a1(x0 x0Var, c1 c1Var, l2.l0 l0Var, int i7) {
    }
}
