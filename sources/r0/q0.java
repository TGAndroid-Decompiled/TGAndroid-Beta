package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
public final class q0 extends u0 {
    public static final PathInterpolator f54120e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final x1.a f54121f = new x1.b(x1.a.f58172c);
    public static final DecelerateInterpolator f54122g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, v0 v0Var) {
        bi.b1 i7 = i(view);
        if (i7 != null) {
            i7.V0();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), v0Var);
            }
        }
    }

    public static void f(View view, k1 k1Var, boolean z9) {
        bi.b1 i7 = i(view);
        if (i7 != null) {
            i7.f3500a = k1Var;
            if (!z9) {
                z9 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), k1Var, z9);
            }
        }
    }

    public static void g(View view, k1 k1Var, List list) {
        bi.b1 i7 = i(view);
        if (i7 != null) {
            i7.W0(k1Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), k1Var, list);
            }
        }
    }

    public static void h(View view, v0 v0Var, j2.n nVar) {
        bi.b1 i7 = i(view);
        if (i7 != null) {
            rh.d dVar = (rh.d) i7;
            if (dVar.f54450c == 0) {
                Iterator it = dVar.d.iterator();
                while (it.hasNext()) {
                    ((rh.c) it.next()).w();
                }
            }
            dVar.f54450c++;
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), v0Var, nVar);
            }
        }
    }

    public static bi.b1 i(View view) {
        Object tag = view.getTag(2131296698);
        if (tag instanceof p0) {
            return ((p0) tag).f54118a;
        }
        return null;
    }
}
