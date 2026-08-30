package vh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class t0 extends h51 {
    public static final int f46176a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        u0 u0Var = (u0) view;
        a aVar = (a) i51Var.G;
        u0Var.f46283a = aVar;
        u0Var.v = (m2) i51Var.H;
        u0Var.f46190w = LocaleController.isRTL;
        u0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        return new u0(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
