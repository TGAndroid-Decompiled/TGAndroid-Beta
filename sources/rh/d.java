package rh;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import c8.dd;
import com.google.android.gms.common.api.q;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import jh.k;
import r0.i0;
import r0.l1;
import r0.p0;
import r0.q0;
import r0.t0;
import r0.v0;
public final class d extends q {
    public static final RectF f56642e;
    public static final Rect f56643f;
    public final ViewGroup f56644b;
    public int f56645c;
    public final xe.b d = new xe.b();

    static {
        new PointF();
        f56642e = new RectF();
        f56643f = new Rect();
    }

    public d(FrameLayout frameLayout) {
        this.f56644b = frameLayout;
        WeakHashMap weakHashMap = i0.f56289a;
        if (Build.VERSION.SDK_INT >= 30) {
            t0.g(frameLayout, this);
            return;
        }
        PathInterpolator pathInterpolator = q0.f56314e;
        View.OnApplyWindowInsetsListener p0Var = new p0(frameLayout, this);
        frameLayout.setTag(2131296700, p0Var);
        if (frameLayout.getTag(2131296688) == null && frameLayout.getTag(2131296689) == null) {
            frameLayout.setOnApplyWindowInsetsListener(p0Var);
        }
    }

    public static l1 e1(l1 l1Var, View view, View view2) {
        if (view != null && view2 != null && l1Var != null) {
            RectF rectF = f56642e;
            if (k.c(view, view2, rectF)) {
                Rect rect = f56643f;
                rectF.round(rect);
                int i7 = rect.left;
                int i10 = rect.top;
                int width = view2.getWidth() - rect.right;
                int height = view2.getHeight() - rect.bottom;
                if (i7 == 0 && i10 == 0 && width == 0 && height == 0) {
                    return l1Var;
                }
                return l1Var.f56303a.m(Math.max(0, i7), Math.max(0, i10), Math.max(0, width), Math.max(0, height));
            }
            return null;
        }
        return null;
    }

    @Override
    public final void V0() {
        int i7 = this.f56645c - 1;
        this.f56645c = i7;
        if (i7 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((c) it.next()).O();
            }
        }
    }

    @Override
    public final l1 W0(l1 l1Var, List list) {
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 |= ((v0) it.next()).f56331a.c();
        }
        if (dd.a(i7, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                l1 e12 = e1(l1Var, cVar.S(), this.f56644b);
                if (e12 != null) {
                    cVar.m(e12);
                }
            }
        }
        return l1Var;
    }
}
