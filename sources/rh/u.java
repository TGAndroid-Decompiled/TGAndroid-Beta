package rh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class u extends z41 {
    static {
        z41.h(new z41());
    }

    public static a51 i(String str, CharSequence charSequence, int i10) {
        a51 K = a51.K(u.class);
        K.f7681b = false;
        K.f24305z = i10;
        K.f24292l = str;
        K.f24293m = charSequence;
        return K;
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        ((v) view).a(a51Var.f24305z, a51Var.f24292l, a51Var.f24293m);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new v(0, context, p6Var);
    }
}
