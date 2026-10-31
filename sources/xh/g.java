package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class g extends z41 {
    static {
        z41.h(new z41());
    }

    public static a51 i(int i10, String str, String str2) {
        a51 K = a51.K(g.class);
        K.f24291k = i10;
        K.f24292l = str;
        K.f24293m = str2;
        return K;
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        ((h) view).a(a51Var.f24291k, a51Var.f24292l, a51Var.f24293m);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new h(context, p6Var, false);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
