package rh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class u extends a51 {
    static {
        a51.h(new a51());
    }

    public static b51 i(String str, CharSequence charSequence, int i10) {
        b51 K = b51.K(u.class);
        K.f7682b = false;
        K.f24656z = i10;
        K.f24643l = str;
        K.f24644m = charSequence;
        return K;
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        ((v) view).a(b51Var.f24656z, b51Var.f24643l, b51Var.f24644m);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new v(0, context, p6Var);
    }
}
