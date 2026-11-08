package v4;

import a8.ua;
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
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.vy;
import org.telegram.ui.hy0;
public abstract class n0 {
    public hy0 f57131a;
    public RecyclerView f57132b;
    public final sg.i0 f57133c;
    public final sg.i0 d;
    public z0 f57134e;
    public boolean f57135f;
    public final boolean f57136g;
    public final boolean h;
    public int f57137i;
    public boolean f57138j;
    public int f57139k;
    public int f57140l;
    public int f57141m;
    public int f57142n;

    public n0() {
        vy vyVar = new vy(this, 26);
        rt rtVar = new rt(this, 23);
        this.f57133c = new sg.i0(vyVar);
        this.d = new sg.i0(rtVar);
        this.f57135f = false;
        this.f57136g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((o0) view.getLayoutParams()).b();
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
        o0 o0Var = (o0) view.getLayoutParams();
        Rect rect = o0Var.f57145b;
        view.layout(i7 + rect.left + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) o0Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin);
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
        throw new UnsupportedOperationException("Method not decompiled: v4.n0.s(boolean, int, int, int, int):int");
    }

    public static int v(View view) {
        return view.getBottom() + ((o0) view.getLayoutParams()).f57145b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.Q0;
        o0 o0Var = (o0) view.getLayoutParams();
        Rect rect2 = o0Var.f57145b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) o0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((o0) view.getLayoutParams()).f57145b.left;
    }

    public static void x0(View view) {
        d1 U = RecyclerView.U(view);
        U.f57053l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((o0) view.getLayoutParams()).f57145b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((o0) view.getLayoutParams()).f57145b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        g0 g0Var;
        RecyclerView recyclerView = this.f57132b;
        if (recyclerView != null) {
            g0Var = recyclerView.getAdapter();
        } else {
            g0Var = null;
        }
        if (g0Var != null) {
            return g0Var.b();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f57132b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f57132b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f57132b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f57132b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(v0 v0Var, a1 a1Var) {
        RecyclerView recyclerView = this.f57132b;
        if (recyclerView != null && recyclerView.f2871x != null && e()) {
            return this.f57132b.f2871x.b();
        }
        return 1;
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.f57142n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((o0) view.getLayoutParams()).f57145b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f57132b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f57132b.f2869w;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.f57132b;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            d1 U = RecyclerView.U(view);
            U.a(128);
            this.f57132b.f2849f.T0(U);
            return;
        }
        throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f57132b.C());
    }

    public void P(View view) {
        o0 o0Var = (o0) view.getLayoutParams();
        Rect W = this.f57132b.W(view);
        int i7 = W.left + W.right;
        int i10 = W.top + W.bottom;
        int s5 = s(d(), this.f57141m, this.f57139k, E() + D() + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin + i7, ((ViewGroup.MarginLayoutParams) o0Var).width);
        int s9 = s(e(), this.f57142n, this.f57140l, C() + F() + ((ViewGroup.MarginLayoutParams) o0Var).topMargin + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) o0Var).height);
        if (u0(view, s5, s9, o0Var)) {
            view.measure(s5, s9);
        }
    }

    public abstract View R(View view, int i7, v0 v0Var, a1 a1Var);

    public void S(v0 v0Var, a1 a1Var, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54601a;
        if (this.f57132b.canScrollVertically(-1) || this.f57132b.canScrollHorizontally(-1)) {
            dVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f57132b.canScrollVertically(1) || this.f57132b.canScrollHorizontally(1)) {
            dVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(v0Var, a1Var), u(v0Var, a1Var), false, 0));
    }

    public final void T(View view, s0.d dVar) {
        d1 U = RecyclerView.U(view);
        if (U != null && !U.j()) {
            hy0 hy0Var = this.f57131a;
            if (!((ArrayList) hy0Var.d).contains(U.f57044a)) {
                RecyclerView recyclerView = this.f57132b;
                U(recyclerView.f2842b, recyclerView.f2867u0, view, dVar);
            }
        }
    }

    public void U(v0 v0Var, a1 a1Var, View view, s0.d dVar) {
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
        dVar.f54601a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, 1, i10, 1, false, false));
    }

    public final void a(int i7, View view, boolean z9) {
        int B;
        d1 U = RecyclerView.U(view);
        if (!z9 && !U.j()) {
            this.f57132b.f2849f.S0(U);
        } else {
            a0.f fVar = (a0.f) this.f57132b.f2849f.f19611a;
            j1 j1Var = (j1) fVar.get(U);
            if (j1Var == null) {
                j1Var = j1.a();
                fVar.put(U, j1Var);
            }
            j1Var.f57097a |= 1;
        }
        o0 o0Var = (o0) view.getLayoutParams();
        if (!U.s() && !U.k()) {
            if (view.getParent() == this.f57132b) {
                hy0 hy0Var = this.f57131a;
                ua uaVar = (ua) hy0Var.f46527c;
                int indexOfChild = ((RecyclerView) ((vy) hy0Var.f46526b).f39747b).indexOfChild(view);
                if (indexOfChild == -1 || uaVar.E(indexOfChild)) {
                    B = -1;
                } else {
                    B = indexOfChild - uaVar.B(indexOfChild);
                }
                if (i7 == -1) {
                    i7 = this.f57131a.v();
                }
                if (B != -1) {
                    if (B != i7) {
                        n0 n0Var = this.f57132b.f2873y;
                        View q10 = n0Var.q(B);
                        if (q10 != null) {
                            n0Var.q(B);
                            n0Var.f57131a.p(B);
                            o0 o0Var2 = (o0) q10.getLayoutParams();
                            d1 U2 = RecyclerView.U(q10);
                            if (U2.j()) {
                                a0.f fVar2 = (a0.f) n0Var.f57132b.f2849f.f19611a;
                                j1 j1Var2 = (j1) fVar2.get(U2);
                                if (j1Var2 == null) {
                                    j1Var2 = j1.a();
                                    fVar2.put(U2, j1Var2);
                                }
                                j1Var2.f57097a = 1 | j1Var2.f57097a;
                            } else {
                                n0Var.f57132b.f2849f.S0(U2);
                            }
                            n0Var.f57131a.l(q10, i7, o0Var2, U2.j());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + B + n0Var.f57132b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f57132b.indexOfChild(view) + this.f57132b.C());
                }
            } else {
                this.f57131a.k(i7, view, false);
                o0Var.f57146c = true;
                z0 z0Var = this.f57134e;
                if (z0Var != null && z0Var.f57216e) {
                    z0Var.f57214b.getClass();
                    if (RecyclerView.S(view) == z0Var.f57213a) {
                        z0Var.f57217f = view;
                    }
                }
            }
        } else {
            if (U.k()) {
                U.f57057p.k(U);
            } else {
                U.f57053l &= -33;
            }
            this.f57131a.l(view, i7, view.getLayoutParams(), false);
        }
        if (o0Var.d) {
            U.f57044a.invalidate();
            o0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i7, int i10, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(v0 v0Var, a1 a1Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.f57132b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(a1 a1Var);

    public abstract boolean d();

    public void d0(v0 v0Var, a1 a1Var, int i7, int i10) {
        this.f57132b.q(i7, i10);
    }

    public abstract boolean e();

    public abstract a0 e0();

    public boolean f(o0 o0Var) {
        if (o0Var != null) {
            return true;
        }
        return false;
    }

    public final void g0(v0 v0Var) {
        for (int r10 = r() - 1; r10 >= 0; r10--) {
            if (!RecyclerView.U(q(r10)).r()) {
                i0(r10, v0Var);
            }
        }
    }

    public abstract int h(a1 a1Var);

    public final void h0(v0 v0Var) {
        ArrayList arrayList = (ArrayList) v0Var.f57179c;
        int size = ((ArrayList) v0Var.f57179c).size();
        for (int i7 = size - 1; i7 >= 0; i7--) {
            View view = ((d1) arrayList.get(i7)).f57044a;
            d1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.f57132b.removeDetachedView(view, false);
                }
                l0 l0Var = this.f57132b.f2845c0;
                if (l0Var != null) {
                    l0Var.f(U);
                }
                U.q(true);
                d1 U2 = RecyclerView.U(view);
                U2.f57057p = null;
                U2.f57058q = false;
                U2.f57053l &= -33;
                v0Var.h(U2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) v0Var.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f57132b.invalidate();
        }
    }

    public abstract int i(a1 a1Var);

    public final void i0(int i7, v0 v0Var) {
        View q10 = q(i7);
        if (RecyclerView.U(q10).r()) {
            return;
        }
        j0(i7);
        v0Var.g(q10);
    }

    public abstract int j(a1 a1Var);

    public final void j0(int i7) {
        if (q(i7) != null) {
            hy0 hy0Var = this.f57131a;
            int z9 = hy0Var.z(i7);
            vy vyVar = (vy) hy0Var.f46526b;
            View childAt = ((RecyclerView) vyVar.f39747b).getChildAt(z9);
            if (childAt != null) {
                if (((ua) hy0Var.f46527c).G(z9)) {
                    hy0Var.M(childAt);
                }
                vyVar.Q(z9);
            }
        }
    }

    public abstract int k(a1 a1Var);

    public final boolean k0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: v4.n0.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(a1 a1Var);

    public final void l0() {
        RecyclerView recyclerView = this.f57132b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i7);

    public abstract int m0(int i7, v0 v0Var, a1 a1Var);

    public abstract o0 n();

    public abstract void n0(int i7);

    public o0 o(Context context, AttributeSet attributeSet) {
        return new o0(context, attributeSet);
    }

    public abstract int o0(int i7, v0 v0Var, a1 a1Var);

    public o0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof o0) {
            return new o0((o0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new o0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new o0(layoutParams);
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final View q(int i7) {
        hy0 hy0Var = this.f57131a;
        if (hy0Var != null) {
            return hy0Var.u(i7);
        }
        return null;
    }

    public final void q0(int i7, int i10) {
        this.f57141m = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        this.f57139k = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.Q0;
        }
        this.f57142n = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.f57140l = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.Q0;
        }
    }

    public final int r() {
        hy0 hy0Var = this.f57131a;
        if (hy0Var != null) {
            return hy0Var.v();
        }
        return 0;
    }

    public void r0(Rect rect, int i7, int i10) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f57132b;
        WeakHashMap weakHashMap = r0.i0.f54191a;
        this.f57132b.setMeasuredDimension(g(i7, E, recyclerView.getMinimumWidth()), g(i10, C, this.f57132b.getMinimumHeight()));
    }

    public final void s0(int i7, int i10) {
        int r10 = r();
        if (r10 == 0) {
            this.f57132b.q(i7, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < r10; i15++) {
            View q10 = q(i15);
            Rect rect = this.f57132b.f2862r;
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
        this.f57132b.f2862r.set(i14, i12, i11, i13);
        r0(this.f57132b.f2862r, i7, i10);
    }

    public int[] t(View view, Rect rect) {
        int D = D();
        int F = F();
        int E = this.f57141m - E();
        int C = this.f57142n - C();
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
        RecyclerView recyclerView = this.f57132b;
        WeakHashMap weakHashMap = r0.i0.f54191a;
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
            this.f57132b = null;
            this.f57131a = null;
            this.f57141m = 0;
            this.f57142n = 0;
        } else {
            this.f57132b = recyclerView;
            this.f57131a = recyclerView.f2847e;
            this.f57141m = recyclerView.getWidth();
            this.f57142n = recyclerView.getHeight();
        }
        this.f57139k = 1073741824;
        this.f57140l = 1073741824;
    }

    public int u(v0 v0Var, a1 a1Var) {
        RecyclerView recyclerView = this.f57132b;
        if (recyclerView != null && recyclerView.f2871x != null && d()) {
            return this.f57132b.f2871x.b();
        }
        return 1;
    }

    public final boolean u0(View view, int i7, int i10, o0 o0Var) {
        if (!view.isLayoutRequested() && this.f57136g && N(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) o0Var).width) && N(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) o0Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void v0(RecyclerView recyclerView, a1 a1Var, int i7);

    public final void w0(z0 z0Var) {
        z0 z0Var2 = this.f57134e;
        if (z0Var2 != null && z0Var != z0Var2 && z0Var2.f57216e) {
            z0Var2.h();
        }
        this.f57134e = z0Var;
        RecyclerView recyclerView = this.f57132b;
        z0Var.getClass();
        recyclerView.O0 = true;
        c1 c1Var = recyclerView.f2863r0;
        RecyclerView recyclerView2 = c1Var.h;
        if (recyclerView2.O0) {
            recyclerView2.removeCallbacks(c1Var);
            c1Var.f57037c.abortAnimation();
        }
        if (z0Var.h) {
            Log.w("RecyclerView", "An instance of " + z0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + z0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        z0Var.f57214b = recyclerView;
        z0Var.f57215c = this;
        int i7 = z0Var.f57213a;
        if (i7 != -1) {
            recyclerView.f2867u0.f56998a = i7;
            z0Var.f57216e = true;
            z0Var.d = true;
            z0Var.f57217f = recyclerView.f2873y.m(i7);
            z0Var.e();
            z0Var.f57214b.f2863r0.a();
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

    public void V(RecyclerView recyclerView, int i7, int i10) {
    }

    public void X(RecyclerView recyclerView, int i7, int i10) {
    }

    public void Y(RecyclerView recyclerView, int i7, int i10) {
    }
}
