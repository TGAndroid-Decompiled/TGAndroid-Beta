package s4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public class a0 extends n0 {
    public int A;
    public z B;
    public final i2.p0 C;
    public final k2.k D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int f47868o;
    public y f47869p;
    public androidx.emoji2.text.g f47870q;
    public boolean f47871r;
    public boolean f47872s;
    public boolean f47873t;
    public boolean f47874u;
    public boolean v;
    public boolean f47875w;
    public final boolean f47876x;
    public int f47877y;
    public boolean f47878z;

    public a0() {
        this(1, false);
    }

    public void A0(z0 z0Var, y yVar, e2.f fVar) {
        int i10 = yVar.d;
        if (i10 >= 0 && i10 < z0Var.b()) {
            fVar.b(i10, Math.max(0, yVar.f48040g));
        }
    }

    public final int B0(z0 z0Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f47870q;
            boolean z10 = this.f47876x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && z0Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1;
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
            androidx.emoji2.text.g gVar = this.f47870q;
            boolean z10 = this.f47876x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && z0Var.b() != 0 && K0 != null && J0 != null) {
                int min = Math.min(((o0) K0.getLayoutParams()).b(), ((o0) J0.getLayoutParams()).b());
                int max2 = Math.max(((o0) K0.getLayoutParams()).b(), ((o0) J0.getLayoutParams()).b());
                if (z12) {
                    max = Math.max(0, (z0Var.b() - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!z10) {
                    return max;
                }
                return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
            }
        }
        return 0;
    }

    public final int D0(z0 z0Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f47870q;
            boolean z10 = this.f47876x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && z0Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return z0Var.b();
                }
                return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1)) * z0Var.b());
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
        if (i10 < n0.H(q(0))) {
            z10 = true;
        }
        if (z10 != this.v) {
            i11 = -1;
        }
        if (this.f47868o == 0) {
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
                            if (i10 == 130 && this.f47868o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f47868o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f47868o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f47868o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f47868o != 1 && Y0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f47868o == 1 || !Y0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void G0() {
        if (this.f47869p == null) {
            ?? obj = new Object();
            obj.f48036a = true;
            obj.h = 0;
            obj.f48041i = 0;
            obj.f48043k = null;
            this.f47869p = obj;
        }
    }

    public final int H0(hf.e eVar, y yVar, z0 z0Var, boolean z10) {
        int i10 = yVar.f48038c;
        int i11 = yVar.f48040g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                yVar.f48040g = i11 + i10;
            }
            c1(eVar, yVar);
        }
        int i12 = yVar.f48038c + yVar.h;
        while (true) {
            if ((!yVar.f48044l && i12 <= 0) || !yVar.b(z0Var)) {
                break;
            }
            k2.k kVar = this.D;
            kVar.f10690a = 0;
            kVar.f10691b = false;
            kVar.f10692c = false;
            kVar.d = false;
            Z0(eVar, z0Var, yVar, kVar);
            if (!kVar.f10691b) {
                int i13 = yVar.f48037b;
                int i14 = kVar.f10690a;
                yVar.f48037b = (yVar.f48039f * i14) + i13;
                if (!kVar.f10692c || yVar.f48043k != null || !z0Var.f48057g) {
                    yVar.f48038c -= i14;
                    i12 -= i14;
                }
                int i15 = yVar.f48040g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    yVar.f48040g = i16;
                    int i17 = yVar.f48038c;
                    if (i17 < 0) {
                        yVar.f48040g = i16 + i17;
                    }
                    c1(eVar, yVar);
                }
                if (z10 && kVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - yVar.f48038c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((o0) P0.getLayoutParams()).b();
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

    public final View O0(int i10, int i11) {
        int i12;
        int i13;
        G0();
        if (i11 > i10 || i11 < i10) {
            if (this.f47870q.d(q(i10)) < this.f47870q.j()) {
                i12 = 16644;
                i13 = 16388;
            } else {
                i12 = 4161;
                i13 = 4097;
            }
            if (this.f47868o == 0) {
                return this.f47980c.I(i10, i11, i12, i13);
            }
            return this.d.I(i10, i11, i12, i13);
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
        if (this.f47868o == 0) {
            return this.f47980c.I(i10, i11, i12, i13);
        }
        return this.d.I(i10, i11, i12, i13);
    }

    public View Q0(hf.e eVar, z0 z0Var, int i10, int i11, int i12) {
        int j10;
        int i13;
        G0();
        if (this.f47871r) {
            j10 = 0;
        } else {
            j10 = this.f47870q.j();
        }
        int f7 = this.f47870q.f();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q6 = q(i10);
            int H = n0.H(q6);
            if (H >= 0 && H < i12) {
                if (((o0) q6.getLayoutParams()).f47992a.j()) {
                    if (view2 == null) {
                        view2 = q6;
                    }
                } else if (this.f47870q.d(q6) < f7 && this.f47870q.a(q6) >= j10) {
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
    public View R(View view, int i10, hf.e eVar, z0 z0Var) {
        int F0;
        View O0;
        View U0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.f47870q.k() * 0.33333334f), false, z0Var);
            y yVar = this.f47869p;
            yVar.f48040g = Integer.MIN_VALUE;
            yVar.f48036a = false;
            H0(eVar, yVar, z0Var, true);
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

    public final int S0(int i10, hf.e eVar, z0 z0Var, boolean z10) {
        int f7;
        int f10;
        if (this.G && this.H && (f7 = this.f47870q.f() - i10) > 0) {
            int i11 = -g1(-f7, eVar, z0Var);
            int i12 = i10 + i11;
            if (z10 && (f10 = this.f47870q.f() - i12) > 0) {
                this.f47870q.n(f10);
                return f10 + i11;
            }
            return i11;
        }
        return 0;
    }

    public final int T0(int i10, hf.e eVar, z0 z0Var, boolean z10) {
        int X0;
        int j10;
        if (this.G && (X0 = i10 - X0()) > 0) {
            int i11 = -g1(X0, eVar, z0Var);
            int i12 = i10 + i11;
            if (z10 && (j10 = i12 - this.f47870q.j()) > 0) {
                this.f47870q.n(-j10);
                return i11 - j10;
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
        if (z0Var.f48053a != -1) {
            return this.f47870q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f47870q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f47979b;
        WeakHashMap weakHashMap = r0.h0.f46123a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Z0(hf.e eVar, z0 z0Var, y yVar, k2.k kVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        View c10 = yVar.c(eVar);
        if (c10 == null) {
            kVar.f10691b = true;
            return;
        }
        o0 o0Var = (o0) c10.getLayoutParams();
        if (yVar.f48043k == null) {
            boolean z12 = this.v;
            if (yVar.f48039f == -1) {
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
            if (yVar.f48039f == -1) {
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
        kVar.f10690a = this.f47870q.b(c10);
        if (this.f47868o == 1) {
            if (Y0()) {
                i13 = this.f47987m - E();
                i10 = i13 - this.f47870q.c(c10);
            } else {
                i10 = D();
                i13 = this.f47870q.c(c10) + i10;
            }
            if (yVar.f48039f == -1) {
                i11 = yVar.f48037b;
                i12 = i11 - kVar.f10690a;
            } else {
                i12 = yVar.f48037b;
                i11 = kVar.f10690a + i12;
            }
        } else {
            int F = F();
            int c11 = this.f47870q.c(c10) + F;
            if (yVar.f48039f == -1) {
                int i14 = yVar.f48037b;
                int i15 = i14 - kVar.f10690a;
                i13 = i14;
                i11 = c11;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = yVar.f48037b;
                int i17 = kVar.f10690a + i16;
                i10 = i16;
                i11 = c11;
                i12 = F;
                i13 = i17;
            }
        }
        n0.O(c10, i10, i12, i13, i11);
        if (o0Var.f47992a.j() || o0Var.f47992a.m()) {
            kVar.f10692c = true;
        }
        kVar.d = c10.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f47979b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(hf.e r18, s4.z0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: s4.a0.b0(hf.e, s4.z0):void");
    }

    public void b1(View view, View view2, int i10, int i11) {
        boolean z10;
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = n0.H(view);
        int H2 = n0.H(view2);
        if (H < H2) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (this.v) {
            if (z10) {
                h1(H2, this.f47870q.f() - (this.f47870q.b(view) + this.f47870q.d(view2)));
                return;
            }
            h1(H2, this.f47870q.f() - this.f47870q.a(view2));
        } else if (z10) {
            h1(H2, this.f47870q.d(view2));
        } else {
            h1(H2, this.f47870q.a(view2) - this.f47870q.b(view));
        }
    }

    @Override
    public void c0(z0 z0Var) {
        this.B = null;
        this.f47877y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.g();
    }

    public final void c1(hf.e eVar, y yVar) {
        c1 T;
        c1 T2;
        if (yVar.f48036a && !yVar.f48044l) {
            int i10 = yVar.f48040g;
            int i11 = yVar.f48041i;
            if (yVar.f48039f == -1) {
                int r10 = r();
                if (i10 >= 0) {
                    int e = (this.f47870q.e() - i10) + i11;
                    if (this.v) {
                        for (int i12 = 0; i12 < r10; i12++) {
                            View q6 = q(i12);
                            if (q6 != null && (T2 = this.f47979b.T(q6)) != null && !T2.r() && (this.f47870q.d(q6) < e || this.f47870q.m(q6) < e)) {
                                d1(eVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = r10 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View q10 = q(i14);
                        if (q10 != null && (T = this.f47979b.T(q10)) != null && !T.r() && (this.f47870q.d(q10) < e || this.f47870q.m(q10) < e)) {
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
        if (!this.f47874u && this.f47868o == 0) {
            return true;
        }
        return false;
    }

    public final void d1(hf.e eVar, int i10, int i11) {
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
        if (!this.f47874u && this.f47868o == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final z e0() {
        z zVar = this.B;
        if (zVar != null) {
            ?? obj = new Object();
            obj.f48050a = zVar.f48050a;
            obj.f48051b = zVar.f48051b;
            obj.f48052c = zVar.f48052c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            G0();
            boolean z10 = this.f47872s ^ this.v;
            obj2.f48052c = z10;
            if (z10) {
                View U0 = U0();
                obj2.f48051b = this.f47870q.f() - this.f47870q.a(U0);
                obj2.f48050a = ((o0) U0.getLayoutParams()).b();
                return obj2;
            }
            View V0 = V0();
            obj2.f48050a = n0.H(V0);
            obj2.f48051b = this.f47870q.d(V0) - this.f47870q.j();
            return obj2;
        }
        obj2.f48050a = -1;
        return obj2;
    }

    public void e1(hf.e eVar, int i10, int i11) {
        c1 T;
        c1 T2;
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int r10 = r();
            if (this.v) {
                int i13 = r10 - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View q6 = q(i14);
                    if (q6 != null && (T2 = this.f47979b.T(q6)) != null && !T2.r() && (this.f47870q.a(q6) > i12 || this.f47870q.l(q6) > i12)) {
                        d1(eVar, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < r10; i15++) {
                View q10 = q(i15);
                if (q10 != null && (T = this.f47979b.T(q10)) != null && !T.r() && (this.f47870q.a(q10) > i12 || this.f47870q.l(q10) > i12)) {
                    d1(eVar, 0, i15);
                    return;
                }
            }
        }
    }

    public final void f1() {
        if (this.f47868o != 1 && Y0()) {
            this.v = !this.f47873t;
        } else {
            this.v = this.f47873t;
        }
    }

    public final int g1(int i10, hf.e eVar, z0 z0Var) {
        int i11;
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.f47869p.f48036a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        m1(i11, abs, true, z0Var);
        y yVar = this.f47869p;
        int H0 = H0(eVar, yVar, z0Var, false) + yVar.f48040g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i10 = i11 * H0;
        }
        this.f47870q.n(-i10);
        this.f47869p.f48042j = i10;
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
        if (this.f47877y == i10 && this.A == i11 && this.f47878z == z10) {
            return;
        }
        this.f47877y = i10;
        this.A = i11;
        this.f47878z = z10;
        z zVar = this.B;
        if (zVar != null) {
            zVar.f48050a = -1;
        }
        l0();
    }

    @Override
    public int j(z0 z0Var) {
        return B0(z0Var);
    }

    public final void j1(int i10) {
        d0 d0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(i0.a.i(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 == this.f47868o && this.f47870q != null) {
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                d0Var = new d0(this, 1);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            d0Var = new d0(this, 0);
        }
        this.f47870q = d0Var;
        this.C.f8019f = d0Var;
        this.f47868o = i10;
        l0();
    }

    @Override
    public int k(z0 z0Var) {
        return C0(z0Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.f47873t) {
            return;
        }
        this.f47873t = z10;
        l0();
    }

    @Override
    public int l(z0 z0Var) {
        return D0(z0Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.f47875w == z10) {
            return;
        }
        this.f47875w = z10;
        l0();
    }

    @Override
    public final View m(int i10) {
        int r10 = r();
        if (r10 != 0) {
            int H = i10 - n0.H(q(0));
            if (H >= 0 && H < r10) {
                View q6 = q(H);
                if (n0.H(q6) == i10) {
                    return q6;
                }
            }
            int r11 = r();
            for (int i11 = 0; i11 < r11; i11++) {
                View q10 = q(i11);
                c1 U = RecyclerView.U(q10);
                if (U != null && U.c() == i10 && !U.r() && (this.f47979b.f1918u0.f48057g || !U.j())) {
                    return q10;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int m0(int i10, hf.e eVar, z0 z0Var) {
        if (this.f47868o == 1) {
            return 0;
        }
        return g1(i10, eVar, z0Var);
    }

    public final void m1(int i10, int i11, boolean z10, z0 z0Var) {
        boolean z11;
        int i12;
        int j10;
        y yVar = this.f47869p;
        boolean z12 = false;
        int i13 = 1;
        if (this.f47870q.h() == 0 && this.f47870q.e() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        yVar.f48044l = z11;
        this.f47869p.f48039f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(z0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z12 = true;
        }
        y yVar2 = this.f47869p;
        if (z12) {
            i12 = max2;
        } else {
            i12 = max;
        }
        yVar2.h = i12;
        if (!z12) {
            max = max2;
        }
        yVar2.f48041i = max;
        if (z12) {
            yVar2.h = this.f47870q.g() + i12;
            View U0 = U0();
            y yVar3 = this.f47869p;
            if (this.v) {
                i13 = -1;
            }
            yVar3.e = i13;
            int H = n0.H(U0);
            y yVar4 = this.f47869p;
            yVar3.d = H + yVar4.e;
            yVar4.f48037b = this.f47870q.a(U0);
            j10 = this.f47870q.a(U0) - this.f47870q.f();
        } else {
            View V0 = V0();
            y yVar5 = this.f47869p;
            yVar5.h = this.f47870q.j() + yVar5.h;
            y yVar6 = this.f47869p;
            if (!this.v) {
                i13 = -1;
            }
            yVar6.e = i13;
            int H2 = n0.H(V0);
            y yVar7 = this.f47869p;
            yVar6.d = H2 + yVar7.e;
            yVar7.f48037b = this.f47870q.d(V0);
            j10 = (-this.f47870q.d(V0)) + this.f47870q.j();
        }
        y yVar8 = this.f47869p;
        yVar8.f48038c = i11;
        if (z10) {
            yVar8.f48038c = i11 - j10;
        }
        yVar8.f48040g = j10;
    }

    @Override
    public o0 n() {
        return new o0(-2, -2);
    }

    @Override
    public void n0(int i10) {
        this.f47877y = i10;
        this.A = Integer.MIN_VALUE;
        z zVar = this.B;
        if (zVar != null) {
            zVar.f48050a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        int i12;
        this.f47869p.f48038c = this.f47870q.f() - i11;
        y yVar = this.f47869p;
        if (this.v) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        yVar.e = i12;
        yVar.d = i10;
        yVar.f48039f = 1;
        yVar.f48037b = i11;
        yVar.f48040g = Integer.MIN_VALUE;
    }

    @Override
    public int o0(int i10, hf.e eVar, z0 z0Var) {
        if (this.f47868o == 0) {
            return 0;
        }
        return g1(i10, eVar, z0Var);
    }

    public final void o1(int i10, int i11) {
        int i12;
        this.f47869p.f48038c = i11 - this.f47870q.j();
        y yVar = this.f47869p;
        yVar.d = i10;
        if (this.v) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        yVar.e = i12;
        yVar.f48039f = -1;
        yVar.f48037b = i11;
        yVar.f48040g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, z0 z0Var, int i10) {
        b0 b0Var = new b0(recyclerView.getContext());
        b0Var.f48045a = i10;
        w0(b0Var);
    }

    @Override
    public boolean y0() {
        if (this.B == null && this.f47872s == this.f47875w) {
            return true;
        }
        return false;
    }

    public void z0(z0 z0Var, int[] iArr) {
        int i10;
        int W0 = W0(z0Var);
        if (this.f47869p.f48039f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public a0(int i10, boolean z10) {
        this.f47868o = 1;
        this.f47871r = false;
        this.f47873t = false;
        this.f47874u = false;
        this.v = false;
        this.f47875w = false;
        this.f47876x = true;
        this.f47877y = -1;
        this.f47878z = true;
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
        j1(i10);
        k1(z10);
    }

    public void a1(hf.e eVar, z0 z0Var, i2.p0 p0Var, int i10) {
    }
}
