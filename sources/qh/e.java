package qh;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import ih.j;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import r0.j0;
import r0.l1;
import r0.q0;
import r0.r0;
import r0.u0;
import r0.w0;
import w7.m6;
public final class e extends b2.h {
    public static final RectF e;
    public static final Rect f43633f;
    public final ViewGroup f43634b;
    public int f43635c;
    public final re.b d = new re.b();

    static {
        new PointF();
        e = new RectF();
        f43633f = new Rect();
    }

    public e(ViewGroup viewGroup) {
        this.f43634b = viewGroup;
        WeakHashMap weakHashMap = j0.f43732a;
        if (Build.VERSION.SDK_INT >= 30) {
            u0.g(viewGroup, this);
            return;
        }
        PathInterpolator pathInterpolator = r0.e;
        View.OnApplyWindowInsetsListener q0Var = new q0(viewGroup, this);
        viewGroup.setTag(2131296698, q0Var);
        if (viewGroup.getTag(2131296686) == null && viewGroup.getTag(2131296687) == null) {
            viewGroup.setOnApplyWindowInsetsListener(q0Var);
        }
    }

    public static l1 e1(l1 l1Var, View view, View view2) {
        if (view != null && view2 != null && l1Var != null) {
            RectF rectF = e;
            if (j.c(view, view2, rectF)) {
                Rect rect = f43633f;
                rectF.round(rect);
                int i10 = rect.left;
                int i11 = rect.top;
                int width = view2.getWidth() - rect.right;
                int height = view2.getHeight() - rect.bottom;
                if (i10 == 0 && i11 == 0 && width == 0 && height == 0) {
                    return l1Var;
                }
                return l1Var.f43741a.m(Math.max(0, i10), Math.max(0, i11), Math.max(0, width), Math.max(0, height));
            }
            return null;
        }
        return null;
    }

    @Override
    public final void V0() {
        int i10 = this.f43635c - 1;
        this.f43635c = i10;
        if (i10 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).J();
            }
        }
    }

    @Override
    public final l1 W0(l1 l1Var, List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= ((w0) it.next()).f43765a.c();
        }
        if (m6.a(i10, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                l1 e12 = e1(l1Var, dVar.N(), this.f43634b);
                if (e12 != null) {
                    dVar.k(e12);
                }
            }
        }
        return l1Var;
    }
}
