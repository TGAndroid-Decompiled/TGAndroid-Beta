package v4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public class b0 extends o0 {
    public int A;
    public a0 B;
    public final l2.l0 C;
    public final n2.j D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int f58489o;
    public z f58490p;
    public androidx.emoji2.text.g f58491q;
    public boolean f58492r;
    public boolean f58493s;
    public boolean f58494t;
    public boolean f58495u;
    public boolean v;
    public boolean f58496w;
    public final boolean f58497x;
    public int f58498y;
    public boolean f58499z;

    public b0() {
        this(1, false);
    }

    public void A0(b1 b1Var, z zVar, h2.f fVar) {
        int i7 = zVar.d;
        if (i7 >= 0 && i7 < b1Var.b()) {
            fVar.b(i7, Math.max(0, zVar.f58691g));
        }
    }

    public final int B0(b1 b1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f58491q;
            boolean z10 = this.f58497x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && b1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return Math.abs(((p0) K0.getLayoutParams()).b() - ((p0) J0.getLayoutParams()).b()) + 1;
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
            androidx.emoji2.text.g gVar = this.f58491q;
            boolean z10 = this.f58497x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && b1Var.b() != 0 && K0 != null && J0 != null) {
                int min = Math.min(((p0) K0.getLayoutParams()).b(), ((p0) J0.getLayoutParams()).b());
                int max2 = Math.max(((p0) K0.getLayoutParams()).b(), ((p0) J0.getLayoutParams()).b());
                if (z12) {
                    max = Math.max(0, (b1Var.b() - max2) - 1);
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

    public final int D0(b1 b1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f58491q;
            boolean z10 = this.f58497x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && b1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return b1Var.b();
                }
                return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((p0) K0.getLayoutParams()).b() - ((p0) J0.getLayoutParams()).b()) + 1)) * b1Var.b());
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
        if (i7 < o0.H(q(0))) {
            z10 = true;
        }
        if (z10 != this.v) {
            i10 = -1;
        }
        if (this.f58489o == 0) {
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
                            if (i7 == 130 && this.f58489o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f58489o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f58489o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f58489o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f58489o != 1 && Y0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f58489o == 1 || !Y0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void G0() {
        if (this.f58490p == null) {
            ?? obj = new Object();
            obj.f58686a = true;
            obj.h = 0;
            obj.f58692i = 0;
            obj.f58694k = null;
            this.f58490p = obj;
        }
    }

    public final int H0(w0 w0Var, z zVar, b1 b1Var, boolean z10) {
        int i7 = zVar.f58688c;
        int i10 = zVar.f58691g;
        if (i10 != Integer.MIN_VALUE) {
            if (i7 < 0) {
                zVar.f58691g = i10 + i7;
            }
            c1(w0Var, zVar);
        }
        int i11 = zVar.f58688c + zVar.h;
        while (true) {
            if ((!zVar.f58695l && i11 <= 0) || !zVar.b(b1Var)) {
                break;
            }
            n2.j jVar = this.D;
            jVar.f20775a = 0;
            jVar.f20776b = false;
            jVar.f20777c = false;
            jVar.d = false;
            Z0(w0Var, b1Var, zVar, jVar);
            if (!jVar.f20776b) {
                int i12 = zVar.f58687b;
                int i13 = jVar.f20775a;
                zVar.f58687b = (zVar.f58690f * i13) + i12;
                if (!jVar.f20777c || zVar.f58694k != null || !b1Var.f58505g) {
                    zVar.f58688c -= i13;
                    i11 -= i13;
                }
                int i14 = zVar.f58691g;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + i13;
                    zVar.f58691g = i15;
                    int i16 = zVar.f58688c;
                    if (i16 < 0) {
                        zVar.f58691g = i15 + i16;
                    }
                    c1(w0Var, zVar);
                }
                if (z10 && jVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i7 - zVar.f58688c;
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

    public final View O0(int i7, int i10) {
        int i11;
        int i12;
        G0();
        if (i10 > i7 || i10 < i7) {
            if (this.f58491q.d(q(i7)) < this.f58491q.j()) {
                i11 = 16644;
                i12 = 16388;
            } else {
                i11 = 4161;
                i12 = 4097;
            }
            if (this.f58489o == 0) {
                return this.f58623c.d(i7, i10, i11, i12);
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
        if (this.f58489o == 0) {
            return this.f58623c.d(i7, i10, i11, i12);
        }
        return this.d.d(i7, i10, i11, i12);
    }

    public View Q0(w0 w0Var, b1 b1Var, int i7, int i10, int i11) {
        int j3;
        int i12;
        G0();
        if (this.f58492r) {
            j3 = 0;
        } else {
            j3 = this.f58491q.j();
        }
        int f10 = this.f58491q.f();
        if (i10 > i7) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        View view = null;
        View view2 = null;
        while (i7 != i10) {
            View q10 = q(i7);
            int H = o0.H(q10);
            if (H >= 0 && H < i11) {
                if (((p0) q10.getLayoutParams()).f58637a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else if (this.f58491q.d(q10) < f10 && this.f58491q.a(q10) >= j3) {
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
    public View R(View view, int i7, w0 w0Var, b1 b1Var) {
        int F0;
        View O0;
        View U0;
        f1();
        if (r() != 0 && (F0 = F0(i7)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.f58491q.k() * 0.33333334f), false, b1Var);
            z zVar = this.f58490p;
            zVar.f58691g = Integer.MIN_VALUE;
            zVar.f58686a = false;
            H0(w0Var, zVar, b1Var, true);
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

    public final int S0(int i7, w0 w0Var, b1 b1Var, boolean z10) {
        int f10;
        int f11;
        if (this.G && this.H && (f10 = this.f58491q.f() - i7) > 0) {
            int i10 = -g1(-f10, w0Var, b1Var);
            int i11 = i7 + i10;
            if (z10 && (f11 = this.f58491q.f() - i11) > 0) {
                this.f58491q.n(f11);
                return f11 + i10;
            }
            return i10;
        }
        return 0;
    }

    public final int T0(int i7, w0 w0Var, b1 b1Var, boolean z10) {
        int X0;
        int j3;
        if (this.G && (X0 = i7 - X0()) > 0) {
            int i10 = -g1(X0, w0Var, b1Var);
            int i11 = i7 + i10;
            if (z10 && (j3 = i11 - this.f58491q.j()) > 0) {
                this.f58491q.n(-j3);
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

    public int W0(b1 b1Var) {
        if (b1Var.f58500a != -1) {
            return this.f58491q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f58491q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f58622b;
        WeakHashMap weakHashMap = r0.i0.f55671a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Z0(w0 w0Var, b1 b1Var, z zVar, n2.j jVar) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z11;
        View c10 = zVar.c(w0Var);
        if (c10 == null) {
            jVar.f20776b = true;
            return;
        }
        p0 p0Var = (p0) c10.getLayoutParams();
        if (zVar.f58694k == null) {
            boolean z12 = this.v;
            if (zVar.f58690f == -1) {
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
            if (zVar.f58690f == -1) {
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
        jVar.f20775a = this.f58491q.b(c10);
        if (this.f58489o == 1) {
            if (Y0()) {
                i12 = this.f58631m - E();
                i7 = i12 - this.f58491q.c(c10);
            } else {
                i7 = D();
                i12 = this.f58491q.c(c10) + i7;
            }
            if (zVar.f58690f == -1) {
                i10 = zVar.f58687b;
                i11 = i10 - jVar.f20775a;
            } else {
                i11 = zVar.f58687b;
                i10 = jVar.f20775a + i11;
            }
        } else {
            int F = F();
            int c11 = this.f58491q.c(c10) + F;
            if (zVar.f58690f == -1) {
                int i13 = zVar.f58687b;
                int i14 = i13 - jVar.f20775a;
                i12 = i13;
                i10 = c11;
                i7 = i14;
                i11 = F;
            } else {
                int i15 = zVar.f58687b;
                int i16 = jVar.f20775a + i15;
                i7 = i15;
                i10 = c11;
                i11 = F;
                i12 = i16;
            }
        }
        o0.O(c10, i7, i11, i12, i10);
        if (p0Var.f58637a.j() || p0Var.f58637a.m()) {
            jVar.f20777c = true;
        }
        jVar.d = c10.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f58622b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(v4.w0 r18, v4.b1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: v4.b0.b0(v4.w0, v4.b1):void");
    }

    public void b1(View view, View view2, int i7, int i10) {
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
                h1(H2, this.f58491q.f() - (this.f58491q.b(view) + this.f58491q.d(view2)));
                return;
            }
            h1(H2, this.f58491q.f() - this.f58491q.a(view2));
        } else if (z10) {
            h1(H2, this.f58491q.d(view2));
        } else {
            h1(H2, this.f58491q.a(view2) - this.f58491q.b(view));
        }
    }

    @Override
    public void c0(b1 b1Var) {
        this.B = null;
        this.f58498y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.g();
    }

    public final void c1(w0 w0Var, z zVar) {
        e1 T;
        e1 T2;
        if (zVar.f58686a && !zVar.f58695l) {
            int i7 = zVar.f58691g;
            int i10 = zVar.f58692i;
            if (zVar.f58690f == -1) {
                int r10 = r();
                if (i7 >= 0) {
                    int e10 = (this.f58491q.e() - i7) + i10;
                    if (this.v) {
                        for (int i11 = 0; i11 < r10; i11++) {
                            View q10 = q(i11);
                            if (q10 != null && (T2 = this.f58622b.T(q10)) != null && !T2.r() && (this.f58491q.d(q10) < e10 || this.f58491q.m(q10) < e10)) {
                                d1(w0Var, 0, i11);
                                return;
                            }
                        }
                        return;
                    }
                    int i12 = r10 - 1;
                    for (int i13 = i12; i13 >= 0; i13--) {
                        View q11 = q(i13);
                        if (q11 != null && (T = this.f58622b.T(q11)) != null && !T.r() && (this.f58491q.d(q11) < e10 || this.f58491q.m(q11) < e10)) {
                            d1(w0Var, i12, i13);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            e1(w0Var, i7, i10);
        }
    }

    @Override
    public final boolean d() {
        if (!this.f58495u && this.f58489o == 0) {
            return true;
        }
        return false;
    }

    public final void d1(w0 w0Var, int i7, int i10) {
        if (i7 != i10) {
            if (i10 > i7) {
                for (int i11 = i10 - 1; i11 >= i7; i11--) {
                    i0(i11, w0Var);
                }
                return;
            }
            while (i7 > i10) {
                i0(i7, w0Var);
                i7--;
            }
        }
    }

    @Override
    public boolean e() {
        if (!this.f58495u && this.f58489o == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final a0 e0() {
        a0 a0Var = this.B;
        if (a0Var != null) {
            ?? obj = new Object();
            obj.f58477a = a0Var.f58477a;
            obj.f58478b = a0Var.f58478b;
            obj.f58479c = a0Var.f58479c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            G0();
            boolean z10 = this.f58493s ^ this.v;
            obj2.f58479c = z10;
            if (z10) {
                View U0 = U0();
                obj2.f58478b = this.f58491q.f() - this.f58491q.a(U0);
                obj2.f58477a = ((p0) U0.getLayoutParams()).b();
                return obj2;
            }
            View V0 = V0();
            obj2.f58477a = o0.H(V0);
            obj2.f58478b = this.f58491q.d(V0) - this.f58491q.j();
            return obj2;
        }
        obj2.f58477a = -1;
        return obj2;
    }

    public void e1(w0 w0Var, int i7, int i10) {
        e1 T;
        e1 T2;
        if (i7 >= 0) {
            int i11 = i7 - i10;
            int r10 = r();
            if (this.v) {
                int i12 = r10 - 1;
                for (int i13 = i12; i13 >= 0; i13--) {
                    View q10 = q(i13);
                    if (q10 != null && (T2 = this.f58622b.T(q10)) != null && !T2.r() && (this.f58491q.a(q10) > i11 || this.f58491q.l(q10) > i11)) {
                        d1(w0Var, i12, i13);
                        return;
                    }
                }
                return;
            }
            for (int i14 = 0; i14 < r10; i14++) {
                View q11 = q(i14);
                if (q11 != null && (T = this.f58622b.T(q11)) != null && !T.r() && (this.f58491q.a(q11) > i11 || this.f58491q.l(q11) > i11)) {
                    d1(w0Var, 0, i14);
                    return;
                }
            }
        }
    }

    public final void f1() {
        if (this.f58489o != 1 && Y0()) {
            this.v = !this.f58494t;
        } else {
            this.v = this.f58494t;
        }
    }

    public final int g1(int i7, w0 w0Var, b1 b1Var) {
        int i10;
        if (r() == 0 || i7 == 0) {
            return 0;
        }
        G0();
        this.f58490p.f58686a = true;
        if (i7 > 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int abs = Math.abs(i7);
        m1(i10, abs, true, b1Var);
        z zVar = this.f58490p;
        int H0 = H0(w0Var, zVar, b1Var, false) + zVar.f58691g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i7 = i10 * H0;
        }
        this.f58491q.n(-i7);
        this.f58490p.f58693j = i7;
        return i7;
    }

    @Override
    public int h(b1 b1Var) {
        return C0(b1Var);
    }

    public void h1(int i7, int i10) {
        i1(i7, i10, this.v);
    }

    @Override
    public int i(b1 b1Var) {
        return D0(b1Var);
    }

    public void i1(int i7, int i10, boolean z10) {
        if (this.f58498y == i7 && this.A == i10 && this.f58499z == z10) {
            return;
        }
        this.f58498y = i7;
        this.A = i10;
        this.f58499z = z10;
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0Var.f58477a = -1;
        }
        l0();
    }

    @Override
    public int j(b1 b1Var) {
        return B0(b1Var);
    }

    public final void j1(int i7) {
        e0 e0Var;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(i5.c.i(i7, "invalid orientation:"));
        }
        b(null);
        if (i7 == this.f58489o && this.f58491q != null) {
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
        this.f58491q = e0Var;
        this.C.f19069f = e0Var;
        this.f58489o = i7;
        l0();
    }

    @Override
    public int k(b1 b1Var) {
        return C0(b1Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.f58494t) {
            return;
        }
        this.f58494t = z10;
        l0();
    }

    @Override
    public int l(b1 b1Var) {
        return D0(b1Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.f58496w == z10) {
            return;
        }
        this.f58496w = z10;
        l0();
    }

    @Override
    public final View m(int i7) {
        int r10 = r();
        if (r10 != 0) {
            int H = i7 - o0.H(q(0));
            if (H >= 0 && H < r10) {
                View q10 = q(H);
                if (o0.H(q10) == i7) {
                    return q10;
                }
            }
            int r11 = r();
            for (int i10 = 0; i10 < r11; i10++) {
                View q11 = q(i10);
                e1 U = RecyclerView.U(q11);
                if (U != null && U.c() == i7 && !U.r() && (this.f58622b.f2825v0.f58505g || !U.j())) {
                    return q11;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int m0(int i7, w0 w0Var, b1 b1Var) {
        if (this.f58489o == 1) {
            return 0;
        }
        return g1(i7, w0Var, b1Var);
    }

    public final void m1(int i7, int i10, boolean z10, b1 b1Var) {
        boolean z11;
        int i11;
        int j3;
        z zVar = this.f58490p;
        boolean z12 = false;
        int i12 = 1;
        if (this.f58491q.h() == 0 && this.f58491q.e() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zVar.f58695l = z11;
        this.f58490p.f58690f = i7;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(b1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i7 == 1) {
            z12 = true;
        }
        z zVar2 = this.f58490p;
        if (z12) {
            i11 = max2;
        } else {
            i11 = max;
        }
        zVar2.h = i11;
        if (!z12) {
            max = max2;
        }
        zVar2.f58692i = max;
        if (z12) {
            zVar2.h = this.f58491q.g() + i11;
            View U0 = U0();
            z zVar3 = this.f58490p;
            if (this.v) {
                i12 = -1;
            }
            zVar3.f58689e = i12;
            int H = o0.H(U0);
            z zVar4 = this.f58490p;
            zVar3.d = H + zVar4.f58689e;
            zVar4.f58687b = this.f58491q.a(U0);
            j3 = this.f58491q.a(U0) - this.f58491q.f();
        } else {
            View V0 = V0();
            z zVar5 = this.f58490p;
            zVar5.h = this.f58491q.j() + zVar5.h;
            z zVar6 = this.f58490p;
            if (!this.v) {
                i12 = -1;
            }
            zVar6.f58689e = i12;
            int H2 = o0.H(V0);
            z zVar7 = this.f58490p;
            zVar6.d = H2 + zVar7.f58689e;
            zVar7.f58687b = this.f58491q.d(V0);
            j3 = (-this.f58491q.d(V0)) + this.f58491q.j();
        }
        z zVar8 = this.f58490p;
        zVar8.f58688c = i10;
        if (z10) {
            zVar8.f58688c = i10 - j3;
        }
        zVar8.f58691g = j3;
    }

    @Override
    public p0 n() {
        return new p0(-2, -2);
    }

    @Override
    public void n0(int i7) {
        this.f58498y = i7;
        this.A = Integer.MIN_VALUE;
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0Var.f58477a = -1;
        }
        l0();
    }

    public final void n1(int i7, int i10) {
        int i11;
        this.f58490p.f58688c = this.f58491q.f() - i10;
        z zVar = this.f58490p;
        if (this.v) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        zVar.f58689e = i11;
        zVar.d = i7;
        zVar.f58690f = 1;
        zVar.f58687b = i10;
        zVar.f58691g = Integer.MIN_VALUE;
    }

    @Override
    public int o0(int i7, w0 w0Var, b1 b1Var) {
        if (this.f58489o == 0) {
            return 0;
        }
        return g1(i7, w0Var, b1Var);
    }

    public final void o1(int i7, int i10) {
        int i11;
        this.f58490p.f58688c = i10 - this.f58491q.j();
        z zVar = this.f58490p;
        zVar.d = i7;
        if (this.v) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        zVar.f58689e = i11;
        zVar.f58690f = -1;
        zVar.f58687b = i10;
        zVar.f58691g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, b1 b1Var, int i7) {
        c0 c0Var = new c0(recyclerView.getContext());
        c0Var.f58480a = i7;
        w0(c0Var);
    }

    @Override
    public boolean y0() {
        if (this.B == null && this.f58493s == this.f58496w) {
            return true;
        }
        return false;
    }

    public void z0(b1 b1Var, int[] iArr) {
        int i7;
        int W0 = W0(b1Var);
        if (this.f58490p.f58690f == -1) {
            i7 = 0;
        } else {
            i7 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i7;
    }

    public b0(int i7, boolean z10) {
        this.f58489o = 1;
        this.f58492r = false;
        this.f58494t = false;
        this.f58495u = false;
        this.v = false;
        this.f58496w = false;
        this.f58497x = true;
        this.f58498y = -1;
        this.f58499z = true;
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

    public void a1(w0 w0Var, b1 b1Var, l2.l0 l0Var, int i7) {
    }
}
