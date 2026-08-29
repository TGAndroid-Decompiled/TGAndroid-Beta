package rh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class h extends v41 {
    public static final int f47454a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        long j10 = w41Var.B;
        ((i) view).a((int) j10, (int) (j10 >>> 32), w41Var.f34299k, w41Var.f34300l, w41Var.f34302n, w41Var.f34305q);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new i(context, c6Var, false);
    }
}
