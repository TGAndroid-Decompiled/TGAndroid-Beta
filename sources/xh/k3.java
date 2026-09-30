package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class k3 extends x51 {
    static {
        x51.setup(new x51());
    }

    public static y51 a(String str) {
        y51 J = y51.J(k3.class);
        J.f30637l = str;
        return J;
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        ((l3) view).set(y51Var.f30637l);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new l3(context, d6Var);
    }
}
