package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
public final class r0 extends v0 {
    public static final PathInterpolator f46463e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final u1.a f46464f = new u1.b(u1.a.f48226c);
    public static final DecelerateInterpolator f46465g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, w0 w0Var) {
        cb.e i10 = i(view);
        if (i10 != null) {
            i10.H();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                e(viewGroup.getChildAt(i11), w0Var);
            }
        }
    }

    public static void f(View view, m1 m1Var, boolean z4) {
        cb.e i10 = i(view);
        if (i10 != null) {
            i10.f2406a = m1Var;
            if (!z4) {
                z4 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                f(viewGroup.getChildAt(i11), m1Var, z4);
            }
        }
    }

    public static void g(View view, m1 m1Var, List list) {
        cb.e i10 = i(view);
        if (i10 != null) {
            i10.I(m1Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                g(viewGroup.getChildAt(i11), m1Var, list);
            }
        }
    }

    public static void h(View view, w0 w0Var, q5.g0 g0Var) {
        cb.e i10 = i(view);
        if (i10 != null) {
            dh.e eVar = (dh.e) i10;
            if (eVar.f4754c == 0) {
                Iterator it = eVar.d.iterator();
                while (it.hasNext()) {
                    ((dh.d) it.next()).t();
                }
            }
            eVar.f4754c++;
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                h(viewGroup.getChildAt(i11), w0Var, g0Var);
            }
        }
    }

    public static cb.e i(View view) {
        Object tag = view.getTag(2131296698);
        if (tag instanceof q0) {
            return ((q0) tag).f46460a;
        }
        return null;
    }
}
