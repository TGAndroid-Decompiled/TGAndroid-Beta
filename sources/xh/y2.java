package xh;

import android.content.Context;
import org.telegram.messenger.dd;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.p80;
import w7.b6;
public final class y2 extends p4 {
    public final p80 f54135r;

    public y2(Context context, p6 p6Var) {
        super(context, p6Var);
        int i10;
        p80 p80Var = new p80(context, p6Var);
        this.f54135r = p80Var;
        p80Var.setTextSize(1, 14.0f);
        a7.V(p80Var, t6.f21331z6, p6Var);
        a7.H(p80Var, t6.L6, p6Var);
        p80Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        if (dd.X) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(p80Var, b6.d(-2, -2.0f, i10 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
