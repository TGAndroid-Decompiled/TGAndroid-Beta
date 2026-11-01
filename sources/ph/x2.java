package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class x2 extends a51 {
    static {
        a51.h(new a51());
    }

    public static b51 i(String str) {
        b51 K = b51.K(x2.class);
        K.f24643l = str;
        return K;
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        ((y2) view).set(b51Var.f24643l);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new y2(context, p6Var);
    }
}
