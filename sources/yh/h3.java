package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class h3 extends l61 {
    static {
        l61.setup(new l61());
    }

    public static m61 a(String str) {
        m61 J = m61.J(h3.class);
        J.f28559l = str;
        return J;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        ((i3) view).set(m61Var.f28559l);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new i3(context, g6Var);
    }
}
