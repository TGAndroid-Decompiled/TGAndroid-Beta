package sh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.if0;
public final class j extends a41 {
    public static final int f56885b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        if0 if0Var = (if0) view;
        if0Var.a((TLObject) b41Var.G, b41Var.f33197z, true);
        if0Var.setOnClickListener(b41Var.D);
    }

    @Override
    public final boolean c(b41 b41Var, b41 b41Var2) {
        if (b41Var.B == b41Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        if0 if0Var = new if0(context);
        if0Var.setBackground(j6.N0(false));
        return if0Var;
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var.B == b41Var2.B) {
            return true;
        }
        return false;
    }
}
