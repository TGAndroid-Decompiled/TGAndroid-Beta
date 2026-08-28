package qh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class d0 extends k41 {
    public static final int f46334a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        e0 e0Var = (e0) view;
        a aVar = (a) l41Var.G;
        e0Var.f46834a = aVar;
        e0Var.A = (c0) l41Var.H;
        e0Var.c(aVar);
        e0Var.i();
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        e0 e0Var = new e0(context, i9, b6Var);
        e0Var.setBackground(new u1(f6.v0(f6.f23001d6, b6Var)));
        return e0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
