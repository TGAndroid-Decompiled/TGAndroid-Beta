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
public final class x extends h51 {
    public static final int f46348a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        ((y) view).i((a) i51Var.G, (m3) i51Var.H);
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        y yVar = new y(context, i10, f6Var);
        yVar.setBackground(new v1(j6.v0(j6.f19881d6, f6Var)));
        return yVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
