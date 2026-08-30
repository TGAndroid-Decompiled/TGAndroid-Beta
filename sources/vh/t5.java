package vh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class t5 extends h51 {
    public static final int f46185a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        ((v5) view).g((a) i51Var.G, (s5) i51Var.H, i51Var.f25571r);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        v5 v5Var = new v5(context, f6Var);
        v5Var.setBackground(new v1(j6.v0(j6.f19906d6, f6Var)));
        return v5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
