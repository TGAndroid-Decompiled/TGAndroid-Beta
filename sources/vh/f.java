package vh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class f extends v31 {
    public static final int f57419b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        ah.c cVar = (ah.c) view;
        cVar.f1062w = (TLRPC.TL_help_country) w31Var.G;
        cVar.f();
        cVar.setDivider(z9);
        cVar.c(w31Var.f39824e, false);
    }

    @Override
    public final boolean c(w31 w31Var, w31 w31Var2) {
        return w31Var.I(w31Var2);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        ah.c cVar = new ah.c(context, f6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override
    public final boolean e(w31 w31Var, w31 w31Var2) {
        return w31Var.J(w31Var2);
    }
}
