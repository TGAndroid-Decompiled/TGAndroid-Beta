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
public abstract class o0 {
    public lf.i f43021a;
    public RecyclerView f43022b;
    public final o0.a f43023c;
    public final o0.a d;
    public y0 e;
    public boolean f43024f;
    public final boolean f43025g;
    public final boolean h;
    public int f43026i;
    public boolean f43027j;
    public int f43028k;
    public int f43029l;
    public int f43030m;
    public int f43031n;

    public o0() {
        n2.e eVar = new n2.e(this, 20);
        ka.c cVar = new ka.c(this, 22);
        this.f43023c = new o0.a(eVar);
        this.d = new o0.a(cVar);
        this.f43024f = false;
        this.f43025g = true;
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
        Rect rect = p0Var.f43036b;
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
        return view.getBottom() + ((p0) view.getLayoutParams()).f43036b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.P0;
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect2 = p0Var.f43036b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((p0) view.getLayoutParams()).f43036b.left;
    }

    public static void x0(View view) {
        c1 V = RecyclerView.V(view);
        V.f42937l &= -129;
        V.o();
        V.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((p0) view.getLayoutParams()).f43036b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((p0) view.getLayoutParams()).f43036b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        h0 h0Var;
        RecyclerView recyclerView = this.f43022b;
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
        RecyclerView recyclerView = this.f43022b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f43022b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f43022b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f43022b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(of.e eVar, z0 z0Var) {
        RecyclerView recyclerView = this.f43022b;
        if (recyclerView != null && recyclerView.f2866w != null && e()) {
            return this.f43022b.f2866w.h();
        }
        return 1;
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.f43031n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((p0) view.getLayoutParams()).f43036b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f43022b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f43022b.v;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.f43022b;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            c1 V = RecyclerView.V(view);
            V.a(128);
            this.f43022b.f2846f.M(V);
            return;
        }
        throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f43022b.D());
    }

    public void P(View view) {
        p0 p0Var = (p0) view.getLayoutParams();
        Rect X = this.f43022b.X(view);
        int i10 = X.left + X.right;
        int i11 = X.top + X.bottom;
        int s10 = s(d(), this.f43030m, this.f43028k, E() + D() + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin + i10, ((ViewGroup.MarginLayoutParams) p0Var).width);
        int s11 = s(e(), this.f43031n, this.f43029l, C() + F() + ((ViewGroup.MarginLayoutParams) p0Var).topMargin + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) p0Var).height);
        if (u0(view, s10, s11, p0Var)) {
            view.measure(s10, s11);
        }
    }

    public abstract View R(View view, int i10, of.e eVar, z0 z0Var);

    public void S(of.e eVar, z0 z0Var, s0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f42878a;
        if (this.f43022b.canScrollVertically(-1) || this.f43022b.canScrollHorizontally(-1)) {
            cVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f43022b.canScrollVertically(1) || this.f43022b.canScrollHorizontally(1)) {
            cVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(eVar, z0Var), u(eVar, z0Var), false, 0));
    }

    public final void T(View view, s0.c cVar) {
        c1 V = RecyclerView.V(view);
        if (V != null && !V.j()) {
            lf.i iVar = this.f43021a;
            if (!((ArrayList) iVar.d).contains(V.f42929a)) {
                RecyclerView recyclerView = this.f43022b;
                U(recyclerView.f2840b, recyclerView.f2863t0, view, cVar);
            }
        }
    }

    public void U(of.e eVar, z0 z0Var, View view, s0.c cVar) {
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
        cVar.f42878a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, 1, i11, 1, false, false));
    }

    public final void a(View view, int i10, boolean z10) {
        int x10;
        c1 V = RecyclerView.V(view);
        if (!z10 && !V.j()) {
            this.f43022b.f2846f.L(V);
        } else {
            a0.f fVar = (a0.f) this.f43022b.f2846f.f15367b;
            i1 i1Var = (i1) fVar.get(V);
            if (i1Var == null) {
                i1Var = i1.a();
                fVar.put(V, i1Var);
            }
            i1Var.f42983a |= 1;
        }
        p0 p0Var = (p0) view.getLayoutParams();
        if (!V.s() && !V.k()) {
            if (view.getParent() == this.f43022b) {
                lf.i iVar = this.f43021a;
                e6.n nVar = (e6.n) iVar.f14180c;
                int indexOfChild = ((RecyclerView) ((ka.c) iVar.f14179b).f13565b).indexOfChild(view);
                if (indexOfChild == -1 || nVar.D(indexOfChild)) {
                    x10 = -1;
                } else {
                    x10 = indexOfChild - nVar.x(indexOfChild);
                }
                if (i10 == -1) {
                    i10 = this.f43021a.C();
                }
                if (x10 != -1) {
                    if (x10 != i10) {
                        o0 o0Var = this.f43022b.f2868x;
                        View q6 = o0Var.q(x10);
                        if (q6 != null) {
                            o0Var.q(x10);
                            o0Var.f43021a.y(x10);
                            p0 p0Var2 = (p0) q6.getLayoutParams();
                            c1 V2 = RecyclerView.V(q6);
                            if (V2.j()) {
                                a0.f fVar2 = (a0.f) o0Var.f43022b.f2846f.f15367b;
                                i1 i1Var2 = (i1) fVar2.get(V2);
                                if (i1Var2 == null) {
                                    i1Var2 = i1.a();
                                    fVar2.put(V2, i1Var2);
                                }
                                i1Var2.f42983a = 1 | i1Var2.f42983a;
                            } else {
                                o0Var.f43022b.f2846f.L(V2);
                            }
                            o0Var.f43021a.t(q6, i10, p0Var2, V2.j());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + x10 + o0Var.f43022b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f43022b.indexOfChild(view) + this.f43022b.D());
                }
            } else {
                this.f43021a.s(view, i10, false);
                p0Var.f43037c = true;
                y0 y0Var = this.e;
                if (y0Var != null && y0Var.e) {
                    y0Var.f43080b.getClass();
                    if (RecyclerView.T(view) == y0Var.f43079a) {
                        y0Var.f43082f = view;
                    }
                }
            }
        } else {
            if (V.k()) {
                V.f42941p.k(V);
            } else {
                V.f42937l &= -33;
            }
            this.f43021a.t(view, i10, view.getLayoutParams(), false);
        }
        if (p0Var.d) {
            V.f42929a.invalidate();
            p0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(of.e eVar, z0 z0Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.f43022b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.X(view));
        }
    }

    public abstract void c0(z0 z0Var);

    public abstract boolean d();

    public void d0(of.e eVar, z0 z0Var, int i10, int i11) {
        this.f43022b.r(i10, i11);
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
            if (!RecyclerView.V(q(r10)).r()) {
                i0(r10, eVar);
            }
        }
    }

    public abstract int h(z0 z0Var);

    public final void h0(of.e eVar) {
        ArrayList arrayList = (ArrayList) eVar.f15664c;
        int size = ((ArrayList) eVar.f15664c).size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((c1) arrayList.get(i10)).f42929a;
            c1 V = RecyclerView.V(view);
            if (!V.r()) {
                V.q(false);
                if (V.l()) {
                    this.f43022b.removeDetachedView(view, false);
                }
                m0 m0Var = this.f43022b.f2843c0;
                if (m0Var != null) {
                    m0Var.f(V);
                }
                V.q(true);
                c1 V2 = RecyclerView.V(view);
                V2.f42941p = null;
                V2.f42942q = false;
                V2.f42937l &= -33;
                eVar.h(V2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) eVar.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f43022b.invalidate();
        }
    }

    public abstract int i(z0 z0Var);

    public final void i0(int i10, of.e eVar) {
        View q6 = q(i10);
        if (RecyclerView.V(q6).r()) {
            return;
        }
        j0(i10);
        eVar.g(q6);
    }

    public abstract int j(z0 z0Var);

    public final void j0(int i10) {
        if (q(i10) != null) {
            lf.i iVar = this.f43021a;
            int J = iVar.J(i10);
            ka.c cVar = (ka.c) iVar.f14179b;
            View childAt = ((RecyclerView) cVar.f13565b).getChildAt(J);
            if (childAt != null) {
                if (((e6.n) iVar.f14180c).F(J)) {
                    iVar.Y(childAt);
                }
                cVar.j0(J);
            }
        }
    }

    public abstract int k(z0 z0Var);

    public final boolean k0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: s4.o0.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(z0 z0Var);

    public final void l0() {
        RecyclerView recyclerView = this.f43022b;
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
        lf.i iVar = this.f43021a;
        if (iVar != null) {
            return iVar.B(i10);
        }
        return null;
    }

    public final void q0(int i10, int i11) {
        this.f43030m = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f43028k = mode;
        if (mode == 0 && !RecyclerView.Q0) {
            this.f43030m = 0;
        }
        this.f43031n = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f43029l = mode2;
        if (mode2 == 0 && !RecyclerView.Q0) {
            this.f43031n = 0;
        }
    }

    public final int r() {
        lf.i iVar = this.f43021a;
        if (iVar != null) {
            return iVar.C();
        }
        return 0;
    }

    public void r0(Rect rect, int i10, int i11) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f43022b;
        WeakHashMap weakHashMap = r0.i0.f42096a;
        this.f43022b.setMeasuredDimension(g(i10, E, recyclerView.getMinimumWidth()), g(i11, C, this.f43022b.getMinimumHeight()));
    }

    public final void s0(int i10, int i11) {
        int r10 = r();
        if (r10 == 0) {
            this.f43022b.r(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < r10; i16++) {
            View q6 = q(i16);
            Rect rect = this.f43022b.f2859r;
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
        this.f43022b.f2859r.set(i14, i15, i12, i13);
        r0(this.f43022b.f2859r, i10, i11);
    }

    public int[] t(View view, Rect rect) {
        int D = D();
        int F = F();
        int E = this.f43030m - E();
        int C = this.f43031n - C();
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
        RecyclerView recyclerView = this.f43022b;
        WeakHashMap weakHashMap = r0.i0.f42096a;
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
            this.f43022b = null;
            this.f43021a = null;
            this.f43030m = 0;
            this.f43031n = 0;
        } else {
            this.f43022b = recyclerView;
            this.f43021a = recyclerView.e;
            this.f43030m = recyclerView.getWidth();
            this.f43031n = recyclerView.getHeight();
        }
        this.f43028k = 1073741824;
        this.f43029l = 1073741824;
    }

    public int u(of.e eVar, z0 z0Var) {
        RecyclerView recyclerView = this.f43022b;
        if (recyclerView != null && recyclerView.f2866w != null && d()) {
            return this.f43022b.f2866w.h();
        }
        return 1;
    }

    public final boolean u0(View view, int i10, int i11, p0 p0Var) {
        if (!view.isLayoutRequested() && this.f43025g && N(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) p0Var).width) && N(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) p0Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void v0(RecyclerView recyclerView, z0 z0Var, int i10);

    public final void w0(y0 y0Var) {
        y0 y0Var2 = this.e;
        if (y0Var2 != null && y0Var != y0Var2 && y0Var2.e) {
            y0Var2.h();
        }
        this.e = y0Var;
        RecyclerView recyclerView = this.f43022b;
        y0Var.getClass();
        recyclerView.N0 = true;
        b1 b1Var = recyclerView.f2858q0;
        RecyclerView recyclerView2 = b1Var.h;
        if (recyclerView2.N0) {
            recyclerView2.removeCallbacks(b1Var);
            b1Var.f42913c.abortAnimation();
        }
        if (y0Var.h) {
            Log.w("RecyclerView", "An instance of " + y0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + y0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        y0Var.f43080b = recyclerView;
        y0Var.f43081c = this;
        int i10 = y0Var.f43079a;
        if (i10 != -1) {
            recyclerView.f2863t0.f43087a = i10;
            y0Var.e = true;
            y0Var.d = true;
            y0Var.f43082f = recyclerView.f2868x.m(i10);
            y0Var.e();
            y0Var.f43080b.f2858q0.a();
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
