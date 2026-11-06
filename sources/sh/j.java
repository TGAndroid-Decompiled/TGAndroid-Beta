package sh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.if0;
public final class j extends v31 {
    public static final int f55229b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        if0 if0Var = (if0) view;
        if0Var.a((TLObject) w31Var.G, w31Var.f39843z, true);
        if0Var.setOnClickListener(w31Var.D);
    }

    @Override
    public final boolean c(w31 w31Var, w31 w31Var2) {
        if (w31Var.B == w31Var2.B) {
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
    public final boolean e(w31 w31Var, w31 w31Var2) {
        if (w31Var.B == w31Var2.B) {
            return true;
        }
        return false;
    }
}
