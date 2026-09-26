package xg;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xl0;
public final class k extends v51 {
    public static final int f46061a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        l lVar = (l) view;
        lVar.setUser((TLRPC.User) w51Var.G);
        lVar.c(w51Var.e, false);
        lVar.setDivider(z10);
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, d6 d6Var) {
        return new l(context, true, false, d6Var, false);
    }
}
