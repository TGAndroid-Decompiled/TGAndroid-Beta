package zg;

import android.content.Context;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.xq;
public final class x extends n4 {
    public final h6 f60543r;

    public x(Context context, e6 e6Var) {
        super(context, e6Var);
        int i3;
        h6 h6Var = new h6(context, true, true, true);
        this.f60543r = h6Var;
        h6Var.b(0.45f, 240L, xq.h);
        if (bd.f21784a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        h6Var.setGravity(i3);
        h6Var.setTextSize(g0.L(15.0f));
        h6Var.setTypeface(g0.o());
        r6.Z(h6Var, k6.L6, e6Var);
        addView(h6Var, mf.d(-2, 24.0f, (bd.f21784a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        r6.i(k6.f27954h5, this, e6Var);
    }
}
