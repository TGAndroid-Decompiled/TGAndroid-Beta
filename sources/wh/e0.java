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
public final class e0 extends i51 {
    public static final int f49708a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        f0 f0Var = (f0) view;
        a aVar = (a) j51Var.G;
        f0Var.f50174a = aVar;
        f0Var.B = (d0) j51Var.H;
        f0Var.c(aVar);
        f0Var.i();
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        f0 f0Var = new f0(context, i10, g6Var);
        f0Var.setBackground(new w1(k6.v0(k6.f21659d6, g6Var)));
        return f0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
