package sh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.if0;
public final class j extends w31 {
    public static final int f55228b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        if0 if0Var = (if0) view;
        if0Var.a((TLObject) x31Var.G, x31Var.f40172z, true);
        if0Var.setOnClickListener(x31Var.D);
    }

    @Override
    public final boolean c(x31 x31Var, x31 x31Var2) {
        if (x31Var.B == x31Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        if0 if0Var = new if0(context);
        if0Var.setBackground(k6.N0(false));
        return if0Var;
    }

    @Override
    public final boolean e(x31 x31Var, x31 x31Var2) {
        if (x31Var.B == x31Var2.B) {
            return true;
        }
        return false;
    }
}
