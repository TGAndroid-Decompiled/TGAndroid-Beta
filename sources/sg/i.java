package sg;

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
    public static final int[] f48063f = new int[2];
    public static final RectF h = new RectF();
    public final View f48064a;
    public ViewTreeObserver f48065b;
    public boolean f48066c;
    public final WeakHashMap d = new WeakHashMap();
    public final RectF f48067e = new RectF();

    public i(View view) {
        this.f48064a = view;
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
        float f9 = 0.0f;
        float f10 = 0.0f;
        View view3 = view;
        while (view3 != null && view3 != view2) {
            float x4 = view3.getX() + f9;
            float y8 = view3.getY() + f10;
            ViewParent parent = view3.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view3 = (View) parent;
            float scrollX = x4 - view3.getScrollX();
            f10 = y8 - view3.getScrollY();
            f9 = scrollX;
        }
        if (view3 != view2) {
            return false;
        }
        rectF.set(f9, f10, view.getWidth() + f9, view.getHeight() + f10);
        return true;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f48064a;
        if (view.isAttachedToWindow() && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            this.f48065b = viewTreeObserver;
            if (!this.f48066c) {
                viewTreeObserver.addOnPreDrawListener(this);
                this.f48066c = true;
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
        RectF rectF = this.f48067e;
        c(view, viewGroup, rectF);
        hVar.f48061c.set(rectF);
        if (!this.f48066c) {
            a();
        }
        if (z10) {
            view.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    @Override
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.f48064a.getViewTreeObserver();
        ViewTreeObserver viewTreeObserver2 = this.f48065b;
        if (viewTreeObserver != viewTreeObserver2) {
            if (this.f48066c && viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                this.f48065b.removeOnPreDrawListener(this);
            }
            this.f48066c = false;
            this.f48065b = null;
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
                        RectF rectF = hVar.f48061c;
                        ViewGroup viewGroup = hVar.f48059a;
                        RectF rectF2 = this.f48067e;
                        if (z10) {
                            int[] iArr = f48063f;
                            view.getLocationOnScreen(iArr);
                            int i10 = iArr[0];
                            rectF2.set(i10, iArr[1], view.getWidth() + i10, view.getHeight() + iArr[1]);
                            viewGroup.getLocationOnScreen(iArr);
                            rectF2.offset(-iArr[0], -iArr[1]);
                        } else if (!c(view, viewGroup, rectF2)) {
                        }
                        if (!hVar.f48062e || !rectF2.equals(rectF)) {
                            rectF.set(rectF2);
                            hVar.f48062e = true;
                            try {
                                hVar.f48060b.d(new RectF(rectF2), view);
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
        if (view == this.f48064a) {
            if (this.f48066c && (viewTreeObserver = this.f48065b) != null && viewTreeObserver.isAlive()) {
                this.f48065b.removeOnPreDrawListener(this);
            }
            this.f48066c = false;
            this.f48065b = null;
        }
    }
}
