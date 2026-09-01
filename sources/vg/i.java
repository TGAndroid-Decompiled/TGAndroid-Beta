package vg;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
public final class i implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final int[] f49299f = new int[2];
    public static final RectF h = new RectF();
    public final View f49300a;
    public ViewTreeObserver f49301b;
    public boolean f49302c;
    public final WeakHashMap d = new WeakHashMap();
    public final RectF f49303e = new RectF();

    public i(View view) {
        this.f49300a = view;
        view.addOnAttachStateChangeListener(this);
        a();
    }

    public static boolean b(View view, ViewGroup viewGroup, PointF pointF) {
        RectF rectF = h;
        boolean c3 = c(view, viewGroup, rectF);
        if (c3) {
            pointF.x = rectF.left;
            pointF.y = rectF.top;
        }
        return c3;
    }

    public static boolean c(View view, View view2, RectF rectF) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        View view3 = view;
        while (view3 != null && view3 != view2) {
            float x10 = view3.getX() + f10;
            float y10 = view3.getY() + f11;
            ViewParent parent = view3.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view3 = (View) parent;
            float scrollX = x10 - view3.getScrollX();
            f11 = y10 - view3.getScrollY();
            f10 = scrollX;
        }
        if (view3 != view2) {
            return false;
        }
        rectF.set(f10, f11, view.getWidth() + f10, view.getHeight() + f11);
        return true;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f49300a;
        if (view.isAttachedToWindow() && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            this.f49301b = viewTreeObserver;
            if (!this.f49302c) {
                viewTreeObserver.addOnPreDrawListener(this);
                this.f49302c = true;
            }
        }
    }

    public final void d(View view, ViewGroup viewGroup, g gVar, boolean z4) {
        h hVar = new h(viewGroup, gVar);
        hVar.d = z4;
        WeakHashMap weakHashMap = this.d;
        List list = (List) weakHashMap.get(view);
        if (list == null) {
            list = new ArrayList(1);
            weakHashMap.put(view, list);
        }
        list.add(hVar);
        RectF rectF = this.f49303e;
        c(view, viewGroup, rectF);
        hVar.f49297c.set(rectF);
        if (!this.f49302c) {
            a();
        }
        if (z4) {
            view.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    @Override
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.f49300a.getViewTreeObserver();
        ViewTreeObserver viewTreeObserver2 = this.f49301b;
        if (viewTreeObserver != viewTreeObserver2) {
            if (this.f49302c && viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                this.f49301b.removeOnPreDrawListener(this);
            }
            this.f49302c = false;
            this.f49301b = null;
            a();
        }
        WeakHashMap weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                View view = (View) entry.getKey();
                List<h> list = (List) entry.getValue();
                if (view != null && list != null) {
                    for (h hVar : list) {
                        boolean z4 = hVar.d;
                        RectF rectF = hVar.f49297c;
                        ViewGroup viewGroup = hVar.f49295a;
                        RectF rectF2 = this.f49303e;
                        if (z4) {
                            int[] iArr = f49299f;
                            view.getLocationOnScreen(iArr);
                            int i10 = iArr[0];
                            rectF2.set(i10, iArr[1], view.getWidth() + i10, view.getHeight() + iArr[1]);
                            viewGroup.getLocationOnScreen(iArr);
                            rectF2.offset(-iArr[0], -iArr[1]);
                        } else if (!c(view, viewGroup, rectF2)) {
                        }
                        if (!hVar.f49298e || !rectF2.equals(rectF)) {
                            rectF.set(rectF2);
                            hVar.f49298e = true;
                            try {
                                hVar.f49296b.d(new RectF(rectF2), view);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        if (view == this.f49300a) {
            if (this.f49302c && (viewTreeObserver = this.f49301b) != null && viewTreeObserver.isAlive()) {
                this.f49301b.removeOnPreDrawListener(this);
            }
            this.f49302c = false;
            this.f49301b = null;
        }
    }
}
