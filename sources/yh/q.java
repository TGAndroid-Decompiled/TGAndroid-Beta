package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
public final class q extends x51 {
    static {
        x51.setup(new x51());
    }

    public static y51 a(String str, CharSequence charSequence, int i10) {
        y51 J = y51.J(q.class);
        J.f15720b = false;
        J.f30531z = i10;
        J.f30518l = str;
        J.f30519m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        ((r) view).a(y51Var.f30518l, y51Var.f30519m, y51Var.f30531z);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r(context, 0, f6Var);
    }
}
