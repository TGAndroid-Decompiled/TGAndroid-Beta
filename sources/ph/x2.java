package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class x2 extends z41 {
    static {
        z41.h(new z41());
    }

    public static a51 i(String str) {
        a51 K = a51.K(x2.class);
        K.f24292l = str;
        return K;
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        ((y2) view).set(a51Var.f24292l);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new y2(context, p6Var);
    }
}
