package vh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class u0 extends h51 {
    public static final int f46275a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        v0 v0Var = (v0) view;
        a aVar = (a) i51Var.G;
        v0Var.f46414a = aVar;
        v0Var.v = (n2) i51Var.H;
        v0Var.f46293w = LocaleController.isRTL;
        v0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new v0(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
