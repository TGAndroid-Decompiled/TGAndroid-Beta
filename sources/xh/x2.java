package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class x2 extends a51 {
    public static final int f54129b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        y2 y2Var = (y2) view;
        CharSequence charSequence = b51Var.f24643l;
        CharSequence charSequence2 = b51Var.f24644m;
        y2Var.setText(charSequence);
        y2Var.f54135r.setText(charSequence2);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new y2(context, p6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
