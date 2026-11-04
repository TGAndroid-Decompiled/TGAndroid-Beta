package u4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import k2.p1;
public class b0 extends o0 {
    public int A;
    public a0 B;
    public final k2.o0 C;
    public final m2.j D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int f55509o;
    public z f55510p;
    public androidx.emoji2.text.g f55511q;
    public boolean f55512r;
    public boolean f55513s;
    public boolean f55514t;
    public boolean f55515u;
    public boolean v;
    public boolean f55516w;
    public final boolean f55517x;
    public int f55518y;
    public boolean f55519z;

    public b0() {
        this(1, false);
    }

    public void A0(a1 a1Var, z zVar, g2.g gVar) {
        int i3 = zVar.d;
        if (i3 >= 0 && i3 < a1Var.b()) {
            gVar.b(i3, Math.max(0, zVar.f55699g));
        }
    }

    public final int B0(a1 a1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f55511q;
            boolean z10 = this.f55517x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && a1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return Math.abs(((p0) K0.getLayoutParams()).b() - ((p0) J0.getLayoutParams()).b()) + 1;
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
            androidx.emoji2.text.g gVar = this.f55511q;
            boolean z10 = this.f55517x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && a1Var.b() != 0 && K0 != null && J0 != null) {
                int min = Math.min(((p0) K0.getLayoutParams()).b(), ((p0) J0.getLayoutParams()).b());
                int max2 = Math.max(((p0) K0.getLayoutParams()).b(), ((p0) J0.getLayoutParams()).b());
                if (z12) {
                    max = Math.max(0, (a1Var.b() - max2) - 1);
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

    public final int D0(a1 a1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f55511q;
            boolean z10 = this.f55517x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && a1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return a1Var.b();
                }
                return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((p0) K0.getLayoutParams()).b() - ((p0) J0.getLayoutParams()).b()) + 1)) * a1Var.b());
            }
            return 0;
        }
        return 0;
    }

    public final PointF E0(int i3) {
        if (r() == 0) {
            return null;
        }
        boolean z10 = false;
        int i10 = 1;
        if (i3 < o0.H(q(0))) {
            z10 = true;
        }
        if (z10 != this.v) {
            i10 = -1;
        }
        if (this.f55509o == 0) {
            return new PointF(i10, 0.0f);
        }
        return new PointF(0.0f, i10);
    }

    public final int F0(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 17) {
                    if (i3 != 33) {
                        if (i3 != 66) {
                            if (i3 == 130 && this.f55509o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f55509o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f55509o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f55509o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f55509o != 1 && Y0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f55509o == 1 || !Y0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void G0() {
        if (this.f55510p == null) {
            ?? obj = new Object();
            obj.f55694a = true;
            obj.h = 0;
            obj.f55700i = 0;
            obj.f55702k = null;
            this.f55510p = obj;
        }
    }

    public final int H0(tf.e eVar, z zVar, a1 a1Var, boolean z10) {
        int i3 = zVar.f55696c;
        int i10 = zVar.f55699g;
        if (i10 != Integer.MIN_VALUE) {
            if (i3 < 0) {
                zVar.f55699g = i10 + i3;
            }
            c1(eVar, zVar);
        }
        int i11 = zVar.f55696c + zVar.h;
        while (true) {
            if ((!zVar.f55703l && i11 <= 0) || !zVar.b(a1Var)) {
                break;
            }
            m2.j jVar = this.D;
            jVar.f18893a = 0;
            jVar.f18894b = false;
            jVar.f18895c = false;
            jVar.d = false;
            Z0(eVar, a1Var, zVar, jVar);
            if (!jVar.f18894b) {
                int i12 = zVar.f55695b;
                int i13 = jVar.f18893a;
                zVar.f55695b = (zVar.f55698f * i13) + i12;
                if (!jVar.f18895c || zVar.f55702k != null || !a1Var.f55495g) {
                    zVar.f55696c -= i13;
                    i11 -= i13;
                }
                int i14 = zVar.f55699g;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + i13;
                    zVar.f55699g = i15;
                    int i16 = zVar.f55696c;
                    if (i16 < 0) {
                        zVar.f55699g = i15 + i16;
                    }
                    c1(eVar, zVar);
                }
                if (z10 && jVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i3 - zVar.f55696c;
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

    public final View O0(int i3, int i10) {
        int i11;
        int i12;
        G0();
        if (i10 > i3 || i10 < i3) {
            if (this.f55511q.d(q(i3)) < this.f55511q.j()) {
                i11 = 16644;
                i12 = 16388;
            } else {
                i11 = 4161;
                i12 = 4097;
            }
            if (this.f55509o == 0) {
                return this.f55631c.g(i3, i10, i11, i12);
            }
            return this.d.g(i3, i10, i11, i12);
        }
        return q(i3);
    }

    public final View P0(int i3, int i10, boolean z10, boolean z11) {
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
        if (this.f55509o == 0) {
            return this.f55631c.g(i3, i10, i11, i12);
        }
        return this.d.g(i3, i10, i11, i12);
    }

    public View Q0(tf.e eVar, a1 a1Var, int i3, int i10, int i11) {
        int j10;
        int i12;
        G0();
        if (this.f55512r) {
            j10 = 0;
        } else {
            j10 = this.f55511q.j();
        }
        int f10 = this.f55511q.f();
        if (i10 > i3) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        View view = null;
        View view2 = null;
        while (i3 != i10) {
            View q10 = q(i3);
            int H = o0.H(q10);
            if (H >= 0 && H < i11) {
                if (((p0) q10.getLayoutParams()).f55645a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else if (this.f55511q.d(q10) < f10 && this.f55511q.a(q10) >= j10) {
                    return q10;
                } else {
                    if (view == null) {
                        view = q10;
                    }
                }
            }
            i3 += i12;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override
    public View R(View view, int i3, tf.e eVar, a1 a1Var) {
        int F0;
        View O0;
        View U0;
        f1();
        if (r() != 0 && (F0 = F0(i3)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.f55511q.k() * 0.33333334f), false, a1Var);
            z zVar = this.f55510p;
            zVar.f55699g = Integer.MIN_VALUE;
            zVar.f55694a = false;
            H0(eVar, zVar, a1Var, true);
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

    public final int S0(int i3, tf.e eVar, a1 a1Var, boolean z10) {
        int f10;
        int f11;
        if (this.G && this.H && (f10 = this.f55511q.f() - i3) > 0) {
            int i10 = -g1(-f10, eVar, a1Var);
            int i11 = i3 + i10;
            if (z10 && (f11 = this.f55511q.f() - i11) > 0) {
                this.f55511q.n(f11);
                return f11 + i10;
            }
            return i10;
        }
        return 0;
    }

    public final int T0(int i3, tf.e eVar, a1 a1Var, boolean z10) {
        int X0;
        int j10;
        if (this.G && (X0 = i3 - X0()) > 0) {
            int i10 = -g1(X0, eVar, a1Var);
            int i11 = i3 + i10;
            if (z10 && (j10 = i11 - this.f55511q.j()) > 0) {
                this.f55511q.n(-j10);
                return i10 - j10;
            }
            return i10;
        }
        return 0;
    }

    public final View U0() {
        int r5;
        if (this.v) {
            r5 = 0;
        } else {
            r5 = r() - 1;
        }
        return q(r5);
    }

    public final View V0() {
        int i3;
        if (this.v) {
            i3 = r() - 1;
        } else {
            i3 = 0;
        }
        return q(i3);
    }

    public int W0(a1 a1Var) {
        if (a1Var.f55490a != -1) {
            return this.f55511q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f55511q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f55630b;
        WeakHashMap weakHashMap = r0.i0.f54015a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Z0(tf.e eVar, a1 a1Var, z zVar, m2.j jVar) {
        boolean z10;
        int i3;
        int i10;
        int i11;
        int i12;
        boolean z11;
        View c2 = zVar.c(eVar);
        if (c2 == null) {
            jVar.f18894b = true;
            return;
        }
        p0 p0Var = (p0) c2.getLayoutParams();
        if (zVar.f55702k == null) {
            boolean z12 = this.v;
            if (zVar.f55698f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                a(-1, c2, false);
            } else {
                a(0, c2, false);
            }
        } else {
            boolean z13 = this.v;
            if (zVar.f55698f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                a(-1, c2, true);
            } else {
                a(0, c2, true);
            }
        }
        P(c2);
        jVar.f18893a = this.f55511q.b(c2);
        if (this.f55509o == 1) {
            if (Y0()) {
                i12 = this.f55639m - E();
                i3 = i12 - this.f55511q.c(c2);
            } else {
                i3 = D();
                i12 = this.f55511q.c(c2) + i3;
            }
            if (zVar.f55698f == -1) {
                i10 = zVar.f55695b;
                i11 = i10 - jVar.f18893a;
            } else {
                i11 = zVar.f55695b;
                i10 = jVar.f18893a + i11;
            }
        } else {
            int F = F();
            int c10 = this.f55511q.c(c2) + F;
            if (zVar.f55698f == -1) {
                int i13 = zVar.f55695b;
                int i14 = i13 - jVar.f18893a;
                i12 = i13;
                i10 = c10;
                i3 = i14;
                i11 = F;
            } else {
                int i15 = zVar.f55695b;
                int i16 = jVar.f18893a + i15;
                i3 = i15;
                i10 = c10;
                i11 = F;
                i12 = i16;
            }
        }
        o0.O(c2, i3, i11, i12, i10);
        if (p0Var.f55645a.j() || p0Var.f55645a.m()) {
            jVar.f18895c = true;
        }
        jVar.d = c2.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f55630b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(tf.e r18, u4.a1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: u4.b0.b0(tf.e, u4.a1):void");
    }

    public void b1(View view, View view2, int i3, int i10) {
        boolean z10;
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = o0.H(view);
        int H2 = o0.H(view2);
        if (H < H2) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (this.v) {
            if (z10) {
                h1(H2, this.f55511q.f() - (this.f55511q.b(view) + this.f55511q.d(view2)));
                return;
            }
            h1(H2, this.f55511q.f() - this.f55511q.a(view2));
        } else if (z10) {
            h1(H2, this.f55511q.d(view2));
        } else {
            h1(H2, this.f55511q.a(view2) - this.f55511q.b(view));
        }
    }

    @Override
    public void c0(a1 a1Var) {
        this.B = null;
        this.f55518y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.g();
    }

    public final void c1(tf.e eVar, z zVar) {
        d1 T;
        d1 T2;
        if (zVar.f55694a && !zVar.f55703l) {
            int i3 = zVar.f55699g;
            int i10 = zVar.f55700i;
            if (zVar.f55698f == -1) {
                int r5 = r();
                if (i3 >= 0) {
                    int e10 = (this.f55511q.e() - i3) + i10;
                    if (this.v) {
                        for (int i11 = 0; i11 < r5; i11++) {
                            View q10 = q(i11);
                            if (q10 != null && (T2 = this.f55630b.T(q10)) != null && !T2.r() && (this.f55511q.d(q10) < e10 || this.f55511q.m(q10) < e10)) {
                                d1(eVar, 0, i11);
                                return;
                            }
                        }
                        return;
                    }
                    int i12 = r5 - 1;
                    for (int i13 = i12; i13 >= 0; i13--) {
                        View q11 = q(i13);
                        if (q11 != null && (T = this.f55630b.T(q11)) != null && !T.r() && (this.f55511q.d(q11) < e10 || this.f55511q.m(q11) < e10)) {
                            d1(eVar, i12, i13);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            e1(eVar, i3, i10);
        }
    }

    @Override
    public final boolean d() {
        if (!this.f55515u && this.f55509o == 0) {
            return true;
        }
        return false;
    }

    public final void d1(tf.e eVar, int i3, int i10) {
        if (i3 != i10) {
            if (i10 > i3) {
                for (int i11 = i10 - 1; i11 >= i3; i11--) {
                    i0(i11, eVar);
                }
                return;
            }
            while (i3 > i10) {
                i0(i3, eVar);
                i3--;
            }
        }
    }

    @Override
    public boolean e() {
        if (!this.f55515u && this.f55509o == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final a0 e0() {
        a0 a0Var = this.B;
        if (a0Var != null) {
            ?? obj = new Object();
            obj.f55487a = a0Var.f55487a;
            obj.f55488b = a0Var.f55488b;
            obj.f55489c = a0Var.f55489c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            G0();
            boolean z10 = this.f55513s ^ this.v;
            obj2.f55489c = z10;
            if (z10) {
                View U0 = U0();
                obj2.f55488b = this.f55511q.f() - this.f55511q.a(U0);
                obj2.f55487a = ((p0) U0.getLayoutParams()).b();
                return obj2;
            }
            View V0 = V0();
            obj2.f55487a = o0.H(V0);
            obj2.f55488b = this.f55511q.d(V0) - this.f55511q.j();
            return obj2;
        }
        obj2.f55487a = -1;
        return obj2;
    }

    public void e1(tf.e eVar, int i3, int i10) {
        d1 T;
        d1 T2;
        if (i3 >= 0) {
            int i11 = i3 - i10;
            int r5 = r();
            if (this.v) {
                int i12 = r5 - 1;
                for (int i13 = i12; i13 >= 0; i13--) {
                    View q10 = q(i13);
                    if (q10 != null && (T2 = this.f55630b.T(q10)) != null && !T2.r() && (this.f55511q.a(q10) > i11 || this.f55511q.l(q10) > i11)) {
                        d1(eVar, i12, i13);
                        return;
                    }
                }
                return;
            }
            for (int i14 = 0; i14 < r5; i14++) {
                View q11 = q(i14);
                if (q11 != null && (T = this.f55630b.T(q11)) != null && !T.r() && (this.f55511q.a(q11) > i11 || this.f55511q.l(q11) > i11)) {
                    d1(eVar, 0, i14);
                    return;
                }
            }
        }
    }

    public final void f1() {
        if (this.f55509o != 1 && Y0()) {
            this.v = !this.f55514t;
        } else {
            this.v = this.f55514t;
        }
    }

    public final int g1(int i3, tf.e eVar, a1 a1Var) {
        int i10;
        if (r() == 0 || i3 == 0) {
            return 0;
        }
        G0();
        this.f55510p.f55694a = true;
        if (i3 > 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int abs = Math.abs(i3);
        m1(i10, abs, true, a1Var);
        z zVar = this.f55510p;
        int H0 = H0(eVar, zVar, a1Var, false) + zVar.f55699g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i3 = i10 * H0;
        }
        this.f55511q.n(-i3);
        this.f55510p.f55701j = i3;
        return i3;
    }

    @Override
    public int h(a1 a1Var) {
        return C0(a1Var);
    }

    public void h1(int i3, int i10) {
        i1(i3, i10, this.v);
    }

    @Override
    public int i(a1 a1Var) {
        return D0(a1Var);
    }

    public void i1(int i3, int i10, boolean z10) {
        if (this.f55518y == i3 && this.A == i10 && this.f55519z == z10) {
            return;
        }
        this.f55518y = i3;
        this.A = i10;
        this.f55519z = z10;
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0Var.f55487a = -1;
        }
        l0();
    }

    @Override
    public int j(a1 a1Var) {
        return B0(a1Var);
    }

    public final void j1(int i3) {
        e0 e0Var;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException(p1.i(i3, "invalid orientation:"));
        }
        b(null);
        if (i3 == this.f55509o && this.f55511q != null) {
            return;
        }
        if (i3 != 0) {
            if (i3 == 1) {
                e0Var = new e0(this, 1);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            e0Var = new e0(this, 0);
        }
        this.f55511q = e0Var;
        this.C.f16663f = e0Var;
        this.f55509o = i3;
        l0();
    }

    @Override
    public int k(a1 a1Var) {
        return C0(a1Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.f55514t) {
            return;
        }
        this.f55514t = z10;
        l0();
    }

    @Override
    public int l(a1 a1Var) {
        return D0(a1Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.f55516w == z10) {
            return;
        }
        this.f55516w = z10;
        l0();
    }

    @Override
    public final View m(int i3) {
        int r5 = r();
        if (r5 != 0) {
            int H = i3 - o0.H(q(0));
            if (H >= 0 && H < r5) {
                View q10 = q(H);
                if (o0.H(q10) == i3) {
                    return q10;
                }
            }
            int r9 = r();
            for (int i10 = 0; i10 < r9; i10++) {
                View q11 = q(i10);
                d1 U = RecyclerView.U(q11);
                if (U != null && U.c() == i3 && !U.r() && (this.f55630b.f2300v0.f55495g || !U.j())) {
                    return q11;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int m0(int i3, tf.e eVar, a1 a1Var) {
        if (this.f55509o == 1) {
            return 0;
        }
        return g1(i3, eVar, a1Var);
    }

    public final void m1(int i3, int i10, boolean z10, a1 a1Var) {
        boolean z11;
        int i11;
        int j10;
        z zVar = this.f55510p;
        boolean z12 = false;
        int i12 = 1;
        if (this.f55511q.h() == 0 && this.f55511q.e() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zVar.f55703l = z11;
        this.f55510p.f55698f = i3;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(a1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i3 == 1) {
            z12 = true;
        }
        z zVar2 = this.f55510p;
        if (z12) {
            i11 = max2;
        } else {
            i11 = max;
        }
        zVar2.h = i11;
        if (!z12) {
            max = max2;
        }
        zVar2.f55700i = max;
        if (z12) {
            zVar2.h = this.f55511q.g() + i11;
            View U0 = U0();
            z zVar3 = this.f55510p;
            if (this.v) {
                i12 = -1;
            }
            zVar3.f55697e = i12;
            int H = o0.H(U0);
            z zVar4 = this.f55510p;
            zVar3.d = H + zVar4.f55697e;
            zVar4.f55695b = this.f55511q.a(U0);
            j10 = this.f55511q.a(U0) - this.f55511q.f();
        } else {
            View V0 = V0();
            z zVar5 = this.f55510p;
            zVar5.h = this.f55511q.j() + zVar5.h;
            z zVar6 = this.f55510p;
            if (!this.v) {
                i12 = -1;
            }
            zVar6.f55697e = i12;
            int H2 = o0.H(V0);
            z zVar7 = this.f55510p;
            zVar6.d = H2 + zVar7.f55697e;
            zVar7.f55695b = this.f55511q.d(V0);
            j10 = (-this.f55511q.d(V0)) + this.f55511q.j();
        }
        z zVar8 = this.f55510p;
        zVar8.f55696c = i10;
        if (z10) {
            zVar8.f55696c = i10 - j10;
        }
        zVar8.f55699g = j10;
    }

    @Override
    public p0 n() {
        return new p0(-2, -2);
    }

    @Override
    public void n0(int i3) {
        this.f55518y = i3;
        this.A = Integer.MIN_VALUE;
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0Var.f55487a = -1;
        }
        l0();
    }

    public final void n1(int i3, int i10) {
        int i11;
        this.f55510p.f55696c = this.f55511q.f() - i10;
        z zVar = this.f55510p;
        if (this.v) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        zVar.f55697e = i11;
        zVar.d = i3;
        zVar.f55698f = 1;
        zVar.f55695b = i10;
        zVar.f55699g = Integer.MIN_VALUE;
    }

    @Override
    public int o0(int i3, tf.e eVar, a1 a1Var) {
        if (this.f55509o == 0) {
            return 0;
        }
        return g1(i3, eVar, a1Var);
    }

    public final void o1(int i3, int i10) {
        int i11;
        this.f55510p.f55696c = i10 - this.f55511q.j();
        z zVar = this.f55510p;
        zVar.d = i3;
        if (this.v) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        zVar.f55697e = i11;
        zVar.f55698f = -1;
        zVar.f55695b = i10;
        zVar.f55699g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, a1 a1Var, int i3) {
        c0 c0Var = new c0(recyclerView.getContext());
        c0Var.f55704a = i3;
        w0(c0Var);
    }

    @Override
    public boolean y0() {
        if (this.B == null && this.f55513s == this.f55516w) {
            return true;
        }
        return false;
    }

    public void z0(a1 a1Var, int[] iArr) {
        int i3;
        int W0 = W0(a1Var);
        if (this.f55510p.f55698f == -1) {
            i3 = 0;
        } else {
            i3 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i3;
    }

    public b0(int i3, boolean z10) {
        this.f55509o = 1;
        this.f55512r = false;
        this.f55514t = false;
        this.f55515u = false;
        this.v = false;
        this.f55516w = false;
        this.f55517x = true;
        this.f55518y = -1;
        this.f55519z = true;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        k2.o0 o0Var = new k2.o0();
        o0Var.g();
        this.C = o0Var;
        this.D = new Object();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i3);
        k1(z10);
    }

    public void a1(tf.e eVar, a1 a1Var, k2.o0 o0Var, int i3) {
    }
}
