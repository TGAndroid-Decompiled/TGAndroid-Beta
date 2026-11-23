package yg;

import android.content.Context;
import c8.na;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o6;
public final class x extends o4 {
    public final o6 f61292r;

    public x(Context context, h6 h6Var) {
        super(context, h6Var);
        int i7;
        o6 o6Var = new o6(context, true, true, true);
        this.f61292r = o6Var;
        o6Var.b(0.45f, 240L, nr.h);
        if (hd.f24408a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        o6Var.setGravity(i7);
        o6Var.setTextSize(g0.L(15.0f));
        o6Var.setTypeface(g0.o());
        t6.Y(o6Var, m6.L6, h6Var);
        addView(o6Var, na.d(-2, 24.0f, (hd.f24408a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        t6.h(m6.f29420h5, this, h6Var);
    }
}
