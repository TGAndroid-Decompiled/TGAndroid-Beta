package yg;

import android.content.Context;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.xq;
public final class x extends n4 {
    public final j6 f59512r;

    public x(Context context, g6 g6Var) {
        super(context, g6Var);
        int i7;
        j6 j6Var = new j6(context, true, true, true);
        this.f59512r = j6Var;
        j6Var.b(0.45f, 240L, xq.h);
        if (id.f23157a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        j6Var.setGravity(i7);
        j6Var.setTextSize(g0.L(15.0f));
        j6Var.setTypeface(g0.o());
        s6.Y(j6Var, l6.L6, g6Var);
        addView(j6Var, ha.d(-2, 24.0f, (id.f23157a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        s6.h(l6.f27938h5, this, g6Var);
    }
}
