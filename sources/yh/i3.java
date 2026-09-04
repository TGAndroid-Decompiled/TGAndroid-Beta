package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class i3 extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(String str) {
        h51 J = h51.J(i3.class);
        J.f26594l = str;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        ((j3) view).set(h51Var.f26594l);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new j3(context, f6Var);
    }
}
