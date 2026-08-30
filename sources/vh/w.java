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
public final class w extends h51 {
    public static final int f46247a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        ((x) view).i((a) i51Var.G, (l3) i51Var.H);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        x xVar = new x(context, i10, f6Var);
        xVar.setBackground(new v1(j6.v0(j6.f19906d6, f6Var)));
        return xVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
