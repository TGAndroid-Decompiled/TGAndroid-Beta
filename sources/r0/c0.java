package r0;

import android.view.View;
import android.view.WindowInsets;

public abstract class c0 {
    public static m1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        m1 m1VarH = m1.h(null, rootWindowInsets);
        j1 j1Var = m1VarH.f46619a;
        j1Var.r(m1VarH);
        j1Var.d(view.getRootView());
        return m1VarH;
    }

    public static void b(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
