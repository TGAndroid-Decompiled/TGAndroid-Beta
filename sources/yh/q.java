package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class q extends q61 {
    static {
        q61.setup(new q61());
    }

    public static r61 a(String str, CharSequence charSequence, int i10) {
        r61 J = r61.J(q.class);
        J.f17176b = false;
        J.f30374z = i10;
        J.f30361l = str;
        J.f30362m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        ((r) view).a(r61Var.f30361l, r61Var.f30362m, r61Var.f30374z);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r(context, 0, d6Var);
    }
}
