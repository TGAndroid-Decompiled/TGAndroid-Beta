package qh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class p3 extends i51 {
    public static final int f45877a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        q3 q3Var = (q3) view;
        q3Var.a(j51Var.d, j51Var.f28027z, (s6) j51Var.G);
        q3Var.b(j51Var.f28008e, false);
        boolean z10 = j51Var.f28009f;
        if (q3Var.f45904f != z10) {
            q3Var.f45904f = z10;
            q3Var.B.a(z10);
            q3Var.invalidate();
        }
        q3Var.setOnCheckboxClick(j51Var.D);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new q3(context, g6Var);
    }
}
