package v4;

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
import org.telegram.ui.vt;
public class t extends c0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public g.p O;
    public final Rect P;

    public t(int i7) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new vt(1);
        this.P = new Rect();
        y1(i7);
    }

    @Override
    public final void A0(c1 c1Var, a0 a0Var, h2.f fVar) {
        int i7 = this.J;
        for (int i10 = 0; i10 < this.J && a0Var.b(c1Var) && i7 > 0; i10++) {
            int i11 = a0Var.d;
            fVar.b(i11, Math.max(0, a0Var.f59174g));
            i7 -= this.O.i(i11);
            a0Var.d += a0Var.f59172e;
        }
    }

    public final void A1() {
        int C;
        int F;
        if (this.f59199o == 1) {
            C = this.f59341m - E();
            F = D();
        } else {
            C = this.f59342n - C();
            F = F();
        }
        int i7 = C - F;
        this.K = q1(this.J, i7, this.K);
    }

    @Override
    public int I(x0 x0Var, c1 c1Var) {
        if (this.f59199o == 0) {
            return this.J;
        }
        if (c1Var.b() < 1) {
            return 0;
        }
        return t1(c1Var.b() - 1, x0Var, c1Var) + 1;
    }

    @Override
    public final View Q0(x0 x0Var, c1 c1Var, int i7, int i10, int i11) {
        int i12;
        G0();
        int j3 = this.f59201q.j();
        int f10 = this.f59201q.f();
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
            if (H >= 0 && H < i11 && u1(H, x0Var, c1Var) == 0) {
                if (((q0) q10.getLayoutParams()).f59347a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else if (this.f59201q.d(q10) < f10 && this.f59201q.a(q10) >= j3) {
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
    public final android.view.View R(android.view.View r23, int r24, v4.x0 r25, v4.c1 r26) {
        throw new UnsupportedOperationException("Method not decompiled: v4.t.R(android.view.View, int, v4.x0, v4.c1):android.view.View");
    }

    @Override
    public void U(x0 x0Var, c1 c1Var, View view, s0.c cVar) {
        boolean z10;
        boolean z11;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f56863a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof s)) {
            T(view, cVar);
            return;
        }
        s sVar = (s) layoutParams;
        int t12 = t1(sVar.b(), x0Var, c1Var);
        if (this.f59199o == 0) {
            int i7 = sVar.f59355e;
            int i10 = sVar.f59356f;
            int i11 = this.J;
            if (i11 > 1 && i10 == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, i10, t12, 1, z11, false));
            return;
        }
        int i12 = sVar.f59355e;
        int i13 = sVar.f59356f;
        int i14 = this.J;
        if (i14 > 1 && i13 == i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(t12, 1, i12, i13, z10, false));
    }

    @Override
    public void V(RecyclerView recyclerView, int i7, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.f12995b).clear();
    }

    @Override
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.f12995b).clear();
    }

    @Override
    public void X(RecyclerView recyclerView, int i7, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.f12995b).clear();
    }

    @Override
    public void Y(RecyclerView recyclerView, int i7, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.f12995b).clear();
    }

    @Override
    public void Z0(v4.x0 r18, v4.c1 r19, v4.a0 r20, n2.j r21) {
        throw new UnsupportedOperationException("Method not decompiled: v4.t.Z0(v4.x0, v4.c1, v4.a0, n2.j):void");
    }

    @Override
    public void a0(RecyclerView recyclerView, int i7, int i10, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.f12995b).clear();
    }

    @Override
    public final void a1(x0 x0Var, c1 c1Var, l2.m0 m0Var, int i7) {
        boolean z10;
        A1();
        if (c1Var.b() > 0 && !c1Var.f59215g) {
            if (i7 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int u12 = u1(m0Var.f19531b, x0Var, c1Var);
            if (z10) {
                while (u12 > 0) {
                    int i10 = m0Var.f19531b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    m0Var.f19531b = i11;
                    u12 = u1(i11, x0Var, c1Var);
                }
            } else {
                int b10 = c1Var.b() - 1;
                int i12 = m0Var.f19531b;
                while (i12 < b10) {
                    int i13 = i12 + 1;
                    int u13 = u1(i13, x0Var, c1Var);
                    if (u13 <= u12) {
                        break;
                    }
                    i12 = i13;
                    u12 = u13;
                }
                m0Var.f19531b = i12;
            }
        }
        r1();
    }

    @Override
    public void b0(x0 x0Var, c1 c1Var) {
        boolean z10 = c1Var.f59215g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z10) {
            int r10 = r();
            for (int i7 = 0; i7 < r10; i7++) {
                s sVar = (s) q(i7).getLayoutParams();
                int b10 = sVar.b();
                sparseIntArray2.put(b10, sVar.f59356f);
                sparseIntArray.put(b10, sVar.f59355e);
            }
        }
        super.b0(x0Var, c1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override
    public final void c0(c1 c1Var) {
        super.c0(c1Var);
        this.I = false;
    }

    @Override
    public final boolean f(q0 q0Var) {
        return q0Var instanceof s;
    }

    @Override
    public final int h(c1 c1Var) {
        return C0(c1Var);
    }

    @Override
    public final int i(c1 c1Var) {
        return D0(c1Var);
    }

    @Override
    public int k(c1 c1Var) {
        return C0(c1Var);
    }

    @Override
    public int l(c1 c1Var) {
        return D0(c1Var);
    }

    @Override
    public final void l1(boolean z10) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override
    public final int m0(int i7, x0 x0Var, c1 c1Var) {
        A1();
        r1();
        return super.m0(i7, x0Var, c1Var);
    }

    @Override
    public final q0 n() {
        if (this.f59199o == 0) {
            return new s(-2, -1);
        }
        return new s(-1, -2);
    }

    @Override
    public final q0 o(Context context, AttributeSet attributeSet) {
        ?? q0Var = new q0(context, attributeSet);
        q0Var.f59355e = -1;
        q0Var.f59356f = 0;
        return q0Var;
    }

    @Override
    public int o0(int i7, x0 x0Var, c1 c1Var) {
        A1();
        r1();
        return super.o0(i7, x0Var, c1Var);
    }

    @Override
    public final q0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? q0Var = new q0((ViewGroup.MarginLayoutParams) layoutParams);
            q0Var.f59355e = -1;
            q0Var.f59356f = 0;
            return q0Var;
        }
        ?? q0Var2 = new q0(layoutParams);
        q0Var2.f59355e = -1;
        q0Var2.f59356f = 0;
        return q0Var2;
    }

    public final void p1(int i7, x0 x0Var, c1 c1Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (z10) {
            i12 = 1;
            i11 = i7;
            i10 = 0;
        } else {
            i10 = i7 - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View view = this.L[i10];
            s sVar = (s) view.getLayoutParams();
            int v12 = v1(((q0) view.getLayoutParams()).b(), x0Var, c1Var);
            sVar.f59356f = v12;
            sVar.f59355e = i13;
            i13 += v12;
            i10 += i12;
        }
    }

    public int[] q1(int i7, int i10, int[] iArr) {
        int i11;
        if (iArr == null || iArr.length != i7 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i7 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i10 / i7;
        int i14 = i10 % i7;
        int i15 = 0;
        for (int i16 = 1; i16 <= i7; i16++) {
            i12 += i14;
            if (i12 > 0 && i7 - i12 < i14) {
                i11 = i13 + 1;
                i12 -= i7;
            } else {
                i11 = i13;
            }
            i15 += i11;
            iArr[i16] = i15;
        }
        return iArr;
    }

    @Override
    public final void r0(Rect rect, int i7, int i10) {
        int g10;
        int g11;
        if (this.K == null) {
            super.r0(rect, i7, i10);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.f59199o == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f59332b;
            WeakHashMap weakHashMap = r0.i0.f56367a;
            g11 = p0.g(i10, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g10 = p0.g(i7, iArr[iArr.length - 1] + E, this.f59332b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.f59332b;
            WeakHashMap weakHashMap2 = r0.i0.f56367a;
            g10 = p0.g(i7, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g11 = p0.g(i10, iArr2[iArr2.length - 1] + C, this.f59332b.getMinimumHeight());
        }
        this.f59332b.setMeasuredDimension(g10, g11);
    }

    public final void r1() {
        View[] viewArr = this.L;
        if (viewArr != null && viewArr.length == this.J) {
            return;
        }
        this.L = new View[this.J];
    }

    public final int s1(int i7, int i10) {
        if (this.f59199o == 1 && Y0()) {
            int[] iArr = this.K;
            int i11 = this.J;
            return iArr[i11 - i7] - iArr[(i11 - i7) - i10];
        }
        int[] iArr2 = this.K;
        return iArr2[i10 + i7] - iArr2[i7];
    }

    public final int t1(int i7, x0 x0Var, c1 c1Var) {
        if (!c1Var.f59215g) {
            return this.O.g(i7, this.J);
        }
        int b10 = x0Var.b(i7);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i7);
            return 0;
        }
        return this.O.g(b10, this.J);
    }

    @Override
    public int u(x0 x0Var, c1 c1Var) {
        if (this.f59199o == 1) {
            return this.J;
        }
        if (c1Var.b() < 1) {
            return 0;
        }
        return t1(c1Var.b() - 1, x0Var, c1Var) + 1;
    }

    public final int u1(int i7, x0 x0Var, c1 c1Var) {
        if (!c1Var.f59215g) {
            return this.O.h(i7, this.J);
        }
        int i10 = this.N.get(i7, -1);
        if (i10 != -1) {
            return i10;
        }
        int b10 = x0Var.b(i7);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
            return 0;
        }
        return this.O.h(b10, this.J);
    }

    public final int v1(int i7, x0 x0Var, c1 c1Var) {
        if (!c1Var.f59215g) {
            return this.O.i(i7);
        }
        int i10 = this.M.get(i7, -1);
        if (i10 != -1) {
            return i10;
        }
        int b10 = x0Var.b(i7);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
            return 1;
        }
        return this.O.i(b10);
    }

    public void w1(int i7, View view, boolean z10) {
        int i10;
        int i11;
        s sVar = (s) view.getLayoutParams();
        Rect rect = sVar.f59348b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) sVar).topMargin + ((ViewGroup.MarginLayoutParams) sVar).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) sVar).leftMargin + ((ViewGroup.MarginLayoutParams) sVar).rightMargin;
        int s12 = s1(sVar.f59355e, sVar.f59356f);
        if (this.f59199o == 1) {
            i11 = p0.s(false, s12, i7, i13, ((ViewGroup.MarginLayoutParams) sVar).width);
            i10 = p0.s(true, this.f59201q.k(), this.f59340l, i12, ((ViewGroup.MarginLayoutParams) sVar).height);
        } else {
            int s5 = p0.s(false, s12, i7, i12, ((ViewGroup.MarginLayoutParams) sVar).height);
            int s9 = p0.s(true, this.f59201q.k(), this.f59339k, i13, ((ViewGroup.MarginLayoutParams) sVar).width);
            i10 = s5;
            i11 = s9;
        }
        x1(i11, i10, view, z10);
    }

    public final void x1(int i7, int i10, View view, boolean z10) {
        boolean u02;
        q0 q0Var = (q0) view.getLayoutParams();
        if (z10) {
            if (this.f59336g && p0.N(view.getMeasuredWidth(), i7, ((ViewGroup.MarginLayoutParams) q0Var).width) && p0.N(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) q0Var).height)) {
                u02 = false;
            } else {
                u02 = true;
            }
        } else {
            u02 = u0(view, i7, i10, q0Var);
        }
        if (u02) {
            view.measure(i7, i10);
        }
    }

    @Override
    public boolean y0() {
        if (this.B == null && !this.I) {
            return true;
        }
        return false;
    }

    public void y1(int i7) {
        if (i7 == this.J) {
            return;
        }
        this.I = true;
        if (i7 >= 1) {
            this.J = i7;
            this.O.j();
            l0();
            return;
        }
        throw new IllegalArgumentException(i5.c.i(i7, "Span count should be at least 1. Provided "));
    }

    public final void z1(g.p pVar) {
        this.O = pVar;
    }

    public t(int i7, boolean z10) {
        super(1, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new vt(1);
        this.P = new Rect();
        y1(i7);
    }
}
