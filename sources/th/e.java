package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class e extends q61 {
    public static final int f48554a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        xg.b bVar = (xg.b) view;
        bVar.v = (TLRPC.TL_help_country) r61Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(r61Var.f30355e, false);
    }

    @Override
    public final boolean contentsEquals(r61 r61Var, r61 r61Var2) {
        return r61Var.H(r61Var2);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        xg.b bVar = new xg.b(context, d6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(r61 r61Var, r61 r61Var2) {
        return r61Var.I(r61Var2);
    }
}
