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
public final class x extends g51 {
    public static final int f50177a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        ((y) view).i((a) h51Var.G, (l3) h51Var.H);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        y yVar = new y(context, i10, g6Var);
        yVar.setBackground(new w1(k6.v0(k6.f21661d6, g6Var)));
        return yVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
