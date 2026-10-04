package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
public final class e extends f61 {
    public static final int f47149a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        xg.b bVar = (xg.b) view;
        bVar.f49831s = (TLRPC.TL_help_country) g61Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(g61Var.f26662e, false);
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        return g61Var.H(g61Var2);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        xg.b bVar = new xg.b(context, d6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        return g61Var.I(g61Var2);
    }
}
