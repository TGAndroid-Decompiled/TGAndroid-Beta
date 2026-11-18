package yg;

import android.content.Context;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.n6;
public final class x extends n4 {
    public final n6 f61281r;

    public x(Context context, i6 i6Var) {
        super(context, i6Var);
        int i7;
        n6 n6Var = new n6(context, true, true, true);
        this.f61281r = n6Var;
        n6Var.b(0.45f, 240L, lr.h);
        if (gd.f24216a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        n6Var.setGravity(i7);
        n6Var.setTextSize(g0.L(15.0f));
        n6Var.setTypeface(g0.o());
        u6.Y(n6Var, org.telegram.ui.ActionBar.n6.L6, i6Var);
        addView(n6Var, ma.d(-2, 24.0f, (gd.f24216a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        u6.h(org.telegram.ui.ActionBar.n6.f29469h5, this, i6Var);
    }
}
