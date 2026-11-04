package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.cf0;
public final class j extends q31 {
    public static final int f55426b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        cf0 cf0Var = (cf0) view;
        cf0Var.a((TLObject) r31Var.G, r31Var.f37640z, true);
        cf0Var.setOnClickListener(r31Var.D);
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (r31Var.B == r31Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        cf0 cf0Var = new cf0(context);
        cf0Var.setBackground(k6.N0(false));
        return cf0Var;
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.B == r31Var2.B) {
            return true;
        }
        return false;
    }
}
