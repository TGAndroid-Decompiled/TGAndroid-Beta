package vh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class f extends m41 {
    public static final int f59690b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ah.c cVar = (ah.c) view;
        cVar.f1059w = (TLRPC.TL_help_country) n41Var.H;
        cVar.f();
        cVar.setDivider(z10);
        cVar.c(n41Var.f37648e, false);
    }

    @Override
    public final boolean c(n41 n41Var, n41 n41Var2) {
        return n41Var.I(n41Var2);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        ah.c cVar = new ah.c(context, i6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        return n41Var.J(n41Var2);
    }
}
