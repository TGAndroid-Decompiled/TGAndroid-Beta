package u4;

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
import k2.p1;
import org.telegram.ui.qt;
public class s extends b0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public g.p O;
    public final Rect P;

    public s(int i3) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new qt(1);
        this.P = new Rect();
        y1(i3);
    }

    @Override
    public final void A0(a1 a1Var, z zVar, g2.g gVar) {
        int i3 = this.J;
        for (int i10 = 0; i10 < this.J && zVar.b(a1Var) && i3 > 0; i10++) {
            int i11 = zVar.d;
            gVar.b(i11, Math.max(0, zVar.f55699g));
            i3 -= this.O.i(i11);
            zVar.d += zVar.f55697e;
        }
    }

    public final void A1() {
        int C;
        int F;
        if (this.f55509o == 1) {
            C = this.f55639m - E();
            F = D();
        } else {
            C = this.f55640n - C();
            F = F();
        }
        int i3 = C - F;
        this.K = q1(this.J, i3, this.K);
    }

    @Override
    public int I(tf.e eVar, a1 a1Var) {
        if (this.f55509o == 0) {
            return this.J;
        }
        if (a1Var.b() < 1) {
            return 0;
        }
        return t1(a1Var.b() - 1, eVar, a1Var) + 1;
    }

    @Override
    public final View Q0(tf.e eVar, a1 a1Var, int i3, int i10, int i11) {
        int i12;
        G0();
        int j10 = this.f55511q.j();
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
            if (H >= 0 && H < i11 && u1(H, eVar, a1Var) == 0) {
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
    public final android.view.View R(android.view.View r23, int r24, tf.e r25, u4.a1 r26) {
        throw new UnsupportedOperationException("Method not decompiled: u4.s.R(android.view.View, int, tf.e, u4.a1):android.view.View");
    }

    @Override
    public void U(tf.e eVar, a1 a1Var, View view, s0.d dVar) {
        boolean z10;
        boolean z11;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54570a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof r)) {
            T(view, dVar);
            return;
        }
        r rVar = (r) layoutParams;
        int t12 = t1(rVar.b(), eVar, a1Var);
        if (this.f55509o == 0) {
            int i3 = rVar.f55653e;
            int i10 = rVar.f55654f;
            int i11 = this.J;
            if (i11 > 1 && i10 == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, i10, t12, 1, z11, false));
            return;
        }
        int i12 = rVar.f55653e;
        int i13 = rVar.f55654f;
        int i14 = this.J;
        if (i14 > 1 && i13 == i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(t12, 1, i12, i13, z10, false));
    }

    @Override
    public void V(RecyclerView recyclerView, int i3, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.f11721b).clear();
    }

    @Override
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.f11721b).clear();
    }

    @Override
    public void X(RecyclerView recyclerView, int i3, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.f11721b).clear();
    }

    @Override
    public void Y(RecyclerView recyclerView, int i3, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.f11721b).clear();
    }

    @Override
    public void Z0(tf.e r18, u4.a1 r19, u4.z r20, m2.j r21) {
        throw new UnsupportedOperationException("Method not decompiled: u4.s.Z0(tf.e, u4.a1, u4.z, m2.j):void");
    }

    @Override
    public void a0(RecyclerView recyclerView, int i3, int i10, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.f11721b).clear();
    }

    @Override
    public final void a1(tf.e eVar, a1 a1Var, k2.o0 o0Var, int i3) {
        boolean z10;
        A1();
        if (a1Var.b() > 0 && !a1Var.f55495g) {
            if (i3 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int u12 = u1(o0Var.f16660b, eVar, a1Var);
            if (z10) {
                while (u12 > 0) {
                    int i10 = o0Var.f16660b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    o0Var.f16660b = i11;
                    u12 = u1(i11, eVar, a1Var);
                }
            } else {
                int b10 = a1Var.b() - 1;
                int i12 = o0Var.f16660b;
                while (i12 < b10) {
                    int i13 = i12 + 1;
                    int u13 = u1(i13, eVar, a1Var);
                    if (u13 <= u12) {
                        break;
                    }
                    i12 = i13;
                    u12 = u13;
                }
                o0Var.f16660b = i12;
            }
        }
        r1();
    }

    @Override
    public void b0(tf.e eVar, a1 a1Var) {
        boolean z10 = a1Var.f55495g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z10) {
            int r5 = r();
            for (int i3 = 0; i3 < r5; i3++) {
                r rVar = (r) q(i3).getLayoutParams();
                int b10 = rVar.b();
                sparseIntArray2.put(b10, rVar.f55654f);
                sparseIntArray.put(b10, rVar.f55653e);
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
    public final boolean f(p0 p0Var) {
        return p0Var instanceof r;
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
    public final int m0(int i3, tf.e eVar, a1 a1Var) {
        A1();
        r1();
        return super.m0(i3, eVar, a1Var);
    }

    @Override
    public final p0 n() {
        if (this.f55509o == 0) {
            return new r(-2, -1);
        }
        return new r(-1, -2);
    }

    @Override
    public final p0 o(Context context, AttributeSet attributeSet) {
        ?? p0Var = new p0(context, attributeSet);
        p0Var.f55653e = -1;
        p0Var.f55654f = 0;
        return p0Var;
    }

    @Override
    public int o0(int i3, tf.e eVar, a1 a1Var) {
        A1();
        r1();
        return super.o0(i3, eVar, a1Var);
    }

    @Override
    public final p0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? p0Var = new p0((ViewGroup.MarginLayoutParams) layoutParams);
            p0Var.f55653e = -1;
            p0Var.f55654f = 0;
            return p0Var;
        }
        ?? p0Var2 = new p0(layoutParams);
        p0Var2.f55653e = -1;
        p0Var2.f55654f = 0;
        return p0Var2;
    }

    public final void p1(int i3, tf.e eVar, a1 a1Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (z10) {
            i12 = 1;
            i11 = i3;
            i10 = 0;
        } else {
            i10 = i3 - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View view = this.L[i10];
            r rVar = (r) view.getLayoutParams();
            int v12 = v1(((p0) view.getLayoutParams()).b(), eVar, a1Var);
            rVar.f55654f = v12;
            rVar.f55653e = i13;
            i13 += v12;
            i10 += i12;
        }
    }

    public int[] q1(int i3, int i10, int[] iArr) {
        int i11;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i3 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i10 / i3;
        int i14 = i10 % i3;
        int i15 = 0;
        for (int i16 = 1; i16 <= i3; i16++) {
            i12 += i14;
            if (i12 > 0 && i3 - i12 < i14) {
                i11 = i13 + 1;
                i12 -= i3;
            } else {
                i11 = i13;
            }
            i15 += i11;
            iArr[i16] = i15;
        }
        return iArr;
    }

    @Override
    public final void r0(Rect rect, int i3, int i10) {
        int g7;
        int g10;
        if (this.K == null) {
            super.r0(rect, i3, i10);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.f55509o == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f55630b;
            WeakHashMap weakHashMap = r0.i0.f54015a;
            g10 = o0.g(i10, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g7 = o0.g(i3, iArr[iArr.length - 1] + E, this.f55630b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.f55630b;
            WeakHashMap weakHashMap2 = r0.i0.f54015a;
            g7 = o0.g(i3, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g10 = o0.g(i10, iArr2[iArr2.length - 1] + C, this.f55630b.getMinimumHeight());
        }
        this.f55630b.setMeasuredDimension(g7, g10);
    }

    public final void r1() {
        View[] viewArr = this.L;
        if (viewArr != null && viewArr.length == this.J) {
            return;
        }
        this.L = new View[this.J];
    }

    public final int s1(int i3, int i10) {
        if (this.f55509o == 1 && Y0()) {
            int[] iArr = this.K;
            int i11 = this.J;
            return iArr[i11 - i3] - iArr[(i11 - i3) - i10];
        }
        int[] iArr2 = this.K;
        return iArr2[i10 + i3] - iArr2[i3];
    }

    public final int t1(int i3, tf.e eVar, a1 a1Var) {
        if (!a1Var.f55495g) {
            return this.O.g(i3, this.J);
        }
        int b10 = eVar.b(i3);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
            return 0;
        }
        return this.O.g(b10, this.J);
    }

    @Override
    public int u(tf.e eVar, a1 a1Var) {
        if (this.f55509o == 1) {
            return this.J;
        }
        if (a1Var.b() < 1) {
            return 0;
        }
        return t1(a1Var.b() - 1, eVar, a1Var) + 1;
    }

    public final int u1(int i3, tf.e eVar, a1 a1Var) {
        if (!a1Var.f55495g) {
            return this.O.h(i3, this.J);
        }
        int i10 = this.N.get(i3, -1);
        if (i10 != -1) {
            return i10;
        }
        int b10 = eVar.b(i3);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
            return 0;
        }
        return this.O.h(b10, this.J);
    }

    public final int v1(int i3, tf.e eVar, a1 a1Var) {
        if (!a1Var.f55495g) {
            return this.O.i(i3);
        }
        int i10 = this.M.get(i3, -1);
        if (i10 != -1) {
            return i10;
        }
        int b10 = eVar.b(i3);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
            return 1;
        }
        return this.O.i(b10);
    }

    public void w1(int i3, View view, boolean z10) {
        int i10;
        int i11;
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.f55646b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        int s12 = s1(rVar.f55653e, rVar.f55654f);
        if (this.f55509o == 1) {
            i11 = o0.s(false, s12, i3, i13, ((ViewGroup.MarginLayoutParams) rVar).width);
            i10 = o0.s(true, this.f55511q.k(), this.f55638l, i12, ((ViewGroup.MarginLayoutParams) rVar).height);
        } else {
            int s6 = o0.s(false, s12, i3, i12, ((ViewGroup.MarginLayoutParams) rVar).height);
            int s10 = o0.s(true, this.f55511q.k(), this.f55637k, i13, ((ViewGroup.MarginLayoutParams) rVar).width);
            i10 = s6;
            i11 = s10;
        }
        x1(i11, i10, view, z10);
    }

    public final void x1(int i3, int i10, View view, boolean z10) {
        boolean u02;
        p0 p0Var = (p0) view.getLayoutParams();
        if (z10) {
            if (this.f55634g && o0.N(view.getMeasuredWidth(), i3, ((ViewGroup.MarginLayoutParams) p0Var).width) && o0.N(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) p0Var).height)) {
                u02 = false;
            } else {
                u02 = true;
            }
        } else {
            u02 = u0(view, i3, i10, p0Var);
        }
        if (u02) {
            view.measure(i3, i10);
        }
    }

    @Override
    public boolean y0() {
        if (this.B == null && !this.I) {
            return true;
        }
        return false;
    }

    public void y1(int i3) {
        if (i3 == this.J) {
            return;
        }
        this.I = true;
        if (i3 >= 1) {
            this.J = i3;
            this.O.j();
            l0();
            return;
        }
        throw new IllegalArgumentException(p1.i(i3, "Span count should be at least 1. Provided "));
    }

    public final void z1(g.p pVar) {
        this.O = pVar;
    }

    public s(int i3, boolean z10) {
        super(1, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new qt(1);
        this.P = new Rect();
        y1(i3);
    }
}
