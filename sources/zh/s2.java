package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class s2 extends x31 {
    static {
        x31.h(new x31());
    }

    public static y31 i(String str) {
        y31 K = y31.K(s2.class);
        K.f40568l = str;
        return K;
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((t2) view).set(y31Var.f40568l);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new t2(context, g6Var);
    }
}
