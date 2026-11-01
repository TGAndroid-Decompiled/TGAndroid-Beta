package vh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class w2 extends a51 {
    public static final int f52104b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        x2 x2Var = (x2) view;
        x2Var.a(b51Var.d, b51Var.f24656z, (n5) b51Var.G);
        x2Var.b(b51Var.e, false);
        boolean z11 = b51Var.f24638f;
        if (x2Var.h != z11) {
            x2Var.h = z11;
            x2Var.F.a(z11);
            x2Var.invalidate();
        }
        x2Var.setOnCheckboxClick(b51Var.D);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new x2(context, p6Var);
    }
}
