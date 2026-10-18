package s4;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public class b0 extends n0 {
    public int A;
    public a0 B;
    public final i2.n0 C;
    public final k2.k D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int f45898o;
    public z f45899p;
    public androidx.emoji2.text.g f45900q;
    public boolean f45901r;
    public boolean f45902s;
    public boolean f45903t;
    public boolean f45904u;
    public boolean v;
    public boolean f45905w;
    public final boolean f45906x;
    public int f45907y;
    public boolean f45908z;

    public b0() {
        this(1, false);
    }

    public void A0(y0 y0Var, z zVar, e2.f fVar) {
        int i10 = zVar.d;
        if (i10 >= 0 && i10 < y0Var.b()) {
            fVar.b(i10, Math.max(0, zVar.f46081g));
        }
    }

    public final int B0(y0 y0Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f45900q;
            boolean z10 = this.f45906x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && y0Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1;
                }
                return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
            }
            return 0;
        }
        return 0;
    }

    public final int C0(y0 y0Var) {
        int max;
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f45900q;
            boolean z10 = this.f45906x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && y0Var.b() != 0 && K0 != null && J0 != null) {
                int min = Math.min(((o0) K0.getLayoutParams()).b(), ((o0) J0.getLayoutParams()).b());
                int max2 = Math.max(((o0) K0.getLayoutParams()).b(), ((o0) J0.getLayoutParams()).b());
                if (z12) {
                    max = Math.max(0, (y0Var.b() - max2) - 1);
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

    public final int D0(y0 y0Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f45900q;
            boolean z10 = this.f45906x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && y0Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return y0Var.b();
                }
                return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((o0) K0.getLayoutParams()).b() - ((o0) J0.getLayoutParams()).b()) + 1)) * y0Var.b());
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
        if (this.f45898o == 0) {
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
                            if (i10 == 130 && this.f45898o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f45898o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f45898o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f45898o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f45898o != 1 && Y0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f45898o == 1 || !Y0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void G0() {
        if (this.f45899p == null) {
            ?? obj = new Object();
            obj.f46077a = true;
            obj.h = 0;
            obj.f46082i = 0;
            obj.f46084k = null;
            this.f45899p = obj;
        }
    }

    public final int H0(qf.e eVar, z zVar, y0 y0Var, boolean z10) {
        int i10 = zVar.f46079c;
        int i11 = zVar.f46081g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                zVar.f46081g = i11 + i10;
            }
            c1(eVar, zVar);
        }
        int i12 = zVar.f46079c + zVar.h;
        while (true) {
            if ((!zVar.f46085l && i12 <= 0) || !zVar.b(y0Var)) {
                break;
            }
            k2.k kVar = this.D;
            kVar.f14718a = 0;
            kVar.f14719b = false;
            kVar.f14720c = false;
            kVar.d = false;
            Z0(eVar, y0Var, zVar, kVar);
            if (!kVar.f14719b) {
                int i13 = zVar.f46078b;
                int i14 = kVar.f14718a;
                zVar.f46078b = (zVar.f46080f * i14) + i13;
                if (!kVar.f14720c || zVar.f46084k != null || !y0Var.f46070g) {
                    zVar.f46079c -= i14;
                    i12 -= i14;
                }
                int i15 = zVar.f46081g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    zVar.f46081g = i16;
                    int i17 = zVar.f46079c;
                    if (i17 < 0) {
                        zVar.f46081g = i16 + i17;
                    }
                    c1(eVar, zVar);
                }
                if (z10 && kVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - zVar.f46079c;
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
            if (this.f45900q.d(q(i10)) < this.f45900q.j()) {
                i12 = 16644;
                i13 = 16388;
            } else {
                i12 = 4161;
                i13 = 4097;
            }
            if (this.f45898o == 0) {
                return this.f46004c.U(i10, i11, i12, i13);
            }
            return this.d.U(i10, i11, i12, i13);
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
        if (this.f45898o == 0) {
            return this.f46004c.U(i10, i11, i12, i13);
        }
        return this.d.U(i10, i11, i12, i13);
    }

    public View Q0(qf.e eVar, y0 y0Var, int i10, int i11, int i12) {
        int j10;
        int i13;
        G0();
        if (this.f45901r) {
            j10 = 0;
        } else {
            j10 = this.f45900q.j();
        }
        int f7 = this.f45900q.f();
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
                if (((o0) q6.getLayoutParams()).f46014a.j()) {
                    if (view2 == null) {
                        view2 = q6;
                    }
                } else if (this.f45900q.d(q6) < f7 && this.f45900q.a(q6) >= j10) {
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
    public View R(View view, int i10, qf.e eVar, y0 y0Var) {
        int F0;
        View O0;
        View U0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.f45900q.k() * 0.33333334f), false, y0Var);
            z zVar = this.f45899p;
            zVar.f46081g = Integer.MIN_VALUE;
            zVar.f46077a = false;
            H0(eVar, zVar, y0Var, true);
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

    public final int S0(int i10, qf.e eVar, y0 y0Var, boolean z10) {
        int f7;
        int f10;
        if (this.G && this.H && (f7 = this.f45900q.f() - i10) > 0) {
            int i11 = -g1(-f7, eVar, y0Var);
            int i12 = i10 + i11;
            if (z10 && (f10 = this.f45900q.f() - i12) > 0) {
                this.f45900q.n(f10);
                return f10 + i11;
            }
            return i11;
        }
        return 0;
    }

    public final int T0(int i10, qf.e eVar, y0 y0Var, boolean z10) {
        int X0;
        int j10;
        if (this.G && (X0 = i10 - X0()) > 0) {
            int i11 = -g1(X0, eVar, y0Var);
            int i12 = i10 + i11;
            if (z10 && (j10 = i12 - this.f45900q.j()) > 0) {
                this.f45900q.n(-j10);
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

    public int W0(y0 y0Var) {
        if (y0Var.f46066a != -1) {
            return this.f45900q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f45900q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f46003b;
        WeakHashMap weakHashMap = r0.i0.f44818a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Z0(qf.e eVar, y0 y0Var, z zVar, k2.k kVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        View c10 = zVar.c(eVar);
        if (c10 == null) {
            kVar.f14719b = true;
            return;
        }
        o0 o0Var = (o0) c10.getLayoutParams();
        if (zVar.f46084k == null) {
            boolean z12 = this.v;
            if (zVar.f46080f == -1) {
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
            if (zVar.f46080f == -1) {
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
        kVar.f14718a = this.f45900q.b(c10);
        if (this.f45898o == 1) {
            if (Y0()) {
                i13 = this.f46011m - E();
                i10 = i13 - this.f45900q.c(c10);
            } else {
                i10 = D();
                i13 = this.f45900q.c(c10) + i10;
            }
            if (zVar.f46080f == -1) {
                i11 = zVar.f46078b;
                i12 = i11 - kVar.f14718a;
            } else {
                i12 = zVar.f46078b;
                i11 = kVar.f14718a + i12;
            }
        } else {
            int F = F();
            int c11 = this.f45900q.c(c10) + F;
            if (zVar.f46080f == -1) {
                int i14 = zVar.f46078b;
                int i15 = i14 - kVar.f14718a;
                i13 = i14;
                i11 = c11;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = zVar.f46078b;
                int i17 = kVar.f14718a + i16;
                i10 = i16;
                i11 = c11;
                i12 = F;
                i13 = i17;
            }
        }
        n0.O(c10, i10, i12, i13, i11);
        if (o0Var.f46014a.j() || o0Var.f46014a.m()) {
            kVar.f14720c = true;
        }
        kVar.d = c10.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f46003b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(qf.e r18, s4.y0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: s4.b0.b0(qf.e, s4.y0):void");
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
                h1(H2, this.f45900q.f() - (this.f45900q.b(view) + this.f45900q.d(view2)));
                return;
            }
            h1(H2, this.f45900q.f() - this.f45900q.a(view2));
        } else if (z10) {
            h1(H2, this.f45900q.d(view2));
        } else {
            h1(H2, this.f45900q.a(view2) - this.f45900q.b(view));
        }
    }

    @Override
    public void c0(y0 y0Var) {
        this.B = null;
        this.f45907y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.g();
    }

    public final void c1(qf.e eVar, z zVar) {
        b1 T;
        b1 T2;
        if (zVar.f46077a && !zVar.f46085l) {
            int i10 = zVar.f46081g;
            int i11 = zVar.f46082i;
            if (zVar.f46080f == -1) {
                int r10 = r();
                if (i10 >= 0) {
                    int e = (this.f45900q.e() - i10) + i11;
                    if (this.v) {
                        for (int i12 = 0; i12 < r10; i12++) {
                            View q6 = q(i12);
                            if (q6 != null && (T2 = this.f46003b.T(q6)) != null && !T2.r() && (this.f45900q.d(q6) < e || this.f45900q.m(q6) < e)) {
                                d1(eVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = r10 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View q10 = q(i14);
                        if (q10 != null && (T = this.f46003b.T(q10)) != null && !T.r() && (this.f45900q.d(q10) < e || this.f45900q.m(q10) < e)) {
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
        if (!this.f45904u && this.f45898o == 0) {
            return true;
        }
        return false;
    }

    public final void d1(qf.e eVar, int i10, int i11) {
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
        if (!this.f45904u && this.f45898o == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final a0 e0() {
        a0 a0Var = this.B;
        if (a0Var != null) {
            ?? obj = new Object();
            obj.f45885a = a0Var.f45885a;
            obj.f45886b = a0Var.f45886b;
            obj.f45887c = a0Var.f45887c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            G0();
            boolean z10 = this.f45902s ^ this.v;
            obj2.f45887c = z10;
            if (z10) {
                View U0 = U0();
                obj2.f45886b = this.f45900q.f() - this.f45900q.a(U0);
                obj2.f45885a = ((o0) U0.getLayoutParams()).b();
                return obj2;
            }
            View V0 = V0();
            obj2.f45885a = n0.H(V0);
            obj2.f45886b = this.f45900q.d(V0) - this.f45900q.j();
            return obj2;
        }
        obj2.f45885a = -1;
        return obj2;
    }

    public void e1(qf.e eVar, int i10, int i11) {
        b1 T;
        b1 T2;
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int r10 = r();
            if (this.v) {
                int i13 = r10 - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View q6 = q(i14);
                    if (q6 != null && (T2 = this.f46003b.T(q6)) != null && !T2.r() && (this.f45900q.a(q6) > i12 || this.f45900q.l(q6) > i12)) {
                        d1(eVar, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < r10; i15++) {
                View q10 = q(i15);
                if (q10 != null && (T = this.f46003b.T(q10)) != null && !T.r() && (this.f45900q.a(q10) > i12 || this.f45900q.l(q10) > i12)) {
                    d1(eVar, 0, i15);
                    return;
                }
            }
        }
    }

    public final void f1() {
        if (this.f45898o != 1 && Y0()) {
            this.v = !this.f45903t;
        } else {
            this.v = this.f45903t;
        }
    }

    public final int g1(int i10, qf.e eVar, y0 y0Var) {
        int i11;
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.f45899p.f46077a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        m1(i11, abs, true, y0Var);
        z zVar = this.f45899p;
        int H0 = H0(eVar, zVar, y0Var, false) + zVar.f46081g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i10 = i11 * H0;
        }
        this.f45900q.n(-i10);
        this.f45899p.f46083j = i10;
        return i10;
    }

    @Override
    public int h(y0 y0Var) {
        return C0(y0Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override
    public int i(y0 y0Var) {
        return D0(y0Var);
    }

    public void i1(int i10, int i11, boolean z10) {
        if (this.f45907y == i10 && this.A == i11 && this.f45908z == z10) {
            return;
        }
        this.f45907y = i10;
        this.A = i11;
        this.f45908z = z10;
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0Var.f45885a = -1;
        }
        l0();
    }

    @Override
    public int j(y0 y0Var) {
        return B0(y0Var);
    }

    public final void j1(int i10) {
        e0 e0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(i2.d.j(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 == this.f45898o && this.f45900q != null) {
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                e0Var = new e0(this, 1);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            e0Var = new e0(this, 0);
        }
        this.f45900q = e0Var;
        this.C.f12492f = e0Var;
        this.f45898o = i10;
        l0();
    }

    @Override
    public int k(y0 y0Var) {
        return C0(y0Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.f45903t) {
            return;
        }
        this.f45903t = z10;
        l0();
    }

    @Override
    public int l(y0 y0Var) {
        return D0(y0Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.f45905w == z10) {
            return;
        }
        this.f45905w = z10;
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
                b1 U = RecyclerView.U(q10);
                if (U != null && U.c() == i10 && !U.r() && (this.f46003b.f3631u0.f46070g || !U.j())) {
                    return q10;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int m0(int i10, qf.e eVar, y0 y0Var) {
        if (this.f45898o == 1) {
            return 0;
        }
        return g1(i10, eVar, y0Var);
    }

    public final void m1(int i10, int i11, boolean z10, y0 y0Var) {
        boolean z11;
        int i12;
        int j10;
        z zVar = this.f45899p;
        boolean z12 = false;
        int i13 = 1;
        if (this.f45900q.h() == 0 && this.f45900q.e() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zVar.f46085l = z11;
        this.f45899p.f46080f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(y0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z12 = true;
        }
        z zVar2 = this.f45899p;
        if (z12) {
            i12 = max2;
        } else {
            i12 = max;
        }
        zVar2.h = i12;
        if (!z12) {
            max = max2;
        }
        zVar2.f46082i = max;
        if (z12) {
            zVar2.h = this.f45900q.g() + i12;
            View U0 = U0();
            z zVar3 = this.f45899p;
            if (this.v) {
                i13 = -1;
            }
            zVar3.e = i13;
            int H = n0.H(U0);
            z zVar4 = this.f45899p;
            zVar3.d = H + zVar4.e;
            zVar4.f46078b = this.f45900q.a(U0);
            j10 = this.f45900q.a(U0) - this.f45900q.f();
        } else {
            View V0 = V0();
            z zVar5 = this.f45899p;
            zVar5.h = this.f45900q.j() + zVar5.h;
            z zVar6 = this.f45899p;
            if (!this.v) {
                i13 = -1;
            }
            zVar6.e = i13;
            int H2 = n0.H(V0);
            z zVar7 = this.f45899p;
            zVar6.d = H2 + zVar7.e;
            zVar7.f46078b = this.f45900q.d(V0);
            j10 = (-this.f45900q.d(V0)) + this.f45900q.j();
        }
        z zVar8 = this.f45899p;
        zVar8.f46079c = i11;
        if (z10) {
            zVar8.f46079c = i11 - j10;
        }
        zVar8.f46081g = j10;
    }

    @Override
    public o0 n() {
        return new o0(-2, -2);
    }

    @Override
    public void n0(int i10) {
        this.f45907y = i10;
        this.A = Integer.MIN_VALUE;
        a0 a0Var = this.B;
        if (a0Var != null) {
            a0Var.f45885a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        int i12;
        this.f45899p.f46079c = this.f45900q.f() - i11;
        z zVar = this.f45899p;
        if (this.v) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        zVar.e = i12;
        zVar.d = i10;
        zVar.f46080f = 1;
        zVar.f46078b = i11;
        zVar.f46081g = Integer.MIN_VALUE;
    }

    @Override
    public int o0(int i10, qf.e eVar, y0 y0Var) {
        if (this.f45898o == 0) {
            return 0;
        }
        return g1(i10, eVar, y0Var);
    }

    public final void o1(int i10, int i11) {
        int i12;
        this.f45899p.f46079c = i11 - this.f45900q.j();
        z zVar = this.f45899p;
        zVar.d = i10;
        if (this.v) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        zVar.e = i12;
        zVar.f46080f = -1;
        zVar.f46078b = i11;
        zVar.f46081g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, y0 y0Var, int i10) {
        c0 c0Var = new c0(recyclerView.getContext());
        c0Var.f46051a = i10;
        w0(c0Var);
    }

    @Override
    public boolean y0() {
        if (this.B == null && this.f45902s == this.f45905w) {
            return true;
        }
        return false;
    }

    public void z0(y0 y0Var, int[] iArr) {
        int i10;
        int W0 = W0(y0Var);
        if (this.f45899p.f46080f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public b0(int i10, boolean z10) {
        this.f45898o = 1;
        this.f45901r = false;
        this.f45903t = false;
        this.f45904u = false;
        this.v = false;
        this.f45905w = false;
        this.f45906x = true;
        this.f45907y = -1;
        this.f45908z = true;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        i2.n0 n0Var = new i2.n0();
        n0Var.g();
        this.C = n0Var;
        this.D = new Object();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i10);
        k1(z10);
    }

    public void a1(qf.e eVar, y0 y0Var, i2.n0 n0Var, int i10) {
    }
}
