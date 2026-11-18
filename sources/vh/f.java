package vh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class f extends k41 {
    public static final int f59563b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ah.c cVar = (ah.c) view;
        cVar.f1059w = (TLRPC.TL_help_country) l41Var.H;
        cVar.f();
        cVar.setDivider(z10);
        cVar.c(l41Var.f37011e, false);
    }

    @Override
    public final boolean c(l41 l41Var, l41 l41Var2) {
        return l41Var.I(l41Var2);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        ah.c cVar = new ah.c(context, i6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        return l41Var.J(l41Var2);
    }
}
