package sh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class h extends i51 {
    static {
        i51.setup(new i51());
    }

    public static j51 a(int i10, String str, String str2) {
        j51 J = j51.J(h.class);
        J.f28013k = i10;
        J.f28014l = str;
        J.f28015m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        ((i) view).a(j51Var.f28014l, j51Var.f28015m, j51Var.f28013k);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new i(context, g6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
