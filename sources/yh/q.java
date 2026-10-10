package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class q extends p61 {
    static {
        p61.setup(new p61());
    }

    public static q61 a(String str, CharSequence charSequence, int i10) {
        q61 J = q61.J(q.class);
        J.f17130b = false;
        J.f30076z = i10;
        J.f30063l = str;
        J.f30064m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        ((r) view).a(q61Var.f30063l, q61Var.f30064m, q61Var.f30076z);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new r(context, 0, e6Var);
    }
}
