package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class e extends g51 {
    public static final int f43208a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        xg.b bVar = (xg.b) view;
        bVar.f45704s = (TLRPC.TL_help_country) h51Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(h51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        return h51Var.H(h51Var2);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        xg.b bVar = new xg.b(context, d6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        return h51Var.I(h51Var2);
    }
}
