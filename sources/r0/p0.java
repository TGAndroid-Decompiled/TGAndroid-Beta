package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
public final class p0 extends t0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final u1.a f46143f = new u1.b(u1.a.f49814c);
    public static final DecelerateInterpolator f46144g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, u0 u0Var) {
        b2.h i10 = i(view);
        if (i10 != null) {
            i10.V0();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                e(viewGroup.getChildAt(i11), u0Var);
            }
        }
    }

    public static void f(View view, j1 j1Var, boolean z10) {
        b2.h i10 = i(view);
        if (i10 != null) {
            i10.f2047a = j1Var;
            if (!z10) {
                z10 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                f(viewGroup.getChildAt(i11), j1Var, z10);
            }
        }
    }

    public static void g(View view, j1 j1Var, List list) {
        b2.h i10 = i(view);
        if (i10 != null) {
            i10.W0(j1Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                g(viewGroup.getChildAt(i11), j1Var, list);
            }
        }
    }

    public static void h(View view, u0 u0Var, m5.e eVar) {
        b2.h i10 = i(view);
        if (i10 != null) {
            hh.e eVar2 = (hh.e) i10;
            if (eVar2.f7692c == 0) {
                Iterator it = eVar2.d.iterator();
                while (it.hasNext()) {
                    ((hh.d) it.next()).w();
                }
            }
            eVar2.f7692c++;
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                h(viewGroup.getChildAt(i11), u0Var, eVar);
            }
        }
    }

    public static b2.h i(View view) {
        Object tag = view.getTag(2131296698);
        if (tag instanceof o0) {
            return ((o0) tag).f46140a;
        }
        return null;
    }
}
