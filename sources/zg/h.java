package zg;

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
public final class h implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final int[] f55772f = new int[2];
    public static final RectF h = new RectF();
    public static final float[] f55773n = new float[2];
    public final View f55774a;
    public ViewTreeObserver f55775b;
    public boolean f55776c;
    public final WeakHashMap d = new WeakHashMap();
    public final RectF e = new RectF();

    public h(View view) {
        this.f55774a = view;
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
        float f7 = 0.0f;
        View view3 = view;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (view3 != null && view3 != view2) {
            f10 += view3.getX();
            f11 += view3.getY();
            ViewParent parent = view3.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view3 = (View) parent;
            f10 -= view3.getScrollX();
            f11 -= view3.getScrollY();
        }
        if (view3 != view2) {
            if (view3 != null) {
                float f12 = 0.0f;
                while (view2 != view3) {
                    float x10 = view2.getX() + f7;
                    float y3 = view2.getY() + f12;
                    ViewParent parent2 = view2.getParent();
                    if (parent2 instanceof View) {
                        view2 = (View) parent2;
                        f12 = y3 - view2.getScrollY();
                        f7 = x10 - view2.getScrollX();
                    }
                }
                float[] fArr = f55773n;
                fArr[0] = f7;
                fArr[1] = f12;
                f10 -= fArr[0];
                f11 -= fArr[1];
            }
            return false;
        }
        rectF.set(f10, f11, view.getWidth() + f10, view.getHeight() + f11);
        return true;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f55774a;
        if (view.isAttachedToWindow() && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            this.f55775b = viewTreeObserver;
            if (!this.f55776c) {
                viewTreeObserver.addOnPreDrawListener(this);
                this.f55776c = true;
            }
        }
    }

    public final void d(View view, ViewGroup viewGroup, f fVar, boolean z10) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        g gVar = new g(viewGroup, fVar);
        gVar.d = z10;
        WeakHashMap weakHashMap = this.d;
        List list = (List) weakHashMap.get(view);
        if (list == null) {
            list = new ArrayList(1);
            weakHashMap.put(view, list);
        }
        list.add(gVar);
        RectF rectF = this.e;
        c(view, viewGroup, rectF);
        gVar.f55771c.set(rectF);
        if (!this.f55776c) {
            a();
        }
        if (z10) {
            ?? obj = new Object();
            l.d dVar = new l.d(obj, 16);
            obj.f54739a = view;
            obj.f54740b = this;
            view.addOnAttachStateChangeListener(dVar);
            if (view.isAttachedToWindow() && (viewTreeObserver2 = (ViewTreeObserver) obj.f54741c) != (viewTreeObserver = view.getViewTreeObserver())) {
                if (viewTreeObserver2 != null) {
                    if (viewTreeObserver2.isAlive()) {
                        ((ViewTreeObserver) obj.f54741c).removeOnPreDrawListener(this);
                    }
                    obj.f54741c = null;
                }
                obj.f54741c = viewTreeObserver;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(this);
                }
            }
        }
    }

    @Override
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.f55774a.getViewTreeObserver();
        ViewTreeObserver viewTreeObserver2 = this.f55775b;
        if (viewTreeObserver != viewTreeObserver2) {
            if (this.f55776c && viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                this.f55775b.removeOnPreDrawListener(this);
            }
            this.f55776c = false;
            this.f55775b = null;
            a();
        }
        WeakHashMap weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                View view = (View) entry.getKey();
                List<g> list = (List) entry.getValue();
                if (view != null && list != null) {
                    for (g gVar : list) {
                        boolean z10 = gVar.d;
                        RectF rectF = gVar.f55771c;
                        ViewGroup viewGroup = gVar.f55769a;
                        RectF rectF2 = this.e;
                        if (z10) {
                            int[] iArr = f55772f;
                            view.getLocationOnScreen(iArr);
                            int i10 = iArr[0];
                            rectF2.set(i10, iArr[1], view.getWidth() + i10, view.getHeight() + iArr[1]);
                            viewGroup.getLocationOnScreen(iArr);
                            rectF2.offset(-iArr[0], -iArr[1]);
                        } else if (!c(view, viewGroup, rectF2)) {
                        }
                        if (!gVar.e || !rectF2.equals(rectF)) {
                            rectF.set(rectF2);
                            gVar.e = true;
                            try {
                                gVar.f55770b.l(new RectF(rectF2), view);
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
        if (view == this.f55774a) {
            if (this.f55776c && (viewTreeObserver = this.f55775b) != null && viewTreeObserver.isAlive()) {
                this.f55775b.removeOnPreDrawListener(this);
            }
            this.f55776c = false;
            this.f55775b = null;
        }
    }
}
