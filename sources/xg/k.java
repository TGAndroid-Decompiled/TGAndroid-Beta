package xg;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class k extends t61 {
    public static final int f51392a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        l lVar = (l) view;
        lVar.setUser((TLRPC.User) u61Var.G);
        lVar.c(u61Var.f31065e, false);
        lVar.setDivider(z10);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        return new l(context, true, false, c6Var, false);
    }
}
