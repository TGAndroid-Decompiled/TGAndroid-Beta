package uh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class j extends z41 {
    public static final int f50255b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        k kVar = (k) view;
        m10 m10Var = (m10) a51Var.G;
        kVar.f50256a.setText(m10Var.f16858b);
        kVar.f50257b.setText(m10Var.f16859c);
        if (kVar.f50258c != z10) {
            kVar.invalidate();
        }
        kVar.f50258c = z10;
        kVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new k(context);
    }
}
