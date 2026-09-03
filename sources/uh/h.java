package uh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class h extends g51 {
    public static final int f48858a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        long j10 = h51Var.B;
        ((i) view).a((int) j10, (int) (j10 >>> 32), h51Var.f27374k, h51Var.f27375l, h51Var.f27377n, h51Var.f27380q);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new i(context, g6Var, false);
    }
}
