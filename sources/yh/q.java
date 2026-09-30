package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class q extends x51 {
    static {
        x51.setup(new x51());
    }

    public static y51 a(String str, CharSequence charSequence, int i10) {
        y51 J = y51.J(q.class);
        J.f15732b = false;
        J.f30650z = i10;
        J.f30637l = str;
        J.f30638m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        ((r) view).a(y51Var.f30637l, y51Var.f30638m, y51Var.f30650z);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r(context, 0, d6Var);
    }
}
