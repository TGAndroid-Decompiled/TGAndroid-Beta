package wh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class u0 extends i51 {
    public static final int f50059a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        v0 v0Var = (v0) view;
        a aVar = (a) j51Var.G;
        v0Var.f50175a = aVar;
        v0Var.v = (n2) j51Var.H;
        v0Var.f50093w = LocaleController.isRTL;
        v0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new v0(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
