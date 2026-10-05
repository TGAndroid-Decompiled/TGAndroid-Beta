package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class e extends g61 {
    public static final int f47165a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        xg.b bVar = (xg.b) view;
        bVar.f49847s = (TLRPC.TL_help_country) h61Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(h61Var.f27087e, false);
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        return h61Var.I(h61Var2);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        xg.b bVar = new xg.b(context, d6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        return h61Var.J(h61Var2);
    }
}
