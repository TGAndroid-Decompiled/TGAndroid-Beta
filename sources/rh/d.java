package rh;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import bi.b1;
import c8.zc;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import jh.k;
import r0.i0;
import r0.k1;
import r0.p0;
import r0.q0;
import r0.t0;
import r0.v0;
public final class d extends b1 {
    public static final RectF f54539e;
    public static final Rect f54540f;
    public final ViewGroup f54541b;
    public int f54542c;
    public final xe.b d = new xe.b();

    static {
        new PointF();
        f54539e = new RectF();
        f54540f = new Rect();
    }

    public d(FrameLayout frameLayout) {
        this.f54541b = frameLayout;
        WeakHashMap weakHashMap = i0.f54190a;
        if (Build.VERSION.SDK_INT >= 30) {
            t0.g(frameLayout, this);
            return;
        }
        PathInterpolator pathInterpolator = q0.f54213e;
        View.OnApplyWindowInsetsListener p0Var = new p0(frameLayout, this);
        frameLayout.setTag(2131296698, p0Var);
        if (frameLayout.getTag(2131296686) == null && frameLayout.getTag(2131296687) == null) {
            frameLayout.setOnApplyWindowInsetsListener(p0Var);
        }
    }

    public static k1 e1(k1 k1Var, View view, View view2) {
        if (view != null && view2 != null && k1Var != null) {
            RectF rectF = f54539e;
            if (k.c(view, view2, rectF)) {
                Rect rect = f54540f;
                rectF.round(rect);
                int i7 = rect.left;
                int i10 = rect.top;
                int width = view2.getWidth() - rect.right;
                int height = view2.getHeight() - rect.bottom;
                if (i7 == 0 && i10 == 0 && width == 0 && height == 0) {
                    return k1Var;
                }
                return k1Var.f54201a.m(Math.max(0, i7), Math.max(0, i10), Math.max(0, width), Math.max(0, height));
            }
            return null;
        }
        return null;
    }

    @Override
    public final void V0() {
        int i7 = this.f54542c - 1;
        this.f54542c = i7;
        if (i7 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((c) it.next()).P();
            }
        }
    }

    @Override
    public final k1 W0(k1 k1Var, List list) {
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 |= ((v0) it.next()).f54230a.c();
        }
        if (zc.a(i7, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                k1 e12 = e1(k1Var, cVar.R(), this.f54541b);
                if (e12 != null) {
                    cVar.m(e12);
                }
            }
        }
        return k1Var;
    }
}
