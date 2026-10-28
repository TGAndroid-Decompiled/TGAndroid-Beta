package vh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class e extends t61 {
    public static final int f50346a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        zg.b bVar = (zg.b) view;
        bVar.v = (TLRPC.TL_help_country) u61Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(u61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        return u61Var.I(u61Var2);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        zg.b bVar = new zg.b(context, u6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        return u61Var.J(u61Var2);
    }
}
