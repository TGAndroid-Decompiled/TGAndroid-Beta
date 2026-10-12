package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class e extends t61 {
    public static final int f48695a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        xg.b bVar = (xg.b) view;
        bVar.v = (TLRPC.TL_help_country) u61Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(u61Var.f31070e, false);
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        return u61Var.H(u61Var2);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        xg.b bVar = new xg.b(context, c6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        return u61Var.I(u61Var2);
    }
}
