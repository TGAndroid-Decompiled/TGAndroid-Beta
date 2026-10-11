package ph;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import hh.j;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import r0.i0;
import r0.k1;
import r0.p0;
import r0.q0;
import r0.t0;
import r0.v0;
import w7.g0;
public final class e extends b2.g {
    public static final RectF f45934e;
    public static final Rect f45935f;
    public final ViewGroup f45936b;
    public int f45937c;
    public final qe.b d = new qe.b();

    static {
        new PointF();
        f45934e = new RectF();
        f45935f = new Rect();
    }

    public e(ViewGroup viewGroup) {
        this.f45936b = viewGroup;
        WeakHashMap weakHashMap = i0.f46890a;
        if (Build.VERSION.SDK_INT >= 30) {
            t0.g(viewGroup, this);
            return;
        }
        PathInterpolator pathInterpolator = q0.f46913e;
        View.OnApplyWindowInsetsListener p0Var = new p0(viewGroup, this);
        viewGroup.setTag(2131296698, p0Var);
        if (viewGroup.getTag(2131296686) == null && viewGroup.getTag(2131296687) == null) {
            viewGroup.setOnApplyWindowInsetsListener(p0Var);
        }
    }

    public static k1 b1(k1 k1Var, View view, View view2) {
        if (view != null && view2 != null && k1Var != null) {
            RectF rectF = f45934e;
            if (j.c(view, view2, rectF)) {
                Rect rect = f45935f;
                rectF.round(rect);
                int i10 = rect.left;
                int i11 = rect.top;
                int width = view2.getWidth() - rect.right;
                int height = view2.getHeight() - rect.bottom;
                if (i10 == 0 && i11 == 0 && width == 0 && height == 0) {
                    return k1Var;
                }
                return k1Var.f46901a.m(Math.max(0, i10), Math.max(0, i11), Math.max(0, width), Math.max(0, height));
            }
            return null;
        }
        return null;
    }

    @Override
    public final void S0() {
        int i10 = this.f45937c - 1;
        this.f45937c = i10;
        if (i10 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).J();
            }
        }
    }

    @Override
    public final k1 T0(k1 k1Var, List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= ((v0) it.next()).f46929a.c();
        }
        if (g0.a(i10, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                k1 b12 = b1(k1Var, dVar.N(), this.f45936b);
                if (b12 != null) {
                    dVar.j(b12);
                }
            }
        }
        return k1Var;
    }
}
