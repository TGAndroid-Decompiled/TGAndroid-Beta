package th;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class r5 extends v41 {
    public static final int f48711a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        ((t5) view).g((a) w41Var.G, (q5) w41Var.H, w41Var.f34306r);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        t5 t5Var = new t5(context, c6Var);
        t5Var.setBackground(new u1(g6.v0(g6.f23062d6, c6Var)));
        return t5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
