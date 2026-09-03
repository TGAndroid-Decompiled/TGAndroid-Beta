package wh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class t5 extends g51 {
    public static final int f50092a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        ((v5) view).g((a) h51Var.G, (s5) h51Var.H, h51Var.f27381r);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        v5 v5Var = new v5(context, g6Var);
        v5Var.setBackground(new w1(k6.v0(k6.f21661d6, g6Var)));
        return v5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
