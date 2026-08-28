package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
import org.telegram.ui.Cells.e3;
public final class r0 extends v0 {
    public static final PathInterpolator f46940e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final u1.a f46941f = new u1.b(u1.a.f47959c);
    public static final DecelerateInterpolator f46942g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, w0 w0Var) {
        a8.a i9 = i(view);
        if (i9 != null) {
            i9.L();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), w0Var);
            }
        }
    }

    public static void f(View view, m1 m1Var, boolean z10) {
        a8.a i9 = i(view);
        if (i9 != null) {
            i9.f108a = m1Var;
            if (!z10) {
                z10 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), m1Var, z10);
            }
        }
    }

    public static void g(View view, m1 m1Var, List list) {
        a8.a i9 = i(view);
        if (i9 != null) {
            i9.M(m1Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), m1Var, list);
            }
        }
    }

    public static void h(View view, w0 w0Var, e3 e3Var) {
        a8.a i9 = i(view);
        if (i9 != null) {
            xg.e eVar = (xg.e) i9;
            if (eVar.f49438c == 0) {
                Iterator it = eVar.d.iterator();
                while (it.hasNext()) {
                    ((xg.d) it.next()).t();
                }
            }
            eVar.f49438c++;
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), w0Var, e3Var);
            }
        }
    }

    public static a8.a i(View view) {
        Object tag = view.getTag(2131296698);
        if (tag instanceof q0) {
            return ((q0) tag).f46937a;
        }
        return null;
    }
}
