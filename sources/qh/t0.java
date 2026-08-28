package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class t0 extends k41 {
    public static final int f46713a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        u0 u0Var = (u0) view;
        a aVar = (a) l41Var.G;
        u0Var.f46834a = aVar;
        u0Var.v = (l2) l41Var.H;
        u0Var.f46736w = LocaleController.isRTL;
        u0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new u0(context, b6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
