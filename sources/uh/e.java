package uh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class e extends f61 {
    public static final int f47833a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        yg.b bVar = (yg.b) view;
        bVar.v = (TLRPC.TL_help_country) g61Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(g61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        return g61Var.H(g61Var2);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        yg.b bVar = new yg.b(context, d6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        return g61Var.I(g61Var2);
    }
}
