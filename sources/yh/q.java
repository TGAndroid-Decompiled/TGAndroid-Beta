package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
public final class q extends h51 {
    static {
        h51.setup(new h51());
    }

    public static i51 a(String str, CharSequence charSequence, int i10) {
        i51 J = i51.J(q.class);
        J.f15534b = false;
        J.f24907z = i10;
        J.f24894l = str;
        J.f24895m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        ((r) view).a(i51Var.f24894l, i51Var.f24895m, i51Var.f24907z);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new r(context, 0, e6Var);
    }
}
