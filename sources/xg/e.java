package xg;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import g7.z7;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import r0.j0;
import r0.m1;
import r0.q0;
import r0.r0;
import r0.u0;
import r0.w0;
public final class e extends a8.a {
    public static final RectF f49435e;
    public static final Rect f49436f;
    public final ViewGroup f49437b;
    public int f49438c;
    public final xd.b d = new xd.b(true);

    static {
        new PointF();
        f49435e = new RectF();
        f49436f = new Rect();
    }

    public e(ViewGroup viewGroup) {
        this.f49437b = viewGroup;
        WeakHashMap weakHashMap = j0.f46915a;
        if (Build.VERSION.SDK_INT >= 30) {
            u0.g(viewGroup, this);
            return;
        }
        PathInterpolator pathInterpolator = r0.f46940e;
        View.OnApplyWindowInsetsListener q0Var = new q0(viewGroup, this);
        viewGroup.setTag(2131296698, q0Var);
        if (viewGroup.getTag(2131296686) == null && viewGroup.getTag(2131296687) == null) {
            viewGroup.setOnApplyWindowInsetsListener(q0Var);
        }
    }

    public static m1 Q(m1 m1Var, View view, View view2) {
        if (view != null && view2 != null && m1Var != null) {
            RectF rectF = f49435e;
            if (pg.i.c(view, view2, rectF)) {
                Rect rect = f49436f;
                rectF.round(rect);
                int i9 = rect.left;
                int i10 = rect.top;
                int width = view2.getWidth() - rect.right;
                int height = view2.getHeight() - rect.bottom;
                if (i9 == 0 && i10 == 0 && width == 0 && height == 0) {
                    return m1Var;
                }
                return m1Var.f46929a.m(Math.max(0, i9), Math.max(0, i10), Math.max(0, width), Math.max(0, height));
            }
            return null;
        }
        return null;
    }

    @Override
    public final void L() {
        int i9 = this.f49438c - 1;
        this.f49438c = i9;
        if (i9 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).K();
            }
        }
    }

    @Override
    public final m1 M(m1 m1Var, List list) {
        Iterator it = list.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9 |= ((w0) it.next()).f46956a.c();
        }
        if (z7.a(i9, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                m1 Q = Q(m1Var, dVar.M(), this.f49437b);
                if (Q != null) {
                    dVar.k(Q);
                }
            }
        }
        return m1Var;
    }
}
