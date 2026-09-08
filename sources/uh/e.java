package uh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class e extends g51 {
    public static final int f47273a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        yg.b bVar = (yg.b) view;
        bVar.f50189s = (TLRPC.TL_help_country) h51Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(h51Var.f26615e, false);
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        return h51Var.H(h51Var2);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        yg.b bVar = new yg.b(context, f6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        return h51Var.I(h51Var2);
    }
}
