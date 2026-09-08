package qh;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import ih.k;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import r0.i0;
import r0.l1;
import r0.p0;
import r0.q0;
import r0.t0;
import r0.v0;
import w7.b0;
public final class e extends b2.g {
    public static final RectF f44671e;
    public static final Rect f44672f;
    public final ViewGroup f44673b;
    public int f44674c;
    public final pe.b d = new pe.b(true);

    static {
        new PointF();
        f44671e = new RectF();
        f44672f = new Rect();
    }

    public e(ViewGroup viewGroup) {
        this.f44673b = viewGroup;
        WeakHashMap weakHashMap = i0.f44725a;
        if (Build.VERSION.SDK_INT >= 30) {
            t0.g(viewGroup, this);
            return;
        }
        PathInterpolator pathInterpolator = q0.f44750e;
        View.OnApplyWindowInsetsListener p0Var = new p0(viewGroup, this);
        viewGroup.setTag(2131296698, p0Var);
        if (viewGroup.getTag(2131296686) == null && viewGroup.getTag(2131296687) == null) {
            viewGroup.setOnApplyWindowInsetsListener(p0Var);
        }
    }

    public static l1 Z0(l1 l1Var, View view, View view2) {
        if (view != null && view2 != null && l1Var != null) {
            RectF rectF = f44671e;
            if (k.c(view, view2, rectF)) {
                Rect rect = f44672f;
                rectF.round(rect);
                int i10 = rect.left;
                int i11 = rect.top;
                int width = view2.getWidth() - rect.right;
                int height = view2.getHeight() - rect.bottom;
                if (i10 == 0 && i11 == 0 && width == 0 && height == 0) {
                    return l1Var;
                }
                return l1Var.f44739a.m(Math.max(0, i10), Math.max(0, i11), Math.max(0, width), Math.max(0, height));
            }
            return null;
        }
        return null;
    }

    @Override
    public final void S0() {
        int i10 = this.f44674c - 1;
        this.f44674c = i10;
        if (i10 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).J();
            }
        }
    }

    @Override
    public final l1 T0(l1 l1Var, List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= ((v0) it.next()).f44766a.c();
        }
        if (b0.a(i10, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                l1 Z0 = Z0(l1Var, dVar.N(), this.f44673b);
                if (Z0 != null) {
                    dVar.j(Z0);
                }
            }
        }
        return l1Var;
    }
}
