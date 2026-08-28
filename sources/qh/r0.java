package qh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class r0 extends k41 {
    public static final int f46645a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        ((s0) view).f46682c = (a) l41Var.G;
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new s0(context, b6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
