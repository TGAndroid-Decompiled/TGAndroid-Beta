package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
public final class e extends i51 {
    public static final int f43280a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        xg.b bVar = (xg.b) view;
        bVar.f45777s = (TLRPC.TL_help_country) j51Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(j51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        return j51Var.H(j51Var2);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        xg.b bVar = new xg.b(context, f6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        return j51Var.I(j51Var2);
    }
}
