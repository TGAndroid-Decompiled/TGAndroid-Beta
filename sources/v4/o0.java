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
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ff;
import org.telegram.ui.ld0;
public abstract class o0 {
    public ld0 f58621a;
    public RecyclerView f58622b;
    public final sg.h0 f58623c;
    public final sg.h0 d;
    public a1 f58624e;
    public boolean f58625f;
    public final boolean f58626g;
    public final boolean h;
    public int f58627i;
    public boolean f58628j;
    public int f58629k;
    public int f58630l;
    public int f58631m;
    public int f58632n;

    public o0() {
        ff ffVar = new ff(this, 24);
        cf cfVar = new cf(this);
        this.f58623c = new sg.h0(ffVar);
        this.d = new sg.h0(cfVar);
        this.f58625f = false;
        this.f58626g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((p0) view.getLayoutParams()).b();
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
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect = p0Var.f58638b;
        view.layout(i7 + rect.left + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) p0Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin);
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
        throw new UnsupportedOperationException("Method not decompiled: v4.o0.s(boolean, int, int, int, int):int");
    }

    public static int v(View view) {
        return view.getBottom() + ((p0) view.getLayoutParams()).f58638b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.R0;
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect2 = p0Var.f58638b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((p0) view.getLayoutParams()).f58638b.left;
    }

    public static void x0(View view) {
        e1 U = RecyclerView.U(view);
        U.f58544l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((p0) view.getLayoutParams()).f58638b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((p0) view.getLayoutParams()).f58638b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        h0 h0Var;
        RecyclerView recyclerView = this.f58622b;
        if (recyclerView != null) {
            h0Var = recyclerView.getAdapter();
        } else {
            h0Var = null;
        }
        if (h0Var != null) {
            return h0Var.b();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f58622b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f58622b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f58622b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f58622b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(w0 w0Var, b1 b1Var) {
        RecyclerView recyclerView = this.f58622b;
        if (recyclerView != null && recyclerView.f2825x != null && e()) {
            return this.f58622b.f2825x.b();
        }
        return 1;
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.f58632n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((p0) view.getLayoutParams()).f58638b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f58622b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f58622b.f2823w;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.f58622b;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            e1 U = RecyclerView.U(view);
            U.a(128);
            this.f58622b.f2803f.i(U);
            return;
        }
        throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f58622b.C());
    }

    public void P(View view) {
        p0 p0Var = (p0) view.getLayoutParams();
        Rect W = this.f58622b.W(view);
        int i7 = W.left + W.right;
        int i10 = W.top + W.bottom;
        int s5 = s(d(), this.f58631m, this.f58629k, E() + D() + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin + i7, ((ViewGroup.MarginLayoutParams) p0Var).width);
        int s9 = s(e(), this.f58632n, this.f58630l, C() + F() + ((ViewGroup.MarginLayoutParams) p0Var).topMargin + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) p0Var).height);
        if (u0(view, s5, s9, p0Var)) {
            view.measure(s5, s9);
        }
    }

    public abstract View R(View view, int i7, w0 w0Var, b1 b1Var);

    public void S(w0 w0Var, b1 b1Var, s0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f56166a;
        if (this.f58622b.canScrollVertically(-1) || this.f58622b.canScrollHorizontally(-1)) {
            cVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f58622b.canScrollVertically(1) || this.f58622b.canScrollHorizontally(1)) {
            cVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(w0Var, b1Var), u(w0Var, b1Var), false, 0));
    }

    public final void T(View view, s0.c cVar) {
        e1 U = RecyclerView.U(view);
        if (U != null && !U.j()) {
            ld0 ld0Var = this.f58621a;
            if (!((ArrayList) ld0Var.d).contains(U.f58535a)) {
                RecyclerView recyclerView = this.f58622b;
                U(recyclerView.f2796b, recyclerView.f2822v0, view, cVar);
            }
        }
    }

    public void U(w0 w0Var, b1 b1Var, View view, s0.c cVar) {
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
        cVar.f56166a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, 1, i10, 1, false, false));
    }

    public final void a(int i7, View view, boolean z10) {
        int q10;
        e1 U = RecyclerView.U(view);
        if (!z10 && !U.j()) {
            this.f58622b.f2803f.h(U);
        } else {
            a0.f fVar = (a0.f) this.f58622b.f2803f.f57596b;
            k1 k1Var = (k1) fVar.get(U);
            if (k1Var == null) {
                k1Var = k1.a();
                fVar.put(U, k1Var);
            }
            k1Var.f58597a |= 1;
        }
        p0 p0Var = (p0) view.getLayoutParams();
        if (!U.s() && !U.k()) {
            if (view.getParent() == this.f58622b) {
                ld0 ld0Var = this.f58621a;
                va vaVar = (va) ld0Var.f48977c;
                int indexOfChild = ((RecyclerView) ((ff) ld0Var.f48976b).f34586b).indexOfChild(view);
                if (indexOfChild == -1 || vaVar.v(indexOfChild)) {
                    q10 = -1;
                } else {
                    q10 = indexOfChild - vaVar.q(indexOfChild);
                }
                if (i7 == -1) {
                    i7 = this.f58621a.u();
                }
                if (q10 != -1) {
                    if (q10 != i7) {
                        o0 o0Var = this.f58622b.f2827y;
                        View q11 = o0Var.q(q10);
                        if (q11 != null) {
                            o0Var.q(q10);
                            o0Var.f58621a.p(q10);
                            p0 p0Var2 = (p0) q11.getLayoutParams();
                            e1 U2 = RecyclerView.U(q11);
                            if (U2.j()) {
                                a0.f fVar2 = (a0.f) o0Var.f58622b.f2803f.f57596b;
                                k1 k1Var2 = (k1) fVar2.get(U2);
                                if (k1Var2 == null) {
                                    k1Var2 = k1.a();
                                    fVar2.put(U2, k1Var2);
                                }
                                k1Var2.f58597a = 1 | k1Var2.f58597a;
                            } else {
                                o0Var.f58622b.f2803f.h(U2);
                            }
                            o0Var.f58621a.l(q11, i7, p0Var2, U2.j());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + q10 + o0Var.f58622b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f58622b.indexOfChild(view) + this.f58622b.C());
                }
            } else {
                this.f58621a.k(i7, view, false);
                p0Var.f58639c = true;
                a1 a1Var = this.f58624e;
                if (a1Var != null && a1Var.f58483e) {
                    a1Var.f58481b.getClass();
                    if (RecyclerView.S(view) == a1Var.f58480a) {
                        a1Var.f58484f = view;
                    }
                }
            }
        } else {
            if (U.k()) {
                U.f58548p.k(U);
            } else {
                U.f58544l &= -33;
            }
            this.f58621a.l(view, i7, view.getLayoutParams(), false);
        }
        if (p0Var.d) {
            U.f58535a.invalidate();
            p0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i7, int i10, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(w0 w0Var, b1 b1Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.f58622b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(b1 b1Var);

    public abstract boolean d();

    public void d0(w0 w0Var, b1 b1Var, int i7, int i10) {
        this.f58622b.q(i7, i10);
    }

    public abstract boolean e();

    public abstract a0 e0();

    public boolean f(p0 p0Var) {
        if (p0Var != null) {
            return true;
        }
        return false;
    }

    public final void g0(w0 w0Var) {
        for (int r10 = r() - 1; r10 >= 0; r10--) {
            if (!RecyclerView.U(q(r10)).r()) {
                i0(r10, w0Var);
            }
        }
    }

    public abstract int h(b1 b1Var);

    public final void h0(w0 w0Var) {
        ArrayList arrayList = (ArrayList) w0Var.f58670c;
        int size = ((ArrayList) w0Var.f58670c).size();
        for (int i7 = size - 1; i7 >= 0; i7--) {
            View view = ((e1) arrayList.get(i7)).f58535a;
            e1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.f58622b.removeDetachedView(view, false);
                }
                m0 m0Var = this.f58622b.f2800d0;
                if (m0Var != null) {
                    m0Var.f(U);
                }
                U.q(true);
                e1 U2 = RecyclerView.U(view);
                U2.f58548p = null;
                U2.f58549q = false;
                U2.f58544l &= -33;
                w0Var.h(U2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) w0Var.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f58622b.invalidate();
        }
    }

    public abstract int i(b1 b1Var);

    public final void i0(int i7, w0 w0Var) {
        View q10 = q(i7);
        if (RecyclerView.U(q10).r()) {
            return;
        }
        j0(i7);
        w0Var.g(q10);
    }

    public abstract int j(b1 b1Var);

    public final void j0(int i7) {
        if (q(i7) != null) {
            ld0 ld0Var = this.f58621a;
            int x10 = ld0Var.x(i7);
            ff ffVar = (ff) ld0Var.f48976b;
            View childAt = ((RecyclerView) ffVar.f34586b).getChildAt(x10);
            if (childAt != null) {
                if (((va) ld0Var.f48977c).x(x10)) {
                    ld0Var.K(childAt);
                }
                ffVar.C0(x10);
            }
        }
    }

    public abstract int k(b1 b1Var);

    public final boolean k0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: v4.o0.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(b1 b1Var);

    public final void l0() {
        RecyclerView recyclerView = this.f58622b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i7);

    public abstract int m0(int i7, w0 w0Var, b1 b1Var);

    public abstract p0 n();

    public abstract void n0(int i7);

    public p0 o(Context context, AttributeSet attributeSet) {
        return new p0(context, attributeSet);
    }

    public abstract int o0(int i7, w0 w0Var, b1 b1Var);

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

    public final View q(int i7) {
        ld0 ld0Var = this.f58621a;
        if (ld0Var != null) {
            return ld0Var.t(i7);
        }
        return null;
    }

    public final void q0(int i7, int i10) {
        this.f58631m = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        this.f58629k = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.R0;
        }
        this.f58632n = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.f58630l = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.R0;
        }
    }

    public final int r() {
        ld0 ld0Var = this.f58621a;
        if (ld0Var != null) {
            return ld0Var.u();
        }
        return 0;
    }

    public void r0(Rect rect, int i7, int i10) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f58622b;
        WeakHashMap weakHashMap = r0.i0.f55671a;
        this.f58622b.setMeasuredDimension(g(i7, E, recyclerView.getMinimumWidth()), g(i10, C, this.f58622b.getMinimumHeight()));
    }

    public final void s0(int i7, int i10) {
        int r10 = r();
        if (r10 == 0) {
            this.f58622b.q(i7, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < r10; i15++) {
            View q10 = q(i15);
            Rect rect = this.f58622b.f2816r;
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
        this.f58622b.f2816r.set(i14, i12, i11, i13);
        r0(this.f58622b.f2816r, i7, i10);
    }

    public int[] t(View view, Rect rect) {
        int D = D();
        int F = F();
        int E = this.f58631m - E();
        int C = this.f58632n - C();
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
        RecyclerView recyclerView = this.f58622b;
        WeakHashMap weakHashMap = r0.i0.f55671a;
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
            this.f58622b = null;
            this.f58621a = null;
            this.f58631m = 0;
            this.f58632n = 0;
        } else {
            this.f58622b = recyclerView;
            this.f58621a = recyclerView.f2801e;
            this.f58631m = recyclerView.getWidth();
            this.f58632n = recyclerView.getHeight();
        }
        this.f58629k = 1073741824;
        this.f58630l = 1073741824;
    }

    public int u(w0 w0Var, b1 b1Var) {
        RecyclerView recyclerView = this.f58622b;
        if (recyclerView != null && recyclerView.f2825x != null && d()) {
            return this.f58622b.f2825x.b();
        }
        return 1;
    }

    public final boolean u0(View view, int i7, int i10, p0 p0Var) {
        if (!view.isLayoutRequested() && this.f58626g && N(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) p0Var).width) && N(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) p0Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void v0(RecyclerView recyclerView, b1 b1Var, int i7);

    public final void w0(a1 a1Var) {
        a1 a1Var2 = this.f58624e;
        if (a1Var2 != null && a1Var != a1Var2 && a1Var2.f58483e) {
            a1Var2.h();
        }
        this.f58624e = a1Var;
        RecyclerView recyclerView = this.f58622b;
        a1Var.getClass();
        recyclerView.P0 = true;
        d1 d1Var = recyclerView.f2819s0;
        RecyclerView recyclerView2 = d1Var.h;
        if (recyclerView2.P0) {
            recyclerView2.removeCallbacks(d1Var);
            d1Var.f58528c.abortAnimation();
        }
        if (a1Var.h) {
            Log.w("RecyclerView", "An instance of " + a1Var.getClass().getSimpleName() + " was started more than once. Each instance of" + a1Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        a1Var.f58481b = recyclerView;
        a1Var.f58482c = this;
        int i7 = a1Var.f58480a;
        if (i7 != -1) {
            recyclerView.f2822v0.f58500a = i7;
            a1Var.f58483e = true;
            a1Var.d = true;
            a1Var.f58484f = recyclerView.f2827y.m(i7);
            a1Var.e();
            a1Var.f58481b.f2819s0.a();
            a1Var.h = true;
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
