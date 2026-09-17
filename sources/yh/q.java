package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
public final class q extends i51 {
    static {
        i51.setup(new i51());
    }

    public static j51 a(String str, CharSequence charSequence, int i10) {
        j51 J = j51.J(q.class);
        J.f15544b = false;
        J.f25137z = i10;
        J.f25124l = str;
        J.f25125m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        ((r) view).a(j51Var.f25124l, j51Var.f25125m, j51Var.f25137z);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r(context, 0, f6Var);
    }
}
