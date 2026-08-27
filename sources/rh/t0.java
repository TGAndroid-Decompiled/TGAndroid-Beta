package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class t0 extends m41 {

    public static final int f47455a = 0;

    static {
        m41.setup(new t0());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        u0 u0Var = (u0) view;
        a aVar = (a) n41Var.G;
        l2 l2Var = (l2) n41Var.H;
        u0Var.f47594a = aVar;
        u0Var.v = l2Var;
        u0Var.f47493w = LocaleController.isRTL;
        u0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new u0(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
