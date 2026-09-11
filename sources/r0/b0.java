package r0;

import android.view.View;
import android.view.WindowInsets;
public abstract class b0 {
    public static l1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        l1 h = l1.h(null, rootWindowInsets);
        i1 i1Var = h.f44711a;
        i1Var.r(h);
        i1Var.d(view.getRootView());
        return h;
    }

    public static void b(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
