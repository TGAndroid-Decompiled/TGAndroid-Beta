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
public final class d0 extends v41 {
    public static final int f48398a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        e0 e0Var = (e0) view;
        a aVar = (a) w41Var.G;
        e0Var.f48892a = aVar;
        e0Var.A = (c0) w41Var.H;
        e0Var.c(aVar);
        e0Var.i();
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        e0 e0Var = new e0(context, i10, c6Var);
        e0Var.setBackground(new u1(g6.v0(g6.f23062d6, c6Var)));
        return e0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
