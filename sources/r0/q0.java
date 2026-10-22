package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
public final class q0 extends u0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final u1.a f44849f = new u1.b(u1.a.f47250c);
    public static final DecelerateInterpolator f44850g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, v0 v0Var) {
        ai.c1 i10 = i(view);
        if (i10 != null) {
            i10.V0();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                e(viewGroup.getChildAt(i11), v0Var);
            }
        }
    }

    public static void f(View view, k1 k1Var, boolean z10) {
        ai.c1 i10 = i(view);
        if (i10 != null) {
            i10.f1067a = k1Var;
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
        ai.c1 i10 = i(view);
        if (i10 != null) {
            i10.W0(k1Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                g(viewGroup.getChildAt(i11), k1Var, list);
            }
        }
    }

    public static void h(View view, v0 v0Var, mi.q qVar) {
        ai.c1 i10 = i(view);
        if (i10 != null) {
            qh.e eVar = (qh.e) i10;
            if (eVar.f44736c == 0) {
                Iterator it = eVar.d.iterator();
                while (it.hasNext()) {
                    ((qh.d) it.next()).u();
                }
            }
            eVar.f44736c++;
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                h(viewGroup.getChildAt(i11), v0Var, qVar);
            }
        }
    }

    public static ai.c1 i(View view) {
        Object tag = view.getTag(2131296698);
        if (tag instanceof p0) {
            return ((p0) tag).f44846a;
        }
        return null;
    }
}
