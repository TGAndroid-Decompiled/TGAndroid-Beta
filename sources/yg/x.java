package yg;

import android.content.Context;
import c8.na;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n6;
public final class x extends o4 {
    public final n6 f61411r;

    public x(Context context, i6 i6Var) {
        super(context, i6Var);
        int i7;
        n6 n6Var = new n6(context, true, true, true);
        this.f61411r = n6Var;
        n6Var.b(0.45f, 240L, kr.h);
        if (gd.f24314a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        n6Var.setGravity(i7);
        n6Var.setTextSize(g0.L(15.0f));
        n6Var.setTypeface(g0.o());
        u6.Y(n6Var, org.telegram.ui.ActionBar.n6.L6, i6Var);
        addView(n6Var, na.d(-2, 24.0f, (gd.f24314a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        u6.h(org.telegram.ui.ActionBar.n6.f29524h5, this, i6Var);
    }
}
