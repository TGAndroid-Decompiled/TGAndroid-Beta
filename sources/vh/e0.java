package vh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class e0 extends h51 {
    public static final int f45941a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        f0 f0Var = (f0) view;
        a aVar = (a) i51Var.G;
        f0Var.f46414a = aVar;
        f0Var.B = (d0) i51Var.H;
        f0Var.c(aVar);
        f0Var.i();
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        f0 f0Var = new f0(context, i10, f6Var);
        f0Var.setBackground(new v1(j6.v0(j6.f19881d6, f6Var)));
        return f0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
