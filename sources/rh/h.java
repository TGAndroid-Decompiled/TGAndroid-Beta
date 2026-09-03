package rh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class h extends h51 {
    static {
        h51.setup(new h51());
    }

    public static i51 a(int i10, String str, String str2) {
        i51 J = i51.J(h.class);
        J.f25584k = i10;
        J.f25585l = str;
        J.f25586m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        ((i) view).a(i51Var.f25585l, i51Var.f25586m, i51Var.f25584k);
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new i(context, f6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
