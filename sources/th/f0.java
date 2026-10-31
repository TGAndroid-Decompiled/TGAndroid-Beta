package th;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class f0 extends z41 {
    public static final int f48947b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        ((g0) view).set((i0) a51Var.G);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new g0(context);
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        if (a51Var.G == a51Var2.G) {
            return true;
        }
        return false;
    }
}
