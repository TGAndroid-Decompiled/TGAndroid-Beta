package sh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class e extends u51 {
    public static final int f42042a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        wg.b bVar = (wg.b) view;
        bVar.f43983s = (TLRPC.TL_help_country) v51Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(v51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        return v51Var.H(v51Var2);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        wg.b bVar = new wg.b(context, f6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        return v51Var.I(v51Var2);
    }
}
