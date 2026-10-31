package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class i extends z41 {
    public static final int f55788b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        long j10 = a51Var.B;
        ((j) view).a((int) j10, (int) (j10 >>> 32), a51Var.f24291k, a51Var.f24292l, a51Var.f24294n, a51Var.f24297q);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new j(context, p6Var, false);
    }
}
