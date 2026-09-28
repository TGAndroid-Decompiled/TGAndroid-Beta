package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class k3 extends w51 {
    static {
        w51.setup(new w51());
    }

    public static x51 a(String str) {
        x51 J = x51.J(k3.class);
        J.f30292l = str;
        return J;
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        ((l3) view).set(x51Var.f30292l);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, d6 d6Var) {
        return new l3(context, d6Var);
    }
}
