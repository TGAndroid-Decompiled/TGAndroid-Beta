package s4;

import a8.lg;
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
import m4.w1;
public abstract class p0 {
    public d f47815a;
    public RecyclerView f47816b;
    public final w1 f47817c;
    public final w1 d;
    public a1 e;
    public boolean f47818f;
    public final boolean f47819g;
    public final boolean h;
    public int f47820i;
    public boolean f47821j;
    public int f47822k;
    public int f47823l;
    public int f47824m;
    public int f47825n;

    public p0() {
        jg.i iVar = new jg.i(this);
        o0 o0Var = new o0(this);
        this.f47817c = new w1((j1) iVar);
        this.d = new w1((j1) o0Var);
        this.f47818f = false;
        this.f47819g = true;
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
        Rect rect = q0Var.f47830b;
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
        return view.getBottom() + ((q0) view.getLayoutParams()).f47830b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.Q0;
        q0 q0Var = (q0) view.getLayoutParams();
        Rect rect2 = q0Var.f47830b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) q0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) q0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((q0) view.getLayoutParams()).f47830b.left;
    }

    public static void x0(View view) {
        e1 U = RecyclerView.U(view);
        U.f47743l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((q0) view.getLayoutParams()).f47830b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((q0) view.getLayoutParams()).f47830b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        h0 h0Var;
        RecyclerView recyclerView = this.f47816b;
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
        RecyclerView recyclerView = this.f47816b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f47816b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f47816b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f47816b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(rf.e eVar, b1 b1Var) {
        RecyclerView recyclerView = this.f47816b;
        if (recyclerView != null && recyclerView.f3082w != null && e()) {
            return this.f47816b.f3082w.h();
        }
        return 1;
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.f47825n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((q0) view.getLayoutParams()).f47830b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f47816b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f47816b.v;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.f47816b;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            e1 U = RecyclerView.U(view);
            U.a(128);
            this.f47816b.f3062f.z0(U);
            return;
        }
        throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f47816b.C());
    }

    public void P(View view) {
        q0 q0Var = (q0) view.getLayoutParams();
        Rect W = this.f47816b.W(view);
        int i10 = W.left + W.right;
        int i11 = W.top + W.bottom;
        int s10 = s(d(), this.f47824m, this.f47822k, E() + D() + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin + i10, ((ViewGroup.MarginLayoutParams) q0Var).width);
        int s11 = s(e(), this.f47825n, this.f47823l, C() + F() + ((ViewGroup.MarginLayoutParams) q0Var).topMargin + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) q0Var).height);
        if (u0(view, s10, s11, q0Var)) {
            view.measure(s10, s11);
        }
    }

    public abstract View R(View view, int i10, rf.e eVar, b1 b1Var);

    public void S(rf.e eVar, b1 b1Var, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47650a;
        if (this.f47816b.canScrollVertically(-1) || this.f47816b.canScrollHorizontally(-1)) {
            dVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f47816b.canScrollVertically(1) || this.f47816b.canScrollHorizontally(1)) {
            dVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(eVar, b1Var), u(eVar, b1Var), false, 0));
    }

    public final void T(View view, s0.d dVar) {
        e1 U = RecyclerView.U(view);
        if (U != null && !U.j()) {
            d dVar2 = this.f47815a;
            if (!((ArrayList) dVar2.d).contains(U.f47735a)) {
                RecyclerView recyclerView = this.f47816b;
                U(recyclerView.f3056b, recyclerView.f3080u0, view, dVar);
            }
        }
    }

    public void U(rf.e eVar, b1 b1Var, View view, s0.d dVar) {
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
        dVar.f47650a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, 1, i11, 1, false, false));
    }

    public final void a(View view, int i10, boolean z10) {
        int w10;
        e1 U = RecyclerView.U(view);
        if (!z10 && !U.j()) {
            this.f47816b.f3062f.x0(U);
        } else {
            a0.f fVar = (a0.f) this.f47816b.f3062f.f18009b;
            k1 k1Var = (k1) fVar.get(U);
            if (k1Var == null) {
                k1Var = k1.a();
                fVar.put(U, k1Var);
            }
            k1Var.f47781a |= 1;
        }
        q0 q0Var = (q0) view.getLayoutParams();
        if (!U.s() && !U.k()) {
            if (view.getParent() == this.f47816b) {
                d dVar = this.f47815a;
                lg lgVar = (lg) dVar.f47718c;
                int indexOfChild = ((RecyclerView) ((jg.s0) dVar.f47717b).f15828b).indexOfChild(view);
                if (indexOfChild == -1 || lgVar.z(indexOfChild)) {
                    w10 = -1;
                } else {
                    w10 = indexOfChild - lgVar.w(indexOfChild);
                }
                if (i10 == -1) {
                    i10 = this.f47815a.k();
                }
                if (w10 != -1) {
                    if (w10 != i10) {
                        p0 p0Var = this.f47816b.f3084x;
                        View q5 = p0Var.q(w10);
                        if (q5 != null) {
                            p0Var.q(w10);
                            p0Var.f47815a.i(w10);
                            q0 q0Var2 = (q0) q5.getLayoutParams();
                            e1 U2 = RecyclerView.U(q5);
                            if (U2.j()) {
                                a0.f fVar2 = (a0.f) p0Var.f47816b.f3062f.f18009b;
                                k1 k1Var2 = (k1) fVar2.get(U2);
                                if (k1Var2 == null) {
                                    k1Var2 = k1.a();
                                    fVar2.put(U2, k1Var2);
                                }
                                k1Var2.f47781a = 1 | k1Var2.f47781a;
                            } else {
                                p0Var.f47816b.f3062f.x0(U2);
                            }
                            p0Var.f47815a.h(q5, i10, q0Var2, U2.j());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + w10 + p0Var.f47816b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f47816b.indexOfChild(view) + this.f47816b.C());
                }
            } else {
                this.f47815a.g(view, i10, false);
                q0Var.f47831c = true;
                a1 a1Var = this.e;
                if (a1Var != null && a1Var.e) {
                    a1Var.f47678b.getClass();
                    if (RecyclerView.S(view) == a1Var.f47677a) {
                        a1Var.f47680f = view;
                    }
                }
            }
        } else {
            if (U.k()) {
                U.f47747p.k(U);
            } else {
                U.f47743l &= -33;
            }
            this.f47815a.h(view, i10, view.getLayoutParams(), false);
        }
        if (q0Var.d) {
            U.f47735a.invalidate();
            q0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(rf.e eVar, b1 b1Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.f47816b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(b1 b1Var);

    public abstract boolean d();

    public void d0(rf.e eVar, b1 b1Var, int i10, int i11) {
        this.f47816b.q(i10, i11);
    }

    public abstract boolean e();

    public abstract b0 e0();

    public boolean f(q0 q0Var) {
        if (q0Var != null) {
            return true;
        }
        return false;
    }

    public final void g0(rf.e eVar) {
        for (int r6 = r() - 1; r6 >= 0; r6--) {
            if (!RecyclerView.U(q(r6)).r()) {
                i0(r6, eVar);
            }
        }
    }

    public abstract int h(b1 b1Var);

    public final void h0(rf.e eVar) {
        ArrayList arrayList = (ArrayList) eVar.f47346c;
        int size = ((ArrayList) eVar.f47346c).size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((e1) arrayList.get(i10)).f47735a;
            e1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.f47816b.removeDetachedView(view, false);
                }
                m0 m0Var = this.f47816b.f3059c0;
                if (m0Var != null) {
                    m0Var.f(U);
                }
                U.q(true);
                e1 U2 = RecyclerView.U(view);
                U2.f47747p = null;
                U2.f47748q = false;
                U2.f47743l &= -33;
                eVar.h(U2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) eVar.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f47816b.invalidate();
        }
    }

    public abstract int i(b1 b1Var);

    public final void i0(int i10, rf.e eVar) {
        View q5 = q(i10);
        if (RecyclerView.U(q5).r()) {
            return;
        }
        j0(i10);
        eVar.g(q5);
    }

    public abstract int j(b1 b1Var);

    public final void j0(int i10) {
        if (q(i10) != null) {
            d dVar = this.f47815a;
            int m10 = dVar.m(i10);
            jg.s0 s0Var = (jg.s0) dVar.f47717b;
            View childAt = ((RecyclerView) s0Var.f15828b).getChildAt(m10);
            if (childAt != null) {
                if (((lg) dVar.f47718c).B(m10)) {
                    dVar.t(childAt);
                }
                s0Var.h0(m10);
            }
        }
    }

    public abstract int k(b1 b1Var);

    public final boolean k0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: s4.p0.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(b1 b1Var);

    public final void l0() {
        RecyclerView recyclerView = this.f47816b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i10);

    public abstract int m0(int i10, rf.e eVar, b1 b1Var);

    public abstract q0 n();

    public abstract void n0(int i10);

    public q0 o(Context context, AttributeSet attributeSet) {
        return new q0(context, attributeSet);
    }

    public abstract int o0(int i10, rf.e eVar, b1 b1Var);

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
        d dVar = this.f47815a;
        if (dVar != null) {
            return dVar.j(i10);
        }
        return null;
    }

    public final void q0(int i10, int i11) {
        this.f47824m = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f47822k = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.Q0;
        }
        this.f47825n = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f47823l = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.Q0;
        }
    }

    public final int r() {
        d dVar = this.f47815a;
        if (dVar != null) {
            return dVar.k();
        }
        return 0;
    }

    public void r0(Rect rect, int i10, int i11) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f47816b;
        WeakHashMap weakHashMap = r0.i0.f47105a;
        this.f47816b.setMeasuredDimension(g(i10, E, recyclerView.getMinimumWidth()), g(i11, C, this.f47816b.getMinimumHeight()));
    }

    public final void s0(int i10, int i11) {
        int r6 = r();
        if (r6 == 0) {
            this.f47816b.q(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < r6; i16++) {
            View q5 = q(i16);
            Rect rect = this.f47816b.f3075r;
            w(q5, rect);
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
        this.f47816b.f3075r.set(i15, i13, i12, i14);
        r0(this.f47816b.f3075r, i10, i11);
    }

    public int[] t(View view, Rect rect) {
        int D = D();
        int F = F();
        int E = this.f47824m - E();
        int C = this.f47825n - C();
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
        RecyclerView recyclerView = this.f47816b;
        WeakHashMap weakHashMap = r0.i0.f47105a;
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
            this.f47816b = null;
            this.f47815a = null;
            this.f47824m = 0;
            this.f47825n = 0;
        } else {
            this.f47816b = recyclerView;
            this.f47815a = recyclerView.e;
            this.f47824m = recyclerView.getWidth();
            this.f47825n = recyclerView.getHeight();
        }
        this.f47822k = 1073741824;
        this.f47823l = 1073741824;
    }

    public int u(rf.e eVar, b1 b1Var) {
        RecyclerView recyclerView = this.f47816b;
        if (recyclerView != null && recyclerView.f3082w != null && d()) {
            return this.f47816b.f3082w.h();
        }
        return 1;
    }

    public final boolean u0(View view, int i10, int i11, q0 q0Var) {
        if (!view.isLayoutRequested() && this.f47819g && N(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) q0Var).width) && N(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) q0Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void v0(RecyclerView recyclerView, b1 b1Var, int i10);

    public final void w0(a1 a1Var) {
        a1 a1Var2 = this.e;
        if (a1Var2 != null && a1Var != a1Var2 && a1Var2.e) {
            a1Var2.h();
        }
        this.e = a1Var;
        RecyclerView recyclerView = this.f47816b;
        a1Var.getClass();
        recyclerView.O0 = true;
        d1 d1Var = recyclerView.f3076r0;
        RecyclerView recyclerView2 = d1Var.h;
        if (recyclerView2.O0) {
            recyclerView2.removeCallbacks(d1Var);
            d1Var.f47730c.abortAnimation();
        }
        if (a1Var.h) {
            Log.w("RecyclerView", "An instance of " + a1Var.getClass().getSimpleName() + " was started more than once. Each instance of" + a1Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        a1Var.f47678b = recyclerView;
        a1Var.f47679c = this;
        int i10 = a1Var.f47677a;
        if (i10 != -1) {
            recyclerView.f3080u0.f47691a = i10;
            a1Var.e = true;
            a1Var.d = true;
            a1Var.f47680f = recyclerView.f3084x.m(i10);
            a1Var.e();
            a1Var.f47678b.f3076r0.a();
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

    public void V(RecyclerView recyclerView, int i10, int i11) {
    }

    public void X(RecyclerView recyclerView, int i10, int i11) {
    }

    public void Y(RecyclerView recyclerView, int i10, int i11) {
    }
}
