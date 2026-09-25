package xg;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
public final class k extends u51 {
    public static final int f46063a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        l lVar = (l) view;
        lVar.setUser((TLRPC.User) v51Var.G);
        lVar.c(v51Var.e, false);
        lVar.setDivider(z10);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new l(context, true, false, d6Var, false);
    }
}
