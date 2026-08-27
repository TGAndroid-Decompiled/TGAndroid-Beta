package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
import org.telegram.ui.i6;

public final class r0 extends v0 {

    public static final PathInterpolator f46630e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    public static final u1.a f46631f = new u1.a(u1.a.f48253c);

    public static final DecelerateInterpolator f46632g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, w0 w0Var) {
        b8.a aVarJ = j(view);
        if (aVarJ != null) {
            aVarJ.L();
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), w0Var);
            }
        }
    }

    public static void f(View view, m1 m1Var, boolean z10) {
        b8.a aVarJ = j(view);
        if (aVarJ != null) {
            aVarJ.f2040a = m1Var;
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
        b8.a aVarJ = j(view);
        if (aVarJ != null) {
            aVarJ.M(m1Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), m1Var, list);
            }
        }
    }

    public static void h(View view, w0 w0Var, i6 i6Var) {
        b8.a aVarJ = j(view);
        if (aVarJ != null) {
            yg.e eVar = (yg.e) aVarJ;
            if (eVar.f50151c == 0) {
                Iterator it = eVar.d.iterator();
                while (it.hasNext()) {
                    ((yg.d) it.next()).u();
                }
            }
            eVar.f50151c++;
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), w0Var, i6Var);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(2131296687) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static b8.a j(View view) {
        Object tag = view.getTag(2131296698);
        if (tag instanceof q0) {
            return ((q0) tag).f46627a;
        }
        return null;
    }
}
