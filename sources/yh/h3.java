package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class h3 extends f61 {
    static {
        f61.setup(new f61());
    }

    public static g61 a(String str) {
        g61 J = g61.J(h3.class);
        J.f26499l = str;
        return J;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        ((i3) view).set(g61Var.f26499l);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new i3(context, d6Var);
    }
}
