package v4;

import a8.va;
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
import org.telegram.ui.Components.qf;
import org.telegram.ui.md0;
public abstract class p0 {
    public md0 f59249a;
    public RecyclerView f59250b;
    public final sg.h0 f59251c;
    public final sg.h0 d;
    public b1 f59252e;
    public boolean f59253f;
    public final boolean f59254g;
    public final boolean h;
    public int f59255i;
    public boolean f59256j;
    public int f59257k;
    public int f59258l;
    public int f59259m;
    public int f59260n;

    public p0() {
        qf qfVar = new qf(this, 25);
        f0 f0Var = new f0(this);
        this.f59251c = new sg.h0(qfVar);
        this.d = new sg.h0(f0Var);
        this.f59253f = false;
        this.f59254g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((q0) view.getLayoutParams()).b();
    }

    public static boolean N(int i7, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i7 != i11) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i7) {
                return false;
            }
            return true;
        } else if (size < i7) {
            return false;
        } else {
            return true;
        }
    }

    public static void O(View view, int i7, int i10, int i11, int i12) {
        q0 q0Var = (q0) view.getLayoutParams();
        Rect rect = q0Var.f59266b;
        view.layout(i7 + rect.left + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) q0Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin);
    }

    public static int g(int i7, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i10, i11);
            }
            return size;
        }
        return Math.min(size, Math.max(i10, i11));
    }

    public static int s(boolean r4, int r5, int r6, int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: v4.p0.s(boolean, int, int, int, int):int");
    }

    public static int v(View view) {
        return view.getBottom() + ((q0) view.getLayoutParams()).f59266b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.R0;
        q0 q0Var = (q0) view.getLayoutParams();
        Rect rect2 = q0Var.f59266b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) q0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) q0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((q0) view.getLayoutParams()).f59266b.left;
    }

    public static void x0(View view) {
        f1 U = RecyclerView.U(view);
        U.f59174l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((q0) view.getLayoutParams()).f59266b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((q0) view.getLayoutParams()).f59266b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        i0 i0Var;
        RecyclerView recyclerView = this.f59250b;
        if (recyclerView != null) {
            i0Var = recyclerView.getAdapter();
        } else {
            i0Var = null;
        }
        if (i0Var != null) {
            return i0Var.b();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f59250b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f59250b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f59250b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f59250b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(x0 x0Var, c1 c1Var) {
        RecyclerView recyclerView = this.f59250b;
        if (recyclerView != null && recyclerView.f2839x != null && e()) {
            return this.f59250b.f2839x.b();
        }
        return 1;
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.f59260n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((q0) view.getLayoutParams()).f59266b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f59250b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f59250b.f2837w;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.f59250b;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            f1 U = RecyclerView.U(view);
            U.a(128);
            this.f59250b.f2817f.i(U);
            return;
        }
        throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f59250b.C());
    }

    public void P(View view) {
        q0 q0Var = (q0) view.getLayoutParams();
        Rect W = this.f59250b.W(view);
        int i7 = W.left + W.right;
        int i10 = W.top + W.bottom;
        int s5 = s(d(), this.f59259m, this.f59257k, E() + D() + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin + i7, ((ViewGroup.MarginLayoutParams) q0Var).width);
        int s9 = s(e(), this.f59260n, this.f59258l, C() + F() + ((ViewGroup.MarginLayoutParams) q0Var).topMargin + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) q0Var).height);
        if (u0(view, s5, s9, q0Var)) {
            view.measure(s5, s9);
        }
    }

    public abstract View R(View view, int i7, x0 x0Var, c1 c1Var);

    public void S(x0 x0Var, c1 c1Var, s0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f56785a;
        if (this.f59250b.canScrollVertically(-1) || this.f59250b.canScrollHorizontally(-1)) {
            cVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f59250b.canScrollVertically(1) || this.f59250b.canScrollHorizontally(1)) {
            cVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(x0Var, c1Var), u(x0Var, c1Var), false, 0));
    }

    public final void T(View view, s0.c cVar) {
        f1 U = RecyclerView.U(view);
        if (U != null && !U.j()) {
            md0 md0Var = this.f59249a;
            if (!((ArrayList) md0Var.d).contains(U.f59165a)) {
                RecyclerView recyclerView = this.f59250b;
                U(recyclerView.f2810b, recyclerView.f2836v0, view, cVar);
            }
        }
    }

    public void U(x0 x0Var, c1 c1Var, View view, s0.c cVar) {
        int i7;
        int i10 = 0;
        if (e()) {
            i7 = H(view);
        } else {
            i7 = 0;
        }
        if (d()) {
            i10 = H(view);
        }
        cVar.f56785a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, 1, i10, 1, false, false));
    }

    public final void a(int i7, View view, boolean z10) {
        int D;
        f1 U = RecyclerView.U(view);
        if (!z10 && !U.j()) {
            this.f59250b.f2817f.h(U);
        } else {
            a0.f fVar = (a0.f) this.f59250b.f2817f.f58224b;
            l1 l1Var = (l1) fVar.get(U);
            if (l1Var == null) {
                l1Var = l1.a();
                fVar.put(U, l1Var);
            }
            l1Var.f59226a |= 1;
        }
        q0 q0Var = (q0) view.getLayoutParams();
        if (!U.s() && !U.k()) {
            if (view.getParent() == this.f59250b) {
                md0 md0Var = this.f59249a;
                va vaVar = (va) md0Var.f49858c;
                int indexOfChild = ((RecyclerView) ((qf) md0Var.f49857b).f38895b).indexOfChild(view);
                if (indexOfChild == -1 || vaVar.G(indexOfChild)) {
                    D = -1;
                } else {
                    D = indexOfChild - vaVar.D(indexOfChild);
                }
                if (i7 == -1) {
                    i7 = this.f59249a.u();
                }
                if (D != -1) {
                    if (D != i7) {
                        p0 p0Var = this.f59250b.f2841y;
                        View q10 = p0Var.q(D);
                        if (q10 != null) {
                            p0Var.q(D);
                            p0Var.f59249a.p(D);
                            q0 q0Var2 = (q0) q10.getLayoutParams();
                            f1 U2 = RecyclerView.U(q10);
                            if (U2.j()) {
                                a0.f fVar2 = (a0.f) p0Var.f59250b.f2817f.f58224b;
                                l1 l1Var2 = (l1) fVar2.get(U2);
                                if (l1Var2 == null) {
                                    l1Var2 = l1.a();
                                    fVar2.put(U2, l1Var2);
                                }
                                l1Var2.f59226a = 1 | l1Var2.f59226a;
                            } else {
                                p0Var.f59250b.f2817f.h(U2);
                            }
                            p0Var.f59249a.l(q10, i7, q0Var2, U2.j());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + D + p0Var.f59250b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f59250b.indexOfChild(view) + this.f59250b.C());
                }
            } else {
                this.f59249a.k(i7, view, false);
                q0Var.f59267c = true;
                b1 b1Var = this.f59252e;
                if (b1Var != null && b1Var.f59112e) {
                    b1Var.f59110b.getClass();
                    if (RecyclerView.S(view) == b1Var.f59109a) {
                        b1Var.f59113f = view;
                    }
                }
            }
        } else {
            if (U.k()) {
                U.f59178p.k(U);
            } else {
                U.f59174l &= -33;
            }
            this.f59249a.l(view, i7, view.getLayoutParams(), false);
        }
        if (q0Var.d) {
            U.f59165a.invalidate();
            q0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i7, int i10, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(x0 x0Var, c1 c1Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.f59250b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(c1 c1Var);

    public abstract boolean d();

    public void d0(x0 x0Var, c1 c1Var, int i7, int i10) {
        this.f59250b.q(i7, i10);
    }

    public abstract boolean e();

    public abstract b0 e0();

    public boolean f(q0 q0Var) {
        if (q0Var != null) {
            return true;
        }
        return false;
    }

    public final void g0(x0 x0Var) {
        for (int r10 = r() - 1; r10 >= 0; r10--) {
            if (!RecyclerView.U(q(r10)).r()) {
                i0(r10, x0Var);
            }
        }
    }

    public abstract int h(c1 c1Var);

    public final void h0(x0 x0Var) {
        ArrayList arrayList = (ArrayList) x0Var.f59298c;
        int size = ((ArrayList) x0Var.f59298c).size();
        for (int i7 = size - 1; i7 >= 0; i7--) {
            View view = ((f1) arrayList.get(i7)).f59165a;
            f1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.f59250b.removeDetachedView(view, false);
                }
                n0 n0Var = this.f59250b.f2814d0;
                if (n0Var != null) {
                    n0Var.f(U);
                }
                U.q(true);
                f1 U2 = RecyclerView.U(view);
                U2.f59178p = null;
                U2.f59179q = false;
                U2.f59174l &= -33;
                x0Var.h(U2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) x0Var.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f59250b.invalidate();
        }
    }

    public abstract int i(c1 c1Var);

    public final void i0(int i7, x0 x0Var) {
        View q10 = q(i7);
        if (RecyclerView.U(q10).r()) {
            return;
        }
        j0(i7);
        x0Var.g(q10);
    }

    public abstract int j(c1 c1Var);

    public final void j0(int i7) {
        if (q(i7) != null) {
            md0 md0Var = this.f59249a;
            int x10 = md0Var.x(i7);
            qf qfVar = (qf) md0Var.f49857b;
            View childAt = ((RecyclerView) qfVar.f38895b).getChildAt(x10);
            if (childAt != null) {
                if (((va) md0Var.f49858c).I(x10)) {
                    md0Var.K(childAt);
                }
                qfVar.x0(x10);
            }
        }
    }

    public abstract int k(c1 c1Var);

    public final boolean k0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: v4.p0.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(c1 c1Var);

    public final void l0() {
        RecyclerView recyclerView = this.f59250b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i7);

    public abstract int m0(int i7, x0 x0Var, c1 c1Var);

    public abstract q0 n();

    public abstract void n0(int i7);

    public q0 o(Context context, AttributeSet attributeSet) {
        return new q0(context, attributeSet);
    }

    public abstract int o0(int i7, x0 x0Var, c1 c1Var);

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

    public final View q(int i7) {
        md0 md0Var = this.f59249a;
        if (md0Var != null) {
            return md0Var.t(i7);
        }
        return null;
    }

    public final void q0(int i7, int i10) {
        this.f59259m = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        this.f59257k = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.R0;
        }
        this.f59260n = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.f59258l = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.R0;
        }
    }

    public final int r() {
        md0 md0Var = this.f59249a;
        if (md0Var != null) {
            return md0Var.u();
        }
        return 0;
    }

    public void r0(Rect rect, int i7, int i10) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f59250b;
        WeakHashMap weakHashMap = r0.i0.f56289a;
        this.f59250b.setMeasuredDimension(g(i7, E, recyclerView.getMinimumWidth()), g(i10, C, this.f59250b.getMinimumHeight()));
    }

    public final void s0(int i7, int i10) {
        int r10 = r();
        if (r10 == 0) {
            this.f59250b.q(i7, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < r10; i15++) {
            View q10 = q(i15);
            Rect rect = this.f59250b.f2830r;
            w(q10, rect);
            int i16 = rect.left;
            if (i16 < i14) {
                i14 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i12) {
                i12 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i13) {
                i13 = i19;
            }
        }
        this.f59250b.f2830r.set(i14, i12, i11, i13);
        r0(this.f59250b.f2830r, i7, i10);
    }

    public int[] t(View view, Rect rect) {
        int D = D();
        int F = F();
        int E = this.f59259m - E();
        int C = this.f59260n - C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i7 = left - D;
        int min = Math.min(0, i7);
        int i10 = top - F;
        int min2 = Math.min(0, i10);
        int i11 = width - E;
        int max = Math.max(0, i11);
        int max2 = Math.max(0, height - C);
        RecyclerView recyclerView = this.f59250b;
        WeakHashMap weakHashMap = r0.i0.f56289a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (max == 0) {
                max = Math.max(min, i11);
            }
        } else {
            if (min == 0) {
                min = Math.min(i7, max);
            }
            max = min;
        }
        if (min2 == 0) {
            min2 = Math.min(i10, max2);
        }
        return new int[]{max, min2};
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f59250b = null;
            this.f59249a = null;
            this.f59259m = 0;
            this.f59260n = 0;
        } else {
            this.f59250b = recyclerView;
            this.f59249a = recyclerView.f2815e;
            this.f59259m = recyclerView.getWidth();
            this.f59260n = recyclerView.getHeight();
        }
        this.f59257k = 1073741824;
        this.f59258l = 1073741824;
    }

    public int u(x0 x0Var, c1 c1Var) {
        RecyclerView recyclerView = this.f59250b;
        if (recyclerView != null && recyclerView.f2839x != null && d()) {
            return this.f59250b.f2839x.b();
        }
        return 1;
    }

    public final boolean u0(View view, int i7, int i10, q0 q0Var) {
        if (!view.isLayoutRequested() && this.f59254g && N(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) q0Var).width) && N(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) q0Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void v0(RecyclerView recyclerView, c1 c1Var, int i7);

    public final void w0(b1 b1Var) {
        b1 b1Var2 = this.f59252e;
        if (b1Var2 != null && b1Var != b1Var2 && b1Var2.f59112e) {
            b1Var2.h();
        }
        this.f59252e = b1Var;
        RecyclerView recyclerView = this.f59250b;
        b1Var.getClass();
        recyclerView.P0 = true;
        e1 e1Var = recyclerView.f2833s0;
        RecyclerView recyclerView2 = e1Var.h;
        if (recyclerView2.P0) {
            recyclerView2.removeCallbacks(e1Var);
            e1Var.f59157c.abortAnimation();
        }
        if (b1Var.h) {
            Log.w("RecyclerView", "An instance of " + b1Var.getClass().getSimpleName() + " was started more than once. Each instance of" + b1Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        b1Var.f59110b = recyclerView;
        b1Var.f59111c = this;
        int i7 = b1Var.f59109a;
        if (i7 != -1) {
            recyclerView.f2836v0.f59128a = i7;
            b1Var.f59112e = true;
            b1Var.d = true;
            b1Var.f59113f = recyclerView.f2841y.m(i7);
            b1Var.e();
            b1Var.f59110b.f2833s0.a();
            b1Var.h = true;
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

    public void V(RecyclerView recyclerView, int i7, int i10) {
    }

    public void X(RecyclerView recyclerView, int i7, int i10) {
    }

    public void Y(RecyclerView recyclerView, int i7, int i10) {
    }
}
