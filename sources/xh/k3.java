package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class k3 extends o61 {
    static {
        o61.setup(new o61());
    }

    public static p61 a(String str) {
        p61 J = p61.J(k3.class);
        J.f29734l = str;
        return J;
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        ((l3) view).set(p61Var.f29734l);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new l3(context, e6Var);
    }
}
