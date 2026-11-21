package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
public final class q0 extends u0 {
    public static final PathInterpolator f56310e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final x1.a f56311f = new x1.b(x1.a.f60062c);
    public static final DecelerateInterpolator f56312g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, v0 v0Var) {
        com.google.android.gms.common.api.q i7 = i(view);
        if (i7 != null) {
            i7.V0();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), v0Var);
            }
        }
    }

    public static void f(View view, l1 l1Var, boolean z10) {
        com.google.android.gms.common.api.q i7 = i(view);
        if (i7 != null) {
            i7.f6424a = l1Var;
            if (!z10) {
                z10 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), l1Var, z10);
            }
        }
    }

    public static void g(View view, l1 l1Var, List list) {
        com.google.android.gms.common.api.q i7 = i(view);
        if (i7 != null) {
            i7.W0(l1Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), l1Var, list);
            }
        }
    }

    public static void h(View view, v0 v0Var, k8.a aVar) {
        com.google.android.gms.common.api.q i7 = i(view);
        if (i7 != null) {
            rh.d dVar = (rh.d) i7;
            if (dVar.f56641c == 0) {
                Iterator it = dVar.d.iterator();
                while (it.hasNext()) {
                    ((rh.c) it.next()).w();
                }
            }
            dVar.f56641c++;
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), v0Var, aVar);
            }
        }
    }

    public static com.google.android.gms.common.api.q i(View view) {
        Object tag = view.getTag(2131296700);
        if (tag instanceof p0) {
            return ((p0) tag).f56308a;
        }
        return null;
    }
}
