package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class e extends a51 {
    static {
        a51.h(new a51());
    }

    public static b51 i(int i10, int i11, CharSequence charSequence, String str) {
        b51 K = b51.K(e.class);
        K.d = i10;
        K.f24656z = i11;
        K.f24642k = 2131231105;
        K.f24643l = charSequence;
        K.f24644m = str;
        return K;
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        ((f) view).a(b51Var.f24656z, b51Var.f24642k, b51Var.f24643l, b51Var.f24644m);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new f(context, p6Var);
    }
}
