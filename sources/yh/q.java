package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
public final class q extends f61 {
    static {
        f61.setup(new f61());
    }

    public static g61 a(String str, CharSequence charSequence, int i10) {
        g61 J = g61.J(q.class);
        J.f17183b = false;
        J.f26681z = i10;
        J.f26668l = str;
        J.f26669m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ((r) view).a(g61Var.f26668l, g61Var.f26669m, g61Var.f26681z);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r(context, 0, d6Var);
    }
}
