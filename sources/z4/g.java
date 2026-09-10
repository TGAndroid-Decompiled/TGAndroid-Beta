package z4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import fb.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.telegram.ui.Cells.l2;
import r0.a0;
import r0.i0;
import s4.d1;
import sg.a1;
public class g extends ViewGroup {
    public static final int[] f47237s0 = {16842931};
    public static final i f47238t0 = new i(6);
    public static final l2 f47239u0 = new l2(5);
    public static final i f47240v0 = new i(7);
    public int E;
    public float F;
    public float G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public boolean M;
    public boolean N;
    public final int O;
    public int P;
    public final int Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public int V;
    public VelocityTracker W;
    public int f47241a;
    public final int f47242a0;
    public final ArrayList f47243b;
    public final int f47244b0;
    public final c f47245c;
    public final int f47246c0;
    public final Rect d;
    public final int f47247d0;
    public a e;
    public boolean f47248e0;
    public int f47249f;
    public EdgeEffect f47250f0;
    public EdgeEffect f47251g0;
    public int h;
    public boolean f47252h0;
    public boolean f47253i0;
    public int f47254j0;
    public ArrayList f47255k0;
    public e f47256l0;
    public th.e m0;
    public Parcelable f47257n;
    public int f47258n0;
    public int f47259o0;
    public ArrayList f47260p0;
    public final a1 f47261q0;
    public Scroller f47262r;
    public int f47263r0;
    public boolean f47264s;
    public h1.a v;
    public int f47265w;
    public Drawable f47266x;
    public int f47267y;

    public g(Context context) {
        super(context);
        this.f47243b = new ArrayList();
        this.f47245c = new Object();
        this.d = new Rect();
        this.h = -1;
        this.f47257n = null;
        this.F = -3.4028235E38f;
        this.G = Float.MAX_VALUE;
        this.L = 1;
        this.V = -1;
        this.f47252h0 = true;
        this.f47261q0 = new a1(this, 8);
        this.f47263r0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f47262r = new Scroller(context2, f47239u0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f7 = context2.getResources().getDisplayMetrics().density;
        this.Q = viewConfiguration.getScaledPagingTouchSlop();
        this.f47242a0 = (int) (400.0f * f7);
        this.f47244b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f47250f0 = new EdgeEffect(context2);
        this.f47251g0 = new EdgeEffect(context2);
        this.f47246c0 = (int) (25.0f * f7);
        this.f47247d0 = (int) (2.0f * f7);
        this.O = (int) (f7 * 16.0f);
        i0.k(this, new d1(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        a0.j(this, new n7.a1(this));
    }

    public static boolean d(int i10, int i11, int i12, View view, boolean z10) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && d(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        if (z10 && view.canScrollHorizontally(-i10)) {
            return true;
        }
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
        }
    }

    public final c a(int i10, int i11) {
        ?? obj = new Object();
        obj.f47230b = i10;
        obj.f47229a = this.e.e(this, i10);
        this.e.getClass();
        obj.d = 1.0f;
        ArrayList arrayList = this.f47243b;
        if (i11 >= 0 && i11 < arrayList.size()) {
            arrayList.add(i11, obj);
            return obj;
        }
        arrayList.add(obj);
        return obj;
    }

    @Override
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        c k10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f47230b == this.f47249f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override
    public final void addTouchables(ArrayList arrayList) {
        c k10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f47230b == this.f47249f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        boolean z10;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        d dVar = (d) layoutParams;
        boolean z11 = dVar.f47232a;
        if (view.getClass().getAnnotation(b.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        dVar.f47232a = z12;
        if (this.I) {
            if (!z12) {
                dVar.d = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b(e eVar) {
        if (this.f47255k0 == null) {
            this.f47255k0 = new ArrayList();
        }
        this.f47255k0.add(eVar);
    }

    public final boolean c(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: z4.g.c(int):boolean");
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX <= ((int) (clientWidth * this.F))) {
                return false;
            }
            return true;
        } else if (i10 <= 0 || scrollX >= ((int) (clientWidth * this.G))) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof d) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override
    public final void computeScroll() {
        this.f47264s = true;
        if (!this.f47262r.isFinished() && this.f47262r.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f47262r.getCurrX();
            int currY = this.f47262r.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!q(currX)) {
                    this.f47262r.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap weakHashMap = i0.f41062a;
            postInvalidateOnAnimation();
            return;
        }
        e(true);
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: z4.g.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        c k10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f47230b == this.f47249f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.e) == null || aVar.b() <= 1)) {
            this.f47250f0.finish();
            this.f47251g0.finish();
        } else {
            if (!this.f47250f0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.F * width);
                this.f47250f0.setSize(height, width);
                z10 = this.f47250f0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f47251g0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.G + 1.0f)) * width2);
                this.f47251g0.setSize(height2, width2);
                z10 |= this.f47251g0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            WeakHashMap weakHashMap = i0.f41062a;
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f47266x;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e(boolean z10) {
        boolean z11;
        if (this.f47263r0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f47262r.isFinished()) {
                this.f47262r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f47262r.getCurrX();
                int currY = this.f47262r.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        q(currX);
                    }
                }
            }
        }
        this.K = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47243b;
            if (i10 >= arrayList.size()) {
                break;
            }
            c cVar = (c) arrayList.get(i10);
            if (cVar.f47231c) {
                cVar.f47231c = false;
                z11 = true;
            }
            i10++;
        }
        if (z11) {
            a1 a1Var = this.f47261q0;
            if (z10) {
                WeakHashMap weakHashMap = i0.f41062a;
                postOnAnimation(a1Var);
                return;
            }
            a1Var.run();
        }
    }

    public final void f() {
        boolean z10;
        int b10 = this.e.b();
        this.f47241a = b10;
        ArrayList arrayList = this.f47243b;
        if (arrayList.size() < (this.L * 2) + 1 && arrayList.size() < b10) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f47249f;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < arrayList.size()) {
            c cVar = (c) arrayList.get(i11);
            int c10 = this.e.c(cVar.f47229a);
            if (c10 != -1) {
                if (c10 == -2) {
                    arrayList.remove(i11);
                    i11--;
                    if (!z11) {
                        this.e.getClass();
                        z11 = true;
                    }
                    this.e.a(this, cVar.f47229a);
                    int i12 = this.f47249f;
                    if (i12 == cVar.f47230b) {
                        i10 = Math.max(0, Math.min(i12, b10 - 1));
                    }
                } else {
                    int i13 = cVar.f47230b;
                    if (i13 != c10) {
                        if (i13 == this.f47249f) {
                            i10 = c10;
                        }
                        cVar.f47230b = c10;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.e.getClass();
        }
        Collections.sort(arrayList, f47238t0);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                d dVar = (d) getChildAt(i14).getLayoutParams();
                if (!dVar.f47232a) {
                    dVar.f47234c = 0.0f;
                }
            }
            y(i10, 0, false, true);
            requestLayout();
        }
    }

    public final int g(int i10, int i11, float f7, int i12) {
        float f10;
        if (Math.abs(i12) > this.f47246c0 && Math.abs(i11) > this.f47242a0) {
            if (i11 <= 0) {
                i10++;
            }
        } else {
            if (i10 >= this.f47249f) {
                f10 = 0.4f;
            } else {
                f10 = 0.6f;
            }
            i10 += (int) (f7 + f10);
        }
        ArrayList arrayList = this.f47243b;
        if (arrayList.size() > 0) {
            return Math.max(((c) arrayList.get(0)).f47230b, Math.min(i10, ((c) hc.b.i(1, arrayList)).f47230b));
        }
        return i10;
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.f47234c = 0.0f;
        return layoutParams;
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.e;
    }

    @Override
    public final int getChildDrawingOrder(int i10, int i11) {
        if (this.f47259o0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((d) ((View) this.f47260p0.get(i11)).getLayoutParams()).f47235f;
    }

    public int getCurrentItem() {
        return this.f47249f;
    }

    public int getOffscreenPageLimit() {
        return this.L;
    }

    public int getPageMargin() {
        return this.f47265w;
    }

    public final void h(int i10) {
        e eVar = this.f47256l0;
        if (eVar != null) {
            eVar.a(i10);
        }
        ArrayList arrayList = this.f47255k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.f47255k0.get(i11);
                if (eVar2 != null) {
                    eVar2.a(i10);
                }
            }
        }
    }

    public final void i() {
        if (this.f47248e0) {
            if (this.e != null) {
                VelocityTracker velocityTracker = this.W;
                velocityTracker.computeCurrentVelocity(1000, this.f47244b0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.V);
                this.K = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                c l4 = l();
                y(g(l4.f47230b, xVelocity, ((scrollX / clientWidth) - l4.e) / l4.d, (int) (this.R - this.T)), xVelocity, true, true);
            }
            this.M = false;
            this.N = false;
            VelocityTracker velocityTracker2 = this.W;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.W = null;
            }
            this.f47248e0 = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public final Rect j(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final c k(View view) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47243b;
            if (i10 < arrayList.size()) {
                c cVar = (c) arrayList.get(i10);
                if (this.e.f(view, cVar.f47229a)) {
                    return cVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final z4.c l() {
        throw new UnsupportedOperationException("Method not decompiled: z4.g.l():z4.c");
    }

    public final c m(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f47243b;
            if (i11 < arrayList.size()) {
                c cVar = (c) arrayList.get(i11);
                if (cVar.f47230b == i10) {
                    return cVar;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final void n(float r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: z4.g.n(float, int, int):void");
    }

    public final void o(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.V) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.R = motionEvent.getX(i10);
            this.V = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.W;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47252h0 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f47261q0);
        Scroller scroller = this.f47262r;
        if (scroller != null && !scroller.isFinished()) {
            this.f47262r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        int i10;
        float f7;
        ArrayList arrayList;
        int i11;
        super.onDraw(canvas);
        if (this.f47265w > 0 && this.f47266x != null) {
            ArrayList arrayList2 = this.f47243b;
            if (arrayList2.size() > 0 && this.e != null) {
                int scrollX = getScrollX();
                float width2 = getWidth();
                float f10 = this.f47265w / width2;
                int i12 = 0;
                c cVar = (c) arrayList2.get(0);
                float f11 = cVar.e;
                int size = arrayList2.size();
                int i13 = cVar.f47230b;
                int i14 = ((c) arrayList2.get(size - 1)).f47230b;
                while (i13 < i14) {
                    while (true) {
                        i10 = cVar.f47230b;
                        if (i13 <= i10 || i12 >= size) {
                            break;
                        }
                        i12++;
                        cVar = (c) arrayList2.get(i12);
                    }
                    if (i13 == i10) {
                        float f12 = cVar.e;
                        float f13 = cVar.d;
                        f7 = (f12 + f13) * width2;
                        f11 = f12 + f13 + f10;
                    } else {
                        this.e.getClass();
                        f7 = (f11 + 1.0f) * width2;
                        f11 = 1.0f + f10 + f11;
                    }
                    if (this.f47265w + f7 > scrollX) {
                        arrayList = arrayList2;
                        i11 = scrollX;
                        this.f47266x.setBounds(Math.round(f7), this.f47267y, Math.round(this.f47265w + f7), this.E);
                        this.f47266x.draw(canvas);
                    } else {
                        arrayList = arrayList2;
                        i11 = scrollX;
                    }
                    if (f7 <= i11 + width) {
                        i13++;
                        arrayList2 = arrayList;
                        scrollX = i11;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f7;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.M) {
                    return true;
                }
                if (this.N) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        o(motionEvent);
                    }
                } else {
                    int i10 = this.V;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float f10 = x10 - this.R;
                        float abs = Math.abs(f10);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y3 - this.U);
                        int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                        if (i11 != 0) {
                            float f11 = this.R;
                            if ((f11 >= this.P || i11 <= 0) && ((f11 <= getWidth() - this.P || f10 >= 0.0f) && d((int) f10, (int) x10, (int) y3, this, false))) {
                                this.R = x10;
                                this.S = y3;
                                this.N = true;
                                return false;
                            }
                        }
                        int i12 = this.Q;
                        float f12 = i12;
                        if (abs > f12 && abs * 0.5f > abs2) {
                            this.M = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f13 = this.T;
                            float f14 = i12;
                            if (i11 > 0) {
                                f7 = f13 + f14;
                            } else {
                                f7 = f13 - f14;
                            }
                            this.R = f7;
                            this.S = y3;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f12) {
                            this.N = true;
                        }
                        if (this.M && r(x10)) {
                            WeakHashMap weakHashMap = i0.f41062a;
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x11 = motionEvent.getX();
                this.T = x11;
                this.R = x11;
                float y10 = motionEvent.getY();
                this.U = y10;
                this.S = y10;
                this.V = motionEvent.getPointerId(0);
                this.N = false;
                this.f47264s = true;
                this.f47262r.computeScrollOffset();
                if (this.f47263r0 == 2 && Math.abs(this.f47262r.getFinalX() - this.f47262r.getCurrX()) > this.f47247d0) {
                    this.f47262r.abortAnimation();
                    this.K = false;
                    s();
                    this.M = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    e(false);
                    this.M = false;
                }
            }
            if (this.W == null) {
                this.W = VelocityTracker.obtain();
            }
            this.W.addMovement(motionEvent);
            return this.M;
        }
        v();
        return false;
    }

    @Override
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: z4.g.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: z4.g.onMeasure(int, int):void");
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        c k10;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f47230b == this.f47249f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f10096a);
        if (this.e != null) {
            y(fVar.f47236c, 0, false, true);
            return;
        }
        this.h = fVar.f47236c;
        this.f47257n = fVar.d;
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        ?? cVar = new i1.c(super.onSaveInstanceState());
        cVar.f47236c = this.f47249f;
        if (this.e != null) {
            cVar.d = null;
        }
        return cVar;
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f47265w;
            u(i10, i12, i14, i14);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        float f7;
        if (!this.f47248e0) {
            boolean z10 = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.e) == null || aVar.b() == 0) {
                return false;
            }
            if (this.W == null) {
                this.W = VelocityTracker.obtain();
            }
            this.W.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (action != 5) {
                                if (action == 6) {
                                    o(motionEvent);
                                    this.R = motionEvent.getX(motionEvent.findPointerIndex(this.V));
                                }
                            } else {
                                int actionIndex = motionEvent.getActionIndex();
                                this.R = motionEvent.getX(actionIndex);
                                this.V = motionEvent.getPointerId(actionIndex);
                            }
                        } else if (this.M) {
                            w(this.f47249f, 0, true, false);
                            z10 = v();
                        }
                    } else {
                        if (!this.M) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.V);
                            if (findPointerIndex == -1) {
                                z10 = v();
                            } else {
                                float x10 = motionEvent.getX(findPointerIndex);
                                float abs = Math.abs(x10 - this.R);
                                float y3 = motionEvent.getY(findPointerIndex);
                                float abs2 = Math.abs(y3 - this.S);
                                int i10 = this.Q;
                                if (abs > i10 && abs > abs2) {
                                    this.M = true;
                                    ViewParent parent = getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    float f10 = this.T;
                                    if (x10 - f10 > 0.0f) {
                                        f7 = f10 + i10;
                                    } else {
                                        f7 = f10 - i10;
                                    }
                                    this.R = f7;
                                    this.S = y3;
                                    setScrollState(1);
                                    setScrollingCacheEnabled(true);
                                    ViewParent parent2 = getParent();
                                    if (parent2 != null) {
                                        parent2.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                        }
                        if (this.M) {
                            z10 = r(motionEvent.getX(motionEvent.findPointerIndex(this.V)));
                        }
                    }
                } else if (this.M) {
                    VelocityTracker velocityTracker = this.W;
                    velocityTracker.computeCurrentVelocity(1000, this.f47244b0);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.V);
                    this.K = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    c l4 = l();
                    float f11 = clientWidth;
                    y(g(l4.f47230b, xVelocity, ((scrollX / f11) - l4.e) / (l4.d + (this.f47265w / f11)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.V)) - this.T)), xVelocity, true, true);
                    z10 = v();
                }
            } else {
                this.f47262r.abortAnimation();
                this.K = false;
                s();
                float x11 = motionEvent.getX();
                this.T = x11;
                this.R = x11;
                float y10 = motionEvent.getY();
                this.U = y10;
                this.S = y10;
                this.V = motionEvent.getPointerId(0);
            }
            if (z10) {
                WeakHashMap weakHashMap = i0.f41062a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public final boolean p() {
        a aVar = this.e;
        if (aVar != null && this.f47249f < aVar.b() - 1) {
            x(this.f47249f + 1, true);
            return true;
        }
        return false;
    }

    public final boolean q(int i10) {
        if (this.f47243b.size() == 0) {
            if (!this.f47252h0) {
                this.f47253i0 = false;
                n(0.0f, 0, 0);
                if (!this.f47253i0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        c l4 = l();
        int clientWidth = getClientWidth();
        int i11 = this.f47265w;
        int i12 = clientWidth + i11;
        float f7 = clientWidth;
        int i13 = l4.f47230b;
        float f10 = ((i10 / f7) - l4.e) / (l4.d + (i11 / f7));
        this.f47253i0 = false;
        n(f10, i13, (int) (i12 * f10));
        if (this.f47253i0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean r(float f7) {
        boolean z10;
        boolean z11;
        float f10 = this.R - f7;
        this.R = f7;
        float scrollX = getScrollX() + f10;
        float clientWidth = getClientWidth();
        float f11 = this.F * clientWidth;
        float f12 = this.G * clientWidth;
        ArrayList arrayList = this.f47243b;
        boolean z12 = false;
        c cVar = (c) arrayList.get(0);
        c cVar2 = (c) hc.b.i(1, arrayList);
        if (cVar.f47230b != 0) {
            f11 = cVar.e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (cVar2.f47230b != this.e.b() - 1) {
            f12 = cVar2.e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f11) {
            if (z10) {
                this.f47250f0.onPull(Math.abs(f11 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f11;
        } else if (scrollX > f12) {
            if (z11) {
                this.f47251g0.onPull(Math.abs(scrollX - f12) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        }
        int i10 = (int) scrollX;
        this.R = (scrollX - i10) + this.R;
        scrollTo(i10, getScrollY());
        q(i10);
        return z12;
    }

    @Override
    public final void removeView(View view) {
        if (this.I) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s() {
        t(this.f47249f);
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList = this.f47243b;
        a aVar2 = this.e;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f47228b = null;
            }
            this.e.getClass();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                c cVar = (c) arrayList.get(i10);
                a aVar3 = this.e;
                int i11 = cVar.f47230b;
                aVar3.a(this, cVar.f47229a);
            }
            this.e.getClass();
            arrayList.clear();
            int i12 = 0;
            while (i12 < getChildCount()) {
                if (!((d) getChildAt(i12).getLayoutParams()).f47232a) {
                    removeViewAt(i12);
                    i12--;
                }
                i12++;
            }
            this.f47249f = 0;
            scrollTo(0, 0);
        }
        this.e = aVar;
        this.f47241a = 0;
        if (aVar != null) {
            if (this.v == null) {
                this.v = new h1.a(this, 3);
            }
            this.e.i(this.v);
            this.K = false;
            boolean z10 = this.f47252h0;
            this.f47252h0 = true;
            this.f47241a = this.e.b();
            if (this.h >= 0) {
                this.e.getClass();
                y(this.h, 0, false, true);
                this.h = -1;
                this.f47257n = null;
            } else if (!z10) {
                s();
            } else {
                requestLayout();
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.K = false;
        y(i10, 0, !this.f47252h0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.L) {
            this.L = i10;
            s();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(e eVar) {
        this.f47256l0 = eVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f47265w;
        this.f47265w = i10;
        int width = getWidth();
        u(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f47266x = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        boolean z10;
        int i11;
        if (this.f47263r0 != i10) {
            this.f47263r0 = i10;
            if (this.m0 != null) {
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    if (z10) {
                        i11 = this.f47258n0;
                    } else {
                        i11 = 0;
                    }
                    getChildAt(i12).setLayerType(i11, null);
                }
            }
            e eVar = this.f47256l0;
            if (eVar != null) {
                eVar.c(i10);
            }
            ArrayList arrayList = this.f47255k0;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    e eVar2 = (e) this.f47255k0.get(i13);
                    if (eVar2 != null) {
                        eVar2.c(i10);
                    }
                }
            }
        }
    }

    public final void t(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: z4.g.t(int):void");
    }

    public final void u(int i10, int i11, int i12, int i13) {
        float f7;
        if (i11 > 0 && !this.f47243b.isEmpty()) {
            if (!this.f47262r.isFinished()) {
                this.f47262r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
            return;
        }
        c m10 = m(this.f47249f);
        if (m10 != null) {
            f7 = Math.min(m10.e, this.G);
        } else {
            f7 = 0.0f;
        }
        int paddingLeft = (int) (f7 * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            e(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    public final boolean v() {
        this.V = -1;
        this.M = false;
        this.N = false;
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.W = null;
        }
        this.f47250f0.onRelease();
        this.f47251g0.onRelease();
        if (!this.f47250f0.isFinished() && !this.f47251g0.isFinished()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f47266x) {
            return false;
        }
        return true;
    }

    public final void w(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        int scrollX;
        int abs;
        c m10 = m(i10);
        if (m10 != null) {
            i12 = (int) (Math.max(this.F, Math.min(m10.e, this.G)) * getClientWidth());
        } else {
            i12 = 0;
        }
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f47262r;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.f47264s) {
                        scrollX = this.f47262r.getCurrX();
                    } else {
                        scrollX = this.f47262r.getStartX();
                    }
                    this.f47262r.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollX = getScrollX();
                }
                int i13 = scrollX;
                int scrollY = getScrollY();
                int i14 = i12 - i13;
                int i15 = 0 - scrollY;
                if (i14 == 0 && i15 == 0) {
                    e(false);
                    s();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i16 = clientWidth / 2;
                    float f7 = clientWidth;
                    float f10 = i16;
                    float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i14) * 1.0f) / f7) - 0.5f) * 0.47123894f)) * f10) + f10;
                    int abs2 = Math.abs(i11);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        this.e.getClass();
                        abs = (int) (((Math.abs(i14) / ((f7 * 1.0f) + this.f47265w)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.f47264s = false;
                    this.f47262r.startScroll(i13, scrollY, i14, i15, min);
                    WeakHashMap weakHashMap = i0.f41062a;
                    postInvalidateOnAnimation();
                }
            }
            if (z11) {
                h(i10);
                return;
            }
            return;
        }
        if (z11) {
            h(i10);
        }
        e(false);
        scrollTo(i12, 0);
        q(i12);
    }

    public void x(int i10, boolean z10) {
        this.K = false;
        y(i10, 0, z10, false);
    }

    public final void y(int i10, int i11, boolean z10, boolean z11) {
        a aVar = this.e;
        boolean z12 = false;
        if (aVar != null && aVar.b() > 0) {
            ArrayList arrayList = this.f47243b;
            if (!z11 && this.f47249f == i10 && arrayList.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.e.b()) {
                i10 = this.e.b() - 1;
            }
            int i12 = this.L;
            int i13 = this.f47249f;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((c) arrayList.get(i14)).f47231c = true;
                }
            }
            if (this.f47249f != i10) {
                z12 = true;
            }
            if (this.f47252h0) {
                this.f47249f = i10;
                if (z12) {
                    h(i10);
                }
                requestLayout();
                return;
            }
            t(i10);
            w(i10, i11, z10, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public final void z() {
        if (this.f47259o0 != 0) {
            ArrayList arrayList = this.f47260p0;
            if (arrayList == null) {
                this.f47260p0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f47260p0.add(getChildAt(i10));
            }
            Collections.sort(this.f47260p0, f47240v0);
        }
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.f47234c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f47237s0);
        layoutParams.f47233b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getDrawable(i10));
    }
}
