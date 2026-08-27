package qg;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public final class j implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    public static final int[] f46553f = new int[2];
    public static final RectF h = new RectF();

    public final View f46554a;

    public ViewTreeObserver f46555b;

    public boolean f46556c;
    public final WeakHashMap d = new WeakHashMap();

    public final RectF f46557e = new RectF();

    public j(View view) {
        this.f46554a = view;
        view.addOnAttachStateChangeListener(this);
        a();
    }

    public static boolean b(View view, ViewGroup viewGroup, PointF pointF) {
        RectF rectF = h;
        boolean zC = c(view, viewGroup, rectF);
        if (zC) {
            pointF.x = rectF.left;
            pointF.y = rectF.top;
        }
        return zC;
    }

    public static boolean c(View view, View view2, RectF rectF) {
        float f10 = 0.0f;
        float scrollY = 0.0f;
        View view3 = view;
        while (view3 != null && view3 != view2) {
            float x8 = view3.getX() + f10;
            float y10 = view3.getY() + scrollY;
            Object parent = view3.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view3 = (View) parent;
            float scrollX = x8 - view3.getScrollX();
            scrollY = y10 - view3.getScrollY();
            f10 = scrollX;
        }
        if (view3 != view2) {
            return false;
        }
        rectF.set(f10, scrollY, view.getWidth() + f10, view.getHeight() + scrollY);
        return true;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f46554a;
        if (view.isAttachedToWindow() && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            this.f46555b = viewTreeObserver;
            if (this.f46556c) {
                return;
            }
            viewTreeObserver.addOnPreDrawListener(this);
            this.f46556c = true;
        }
    }

    public final void d(View view, ViewGroup viewGroup, h hVar, boolean z10) {
        i iVar = new i(viewGroup, hVar);
        iVar.d = z10;
        WeakHashMap weakHashMap = this.d;
        List arrayList = (List) weakHashMap.get(view);
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            weakHashMap.put(view, arrayList);
        }
        arrayList.add(iVar);
        RectF rectF = this.f46557e;
        c(view, viewGroup, rectF);
        iVar.f46551c.set(rectF);
        if (!this.f46556c) {
            a();
        }
        if (z10) {
            view.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    @Override
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.f46554a.getViewTreeObserver();
        ViewTreeObserver viewTreeObserver2 = this.f46555b;
        if (viewTreeObserver != viewTreeObserver2) {
            if (this.f46556c && viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                this.f46555b.removeOnPreDrawListener(this);
            }
            this.f46556c = false;
            this.f46555b = null;
            a();
        }
        WeakHashMap weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                View view = (View) entry.getKey();
                List<i> list = (List) entry.getValue();
                if (view != null && list != null) {
                    for (i iVar : list) {
                        boolean z10 = iVar.d;
                        RectF rectF = iVar.f46551c;
                        ViewGroup viewGroup = iVar.f46549a;
                        RectF rectF2 = this.f46557e;
                        if (z10) {
                            int[] iArr = f46553f;
                            view.getLocationOnScreen(iArr);
                            int i10 = iArr[0];
                            rectF2.set(i10, iArr[1], view.getWidth() + i10, view.getHeight() + iArr[1]);
                            viewGroup.getLocationOnScreen(iArr);
                            rectF2.offset(-iArr[0], -iArr[1]);
                        } else if (!c(view, viewGroup, rectF2)) {
                        }
                        if (!iVar.f46552e || !rectF2.equals(rectF)) {
                            rectF.set(rectF2);
                            iVar.f46552e = true;
                            try {
                                iVar.f46550b.g(new RectF(rectF2), view);
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
        if (view == this.f46554a) {
            if (this.f46556c && (viewTreeObserver = this.f46555b) != null && viewTreeObserver.isAlive()) {
                this.f46555b.removeOnPreDrawListener(this);
            }
            this.f46556c = false;
            this.f46555b = null;
        }
    }
}
