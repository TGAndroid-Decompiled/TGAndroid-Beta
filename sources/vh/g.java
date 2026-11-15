package vh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class g extends a41 {
    public static final int f58997b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ah.c cVar = (ah.c) view;
        cVar.f1060w = (TLRPC.TL_help_country) b41Var.G;
        cVar.f();
        cVar.setDivider(z10);
        cVar.c(b41Var.f33178e, false);
    }

    @Override
    public final boolean c(b41 b41Var, b41 b41Var2) {
        return b41Var.I(b41Var2);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        ah.c cVar = new ah.c(context, e6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        return b41Var.J(b41Var2);
    }
}
