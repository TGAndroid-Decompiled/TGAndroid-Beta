package sh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.lf0;
public final class j extends n41 {
    public static final int f57504b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        lf0 lf0Var = (lf0) view;
        lf0Var.a((TLObject) o41Var.H, o41Var.A, true);
        lf0Var.setOnClickListener(o41Var.E);
    }

    @Override
    public final boolean c(o41 o41Var, o41 o41Var2) {
        if (o41Var.C == o41Var2.C) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        lf0 lf0Var = new lf0(context);
        lf0Var.setBackground(m6.N0(false));
        return lf0Var;
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        if (o41Var.C == o41Var2.C) {
            return true;
        }
        return false;
    }
}
