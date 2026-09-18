package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
public final class q0 extends v0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final u1.a f42119f = new u1.b(u1.a.f43551c);
    public static final DecelerateInterpolator f42120g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, w0 w0Var) {
        b2.g i10 = i(view);
        if (i10 != null) {
            i10.S0();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                e(viewGroup.getChildAt(i11), w0Var);
            }
        }
    }

    public static void f(View view, m1 m1Var, boolean z10) {
        b2.g i10 = i(view);
        if (i10 != null) {
            i10.f3000a = m1Var;
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
        b2.g i10 = i(view);
        if (i10 != null) {
            i10.T0(m1Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                g(viewGroup.getChildAt(i11), m1Var, list);
            }
        }
    }

    public static void h(View view, w0 w0Var, o0.a aVar) {
        b2.g i10 = i(view);
        if (i10 != null) {
            ph.e eVar = (ph.e) i10;
            if (eVar.f41322c == 0) {
                Iterator it = eVar.d.iterator();
                while (it.hasNext()) {
                    ((ph.d) it.next()).s();
                }
            }
            eVar.f41322c++;
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                h(viewGroup.getChildAt(i11), w0Var, aVar);
            }
        }
    }

    public static b2.g i(View view) {
        Object tag = view.getTag(2131296698);
        if (tag instanceof p0) {
            return ((p0) tag).f42116a;
        }
        return null;
    }
}
