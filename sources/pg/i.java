package pg;

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
    public static final int[] f45883f = new int[2];
    public static final RectF h = new RectF();
    public final View f45884a;
    public ViewTreeObserver f45885b;
    public boolean f45886c;
    public final WeakHashMap d = new WeakHashMap();
    public final RectF f45887e = new RectF();

    public i(View view) {
        this.f45884a = view;
        view.addOnAttachStateChangeListener(this);
        a();
    }

    public static boolean b(View view, ViewGroup viewGroup, PointF pointF) {
        RectF rectF = h;
        boolean c10 = c(view, viewGroup, rectF);
        if (c10) {
            pointF.x = rectF.left;
            pointF.y = rectF.top;
        }
        return c10;
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
        View view = this.f45884a;
        if (view.isAttachedToWindow() && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            this.f45885b = viewTreeObserver;
            if (!this.f45886c) {
                viewTreeObserver.addOnPreDrawListener(this);
                this.f45886c = true;
            }
        }
    }

    public final void d(View view, ViewGroup viewGroup, g gVar, boolean z10) {
        h hVar = new h(viewGroup, gVar);
        hVar.d = z10;
        WeakHashMap weakHashMap = this.d;
        List list = (List) weakHashMap.get(view);
        if (list == null) {
            list = new ArrayList(1);
            weakHashMap.put(view, list);
        }
        list.add(hVar);
        RectF rectF = this.f45887e;
        c(view, viewGroup, rectF);
        hVar.f45881c.set(rectF);
        if (!this.f45886c) {
            a();
        }
        if (z10) {
            view.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    @Override
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.f45884a.getViewTreeObserver();
        ViewTreeObserver viewTreeObserver2 = this.f45885b;
        if (viewTreeObserver != viewTreeObserver2) {
            if (this.f45886c && viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                this.f45885b.removeOnPreDrawListener(this);
            }
            this.f45886c = false;
            this.f45885b = null;
            a();
        }
        WeakHashMap weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                View view = (View) entry.getKey();
                List<h> list = (List) entry.getValue();
                if (view != null && list != null) {
                    for (h hVar : list) {
                        boolean z10 = hVar.d;
                        RectF rectF = hVar.f45881c;
                        ViewGroup viewGroup = hVar.f45879a;
                        RectF rectF2 = this.f45887e;
                        if (z10) {
                            int[] iArr = f45883f;
                            view.getLocationOnScreen(iArr);
                            int i9 = iArr[0];
                            rectF2.set(i9, iArr[1], view.getWidth() + i9, view.getHeight() + iArr[1]);
                            viewGroup.getLocationOnScreen(iArr);
                            rectF2.offset(-iArr[0], -iArr[1]);
                        } else if (!c(view, viewGroup, rectF2)) {
                        }
                        if (!hVar.f45882e || !rectF2.equals(rectF)) {
                            rectF.set(rectF2);
                            hVar.f45882e = true;
                            try {
                                hVar.f45880b.i(new RectF(rectF2), view);
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
        if (view == this.f45884a) {
            if (this.f45886c && (viewTreeObserver = this.f45885b) != null && viewTreeObserver.isAlive()) {
                this.f45885b.removeOnPreDrawListener(this);
            }
            this.f45886c = false;
            this.f45885b = null;
        }
    }
}
