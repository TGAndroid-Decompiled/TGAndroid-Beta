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
import org.telegram.ui.st;
public class s extends b0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public g.p O;
    public final Rect P;

    public s(int i7) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new st(1);
        this.P = new Rect();
        y1(i7);
    }

    @Override
    public final void A0(a1 a1Var, z zVar, h2.f fVar) {
        int i7 = this.J;
        for (int i10 = 0; i10 < this.J && zVar.b(a1Var) && i7 > 0; i10++) {
            int i11 = zVar.d;
            fVar.b(i11, Math.max(0, zVar.f57091g));
            i7 -= this.O.i(i11);
            zVar.d += zVar.f57089e;
        }
    }

    public final void A1() {
        int C;
        int F;
        if (this.f56896o == 1) {
            C = this.f57024m - E();
            F = D();
        } else {
            C = this.f57025n - C();
            F = F();
        }
        int i7 = C - F;
        this.K = q1(this.J, i7, this.K);
    }

    @Override
    public int I(v0 v0Var, a1 a1Var) {
        if (this.f56896o == 0) {
            return this.J;
        }
        if (a1Var.b() < 1) {
            return 0;
        }
        return t1(a1Var.b() - 1, v0Var, a1Var) + 1;
    }

    @Override
    public final View Q0(v0 v0Var, a1 a1Var, int i7, int i10, int i11) {
        int i12;
        G0();
        int j3 = this.f56898q.j();
        int f10 = this.f56898q.f();
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
            if (H >= 0 && H < i11 && u1(H, v0Var, a1Var) == 0) {
                if (((o0) q10.getLayoutParams()).f57027a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else if (this.f56898q.d(q10) < f10 && this.f56898q.a(q10) >= j3) {
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
    public final android.view.View R(android.view.View r23, int r24, v4.v0 r25, v4.a1 r26) {
        throw new UnsupportedOperationException("Method not decompiled: v4.s.R(android.view.View, int, v4.v0, v4.a1):android.view.View");
    }

    @Override
    public void U(v0 v0Var, a1 a1Var, View view, s0.d dVar) {
        boolean z9;
        boolean z10;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54484a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof r)) {
            T(view, dVar);
            return;
        }
        r rVar = (r) layoutParams;
        int t12 = t1(rVar.b(), v0Var, a1Var);
        if (this.f56896o == 0) {
            int i7 = rVar.f57039e;
            int i10 = rVar.f57040f;
            int i11 = this.J;
            if (i11 > 1 && i10 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, i10, t12, 1, z10, false));
            return;
        }
        int i12 = rVar.f57039e;
        int i13 = rVar.f57040f;
        int i14 = this.J;
        if (i14 > 1 && i13 == i14) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(t12, 1, i12, i13, z9, false));
    }

    @Override
    public void V(RecyclerView recyclerView, int i7, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.f13337b).clear();
    }

    @Override
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.f13337b).clear();
    }

    @Override
    public void X(RecyclerView recyclerView, int i7, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.f13337b).clear();
    }

    @Override
    public void Y(RecyclerView recyclerView, int i7, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.f13337b).clear();
    }

    @Override
    public void Z0(v4.v0 r18, v4.a1 r19, v4.z r20, n2.j r21) {
        throw new UnsupportedOperationException("Method not decompiled: v4.s.Z0(v4.v0, v4.a1, v4.z, n2.j):void");
    }

    @Override
    public void a0(RecyclerView recyclerView, int i7, int i10, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.f13337b).clear();
    }

    @Override
    public final void a1(v0 v0Var, a1 a1Var, l2.o0 o0Var, int i7) {
        boolean z9;
        A1();
        if (a1Var.b() > 0 && !a1Var.f56886g) {
            if (i7 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            int u12 = u1(o0Var.f17972b, v0Var, a1Var);
            if (z9) {
                while (u12 > 0) {
                    int i10 = o0Var.f17972b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    o0Var.f17972b = i11;
                    u12 = u1(i11, v0Var, a1Var);
                }
            } else {
                int b10 = a1Var.b() - 1;
                int i12 = o0Var.f17972b;
                while (i12 < b10) {
                    int i13 = i12 + 1;
                    int u13 = u1(i13, v0Var, a1Var);
                    if (u13 <= u12) {
                        break;
                    }
                    i12 = i13;
                    u12 = u13;
                }
                o0Var.f17972b = i12;
            }
        }
        r1();
    }

    @Override
    public void b0(v0 v0Var, a1 a1Var) {
        boolean z9 = a1Var.f56886g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z9) {
            int r10 = r();
            for (int i7 = 0; i7 < r10; i7++) {
                r rVar = (r) q(i7).getLayoutParams();
                int b10 = rVar.b();
                sparseIntArray2.put(b10, rVar.f57040f);
                sparseIntArray.put(b10, rVar.f57039e);
            }
        }
        super.b0(v0Var, a1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override
    public final void c0(a1 a1Var) {
        super.c0(a1Var);
        this.I = false;
    }

    @Override
    public final boolean f(o0 o0Var) {
        return o0Var instanceof r;
    }

    @Override
    public final int h(a1 a1Var) {
        return C0(a1Var);
    }

    @Override
    public final int i(a1 a1Var) {
        return D0(a1Var);
    }

    @Override
    public int k(a1 a1Var) {
        return C0(a1Var);
    }

    @Override
    public int l(a1 a1Var) {
        return D0(a1Var);
    }

    @Override
    public final void l1(boolean z9) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override
    public final int m0(int i7, v0 v0Var, a1 a1Var) {
        A1();
        r1();
        return super.m0(i7, v0Var, a1Var);
    }

    @Override
    public final o0 n() {
        if (this.f56896o == 0) {
            return new r(-2, -1);
        }
        return new r(-1, -2);
    }

    @Override
    public final o0 o(Context context, AttributeSet attributeSet) {
        ?? o0Var = new o0(context, attributeSet);
        o0Var.f57039e = -1;
        o0Var.f57040f = 0;
        return o0Var;
    }

    @Override
    public int o0(int i7, v0 v0Var, a1 a1Var) {
        A1();
        r1();
        return super.o0(i7, v0Var, a1Var);
    }

    @Override
    public final o0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? o0Var = new o0((ViewGroup.MarginLayoutParams) layoutParams);
            o0Var.f57039e = -1;
            o0Var.f57040f = 0;
            return o0Var;
        }
        ?? o0Var2 = new o0(layoutParams);
        o0Var2.f57039e = -1;
        o0Var2.f57040f = 0;
        return o0Var2;
    }

    public final void p1(int i7, v0 v0Var, a1 a1Var, boolean z9) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (z9) {
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
            r rVar = (r) view.getLayoutParams();
            int v12 = v1(((o0) view.getLayoutParams()).b(), v0Var, a1Var);
            rVar.f57040f = v12;
            rVar.f57039e = i13;
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
        if (this.f56896o == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f57015b;
            WeakHashMap weakHashMap = r0.i0.f54073a;
            g11 = n0.g(i10, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g10 = n0.g(i7, iArr[iArr.length - 1] + E, this.f57015b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.f57015b;
            WeakHashMap weakHashMap2 = r0.i0.f54073a;
            g10 = n0.g(i7, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g11 = n0.g(i10, iArr2[iArr2.length - 1] + C, this.f57015b.getMinimumHeight());
        }
        this.f57015b.setMeasuredDimension(g10, g11);
    }

    public final void r1() {
        View[] viewArr = this.L;
        if (viewArr != null && viewArr.length == this.J) {
            return;
        }
        this.L = new View[this.J];
    }

    public final int s1(int i7, int i10) {
        if (this.f56896o == 1 && Y0()) {
            int[] iArr = this.K;
            int i11 = this.J;
            return iArr[i11 - i7] - iArr[(i11 - i7) - i10];
        }
        int[] iArr2 = this.K;
        return iArr2[i10 + i7] - iArr2[i7];
    }

    public final int t1(int i7, v0 v0Var, a1 a1Var) {
        if (!a1Var.f56886g) {
            return this.O.g(i7, this.J);
        }
        int b10 = v0Var.b(i7);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i7);
            return 0;
        }
        return this.O.g(b10, this.J);
    }

    @Override
    public int u(v0 v0Var, a1 a1Var) {
        if (this.f56896o == 1) {
            return this.J;
        }
        if (a1Var.b() < 1) {
            return 0;
        }
        return t1(a1Var.b() - 1, v0Var, a1Var) + 1;
    }

    public final int u1(int i7, v0 v0Var, a1 a1Var) {
        if (!a1Var.f56886g) {
            return this.O.h(i7, this.J);
        }
        int i10 = this.N.get(i7, -1);
        if (i10 != -1) {
            return i10;
        }
        int b10 = v0Var.b(i7);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
            return 0;
        }
        return this.O.h(b10, this.J);
    }

    public final int v1(int i7, v0 v0Var, a1 a1Var) {
        if (!a1Var.f56886g) {
            return this.O.i(i7);
        }
        int i10 = this.M.get(i7, -1);
        if (i10 != -1) {
            return i10;
        }
        int b10 = v0Var.b(i7);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
            return 1;
        }
        return this.O.i(b10);
    }

    public void w1(int i7, View view, boolean z9) {
        int i10;
        int i11;
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.f57028b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        int s12 = s1(rVar.f57039e, rVar.f57040f);
        if (this.f56896o == 1) {
            i11 = n0.s(false, s12, i7, i13, ((ViewGroup.MarginLayoutParams) rVar).width);
            i10 = n0.s(true, this.f56898q.k(), this.f57023l, i12, ((ViewGroup.MarginLayoutParams) rVar).height);
        } else {
            int s5 = n0.s(false, s12, i7, i12, ((ViewGroup.MarginLayoutParams) rVar).height);
            int s9 = n0.s(true, this.f56898q.k(), this.f57022k, i13, ((ViewGroup.MarginLayoutParams) rVar).width);
            i10 = s5;
            i11 = s9;
        }
        x1(i11, i10, view, z9);
    }

    public final void x1(int i7, int i10, View view, boolean z9) {
        boolean u02;
        o0 o0Var = (o0) view.getLayoutParams();
        if (z9) {
            if (this.f57019g && n0.N(view.getMeasuredWidth(), i7, ((ViewGroup.MarginLayoutParams) o0Var).width) && n0.N(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) o0Var).height)) {
                u02 = false;
            } else {
                u02 = true;
            }
        } else {
            u02 = u0(view, i7, i10, o0Var);
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
        throw new IllegalArgumentException(jg.g.j(i7, "Span count should be at least 1. Provided "));
    }

    public final void z1(g.p pVar) {
        this.O = pVar;
    }

    public s(int i7, boolean z9) {
        super(1, z9);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new st(1);
        this.P = new Rect();
        y1(i7);
    }
}
