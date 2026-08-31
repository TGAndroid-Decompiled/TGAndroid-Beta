package r0;

import android.view.View;
import android.view.WindowInsets;
public abstract class c0 {
    public static m1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        m1 h = m1.h(null, rootWindowInsets);
        j1 j1Var = h.f46452a;
        j1Var.r(h);
        j1Var.d(view.getRootView());
        return h;
    }

    public static void b(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
