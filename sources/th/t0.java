package th;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class t0 extends v41 {
    public static final int f48753a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        u0 u0Var = (u0) view;
        a aVar = (a) w41Var.G;
        u0Var.f48892a = aVar;
        u0Var.v = (l2) w41Var.H;
        u0Var.f48791w = LocaleController.isRTL;
        u0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new u0(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
