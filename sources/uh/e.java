package uh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class e extends g61 {
    public static final int f47838a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        yg.b bVar = (yg.b) view;
        bVar.v = (TLRPC.TL_help_country) h61Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(h61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        return h61Var.H(h61Var2);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, d6 d6Var) {
        yg.b bVar = new yg.b(context, d6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        return h61Var.I(h61Var2);
    }
}
