package yg;

import android.content.Context;
import c8.ja;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h6;
public final class x extends n4 {
    public final h6 f60714r;

    public x(Context context, e6 e6Var) {
        super(context, e6Var);
        int i7;
        h6 h6Var = new h6(context, true, true, true);
        this.f60714r = h6Var;
        h6Var.b(0.45f, 240L, er.h);
        if (hd.f24101a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        h6Var.setGravity(i7);
        h6Var.setTextSize(g0.L(15.0f));
        h6Var.setTypeface(g0.o());
        q6.Y(h6Var, j6.L6, e6Var);
        addView(h6Var, ja.d(-2, 24.0f, (hd.f24101a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        q6.h(j6.f28922h5, this, e6Var);
    }
}
