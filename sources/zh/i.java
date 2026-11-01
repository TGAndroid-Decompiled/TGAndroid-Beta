package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class i extends a51 {
    public static final int f55806b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        long j10 = b51Var.B;
        ((j) view).a((int) j10, (int) (j10 >>> 32), b51Var.f24642k, b51Var.f24643l, b51Var.f24645n, b51Var.f24648q);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new j(context, p6Var, false);
    }
}
