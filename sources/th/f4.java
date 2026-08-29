package th;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class f4 extends v41 {
    public static final int f48442a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        ((g4) view).h((a) w41Var.G, (e4) w41Var.H);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new g4(context, i10, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
