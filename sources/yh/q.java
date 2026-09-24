package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
public final class q extends u51 {
    static {
        u51.setup(new u51());
    }

    public static v51 a(String str, CharSequence charSequence, int i10) {
        v51 J = v51.J(q.class);
        J.f15701b = false;
        J.f29055z = i10;
        J.f29042l = str;
        J.f29043m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        ((r) view).a(v51Var.f29042l, v51Var.f29043m, v51Var.f29055z);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r(context, 0, d6Var);
    }
}
