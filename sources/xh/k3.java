package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class k3 extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(String str) {
        h51 J = h51.J(k3.class);
        J.f24507l = str;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        ((l3) view).set(h51Var.f24507l);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new l3(context, d6Var);
    }
}
