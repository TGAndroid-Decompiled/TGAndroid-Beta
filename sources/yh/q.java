package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class q extends w51 {
    static {
        w51.setup(new w51());
    }

    public static x51 a(String str, CharSequence charSequence, int i10) {
        x51 J = x51.J(q.class);
        J.f15717b = false;
        J.f30291z = i10;
        J.f30278l = str;
        J.f30279m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        ((r) view).a(x51Var.f30278l, x51Var.f30279m, x51Var.f30291z);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r(context, 0, d6Var);
    }
}
