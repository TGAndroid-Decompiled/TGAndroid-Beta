package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class g extends a51 {
    static {
        a51.h(new a51());
    }

    public static b51 i(int i10, String str, String str2) {
        b51 K = b51.K(g.class);
        K.f24642k = i10;
        K.f24643l = str;
        K.f24644m = str2;
        return K;
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        ((h) view).a(b51Var.f24642k, b51Var.f24643l, b51Var.f24644m);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new h(context, p6Var, false);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
