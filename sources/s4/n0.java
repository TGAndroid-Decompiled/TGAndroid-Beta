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
import ji.h5;
import ji.w4;
public abstract class n0 {
    public li.k f44930a;
    public RecyclerView f44931b;
    public final m4.c f44932c;
    public final m4.c d;
    public x0 e;
    public boolean f44933f;
    public final boolean f44934g;
    public final boolean h;
    public int f44935i;
    public boolean f44936j;
    public int f44937k;
    public int f44938l;
    public int f44939m;
    public int f44940n;

    public n0() {
        w4 w4Var = new w4(this, 27);
        h5 h5Var = new h5(this, 26);
        this.f44932c = new m4.c((h1) w4Var);
        this.d = new m4.c((h1) h5Var);
        this.f44933f = false;
        this.f44934g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((o0) view.getLayoutParams()).b();
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
        o0 o0Var = (o0) view.getLayoutParams();
        Rect rect = o0Var.f44943b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) o0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin);
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
        throw new UnsupportedOperationException("Method not decompiled: s4.n0.s(boolean, int, int, int, int):int");
    }

    public static int v(View view) {
        return view.getBottom() + ((o0) view.getLayoutParams()).f44943b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.Q0;
        o0 o0Var = (o0) view.getLayoutParams();
        Rect rect2 = o0Var.f44943b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) o0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((o0) view.getLayoutParams()).f44943b.left;
    }

    public static void x0(View view) {
        b1 U = RecyclerView.U(view);
        U.f44846l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((o0) view.getLayoutParams()).f44943b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((o0) view.getLayoutParams()).f44943b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        g0 g0Var;
        RecyclerView recyclerView = this.f44931b;
        if (recyclerView != null) {
            g0Var = recyclerView.getAdapter();
        } else {
            g0Var = null;
        }
        if (g0Var != null) {
            return g0Var.h();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f44931b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f44931b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f44931b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f44931b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(qf.e eVar, y0 y0Var) {
        RecyclerView recyclerView = this.f44931b;
        if (recyclerView != null && recyclerView.f2015w != null && e()) {
            return this.f44931b.f2015w.h();
        }
        return 1;
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.f44940n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((o0) view.getLayoutParams()).f44943b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f44931b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f44931b.v;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.f44931b;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            b1 U = RecyclerView.U(view);
            U.a(128);
            this.f44931b.f1995f.b0(U);
            return;
        }
        throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f44931b.C());
    }

    public void P(View view) {
        o0 o0Var = (o0) view.getLayoutParams();
        Rect W = this.f44931b.W(view);
        int i10 = W.left + W.right;
        int i11 = W.top + W.bottom;
        int s10 = s(d(), this.f44939m, this.f44937k, E() + D() + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin + i10, ((ViewGroup.MarginLayoutParams) o0Var).width);
        int s11 = s(e(), this.f44940n, this.f44938l, C() + F() + ((ViewGroup.MarginLayoutParams) o0Var).topMargin + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) o0Var).height);
        if (u0(view, s10, s11, o0Var)) {
            view.measure(s10, s11);
        }
    }

    public abstract View R(View view, int i10, qf.e eVar, y0 y0Var);

    public void S(qf.e eVar, y0 y0Var, s0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f44795a;
        if (this.f44931b.canScrollVertically(-1) || this.f44931b.canScrollHorizontally(-1)) {
            cVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f44931b.canScrollVertically(1) || this.f44931b.canScrollHorizontally(1)) {
            cVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(eVar, y0Var), u(eVar, y0Var), false, 0));
    }

    public final void T(View view, s0.c cVar) {
        b1 U = RecyclerView.U(view);
        if (U != null && !U.j()) {
            li.k kVar = this.f44930a;
            if (!((ArrayList) kVar.d).contains(U.f44838a)) {
                RecyclerView recyclerView = this.f44931b;
                U(recyclerView.f1989b, recyclerView.f2013u0, view, cVar);
            }
        }
    }

    public void U(qf.e eVar, y0 y0Var, View view, s0.c cVar) {
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
        cVar.f44795a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, 1, i11, 1, false, false));
    }

    public final void a(View view, int i10, boolean z10) {
        int A;
        b1 U = RecyclerView.U(view);
        if (!z10 && !U.j()) {
            this.f44931b.f1995f.a0(U);
        } else {
            a0.f fVar = (a0.f) this.f44931b.f1995f.f16131b;
            i1 i1Var = (i1) fVar.get(U);
            if (i1Var == null) {
                i1Var = i1.a();
                fVar.put(U, i1Var);
            }
            i1Var.f44895a |= 1;
        }
        o0 o0Var = (o0) view.getLayoutParams();
        if (!U.s() && !U.k()) {
            if (view.getParent() == this.f44931b) {
                li.k kVar = this.f44930a;
                ad.d dVar = (ad.d) kVar.f14821c;
                int indexOfChild = ((RecyclerView) ((h5) kVar.f14820b).f13312b).indexOfChild(view);
                if (indexOfChild == -1 || dVar.E(indexOfChild)) {
                    A = -1;
                } else {
                    A = indexOfChild - dVar.A(indexOfChild);
                }
                if (i10 == -1) {
                    i10 = this.f44930a.C();
                }
                if (A != -1) {
                    if (A != i10) {
                        n0 n0Var = this.f44931b.f2017x;
                        View q6 = n0Var.q(A);
                        if (q6 != null) {
                            n0Var.q(A);
                            n0Var.f44930a.v(A);
                            o0 o0Var2 = (o0) q6.getLayoutParams();
                            b1 U2 = RecyclerView.U(q6);
                            if (U2.j()) {
                                a0.f fVar2 = (a0.f) n0Var.f44931b.f1995f.f16131b;
                                i1 i1Var2 = (i1) fVar2.get(U2);
                                if (i1Var2 == null) {
                                    i1Var2 = i1.a();
                                    fVar2.put(U2, i1Var2);
                                }
                                i1Var2.f44895a = 1 | i1Var2.f44895a;
                            } else {
                                n0Var.f44931b.f1995f.a0(U2);
                            }
                            n0Var.f44930a.p(q6, i10, o0Var2, U2.j());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + A + n0Var.f44931b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f44931b.indexOfChild(view) + this.f44931b.C());
                }
            } else {
                this.f44930a.m(view, i10, false);
                o0Var.f44944c = true;
                x0 x0Var = this.e;
                if (x0Var != null && x0Var.e) {
                    x0Var.f44980b.getClass();
                    if (RecyclerView.S(view) == x0Var.f44979a) {
                        x0Var.f44982f = view;
                    }
                }
            }
        } else {
            if (U.k()) {
                U.f44850p.k(U);
            } else {
                U.f44846l &= -33;
            }
            this.f44930a.p(view, i10, view.getLayoutParams(), false);
        }
        if (o0Var.d) {
            U.f44838a.invalidate();
            o0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(qf.e eVar, y0 y0Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.f44931b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(y0 y0Var);

    public abstract boolean d();

    public void d0(qf.e eVar, y0 y0Var, int i10, int i11) {
        this.f44931b.q(i10, i11);
    }

    public abstract boolean e();

    public abstract a0 e0();

    public boolean f(o0 o0Var) {
        if (o0Var != null) {
            return true;
        }
        return false;
    }

    public final void g0(qf.e eVar) {
        for (int r10 = r() - 1; r10 >= 0; r10--) {
            if (!RecyclerView.U(q(r10)).r()) {
                i0(r10, eVar);
            }
        }
    }

    public abstract int h(y0 y0Var);

    public final void h0(qf.e eVar) {
        ArrayList arrayList = (ArrayList) eVar.f43369c;
        int size = ((ArrayList) eVar.f43369c).size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((b1) arrayList.get(i10)).f44838a;
            b1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.f44931b.removeDetachedView(view, false);
                }
                l0 l0Var = this.f44931b.f1992c0;
                if (l0Var != null) {
                    l0Var.f(U);
                }
                U.q(true);
                b1 U2 = RecyclerView.U(view);
                U2.f44850p = null;
                U2.f44851q = false;
                U2.f44846l &= -33;
                eVar.h(U2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) eVar.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f44931b.invalidate();
        }
    }

    public abstract int i(y0 y0Var);

    public final void i0(int i10, qf.e eVar) {
        View q6 = q(i10);
        if (RecyclerView.U(q6).r()) {
            return;
        }
        j0(i10);
        eVar.g(q6);
    }

    public abstract int j(y0 y0Var);

    public final void j0(int i10) {
        if (q(i10) != null) {
            li.k kVar = this.f44930a;
            int J = kVar.J(i10);
            h5 h5Var = (h5) kVar.f14820b;
            View childAt = ((RecyclerView) h5Var.f13312b).getChildAt(J);
            if (childAt != null) {
                if (((ad.d) kVar.f14821c).G(J)) {
                    kVar.X(childAt);
                }
                h5Var.a1(J);
            }
        }
    }

    public abstract int k(y0 y0Var);

    public final boolean k0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: s4.n0.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(y0 y0Var);

    public final void l0() {
        RecyclerView recyclerView = this.f44931b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i10);

    public abstract int m0(int i10, qf.e eVar, y0 y0Var);

    public abstract o0 n();

    public abstract void n0(int i10);

    public o0 o(Context context, AttributeSet attributeSet) {
        return new o0(context, attributeSet);
    }

    public abstract int o0(int i10, qf.e eVar, y0 y0Var);

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

    public final View q(int i10) {
        li.k kVar = this.f44930a;
        if (kVar != null) {
            return kVar.B(i10);
        }
        return null;
    }

    public final void q0(int i10, int i11) {
        this.f44939m = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f44937k = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.Q0;
        }
        this.f44940n = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f44938l = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.Q0;
        }
    }

    public final int r() {
        li.k kVar = this.f44930a;
        if (kVar != null) {
            return kVar.C();
        }
        return 0;
    }

    public void r0(Rect rect, int i10, int i11) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f44931b;
        WeakHashMap weakHashMap = r0.j0.f43732a;
        this.f44931b.setMeasuredDimension(g(i10, E, recyclerView.getMinimumWidth()), g(i11, C, this.f44931b.getMinimumHeight()));
    }

    public final void s0(int i10, int i11) {
        int r10 = r();
        if (r10 == 0) {
            this.f44931b.q(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < r10; i16++) {
            View q6 = q(i16);
            Rect rect = this.f44931b.f2008r;
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
        this.f44931b.f2008r.set(i15, i13, i12, i14);
        r0(this.f44931b.f2008r, i10, i11);
    }

    public int[] t(View view, Rect rect) {
        int D = D();
        int F = F();
        int E = this.f44939m - E();
        int C = this.f44940n - C();
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
        RecyclerView recyclerView = this.f44931b;
        WeakHashMap weakHashMap = r0.j0.f43732a;
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
            this.f44931b = null;
            this.f44930a = null;
            this.f44939m = 0;
            this.f44940n = 0;
        } else {
            this.f44931b = recyclerView;
            this.f44930a = recyclerView.e;
            this.f44939m = recyclerView.getWidth();
            this.f44940n = recyclerView.getHeight();
        }
        this.f44937k = 1073741824;
        this.f44938l = 1073741824;
    }

    public int u(qf.e eVar, y0 y0Var) {
        RecyclerView recyclerView = this.f44931b;
        if (recyclerView != null && recyclerView.f2015w != null && d()) {
            return this.f44931b.f2015w.h();
        }
        return 1;
    }

    public final boolean u0(View view, int i10, int i11, o0 o0Var) {
        if (!view.isLayoutRequested() && this.f44934g && N(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) o0Var).width) && N(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) o0Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void v0(RecyclerView recyclerView, y0 y0Var, int i10);

    public final void w0(x0 x0Var) {
        x0 x0Var2 = this.e;
        if (x0Var2 != null && x0Var != x0Var2 && x0Var2.e) {
            x0Var2.h();
        }
        this.e = x0Var;
        RecyclerView recyclerView = this.f44931b;
        x0Var.getClass();
        recyclerView.O0 = true;
        a1 a1Var = recyclerView.f2009r0;
        RecyclerView recyclerView2 = a1Var.h;
        if (recyclerView2.O0) {
            recyclerView2.removeCallbacks(a1Var);
            a1Var.f44818c.abortAnimation();
        }
        if (x0Var.h) {
            Log.w("RecyclerView", "An instance of " + x0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + x0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        x0Var.f44980b = recyclerView;
        x0Var.f44981c = this;
        int i10 = x0Var.f44979a;
        if (i10 != -1) {
            recyclerView.f2013u0.f44994a = i10;
            x0Var.e = true;
            x0Var.d = true;
            x0Var.f44982f = recyclerView.f2017x.m(i10);
            x0Var.e();
            x0Var.f44980b.f2009r0.a();
            x0Var.h = true;
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
