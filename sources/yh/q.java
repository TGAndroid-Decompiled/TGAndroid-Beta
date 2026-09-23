package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class q extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(String str, CharSequence charSequence, int i10) {
        h51 J = h51.J(q.class);
        J.f15509b = false;
        J.f24520z = i10;
        J.f24507l = str;
        J.f24508m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        ((r) view).a(h51Var.f24507l, h51Var.f24508m, h51Var.f24520z);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r(context, 0, d6Var);
    }
}
