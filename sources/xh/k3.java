package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class k3 extends q61 {
    static {
        q61.setup(new q61());
    }

    public static r61 a(String str) {
        r61 J = r61.J(k3.class);
        J.f30361l = str;
        return J;
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        ((l3) view).set(r61Var.f30361l);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        return new l3(context, d6Var);
    }
}
