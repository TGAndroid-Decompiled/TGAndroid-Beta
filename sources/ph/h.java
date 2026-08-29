package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class h extends v41 {
    static {
        v41.setup(new v41());
    }

    public static w41 a(int i10, String str, String str2) {
        w41 J = w41.J(h.class);
        J.f34299k = i10;
        J.f34300l = str;
        J.f34301m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        ((i) view).a(w41Var.f34300l, w41Var.f34301m, w41Var.f34299k);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new i(context, c6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
