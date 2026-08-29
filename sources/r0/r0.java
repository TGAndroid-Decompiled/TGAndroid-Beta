package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
public final class r0 extends v0 {
    public static final PathInterpolator f46854e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final u1.a f46855f = new u1.b(u1.a.f48957c);
    public static final DecelerateInterpolator f46856g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, w0 w0Var) {
        ab.e i10 = i(view);
        if (i10 != null) {
            i10.L();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                e(viewGroup.getChildAt(i11), w0Var);
            }
        }
    }

    public static void f(View view, m1 m1Var, boolean z10) {
        ab.e i10 = i(view);
        if (i10 != null) {
            i10.f306a = m1Var;
            if (!z10) {
                z10 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                f(viewGroup.getChildAt(i11), m1Var, z10);
            }
        }
    }

    public static void g(View view, m1 m1Var, List list) {
        ab.e i10 = i(view);
        if (i10 != null) {
            i10.M(m1Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                g(viewGroup.getChildAt(i11), m1Var, list);
            }
        }
    }

    public static void h(View view, w0 w0Var, oc.i iVar) {
        ab.e i10 = i(view);
        if (i10 != null) {
            ah.e eVar = (ah.e) i10;
            if (eVar.f746c == 0) {
                Iterator it = eVar.d.iterator();
                while (it.hasNext()) {
                    ((ah.d) it.next()).t();
                }
            }
            eVar.f746c++;
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                h(viewGroup.getChildAt(i11), w0Var, iVar);
            }
        }
    }

    public static ab.e i(View view) {
        Object tag = view.getTag(2131296698);
        if (tag instanceof q0) {
            return ((q0) tag).f46851a;
        }
        return null;
    }
}
