package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
public final class q0 extends u0 {
    public static final PathInterpolator f46879e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final u1.a f46880f = new u1.b(u1.a.f48596c);
    public static final DecelerateInterpolator f46881g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, v0 v0Var) {
        b2.g i10 = i(view);
        if (i10 != null) {
            i10.S0();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                e(viewGroup.getChildAt(i11), v0Var);
            }
        }
    }

    public static void f(View view, k1 k1Var, boolean z10) {
        b2.g i10 = i(view);
        if (i10 != null) {
            i10.f3314a = k1Var;
            if (!z10) {
                z10 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                f(viewGroup.getChildAt(i11), k1Var, z10);
            }
        }
    }

    public static void g(View view, k1 k1Var, List list) {
        b2.g i10 = i(view);
        if (i10 != null) {
            i10.T0(k1Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                g(viewGroup.getChildAt(i11), k1Var, list);
            }
        }
    }

    public static void h(View view, v0 v0Var, n7.z0 z0Var) {
        b2.g i10 = i(view);
        if (i10 != null) {
            ph.e eVar = (ph.e) i10;
            if (eVar.f45903c == 0) {
                Iterator it = eVar.d.iterator();
                while (it.hasNext()) {
                    ((ph.d) it.next()).t();
                }
            }
            eVar.f45903c++;
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                h(viewGroup.getChildAt(i11), v0Var, z0Var);
            }
        }
    }

    public static b2.g i(View view) {
        Object tag = view.getTag(2131296698);
        if (tag instanceof p0) {
            return ((p0) tag).f46876a;
        }
        return null;
    }
}
