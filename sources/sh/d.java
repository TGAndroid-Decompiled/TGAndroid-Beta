package sh;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import ci.u0;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kh.k;
import r0.i0;
import r0.k1;
import r0.p0;
import r0.q0;
import r0.t0;
import r0.v0;
import x7.u;
public final class d extends u0 {
    public static final RectF f54723e;
    public static final Rect f54724f;
    public final ViewGroup f54725b;
    public int f54726c;
    public final ue.b d = new ue.b();

    static {
        new PointF();
        f54723e = new RectF();
        f54724f = new Rect();
    }

    public d(FrameLayout frameLayout) {
        this.f54725b = frameLayout;
        WeakHashMap weakHashMap = i0.f54015a;
        if (Build.VERSION.SDK_INT >= 30) {
            t0.g(frameLayout, this);
            return;
        }
        PathInterpolator pathInterpolator = q0.f54038e;
        View.OnApplyWindowInsetsListener p0Var = new p0(frameLayout, this);
        frameLayout.setTag(2131296698, p0Var);
        if (frameLayout.getTag(2131296686) == null && frameLayout.getTag(2131296687) == null) {
            frameLayout.setOnApplyWindowInsetsListener(p0Var);
        }
    }

    public static k1 e1(k1 k1Var, View view, View view2) {
        if (view != null && view2 != null && k1Var != null) {
            RectF rectF = f54723e;
            if (k.c(view, view2, rectF)) {
                Rect rect = f54724f;
                rectF.round(rect);
                int i3 = rect.left;
                int i10 = rect.top;
                int width = view2.getWidth() - rect.right;
                int height = view2.getHeight() - rect.bottom;
                if (i3 == 0 && i10 == 0 && width == 0 && height == 0) {
                    return k1Var;
                }
                return k1Var.f54026a.m(Math.max(0, i3), Math.max(0, i10), Math.max(0, width), Math.max(0, height));
            }
            return null;
        }
        return null;
    }

    @Override
    public final void V0() {
        int i3 = this.f54726c - 1;
        this.f54726c = i3;
        if (i3 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((c) it.next()).P();
            }
        }
    }

    @Override
    public final k1 W0(k1 k1Var, List list) {
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 |= ((v0) it.next()).f54055a.c();
        }
        if (u.a(i3, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                k1 e12 = e1(k1Var, cVar.R(), this.f54725b);
                if (e12 != null) {
                    cVar.m(e12);
                }
            }
        }
        return k1Var;
    }
}
