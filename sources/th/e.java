package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
public final class e extends h51 {
    public static final int f43257a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        xg.b bVar = (xg.b) view;
        bVar.f45754s = (TLRPC.TL_help_country) i51Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(i51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return i51Var.H(i51Var2);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        xg.b bVar = new xg.b(context, e6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.I(i51Var2);
    }
}
