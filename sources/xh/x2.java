package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class x2 extends z41 {
    public static final int f54108b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        y2 y2Var = (y2) view;
        CharSequence charSequence = a51Var.f24292l;
        CharSequence charSequence2 = a51Var.f24293m;
        y2Var.setText(charSequence);
        y2Var.f54114r.setText(charSequence2);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new y2(context, p6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
