package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class k3 extends p61 {
    static {
        p61.setup(new p61());
    }

    public static q61 a(String str) {
        q61 J = q61.J(k3.class);
        J.f30063l = str;
        return J;
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        ((l3) view).set(q61Var.f30063l);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, e6 e6Var) {
        return new l3(context, e6Var);
    }
}
