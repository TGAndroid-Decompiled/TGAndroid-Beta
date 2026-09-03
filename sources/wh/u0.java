package wh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class u0 extends g51 {
    public static final int f50095a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        v0 v0Var = (v0) view;
        a aVar = (a) h51Var.G;
        v0Var.f50211a = aVar;
        v0Var.v = (n2) h51Var.H;
        v0Var.f50129w = LocaleController.isRTL;
        v0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new v0(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
