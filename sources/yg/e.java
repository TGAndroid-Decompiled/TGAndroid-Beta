package yg;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import h7.a8;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import qg.j;
import r0.j0;
import r0.m1;
import r0.q0;
import r0.r0;
import r0.u0;
import r0.w0;

public final class e extends b8.a {

    public static final RectF f50148e;

    public static final Rect f50149f;

    public final ViewGroup f50150b;

    public int f50151c;
    public final yd.b d = new yd.b(true);

    static {
        new PointF();
        f50148e = new RectF();
        f50149f = new Rect();
    }

    public e(ViewGroup viewGroup) {
        this.f50150b = viewGroup;
        WeakHashMap weakHashMap = j0.f46605a;
        if (Build.VERSION.SDK_INT >= 30) {
            u0.g(viewGroup, this);
            return;
        }
        PathInterpolator pathInterpolator = r0.f46630e;
        View.OnApplyWindowInsetsListener q0Var = new q0(viewGroup, this);
        viewGroup.setTag(2131296698, q0Var);
        if (viewGroup.getTag(2131296686) == null && viewGroup.getTag(2131296687) == null) {
            viewGroup.setOnApplyWindowInsetsListener(q0Var);
        }
    }

    public static m1 Q(m1 m1Var, View view, View view2) {
        if (view == null || view2 == null || m1Var == null) {
            return null;
        }
        RectF rectF = f50148e;
        if (!j.c(view, view2, rectF)) {
            return null;
        }
        Rect rect = f50149f;
        rectF.round(rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int width = view2.getWidth() - rect.right;
        int height = view2.getHeight() - rect.bottom;
        if (i10 == 0 && i11 == 0 && width == 0 && height == 0) {
            return m1Var;
        }
        return m1Var.f46619a.m(Math.max(0, i10), Math.max(0, i11), Math.max(0, width), Math.max(0, height));
    }

    @Override
    public final void L() {
        int i10 = this.f50151c - 1;
        this.f50151c = i10;
        if (i10 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).L();
            }
        }
    }

    @Override
    public final m1 M(m1 m1Var, List list) {
        Iterator it = list.iterator();
        int iC = 0;
        while (it.hasNext()) {
            iC |= ((w0) it.next()).f46646a.c();
        }
        if (a8.a(iC, 8)) {
            for (d dVar : this.d) {
                m1 m1VarQ = Q(m1Var, dVar.N(), this.f50150b);
                if (m1VarQ != null) {
                    dVar.k(m1VarQ);
                }
            }
        }
        return m1Var;
    }
}
