package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class q extends t61 {
    static {
        t61.setup(new t61());
    }

    public static u61 a(String str, CharSequence charSequence, int i10) {
        u61 J = u61.J(q.class);
        J.f16878b = false;
        J.f31084z = i10;
        J.f31071l = str;
        J.f31072m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        ((r) view).a(u61Var.f31071l, u61Var.f31072m, u61Var.f31084z);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new r(context, 0, c6Var);
    }
}
