package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class e extends p61 {
    public static final int f48508a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        xg.b bVar = (xg.b) view;
        bVar.v = (TLRPC.TL_help_country) q61Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(q61Var.f30057e, false);
    }

    @Override
    public final boolean contentsEquals(q61 q61Var, q61 q61Var2) {
        return q61Var.H(q61Var2);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, e6 e6Var) {
        xg.b bVar = new xg.b(context, e6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        return q61Var.I(q61Var2);
    }
}
