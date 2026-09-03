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
public final class u5 extends h51 {
    public static final int f46288a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        ((w5) view).g((a) i51Var.G, (t5) i51Var.H, i51Var.f25591r);
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        w5 w5Var = new w5(context, f6Var);
        w5Var.setBackground(new v1(j6.v0(j6.f19881d6, f6Var)));
        return w5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
