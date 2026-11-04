package r0;

import android.view.View;
import android.view.WindowInsets;
public abstract class b0 {
    public static k1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        k1 h = k1.h(null, rootWindowInsets);
        h1 h1Var = h.f54026a;
        h1Var.r(h);
        h1Var.d(view.getRootView());
        return h;
    }

    public static void b(View view, int i3, int i10) {
        view.setScrollIndicators(i3, i10);
    }
}
