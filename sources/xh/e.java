package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class e extends z41 {
    static {
        z41.h(new z41());
    }

    public static a51 i(int i10, int i11, CharSequence charSequence, String str) {
        a51 K = a51.K(e.class);
        K.d = i10;
        K.f24305z = i11;
        K.f24291k = 2131231105;
        K.f24292l = charSequence;
        K.f24293m = str;
        return K;
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        ((f) view).a(a51Var.f24305z, a51Var.f24291k, a51Var.f24292l, a51Var.f24293m);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new f(context, p6Var);
    }
}
