package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
public final class q extends w51 {
    static {
        w51.setup(new w51());
    }

    public static x51 a(String str, CharSequence charSequence, int i10) {
        x51 J = x51.J(q.class);
        J.f15673b = false;
        J.f30261z = i10;
        J.f30248l = str;
        J.f30249m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        ((r) view).a(x51Var.f30248l, x51Var.f30249m, x51Var.f30261z);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new r(context, 0, e6Var);
    }
}
