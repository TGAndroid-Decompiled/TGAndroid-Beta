package uf;

import android.content.Context;
import android.view.View;
import oh.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class w0 extends g51 {
    public static final int f48769a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        ((x0) view).a((f6) h51Var.G);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new x0(context, g6Var);
    }
}
