package s4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import org.telegram.ui.su;
public class t extends c0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public g.o O;
    public final Rect P;

    public t(int i10) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new su(1);
        this.P = new Rect();
        z1(i10);
    }

    @Override
    public final void A0(b1 b1Var, a0 a0Var, e2.f fVar) {
        int i10 = this.J;
        for (int i11 = 0; i11 < this.J && a0Var.b(b1Var) && i10 > 0; i11++) {
            int i12 = a0Var.d;
            fVar.b(i12, Math.max(0, a0Var.f47710g));
            i10 -= this.O.i(i12);
            a0Var.d += a0Var.e;
        }
    }

    public final void A1(g.o oVar) {
        this.O = oVar;
    }

    public final void B1() {
        int C;
        int F;
        if (this.f47743o == 1) {
            C = this.f47862m - E();
            F = D();
        } else {
            C = this.f47863n - C();
            F = F();
        }
        int i10 = C - F;
        this.K = r1(this.J, i10, this.K);
    }

    @Override
    public int I(rf.e eVar, b1 b1Var) {
        if (this.f47743o == 0) {
            return this.J;
        }
        if (b1Var.b() < 1) {
            return 0;
        }
        return u1(b1Var.b() - 1, eVar, b1Var) + 1;
    }

    @Override
    public final View Q0(rf.e eVar, b1 b1Var, int i10, int i11, int i12) {
        int i13;
        G0();
        int j10 = this.f47745q.j();
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
            if (H >= 0 && H < i12 && v1(H, eVar, b1Var) == 0) {
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
    public final android.view.View R(android.view.View r23, int r24, rf.e r25, s4.b1 r26) {
        throw new UnsupportedOperationException("Method not decompiled: s4.t.R(android.view.View, int, rf.e, s4.b1):android.view.View");
    }

    @Override
    public void U(rf.e eVar, b1 b1Var, View view, s0.d dVar) {
        boolean z10;
        boolean z11;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47688a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof s)) {
            T(view, dVar);
            return;
        }
        s sVar = (s) layoutParams;
        int u12 = u1(sVar.b(), eVar, b1Var);
        if (this.f47743o == 0) {
            int i10 = sVar.e;
            int i11 = sVar.f47874f;
            int i12 = this.J;
            if (i12 > 1 && i11 == i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, u12, 1, z11, false));
            return;
        }
        int i13 = sVar.e;
        int i14 = sVar.f47874f;
        int i15 = this.J;
        if (i15 > 1 && i14 == i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(u12, 1, i13, i14, z10, false));
    }

    @Override
    public void V(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f12151b).clear();
    }

    @Override
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.f12151b).clear();
    }

    @Override
    public void X(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f12151b).clear();
    }

    @Override
    public void Y(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f12151b).clear();
    }

    @Override
    public void Z0(rf.e r18, s4.b1 r19, s4.a0 r20, k2.l r21) {
        throw new UnsupportedOperationException("Method not decompiled: s4.t.Z0(rf.e, s4.b1, s4.a0, k2.l):void");
    }

    @Override
    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.f12151b).clear();
    }

    @Override
    public final void a1(rf.e eVar, b1 b1Var, i2.p0 p0Var, int i10) {
        boolean z10;
        B1();
        if (b1Var.b() > 0 && !b1Var.f47733g) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int v12 = v1(p0Var.f13697b, eVar, b1Var);
            if (z10) {
                while (v12 > 0) {
                    int i11 = p0Var.f13697b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    p0Var.f13697b = i12;
                    v12 = v1(i12, eVar, b1Var);
                }
            } else {
                int b10 = b1Var.b() - 1;
                int i13 = p0Var.f13697b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int v13 = v1(i14, eVar, b1Var);
                    if (v13 <= v12) {
                        break;
                    }
                    i13 = i14;
                    v12 = v13;
                }
                p0Var.f13697b = i13;
            }
        }
        s1();
    }

    @Override
    public void b0(rf.e eVar, b1 b1Var) {
        boolean z10 = b1Var.f47733g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z10) {
            int r6 = r();
            for (int i10 = 0; i10 < r6; i10++) {
                s sVar = (s) q(i10).getLayoutParams();
                int b10 = sVar.b();
                sparseIntArray2.put(b10, sVar.f47874f);
                sparseIntArray.put(b10, sVar.e);
            }
        }
        super.b0(eVar, b1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override
    public final void c0(b1 b1Var) {
        super.c0(b1Var);
        this.I = false;
    }

    @Override
    public final boolean f(q0 q0Var) {
        return q0Var instanceof s;
    }

    @Override
    public final int h(b1 b1Var) {
        return C0(b1Var);
    }

    @Override
    public final int i(b1 b1Var) {
        return D0(b1Var);
    }

    @Override
    public int k(b1 b1Var) {
        return C0(b1Var);
    }

    @Override
    public int l(b1 b1Var) {
        return D0(b1Var);
    }

    @Override
    public final int m0(int i10, rf.e eVar, b1 b1Var) {
        B1();
        s1();
        return super.m0(i10, eVar, b1Var);
    }

    @Override
    public final void m1(boolean z10) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override
    public final q0 n() {
        if (this.f47743o == 0) {
            return new s(-2, -1);
        }
        return new s(-1, -2);
    }

    @Override
    public final q0 o(Context context, AttributeSet attributeSet) {
        ?? q0Var = new q0(context, attributeSet);
        q0Var.e = -1;
        q0Var.f47874f = 0;
        return q0Var;
    }

    @Override
    public int o0(int i10, rf.e eVar, b1 b1Var) {
        B1();
        s1();
        return super.o0(i10, eVar, b1Var);
    }

    @Override
    public final q0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? q0Var = new q0((ViewGroup.MarginLayoutParams) layoutParams);
            q0Var.e = -1;
            q0Var.f47874f = 0;
            return q0Var;
        }
        ?? q0Var2 = new q0(layoutParams);
        q0Var2.e = -1;
        q0Var2.f47874f = 0;
        return q0Var2;
    }

    public final void q1(int i10, rf.e eVar, b1 b1Var, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.L[i11];
            s sVar = (s) view.getLayoutParams();
            int w12 = w1(((q0) view.getLayoutParams()).b(), eVar, b1Var);
            sVar.f47874f = w12;
            sVar.e = i14;
            i14 += w12;
            i11 += i13;
        }
    }

    @Override
    public final void r0(Rect rect, int i10, int i11) {
        int g7;
        int g10;
        if (this.K == null) {
            super.r0(rect, i10, i11);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.f47743o == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f47854b;
            WeakHashMap weakHashMap = r0.i0.f47143a;
            g10 = p0.g(i11, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g7 = p0.g(i10, iArr[iArr.length - 1] + E, this.f47854b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.f47854b;
            WeakHashMap weakHashMap2 = r0.i0.f47143a;
            g7 = p0.g(i10, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g10 = p0.g(i11, iArr2[iArr2.length - 1] + C, this.f47854b.getMinimumHeight());
        }
        this.f47854b.setMeasuredDimension(g7, g10);
    }

    public int[] r1(int i10, int i11, int[] iArr) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 > 0 && i10 - i13 < i15) {
                i12 = i14 + 1;
                i13 -= i10;
            } else {
                i12 = i14;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    public final void s1() {
        View[] viewArr = this.L;
        if (viewArr != null && viewArr.length == this.J) {
            return;
        }
        this.L = new View[this.J];
    }

    public final int t1(int i10, int i11) {
        if (this.f47743o == 1 && Y0()) {
            int[] iArr = this.K;
            int i12 = this.J;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.K;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    @Override
    public int u(rf.e eVar, b1 b1Var) {
        if (this.f47743o == 1) {
            return this.J;
        }
        if (b1Var.b() < 1) {
            return 0;
        }
        return u1(b1Var.b() - 1, eVar, b1Var) + 1;
    }

    public final int u1(int i10, rf.e eVar, b1 b1Var) {
        if (!b1Var.f47733g) {
            return this.O.g(i10, this.J);
        }
        int b10 = eVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return this.O.g(b10, this.J);
    }

    public final int v1(int i10, rf.e eVar, b1 b1Var) {
        if (!b1Var.f47733g) {
            return this.O.h(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = eVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return this.O.h(b10, this.J);
    }

    public final int w1(int i10, rf.e eVar, b1 b1Var) {
        if (!b1Var.f47733g) {
            return this.O.i(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = eVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        return this.O.i(b10);
    }

    public void x1(View view, int i10, boolean z10) {
        int i11;
        int i12;
        s sVar = (s) view.getLayoutParams();
        Rect rect = sVar.f47868b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) sVar).topMargin + ((ViewGroup.MarginLayoutParams) sVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) sVar).leftMargin + ((ViewGroup.MarginLayoutParams) sVar).rightMargin;
        int t12 = t1(sVar.e, sVar.f47874f);
        if (this.f47743o == 1) {
            i12 = p0.s(false, t12, i10, i14, ((ViewGroup.MarginLayoutParams) sVar).width);
            i11 = p0.s(true, this.f47745q.k(), this.f47861l, i13, ((ViewGroup.MarginLayoutParams) sVar).height);
        } else {
            int s10 = p0.s(false, t12, i10, i13, ((ViewGroup.MarginLayoutParams) sVar).height);
            int s11 = p0.s(true, this.f47745q.k(), this.f47860k, i14, ((ViewGroup.MarginLayoutParams) sVar).width);
            i11 = s10;
            i12 = s11;
        }
        y1(i12, i11, view, z10);
    }

    @Override
    public boolean y0() {
        if (this.B == null && !this.I) {
            return true;
        }
        return false;
    }

    public final void y1(int i10, int i11, View view, boolean z10) {
        boolean u02;
        q0 q0Var = (q0) view.getLayoutParams();
        if (z10) {
            if (this.f47857g && p0.N(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) q0Var).width) && p0.N(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) q0Var).height)) {
                u02 = false;
            } else {
                u02 = true;
            }
        } else {
            u02 = u0(view, i10, i11, q0Var);
        }
        if (u02) {
            view.measure(i10, i11);
        }
    }

    public void z1(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.I = true;
        if (i10 >= 1) {
            this.J = i10;
            this.O.j();
            l0();
            return;
        }
        throw new IllegalArgumentException(ic.a.i(i10, "Span count should be at least 1. Provided "));
    }

    public t(int i10, boolean z10) {
        super(1, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new su(1);
        this.P = new Rect();
        z1(i10);
    }
}
