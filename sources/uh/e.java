package uh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class e extends l61 {
    public static final int f46443a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        yg.b bVar = (yg.b) view;
        bVar.v = (TLRPC.TL_help_country) m61Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(m61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        return m61Var.H(m61Var2);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        yg.b bVar = new yg.b(context, c6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        return m61Var.I(m61Var2);
    }
}
