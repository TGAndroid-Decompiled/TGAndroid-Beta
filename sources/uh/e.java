package uh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class e extends k61 {
    public static final int f48277a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        yg.b bVar = (yg.b) view;
        bVar.v = (TLRPC.TL_help_country) l61Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(l61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        return l61Var.H(l61Var2);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        yg.b bVar = new yg.b(context, g6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        return l61Var.I(l61Var2);
    }
}
