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
import ii.n4;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class o0 {
    public la.h f46641a;
    public RecyclerView f46642b;
    public final o0.a f46643c;
    public final o0.a d;
    public y0 f46644e;
    public boolean f46645f;
    public final boolean f46646g;
    public final boolean h;
    public int f46647i;
    public boolean f46648j;
    public int f46649k;
    public int f46650l;
    public int f46651m;
    public int f46652n;

    public o0() {
        k2.e eVar = new k2.e(this, 20);
        n4 n4Var = new n4(this, 24);
        this.f46643c = new o0.a(eVar);
        this.d = new o0.a(n4Var);
        this.f46645f = false;
        this.f46646g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((p0) view.getLayoutParams()).b();
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
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect = p0Var.f46658b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) p0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin);
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
        throw new UnsupportedOperationException("Method not decompiled: s4.o0.s(boolean, int, int, int, int):int");
    }

    public static int v(View view) {
        return view.getBottom() + ((p0) view.getLayoutParams()).f46658b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.P0;
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect2 = p0Var.f46658b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((p0) view.getLayoutParams()).f46658b.left;
    }

    public static void x0(View view) {
        c1 U = RecyclerView.U(view);
        U.f46547l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((p0) view.getLayoutParams()).f46658b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((p0) view.getLayoutParams()).f46658b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        h0 h0Var;
        RecyclerView recyclerView = this.f46642b;
        if (recyclerView != null) {
            h0Var = recyclerView.getAdapter();
        } else {
            h0Var = null;
        }
        if (h0Var != null) {
            return h0Var.h();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f46642b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f46642b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f46642b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f46642b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(of.e eVar, z0 z0Var) {
        RecyclerView recyclerView = this.f46642b;
        if (recyclerView != null && recyclerView.f3088w != null && e()) {
            return this.f46642b.f3088w.h();
        }
        return 1;
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.f46652n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((p0) view.getLayoutParams()).f46658b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f46642b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f46642b.v;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.f46642b;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            c1 U = RecyclerView.U(view);
            U.a(128);
            this.f46642b.f3068f.E(U);
            return;
        }
        throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f46642b.C());
    }

    public void P(View view) {
        p0 p0Var = (p0) view.getLayoutParams();
        Rect W = this.f46642b.W(view);
        int i10 = W.left + W.right;
        int i11 = W.top + W.bottom;
        int s10 = s(d(), this.f46651m, this.f46649k, E() + D() + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin + i10, ((ViewGroup.MarginLayoutParams) p0Var).width);
        int s11 = s(e(), this.f46652n, this.f46650l, C() + F() + ((ViewGroup.MarginLayoutParams) p0Var).topMargin + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) p0Var).height);
        if (u0(view, s10, s11, p0Var)) {
            view.measure(s10, s11);
        }
    }

    public abstract View R(View view, int i10, of.e eVar, z0 z0Var);

    public void S(of.e eVar, z0 z0Var, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46485a;
        if (this.f46642b.canScrollVertically(-1) || this.f46642b.canScrollHorizontally(-1)) {
            dVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f46642b.canScrollVertically(1) || this.f46642b.canScrollHorizontally(1)) {
            dVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(eVar, z0Var), u(eVar, z0Var), false, 0));
    }

    public final void T(View view, s0.d dVar) {
        c1 U = RecyclerView.U(view);
        if (U != null && !U.j()) {
            la.h hVar = this.f46641a;
            if (!((ArrayList) hVar.d).contains(U.f46538a)) {
                RecyclerView recyclerView = this.f46642b;
                U(recyclerView.f3061b, recyclerView.f3085t0, view, dVar);
            }
        }
    }

    public void U(of.e eVar, z0 z0Var, View view, s0.d dVar) {
        int i10;
        int i11;
        if (e()) {
            i10 = H(view);
        } else {
            i10 = 0;
        }
        if (d()) {
            i11 = H(view);
        } else {
            i11 = 0;
        }
        dVar.f46485a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, 1, i11, 1, false, false));
    }

    public final void a(View view, int i10, boolean z10) {
        int v;
        c1 U = RecyclerView.U(view);
        if (!z10 && !U.j()) {
            this.f46642b.f3068f.D(U);
        } else {
            a0.f fVar = (a0.f) this.f46642b.f3068f.f16856b;
            i1 i1Var = (i1) fVar.get(U);
            if (i1Var == null) {
                i1Var = i1.a();
                fVar.put(U, i1Var);
            }
            i1Var.f46600a |= 1;
        }
        p0 p0Var = (p0) view.getLayoutParams();
        if (!U.s() && !U.k()) {
            if (view.getParent() == this.f46642b) {
                la.h hVar = this.f46641a;
                e6.n nVar = (e6.n) hVar.f15400c;
                int indexOfChild = ((hh.h) hVar.f15399b).f11463a.indexOfChild(view);
                if (indexOfChild == -1 || nVar.y(indexOfChild)) {
                    v = -1;
                } else {
                    v = indexOfChild - nVar.v(indexOfChild);
                }
                if (i10 == -1) {
                    i10 = this.f46641a.x();
                }
                if (v != -1) {
                    if (v != i10) {
                        o0 o0Var = this.f46642b.f3090x;
                        View q6 = o0Var.q(v);
                        if (q6 != null) {
                            o0Var.q(v);
                            o0Var.f46641a.s(v);
                            p0 p0Var2 = (p0) q6.getLayoutParams();
                            c1 U2 = RecyclerView.U(q6);
                            if (U2.j()) {
                                a0.f fVar2 = (a0.f) o0Var.f46642b.f3068f.f16856b;
                                i1 i1Var2 = (i1) fVar2.get(U2);
                                if (i1Var2 == null) {
                                    i1Var2 = i1.a();
                                    fVar2.put(U2, i1Var2);
                                }
                                i1Var2.f46600a = 1 | i1Var2.f46600a;
                            } else {
                                o0Var.f46642b.f3068f.D(U2);
                            }
                            o0Var.f46641a.n(q6, i10, p0Var2, U2.j());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + v + o0Var.f46642b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f46642b.indexOfChild(view) + this.f46642b.C());
                }
            } else {
                this.f46641a.m(view, i10, false);
                p0Var.f46659c = true;
                y0 y0Var = this.f46644e;
                if (y0Var != null && y0Var.f46709e) {
                    y0Var.f46707b.getClass();
                    if (RecyclerView.S(view) == y0Var.f46706a) {
                        y0Var.f46710f = view;
                    }
                }
            }
        } else {
            if (U.k()) {
                U.f46551p.k(U);
            } else {
                U.f46547l &= -33;
            }
            this.f46641a.n(view, i10, view.getLayoutParams(), false);
        }
        if (p0Var.d) {
            U.f46538a.invalidate();
            p0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(of.e eVar, z0 z0Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.f46642b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(z0 z0Var);

    public abstract boolean d();

    public void d0(of.e eVar, z0 z0Var, int i10, int i11) {
        this.f46642b.q(i10, i11);
    }

    public abstract boolean e();

    public abstract b0 e0();

    public boolean f(p0 p0Var) {
        if (p0Var != null) {
            return true;
        }
        return false;
    }

    public final void g0(of.e eVar) {
        for (int r10 = r() - 1; r10 >= 0; r10--) {
            if (!RecyclerView.U(q(r10)).r()) {
                i0(r10, eVar);
            }
        }
    }

    public abstract int h(z0 z0Var);

    public final void h0(of.e eVar) {
        ArrayList arrayList = (ArrayList) eVar.f17182c;
        int size = ((ArrayList) eVar.f17182c).size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((c1) arrayList.get(i10)).f46538a;
            c1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.f46642b.removeDetachedView(view, false);
                }
                m0 m0Var = this.f46642b.f3064c0;
                if (m0Var != null) {
                    m0Var.f(U);
                }
                U.q(true);
                c1 U2 = RecyclerView.U(view);
                U2.f46551p = null;
                U2.f46552q = false;
                U2.f46547l &= -33;
                eVar.h(U2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) eVar.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f46642b.invalidate();
        }
    }

    public abstract int i(z0 z0Var);

    public final void i0(int i10, of.e eVar) {
        View q6 = q(i10);
        if (RecyclerView.U(q6).r()) {
            return;
        }
        j0(i10);
        eVar.g(q6);
    }

    public abstract int j(z0 z0Var);

    public final void j0(int i10) {
        if (q(i10) != null) {
            la.h hVar = this.f46641a;
            int G = hVar.G(i10);
            hh.h hVar2 = (hh.h) hVar.f15399b;
            View childAt = hVar2.f11463a.getChildAt(G);
            if (childAt != null) {
                if (((e6.n) hVar.f15400c).A(G)) {
                    hVar.Y(childAt);
                }
                hVar2.a(G);
            }
        }
    }

    public abstract int k(z0 z0Var);

    public final boolean k0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: s4.o0.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(z0 z0Var);

    public final void l0() {
        RecyclerView recyclerView = this.f46642b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i10);

    public abstract int m0(int i10, of.e eVar, z0 z0Var);

    public abstract p0 n();

    public abstract void n0(int i10);

    public p0 o(Context context, AttributeSet attributeSet) {
        return new p0(context, attributeSet);
    }

    public abstract int o0(int i10, of.e eVar, z0 z0Var);

    public p0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof p0) {
            return new p0((p0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new p0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new p0(layoutParams);
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final View q(int i10) {
        la.h hVar = this.f46641a;
        if (hVar != null) {
            return hVar.w(i10);
        }
        return null;
    }

    public final void q0(int i10, int i11) {
        this.f46651m = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f46649k = mode;
        if (mode == 0 && !RecyclerView.Q0) {
            this.f46651m = 0;
        }
        this.f46652n = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f46650l = mode2;
        if (mode2 == 0 && !RecyclerView.Q0) {
            this.f46652n = 0;
        }
    }

    public final int r() {
        la.h hVar = this.f46641a;
        if (hVar != null) {
            return hVar.x();
        }
        return 0;
    }

    public void r0(Rect rect, int i10, int i11) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f46642b;
        WeakHashMap weakHashMap = r0.i0.f45610a;
        this.f46642b.setMeasuredDimension(g(i10, E, recyclerView.getMinimumWidth()), g(i11, C, this.f46642b.getMinimumHeight()));
    }

    public final void s0(int i10, int i11) {
        int r10 = r();
        if (r10 == 0) {
            this.f46642b.q(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < r10; i16++) {
            View q6 = q(i16);
            Rect rect = this.f46642b.f3081r;
            w(q6, rect);
            int i17 = rect.left;
            if (i17 < i14) {
                i14 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i15) {
                i15 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i13) {
                i13 = i20;
            }
        }
        this.f46642b.f3081r.set(i14, i15, i12, i13);
        r0(this.f46642b.f3081r, i10, i11);
    }

    public int[] t(View view, Rect rect) {
        int D = D();
        int F = F();
        int E = this.f46651m - E();
        int C = this.f46652n - C();
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
        RecyclerView recyclerView = this.f46642b;
        WeakHashMap weakHashMap = r0.i0.f45610a;
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
            this.f46642b = null;
            this.f46641a = null;
            this.f46651m = 0;
            this.f46652n = 0;
        } else {
            this.f46642b = recyclerView;
            this.f46641a = recyclerView.f3066e;
            this.f46651m = recyclerView.getWidth();
            this.f46652n = recyclerView.getHeight();
        }
        this.f46649k = 1073741824;
        this.f46650l = 1073741824;
    }

    public int u(of.e eVar, z0 z0Var) {
        RecyclerView recyclerView = this.f46642b;
        if (recyclerView != null && recyclerView.f3088w != null && d()) {
            return this.f46642b.f3088w.h();
        }
        return 1;
    }

    public final boolean u0(View view, int i10, int i11, p0 p0Var) {
        if (!view.isLayoutRequested() && this.f46646g && N(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) p0Var).width) && N(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) p0Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void v0(RecyclerView recyclerView, z0 z0Var, int i10);

    public final void w0(y0 y0Var) {
        y0 y0Var2 = this.f46644e;
        if (y0Var2 != null && y0Var != y0Var2 && y0Var2.f46709e) {
            y0Var2.h();
        }
        this.f46644e = y0Var;
        RecyclerView recyclerView = this.f46642b;
        y0Var.getClass();
        recyclerView.N0 = true;
        b1 b1Var = recyclerView.f3080q0;
        RecyclerView recyclerView2 = b1Var.h;
        if (recyclerView2.N0) {
            recyclerView2.removeCallbacks(b1Var);
            b1Var.f46521c.abortAnimation();
        }
        if (y0Var.h) {
            Log.w("RecyclerView", "An instance of " + y0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + y0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        y0Var.f46707b = recyclerView;
        y0Var.f46708c = this;
        int i10 = y0Var.f46706a;
        if (i10 != -1) {
            recyclerView.f3085t0.f46715a = i10;
            y0Var.f46709e = true;
            y0Var.d = true;
            y0Var.f46710f = recyclerView.f3090x.m(i10);
            y0Var.e();
            y0Var.f46707b.f3080q0.a();
            y0Var.h = true;
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
