package wh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class t5 extends i51 {
    public static final int f50055a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        ((v5) view).g((a) j51Var.G, (s5) j51Var.H, j51Var.f28020r);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        v5 v5Var = new v5(context, g6Var);
        v5Var.setBackground(new w1(k6.v0(k6.f21659d6, g6Var)));
        return v5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
