package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class r extends u51 {
    static {
        u51.setup(new u51());
    }

    public static v51 a(String str, CharSequence charSequence, int i10) {
        v51 J = v51.J(r.class);
        J.f14047b = false;
        J.f27842z = i10;
        J.f27829l = str;
        J.f27830m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        ((s) view).a(v51Var.f27829l, v51Var.f27830m, v51Var.f27842z);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new s(context, 0, f6Var);
    }
}
