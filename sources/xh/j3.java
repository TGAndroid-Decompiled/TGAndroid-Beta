package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class j3 extends t61 {
    static {
        t61.setup(new t61());
    }

    public static u61 a(String str) {
        u61 J = u61.J(j3.class);
        J.f31071l = str;
        return J;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        ((k3) view).set(u61Var.f31071l);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        return new k3(context, c6Var);
    }
}
