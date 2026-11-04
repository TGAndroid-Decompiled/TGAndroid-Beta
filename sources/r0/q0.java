package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
public final class q0 extends u0 {
    public static final PathInterpolator f54038e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final w1.a f54039f = new w1.b(w1.a.f57014c);
    public static final DecelerateInterpolator f54040g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, v0 v0Var) {
        ci.u0 i3 = i(view);
        if (i3 != null) {
            i3.V0();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), v0Var);
            }
        }
    }

    public static void f(View view, k1 k1Var, boolean z10) {
        ci.u0 i3 = i(view);
        if (i3 != null) {
            i3.f6076a = k1Var;
            if (!z10) {
                z10 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), k1Var, z10);
            }
        }
    }

    public static void g(View view, k1 k1Var, List list) {
        ci.u0 i3 = i(view);
        if (i3 != null) {
            i3.W0(k1Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), k1Var, list);
            }
        }
    }

    public static void h(View view, v0 v0Var, mi.h0 h0Var) {
        ci.u0 i3 = i(view);
        if (i3 != null) {
            sh.d dVar = (sh.d) i3;
            if (dVar.f54726c == 0) {
                Iterator it = dVar.d.iterator();
                while (it.hasNext()) {
                    ((sh.c) it.next()).w();
                }
            }
            dVar.f54726c++;
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), v0Var, h0Var);
            }
        }
    }

    public static ci.u0 i(View view) {
        Object tag = view.getTag(2131296698);
        if (tag instanceof p0) {
            return ((p0) tag).f54036a;
        }
        return null;
    }
}
