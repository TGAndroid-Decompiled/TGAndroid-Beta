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
public final class w extends v41 {
    public static final int f48822a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        ((x) view).i((a) w41Var.G, (j3) w41Var.H);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        x xVar = new x(context, i10, c6Var);
        xVar.setBackground(new u1(g6.v0(g6.f23062d6, c6Var)));
        return xVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
