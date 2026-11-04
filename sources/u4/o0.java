package u4;

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
import b8.ig;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.nh;
public abstract class o0 {
    public p7.d f55629a;
    public RecyclerView f55630b;
    public final mi.h0 f55631c;
    public final mi.h0 d;
    public z0 f55632e;
    public boolean f55633f;
    public final boolean f55634g;
    public final boolean h;
    public int f55635i;
    public boolean f55636j;
    public int f55637k;
    public int f55638l;
    public int f55639m;
    public int f55640n;

    public o0() {
        nh nhVar = new nh(this, 23);
        i9 i9Var = new i9(this, 23);
        this.f55631c = new mi.h0(nhVar);
        this.d = new mi.h0(i9Var);
        this.f55633f = false;
        this.f55634g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((p0) view.getLayoutParams()).b();
    }

    public static boolean N(int i3, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i3 != i11) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i3) {
                return false;
            }
            return true;
        } else if (size < i3) {
            return false;
        } else {
            return true;
        }
    }

    public static void O(View view, int i3, int i10, int i11, int i12) {
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect = p0Var.f55646b;
        view.layout(i3 + rect.left + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) p0Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin);
    }

    public static int g(int i3, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i10, i11);
            }
            return size;
        }
        return Math.min(size, Math.max(i10, i11));
    }

    public static int s(boolean r4, int r5, int r6, int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: u4.o0.s(boolean, int, int, int, int):int");
    }

    public static int v(View view) {
        return view.getBottom() + ((p0) view.getLayoutParams()).f55646b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.R0;
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect2 = p0Var.f55646b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((p0) view.getLayoutParams()).f55646b.left;
    }

    public static void x0(View view) {
        d1 U = RecyclerView.U(view);
        U.f55549l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((p0) view.getLayoutParams()).f55646b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((p0) view.getLayoutParams()).f55646b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        h0 h0Var;
        RecyclerView recyclerView = this.f55630b;
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
        RecyclerView recyclerView = this.f55630b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f55630b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f55630b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f55630b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(tf.e eVar, a1 a1Var) {
        RecyclerView recyclerView = this.f55630b;
        if (recyclerView != null && recyclerView.f2303x != null && e()) {
            return this.f55630b.f2303x.b();
        }
        return 1;
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.f55640n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((p0) view.getLayoutParams()).f55646b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f55630b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f55630b.f2301w;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.f55630b;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            d1 U = RecyclerView.U(view);
            U.a(128);
            this.f55630b.f2281f.W0(U);
            return;
        }
        throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f55630b.C());
    }

    public void P(View view) {
        p0 p0Var = (p0) view.getLayoutParams();
        Rect W = this.f55630b.W(view);
        int i3 = W.left + W.right;
        int i10 = W.top + W.bottom;
        int s6 = s(d(), this.f55639m, this.f55637k, E() + D() + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin + i3, ((ViewGroup.MarginLayoutParams) p0Var).width);
        int s10 = s(e(), this.f55640n, this.f55638l, C() + F() + ((ViewGroup.MarginLayoutParams) p0Var).topMargin + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) p0Var).height);
        if (u0(view, s6, s10, p0Var)) {
            view.measure(s6, s10);
        }
    }

    public abstract View R(View view, int i3, tf.e eVar, a1 a1Var);

    public void S(tf.e eVar, a1 a1Var, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54570a;
        if (this.f55630b.canScrollVertically(-1) || this.f55630b.canScrollHorizontally(-1)) {
            dVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f55630b.canScrollVertically(1) || this.f55630b.canScrollHorizontally(1)) {
            dVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(eVar, a1Var), u(eVar, a1Var), false, 0));
    }

    public final void T(View view, s0.d dVar) {
        d1 U = RecyclerView.U(view);
        if (U != null && !U.j()) {
            p7.d dVar2 = this.f55629a;
            if (!((ArrayList) dVar2.f53346c).contains(U.f55540a)) {
                RecyclerView recyclerView = this.f55630b;
                U(recyclerView.f2274b, recyclerView.f2300v0, view, dVar);
            }
        }
    }

    public void U(tf.e eVar, a1 a1Var, View view, s0.d dVar) {
        int i3;
        int i10 = 0;
        if (e()) {
            i3 = H(view);
        } else {
            i3 = 0;
        }
        if (d()) {
            i10 = H(view);
        }
        dVar.f54570a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, 1, i10, 1, false, false));
    }

    public final void a(int i3, View view, boolean z10) {
        int y9;
        d1 U = RecyclerView.U(view);
        if (!z10 && !U.j()) {
            this.f55630b.f2281f.V0(U);
        } else {
            a0.f fVar = (a0.f) this.f55630b.f2281f.f19006b;
            j1 j1Var = (j1) fVar.get(U);
            if (j1Var == null) {
                j1Var = j1.a();
                fVar.put(U, j1Var);
            }
            j1Var.f55594a |= 1;
        }
        p0 p0Var = (p0) view.getLayoutParams();
        if (!U.s() && !U.k()) {
            if (view.getParent() == this.f55630b) {
                p7.d dVar = this.f55629a;
                ig igVar = (ig) dVar.d;
                int indexOfChild = ((RecyclerView) ((nh) dVar.f53345b).f36540b).indexOfChild(view);
                if (indexOfChild == -1 || igVar.E(indexOfChild)) {
                    y9 = -1;
                } else {
                    y9 = indexOfChild - igVar.y(indexOfChild);
                }
                if (i3 == -1) {
                    i3 = this.f55629a.o();
                }
                if (y9 != -1) {
                    if (y9 != i3) {
                        o0 o0Var = this.f55630b.f2305y;
                        View q10 = o0Var.q(y9);
                        if (q10 != null) {
                            o0Var.q(y9);
                            o0Var.f55629a.k(y9);
                            p0 p0Var2 = (p0) q10.getLayoutParams();
                            d1 U2 = RecyclerView.U(q10);
                            if (U2.j()) {
                                a0.f fVar2 = (a0.f) o0Var.f55630b.f2281f.f19006b;
                                j1 j1Var2 = (j1) fVar2.get(U2);
                                if (j1Var2 == null) {
                                    j1Var2 = j1.a();
                                    fVar2.put(U2, j1Var2);
                                }
                                j1Var2.f55594a = 1 | j1Var2.f55594a;
                            } else {
                                o0Var.f55630b.f2281f.V0(U2);
                            }
                            o0Var.f55629a.i(q10, i3, p0Var2, U2.j());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + y9 + o0Var.f55630b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f55630b.indexOfChild(view) + this.f55630b.C());
                }
            } else {
                this.f55629a.h(i3, view, false);
                p0Var.f55647c = true;
                z0 z0Var = this.f55632e;
                if (z0Var != null && z0Var.f55707e) {
                    z0Var.f55705b.getClass();
                    if (RecyclerView.S(view) == z0Var.f55704a) {
                        z0Var.f55708f = view;
                    }
                }
            }
        } else {
            if (U.k()) {
                U.f55553p.k(U);
            } else {
                U.f55549l &= -33;
            }
            this.f55629a.i(view, i3, view.getLayoutParams(), false);
        }
        if (p0Var.d) {
            U.f55540a.invalidate();
            p0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i3, int i10, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(tf.e eVar, a1 a1Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.f55630b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(a1 a1Var);

    public abstract boolean d();

    public void d0(tf.e eVar, a1 a1Var, int i3, int i10) {
        this.f55630b.q(i3, i10);
    }

    public abstract boolean e();

    public abstract a0 e0();

    public boolean f(p0 p0Var) {
        if (p0Var != null) {
            return true;
        }
        return false;
    }

    public final void g0(tf.e eVar) {
        for (int r5 = r() - 1; r5 >= 0; r5--) {
            if (!RecyclerView.U(q(r5)).r()) {
                i0(r5, eVar);
            }
        }
    }

    public abstract int h(a1 a1Var);

    public final void h0(tf.e eVar) {
        ArrayList arrayList = (ArrayList) eVar.f55109c;
        int size = ((ArrayList) eVar.f55109c).size();
        for (int i3 = size - 1; i3 >= 0; i3--) {
            View view = ((d1) arrayList.get(i3)).f55540a;
            d1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.f55630b.removeDetachedView(view, false);
                }
                m0 m0Var = this.f55630b.f2278d0;
                if (m0Var != null) {
                    m0Var.f(U);
                }
                U.q(true);
                d1 U2 = RecyclerView.U(view);
                U2.f55553p = null;
                U2.f55554q = false;
                U2.f55549l &= -33;
                eVar.h(U2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) eVar.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f55630b.invalidate();
        }
    }

    public abstract int i(a1 a1Var);

    public final void i0(int i3, tf.e eVar) {
        View q10 = q(i3);
        if (RecyclerView.U(q10).r()) {
            return;
        }
        j0(i3);
        eVar.g(q10);
    }

    public abstract int j(a1 a1Var);

    public final void j0(int i3) {
        if (q(i3) != null) {
            p7.d dVar = this.f55629a;
            int s6 = dVar.s(i3);
            nh nhVar = (nh) dVar.f53345b;
            View childAt = ((RecyclerView) nhVar.f36540b).getChildAt(s6);
            if (childAt != null) {
                if (((ig) dVar.d).G(s6)) {
                    dVar.H(childAt);
                }
                nhVar.I(s6);
            }
        }
    }

    public abstract int k(a1 a1Var);

    public final boolean k0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: u4.o0.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(a1 a1Var);

    public final void l0() {
        RecyclerView recyclerView = this.f55630b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i3);

    public abstract int m0(int i3, tf.e eVar, a1 a1Var);

    public abstract p0 n();

    public abstract void n0(int i3);

    public p0 o(Context context, AttributeSet attributeSet) {
        return new p0(context, attributeSet);
    }

    public abstract int o0(int i3, tf.e eVar, a1 a1Var);

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

    public final View q(int i3) {
        p7.d dVar = this.f55629a;
        if (dVar != null) {
            return dVar.n(i3);
        }
        return null;
    }

    public final void q0(int i3, int i10) {
        this.f55639m = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i3);
        this.f55637k = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.R0;
        }
        this.f55640n = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.f55638l = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.R0;
        }
    }

    public final int r() {
        p7.d dVar = this.f55629a;
        if (dVar != null) {
            return dVar.o();
        }
        return 0;
    }

    public void r0(Rect rect, int i3, int i10) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f55630b;
        WeakHashMap weakHashMap = r0.i0.f54015a;
        this.f55630b.setMeasuredDimension(g(i3, E, recyclerView.getMinimumWidth()), g(i10, C, this.f55630b.getMinimumHeight()));
    }

    public final void s0(int i3, int i10) {
        int r5 = r();
        if (r5 == 0) {
            this.f55630b.q(i3, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < r5; i15++) {
            View q10 = q(i15);
            Rect rect = this.f55630b.f2294r;
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
        this.f55630b.f2294r.set(i14, i12, i11, i13);
        r0(this.f55630b.f2294r, i3, i10);
    }

    public int[] t(View view, Rect rect) {
        int D = D();
        int F = F();
        int E = this.f55639m - E();
        int C = this.f55640n - C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i3 = left - D;
        int min = Math.min(0, i3);
        int i10 = top - F;
        int min2 = Math.min(0, i10);
        int i11 = width - E;
        int max = Math.max(0, i11);
        int max2 = Math.max(0, height - C);
        RecyclerView recyclerView = this.f55630b;
        WeakHashMap weakHashMap = r0.i0.f54015a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (max == 0) {
                max = Math.max(min, i11);
            }
        } else {
            if (min == 0) {
                min = Math.min(i3, max);
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
            this.f55630b = null;
            this.f55629a = null;
            this.f55639m = 0;
            this.f55640n = 0;
        } else {
            this.f55630b = recyclerView;
            this.f55629a = recyclerView.f2279e;
            this.f55639m = recyclerView.getWidth();
            this.f55640n = recyclerView.getHeight();
        }
        this.f55637k = 1073741824;
        this.f55638l = 1073741824;
    }

    public int u(tf.e eVar, a1 a1Var) {
        RecyclerView recyclerView = this.f55630b;
        if (recyclerView != null && recyclerView.f2303x != null && d()) {
            return this.f55630b.f2303x.b();
        }
        return 1;
    }

    public final boolean u0(View view, int i3, int i10, p0 p0Var) {
        if (!view.isLayoutRequested() && this.f55634g && N(view.getWidth(), i3, ((ViewGroup.MarginLayoutParams) p0Var).width) && N(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) p0Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void v0(RecyclerView recyclerView, a1 a1Var, int i3);

    public final void w0(z0 z0Var) {
        z0 z0Var2 = this.f55632e;
        if (z0Var2 != null && z0Var != z0Var2 && z0Var2.f55707e) {
            z0Var2.h();
        }
        this.f55632e = z0Var;
        RecyclerView recyclerView = this.f55630b;
        z0Var.getClass();
        recyclerView.P0 = true;
        c1 c1Var = recyclerView.f2297s0;
        RecyclerView recyclerView2 = c1Var.h;
        if (recyclerView2.P0) {
            recyclerView2.removeCallbacks(c1Var);
            c1Var.f55534c.abortAnimation();
        }
        if (z0Var.h) {
            Log.w("RecyclerView", "An instance of " + z0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + z0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        z0Var.f55705b = recyclerView;
        z0Var.f55706c = this;
        int i3 = z0Var.f55704a;
        if (i3 != -1) {
            recyclerView.f2300v0.f55490a = i3;
            z0Var.f55707e = true;
            z0Var.d = true;
            z0Var.f55708f = recyclerView.f2305y.m(i3);
            z0Var.e();
            z0Var.f55705b.f2297s0.a();
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

    public void V(RecyclerView recyclerView, int i3, int i10) {
    }

    public void X(RecyclerView recyclerView, int i3, int i10) {
    }

    public void Y(RecyclerView recyclerView, int i3, int i10) {
    }
}
