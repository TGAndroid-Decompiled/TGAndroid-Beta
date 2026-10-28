package rh;

import a8.pf;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
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
public final class e extends b2.h {
    public static final RectF e;
    public static final Rect f47649f;
    public final ViewGroup f47650b;
    public int f47651c;
    public final se.b d = new se.b();

    static {
        new PointF();
        e = new RectF();
        f47649f = new Rect();
    }

    public e(ViewGroup viewGroup) {
        this.f47650b = viewGroup;
        WeakHashMap weakHashMap = i0.f47143a;
        if (Build.VERSION.SDK_INT >= 30) {
            t0.g(viewGroup, this);
            return;
        }
        PathInterpolator pathInterpolator = q0.e;
        View.OnApplyWindowInsetsListener p0Var = new p0(viewGroup, this);
        viewGroup.setTag(2131296698, p0Var);
        if (viewGroup.getTag(2131296686) == null && viewGroup.getTag(2131296687) == null) {
            viewGroup.setOnApplyWindowInsetsListener(p0Var);
        }
    }

    public static k1 e1(k1 k1Var, View view, View view2) {
        if (view != null && view2 != null && k1Var != null) {
            RectF rectF = e;
            if (k.c(view, view2, rectF)) {
                Rect rect = f47649f;
                rectF.round(rect);
                int i10 = rect.left;
                int i11 = rect.top;
                int width = view2.getWidth() - rect.right;
                int height = view2.getHeight() - rect.bottom;
                if (i10 == 0 && i11 == 0 && width == 0 && height == 0) {
                    return k1Var;
                }
                return k1Var.f47153a.m(Math.max(0, i10), Math.max(0, i11), Math.max(0, width), Math.max(0, height));
            }
            return null;
        }
        return null;
    }

    @Override
    public final void V0() {
        int i10 = this.f47651c - 1;
        this.f47651c = i10;
        if (i10 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).M();
            }
        }
    }

    @Override
    public final k1 W0(k1 k1Var, List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= ((v0) it.next()).f47177a.c();
        }
        if (pf.a(i10, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                k1 e12 = e1(k1Var, dVar.O(), this.f47650b);
                if (e12 != null) {
                    dVar.k(e12);
                }
            }
        }
        return k1Var;
    }
}
