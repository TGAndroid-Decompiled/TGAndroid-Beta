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
import org.telegram.ui.cv;
public class s extends d0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public g.o O;
    public final Rect P;

    public s(int i10) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new cv(1);
        this.P = new Rect();
        y1(i10);
    }

    @Override
    public final void A0(a1 a1Var, b0 b0Var, a0.h hVar) {
        int i10 = this.J;
        for (int i11 = 0; i11 < this.J && b0Var.b(a1Var) && i10 > 0; i11++) {
            int i12 = b0Var.d;
            hVar.b(i12, Math.max(0, b0Var.f47752g));
            i10 -= this.O.i(i12);
            b0Var.d += b0Var.f47750e;
        }
    }

    public final void A1() {
        int C;
        int F;
        if (this.f47770o == 1) {
            C = this.f47897m - E();
            F = D();
        } else {
            C = this.f47898n - C();
            F = F();
        }
        int i10 = C - F;
        this.K = q1(this.J, i10, this.K);
    }

    @Override
    public int I(pf.e eVar, a1 a1Var) {
        if (this.f47770o == 0) {
            return this.J;
        }
        if (a1Var.b() < 1) {
            return 0;
        }
        return t1(a1Var.b() - 1, eVar, a1Var) + 1;
    }

    @Override
    public final View Q0(pf.e eVar, a1 a1Var, int i10, int i11, int i12) {
        int i13;
        G0();
        int j3 = this.f47772q.j();
        int f7 = this.f47772q.f();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q6 = q(i10);
            int H = p0.H(q6);
            if (H >= 0 && H < i12 && u1(H, eVar, a1Var) == 0) {
                if (((q0) q6.getLayoutParams()).f47904a.j()) {
                    if (view2 == null) {
                        view2 = q6;
                    }
                } else if (this.f47772q.d(q6) < f7 && this.f47772q.a(q6) >= j3) {
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
    public final android.view.View R(android.view.View r23, int r24, pf.e r25, s4.a1 r26) {
        throw new UnsupportedOperationException("Method not decompiled: s4.s.R(android.view.View, int, pf.e, s4.a1):android.view.View");
    }

    @Override
    public void U(pf.e eVar, a1 a1Var, View view, s0.d dVar) {
        boolean z10;
        boolean z11;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47711a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof r)) {
            T(view, dVar);
            return;
        }
        r rVar = (r) layoutParams;
        int t12 = t1(rVar.b(), eVar, a1Var);
        if (this.f47770o == 0) {
            int i10 = rVar.f47907e;
            int i11 = rVar.f47908f;
            int i12 = this.J;
            if (i12 > 1 && i11 == i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, t12, 1, z11, false));
            return;
        }
        int i13 = rVar.f47907e;
        int i14 = rVar.f47908f;
        int i15 = this.J;
        if (i15 > 1 && i14 == i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(t12, 1, i13, i14, z10, false));
    }

    @Override
    public void V(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f10147b).clear();
    }

    @Override
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.f10147b).clear();
    }

    @Override
    public void X(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f10147b).clear();
    }

    @Override
    public void Y(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f10147b).clear();
    }

    @Override
    public void Z0(pf.e r18, s4.a1 r19, s4.b0 r20, s4.a0 r21) {
        throw new UnsupportedOperationException("Method not decompiled: s4.s.Z0(pf.e, s4.a1, s4.b0, s4.a0):void");
    }

    @Override
    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.f10147b).clear();
    }

    @Override
    public final void a1(pf.e eVar, a1 a1Var, i2.m0 m0Var, int i10) {
        boolean z10;
        A1();
        if (a1Var.b() > 0 && !a1Var.f47737g) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int u12 = u1(m0Var.f11782b, eVar, a1Var);
            if (z10) {
                while (u12 > 0) {
                    int i11 = m0Var.f11782b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    m0Var.f11782b = i12;
                    u12 = u1(i12, eVar, a1Var);
                }
            } else {
                int b10 = a1Var.b() - 1;
                int i13 = m0Var.f11782b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int u13 = u1(i14, eVar, a1Var);
                    if (u13 <= u12) {
                        break;
                    }
                    i13 = i14;
                    u12 = u13;
                }
                m0Var.f11782b = i13;
            }
        }
        r1();
    }

    @Override
    public void b0(pf.e eVar, a1 a1Var) {
        boolean z10 = a1Var.f47737g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z10) {
            int r10 = r();
            for (int i10 = 0; i10 < r10; i10++) {
                r rVar = (r) q(i10).getLayoutParams();
                int b10 = rVar.b();
                sparseIntArray2.put(b10, rVar.f47908f);
                sparseIntArray.put(b10, rVar.f47907e);
            }
        }
        super.b0(eVar, a1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override
    public final void c0(a1 a1Var) {
        super.c0(a1Var);
        this.I = false;
    }

    @Override
    public final boolean f(q0 q0Var) {
        return q0Var instanceof r;
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
    public final void l1(boolean z10) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override
    public final int m0(int i10, pf.e eVar, a1 a1Var) {
        A1();
        r1();
        return super.m0(i10, eVar, a1Var);
    }

    @Override
    public final q0 n() {
        if (this.f47770o == 0) {
            return new r(-2, -1);
        }
        return new r(-1, -2);
    }

    @Override
    public final q0 o(Context context, AttributeSet attributeSet) {
        ?? q0Var = new q0(context, attributeSet);
        q0Var.f47907e = -1;
        q0Var.f47908f = 0;
        return q0Var;
    }

    @Override
    public int o0(int i10, pf.e eVar, a1 a1Var) {
        A1();
        r1();
        return super.o0(i10, eVar, a1Var);
    }

    @Override
    public final q0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? q0Var = new q0((ViewGroup.MarginLayoutParams) layoutParams);
            q0Var.f47907e = -1;
            q0Var.f47908f = 0;
            return q0Var;
        }
        ?? q0Var2 = new q0(layoutParams);
        q0Var2.f47907e = -1;
        q0Var2.f47908f = 0;
        return q0Var2;
    }

    public final void p1(int i10, pf.e eVar, a1 a1Var, boolean z10) {
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
            r rVar = (r) view.getLayoutParams();
            int v12 = v1(((q0) view.getLayoutParams()).b(), eVar, a1Var);
            rVar.f47908f = v12;
            rVar.f47907e = i14;
            i14 += v12;
            i11 += i13;
        }
    }

    public int[] q1(int i10, int i11, int[] iArr) {
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

    @Override
    public final void r0(Rect rect, int i10, int i11) {
        int g10;
        int g11;
        if (this.K == null) {
            super.r0(rect, i10, i11);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.f47770o == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f47888b;
            WeakHashMap weakHashMap = r0.i0.f46890a;
            g11 = p0.g(i11, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g10 = p0.g(i10, iArr[iArr.length - 1] + E, this.f47888b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.f47888b;
            WeakHashMap weakHashMap2 = r0.i0.f46890a;
            g10 = p0.g(i10, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g11 = p0.g(i11, iArr2[iArr2.length - 1] + C, this.f47888b.getMinimumHeight());
        }
        this.f47888b.setMeasuredDimension(g10, g11);
    }

    public final void r1() {
        View[] viewArr = this.L;
        if (viewArr != null && viewArr.length == this.J) {
            return;
        }
        this.L = new View[this.J];
    }

    public final int s1(int i10, int i11) {
        if (this.f47770o == 1 && Y0()) {
            int[] iArr = this.K;
            int i12 = this.J;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.K;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    public final int t1(int i10, pf.e eVar, a1 a1Var) {
        if (!a1Var.f47737g) {
            return this.O.g(i10, this.J);
        }
        int b10 = eVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return this.O.g(b10, this.J);
    }

    @Override
    public int u(pf.e eVar, a1 a1Var) {
        if (this.f47770o == 1) {
            return this.J;
        }
        if (a1Var.b() < 1) {
            return 0;
        }
        return t1(a1Var.b() - 1, eVar, a1Var) + 1;
    }

    public final int u1(int i10, pf.e eVar, a1 a1Var) {
        if (!a1Var.f47737g) {
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

    public final int v1(int i10, pf.e eVar, a1 a1Var) {
        if (!a1Var.f47737g) {
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

    public void w1(View view, int i10, boolean z10) {
        int i11;
        int i12;
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.f47905b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        int s12 = s1(rVar.f47907e, rVar.f47908f);
        if (this.f47770o == 1) {
            i12 = p0.s(false, s12, i10, i14, ((ViewGroup.MarginLayoutParams) rVar).width);
            i11 = p0.s(true, this.f47772q.k(), this.f47896l, i13, ((ViewGroup.MarginLayoutParams) rVar).height);
        } else {
            int s10 = p0.s(false, s12, i10, i13, ((ViewGroup.MarginLayoutParams) rVar).height);
            int s11 = p0.s(true, this.f47772q.k(), this.f47895k, i14, ((ViewGroup.MarginLayoutParams) rVar).width);
            i11 = s10;
            i12 = s11;
        }
        x1(i12, i11, view, z10);
    }

    public final void x1(int i10, int i11, View view, boolean z10) {
        boolean u02;
        q0 q0Var = (q0) view.getLayoutParams();
        if (z10) {
            if (this.f47892g && p0.N(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) q0Var).width) && p0.N(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) q0Var).height)) {
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

    @Override
    public boolean y0() {
        if (this.B == null && !this.I) {
            return true;
        }
        return false;
    }

    public void y1(int i10) {
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
        throw new IllegalArgumentException(hg.c.h(i10, "Span count should be at least 1. Provided "));
    }

    public final void z1(g.o oVar) {
        this.O = oVar;
    }

    public s(int i10, boolean z10) {
        super(1, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new cv(1);
        this.P = new Rect();
        y1(i10);
    }
}
