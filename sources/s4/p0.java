package s4;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class p0 {
    public la.h f47887a;
    public RecyclerView f47888b;
    public final n7.z0 f47889c;
    public final n7.z0 d;
    public z0 f47890e;
    public boolean f47891f;
    public final boolean f47892g;
    public final boolean h;
    public int f47893i;
    public boolean f47894j;
    public int f47895k;
    public int f47896l;
    public int f47897m;
    public int f47898n;

    public p0() {
        l2.f fVar = new l2.f(this, 24);
        k2.g0 g0Var = new k2.g0(this, 24);
        this.f47889c = new n7.z0(fVar);
        this.d = new n7.z0(g0Var);
        this.f47891f = false;
        this.f47892g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((q0) view.getLayoutParams()).b();
    }

    public static boolean N(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i10) {
                return false;
            }
            return true;
        } else if (size < i10) {
            return false;
        } else {
            return true;
        }
    }

    public static void O(View view, int i10, int i11, int i12, int i13) {
        q0 q0Var = (q0) view.getLayoutParams();
        Rect rect = q0Var.f47905b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) q0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin);
    }

    public static int g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i11, i12);
            }
            return size;
        }
        return Math.min(size, Math.max(i11, i12));
    }

    public static int s(boolean r4, int r5, int r6, int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: s4.p0.s(boolean, int, int, int, int):int");
    }

    public static int v(View view) {
        return view.getBottom() + ((q0) view.getLayoutParams()).f47905b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.Q0;
        q0 q0Var = (q0) view.getLayoutParams();
        Rect rect2 = q0Var.f47905b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) q0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) q0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((q0) view.getLayoutParams()).f47905b.left;
    }

    public static void x0(View view) {
        d1 U = RecyclerView.U(view);
        U.f47791l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((q0) view.getLayoutParams()).f47905b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((q0) view.getLayoutParams()).f47905b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        i0 i0Var;
        RecyclerView recyclerView = this.f47888b;
        if (recyclerView != null) {
            i0Var = recyclerView.getAdapter();
        } else {
            i0Var = null;
        }
        if (i0Var != null) {
            return i0Var.h();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f47888b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f47888b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f47888b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f47888b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(pf.e eVar, a1 a1Var) {
        RecyclerView recyclerView = this.f47888b;
        if (recyclerView != null && recyclerView.f3167w != null && e()) {
            return this.f47888b.f3167w.h();
        }
        return 1;
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.f47898n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((q0) view.getLayoutParams()).f47905b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f47888b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f47888b.v;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.f47888b;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            d1 U = RecyclerView.U(view);
            U.a(128);
            this.f47888b.f3147f.d0(U);
            return;
        }
        throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f47888b.C());
    }

    public void P(View view) {
        q0 q0Var = (q0) view.getLayoutParams();
        Rect W = this.f47888b.W(view);
        int i10 = W.left + W.right;
        int i11 = W.top + W.bottom;
        int s10 = s(d(), this.f47897m, this.f47895k, E() + D() + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin + i10, ((ViewGroup.MarginLayoutParams) q0Var).width);
        int s11 = s(e(), this.f47898n, this.f47896l, C() + F() + ((ViewGroup.MarginLayoutParams) q0Var).topMargin + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) q0Var).height);
        if (u0(view, s10, s11, q0Var)) {
            view.measure(s10, s11);
        }
    }

    public abstract View R(View view, int i10, pf.e eVar, a1 a1Var);

    public void S(pf.e eVar, a1 a1Var, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47711a;
        if (this.f47888b.canScrollVertically(-1) || this.f47888b.canScrollHorizontally(-1)) {
            dVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f47888b.canScrollVertically(1) || this.f47888b.canScrollHorizontally(1)) {
            dVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(eVar, a1Var), u(eVar, a1Var), false, 0));
    }

    public final void T(View view, s0.d dVar) {
        d1 U = RecyclerView.U(view);
        if (U != null && !U.j()) {
            la.h hVar = this.f47887a;
            if (!((ArrayList) hVar.d).contains(U.f47782a)) {
                RecyclerView recyclerView = this.f47888b;
                U(recyclerView.f3140b, recyclerView.f3165u0, view, dVar);
            }
        }
    }

    public void U(pf.e eVar, a1 a1Var, View view, s0.d dVar) {
        int i10;
        int i11 = 0;
        if (e()) {
            i10 = H(view);
        } else {
            i10 = 0;
        }
        if (d()) {
            i11 = H(view);
        }
        dVar.f47711a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, 1, i11, 1, false, false));
    }

    public final void a(View view, int i10, boolean z10) {
        int z11;
        d1 U = RecyclerView.U(view);
        if (!z10 && !U.j()) {
            this.f47888b.f3147f.c0(U);
        } else {
            a0.f fVar = (a0.f) this.f47888b.f3147f.f16765b;
            k1 k1Var = (k1) fVar.get(U);
            if (k1Var == null) {
                k1Var = k1.a();
                fVar.put(U, k1Var);
            }
            k1Var.f47859a |= 1;
        }
        q0 q0Var = (q0) view.getLayoutParams();
        if (!U.s() && !U.k()) {
            if (view.getParent() == this.f47888b) {
                la.h hVar = this.f47887a;
                e6.n nVar = (e6.n) hVar.f15502c;
                int indexOfChild = ((RecyclerView) ((k2.g0) hVar.f15501b).f14469b).indexOfChild(view);
                if (indexOfChild == -1 || nVar.D(indexOfChild)) {
                    z11 = -1;
                } else {
                    z11 = indexOfChild - nVar.z(indexOfChild);
                }
                if (i10 == -1) {
                    i10 = this.f47887a.D();
                }
                if (z11 != -1) {
                    if (z11 != i10) {
                        p0 p0Var = this.f47888b.f3169x;
                        View q6 = p0Var.q(z11);
                        if (q6 != null) {
                            p0Var.q(z11);
                            p0Var.f47887a.y(z11);
                            q0 q0Var2 = (q0) q6.getLayoutParams();
                            d1 U2 = RecyclerView.U(q6);
                            if (U2.j()) {
                                a0.f fVar2 = (a0.f) p0Var.f47888b.f3147f.f16765b;
                                k1 k1Var2 = (k1) fVar2.get(U2);
                                if (k1Var2 == null) {
                                    k1Var2 = k1.a();
                                    fVar2.put(U2, k1Var2);
                                }
                                k1Var2.f47859a = 1 | k1Var2.f47859a;
                            } else {
                                p0Var.f47888b.f3147f.c0(U2);
                            }
                            p0Var.f47887a.p(q6, i10, q0Var2, U2.j());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + z11 + p0Var.f47888b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f47888b.indexOfChild(view) + this.f47888b.C());
                }
            } else {
                this.f47887a.l(view, i10, false);
                q0Var.f47906c = true;
                z0 z0Var = this.f47890e;
                if (z0Var != null && z0Var.f47954e) {
                    z0Var.f47952b.getClass();
                    if (RecyclerView.S(view) == z0Var.f47951a) {
                        z0Var.f47955f = view;
                    }
                }
            }
        } else {
            if (U.k()) {
                U.f47795p.k(U);
            } else {
                U.f47791l &= -33;
            }
            this.f47887a.p(view, i10, view.getLayoutParams(), false);
        }
        if (q0Var.d) {
            U.f47782a.invalidate();
            q0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(pf.e eVar, a1 a1Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.f47888b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(a1 a1Var);

    public abstract boolean d();

    public void d0(pf.e eVar, a1 a1Var, int i10, int i11) {
        this.f47888b.q(i10, i11);
    }

    public abstract boolean e();

    public abstract c0 e0();

    public boolean f(q0 q0Var) {
        if (q0Var != null) {
            return true;
        }
        return false;
    }

    public final void g0(pf.e eVar) {
        for (int r10 = r() - 1; r10 >= 0; r10--) {
            if (!RecyclerView.U(q(r10)).r()) {
                i0(r10, eVar);
            }
        }
    }

    public abstract int h(a1 a1Var);

    public final void h0(pf.e eVar) {
        ArrayList arrayList = (ArrayList) eVar.f45641c;
        int size = ((ArrayList) eVar.f45641c).size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((d1) arrayList.get(i10)).f47782a;
            d1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.f47888b.removeDetachedView(view, false);
                }
                n0 n0Var = this.f47888b.f3143c0;
                if (n0Var != null) {
                    n0Var.f(U);
                }
                U.q(true);
                d1 U2 = RecyclerView.U(view);
                U2.f47795p = null;
                U2.f47796q = false;
                U2.f47791l &= -33;
                eVar.h(U2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) eVar.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f47888b.invalidate();
        }
    }

    public abstract int i(a1 a1Var);

    public final void i0(int i10, pf.e eVar) {
        View q6 = q(i10);
        if (RecyclerView.U(q6).r()) {
            return;
        }
        j0(i10);
        eVar.g(q6);
    }

    public abstract int j(a1 a1Var);

    public final void j0(int i10) {
        if (q(i10) != null) {
            la.h hVar = this.f47887a;
            int K = hVar.K(i10);
            k2.g0 g0Var = (k2.g0) hVar.f15501b;
            View childAt = ((RecyclerView) g0Var.f14469b).getChildAt(K);
            if (childAt != null) {
                if (((e6.n) hVar.f15502c).F(K)) {
                    hVar.Z(childAt);
                }
                g0Var.Z0(K);
            }
        }
    }

    public abstract int k(a1 a1Var);

    public final boolean k0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: s4.p0.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(a1 a1Var);

    public final void l0() {
        RecyclerView recyclerView = this.f47888b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i10);

    public abstract int m0(int i10, pf.e eVar, a1 a1Var);

    public abstract q0 n();

    public abstract void n0(int i10);

    public q0 o(Context context, AttributeSet attributeSet) {
        return new q0(context, attributeSet);
    }

    public abstract int o0(int i10, pf.e eVar, a1 a1Var);

    public q0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof q0) {
            return new q0((q0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new q0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new q0(layoutParams);
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final View q(int i10) {
        la.h hVar = this.f47887a;
        if (hVar != null) {
            return hVar.C(i10);
        }
        return null;
    }

    public final void q0(int i10, int i11) {
        this.f47897m = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f47895k = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.Q0;
        }
        this.f47898n = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f47896l = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.Q0;
        }
    }

    public final int r() {
        la.h hVar = this.f47887a;
        if (hVar != null) {
            return hVar.D();
        }
        return 0;
    }

    public void r0(Rect rect, int i10, int i11) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f47888b;
        WeakHashMap weakHashMap = r0.i0.f46890a;
        this.f47888b.setMeasuredDimension(g(i10, E, recyclerView.getMinimumWidth()), g(i11, C, this.f47888b.getMinimumHeight()));
    }

    public final void s0(int i10, int i11) {
        int r10 = r();
        if (r10 == 0) {
            this.f47888b.q(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < r10; i16++) {
            View q6 = q(i16);
            Rect rect = this.f47888b.f3160r;
            w(q6, rect);
            int i17 = rect.left;
            if (i17 < i15) {
                i15 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i13) {
                i13 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i14) {
                i14 = i20;
            }
        }
        this.f47888b.f3160r.set(i15, i13, i12, i14);
        r0(this.f47888b.f3160r, i10, i11);
    }

    public int[] t(View view, Rect rect) {
        int D = D();
        int F = F();
        int E = this.f47897m - E();
        int C = this.f47898n - C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i10 = left - D;
        int min = Math.min(0, i10);
        int i11 = top - F;
        int min2 = Math.min(0, i11);
        int i12 = width - E;
        int max = Math.max(0, i12);
        int max2 = Math.max(0, height - C);
        RecyclerView recyclerView = this.f47888b;
        WeakHashMap weakHashMap = r0.i0.f46890a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (max == 0) {
                max = Math.max(min, i12);
            }
        } else {
            if (min == 0) {
                min = Math.min(i10, max);
            }
            max = min;
        }
        if (min2 == 0) {
            min2 = Math.min(i11, max2);
        }
        return new int[]{max, min2};
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f47888b = null;
            this.f47887a = null;
            this.f47897m = 0;
            this.f47898n = 0;
        } else {
            this.f47888b = recyclerView;
            this.f47887a = recyclerView.f3145e;
            this.f47897m = recyclerView.getWidth();
            this.f47898n = recyclerView.getHeight();
        }
        this.f47895k = 1073741824;
        this.f47896l = 1073741824;
    }

    public int u(pf.e eVar, a1 a1Var) {
        RecyclerView recyclerView = this.f47888b;
        if (recyclerView != null && recyclerView.f3167w != null && d()) {
            return this.f47888b.f3167w.h();
        }
        return 1;
    }

    public final boolean u0(View view, int i10, int i11, q0 q0Var) {
        if (!view.isLayoutRequested() && this.f47892g && N(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) q0Var).width) && N(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) q0Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void v0(RecyclerView recyclerView, a1 a1Var, int i10);

    public final void w0(z0 z0Var) {
        z0 z0Var2 = this.f47890e;
        if (z0Var2 != null && z0Var != z0Var2 && z0Var2.f47954e) {
            z0Var2.h();
        }
        this.f47890e = z0Var;
        RecyclerView recyclerView = this.f47888b;
        z0Var.getClass();
        recyclerView.O0 = true;
        c1 c1Var = recyclerView.f3161r0;
        RecyclerView recyclerView2 = c1Var.h;
        if (recyclerView2.O0) {
            recyclerView2.removeCallbacks(c1Var);
            c1Var.f47764c.abortAnimation();
        }
        if (z0Var.h) {
            Log.w("RecyclerView", "An instance of " + z0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + z0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        z0Var.f47952b = recyclerView;
        z0Var.f47953c = this;
        int i10 = z0Var.f47951a;
        if (i10 != -1) {
            recyclerView.f3165u0.f47732a = i10;
            z0Var.f47954e = true;
            z0Var.d = true;
            z0Var.f47955f = recyclerView.f3169x.m(i10);
            z0Var.e();
            z0Var.f47952b.f3161r0.a();
            z0Var.h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public abstract boolean y0();

    public void Q() {
    }

    public void Z() {
    }

    public void f0() {
    }

    public void W(RecyclerView recyclerView) {
    }

    public void V(RecyclerView recyclerView, int i10, int i11) {
    }

    public void X(RecyclerView recyclerView, int i10, int i11) {
    }

    public void Y(RecyclerView recyclerView, int i10, int i11) {
    }
}
