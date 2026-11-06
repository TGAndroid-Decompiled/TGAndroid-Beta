package sh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.if0;
public final class j extends q31 {
    public static final int f55204b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        if0 if0Var = (if0) view;
        if0Var.a((TLObject) r31Var.G, r31Var.f37611z, true);
        if0Var.setOnClickListener(r31Var.D);
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (r31Var.B == r31Var2.B) {
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
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.B == r31Var2.B) {
            return true;
        }
        return false;
    }
}
