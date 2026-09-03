package qh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class o3 extends g51 {
    public static final int f45836a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        p3 p3Var = (p3) view;
        p3Var.a(h51Var.d, h51Var.f27388z, (r6) h51Var.G);
        p3Var.b(h51Var.f27369e, false);
        boolean z10 = h51Var.f27370f;
        if (p3Var.f45886f != z10) {
            p3Var.f45886f = z10;
            p3Var.B.a(z10);
            p3Var.invalidate();
        }
        p3Var.setOnCheckboxClick(h51Var.D);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new p3(context, g6Var);
    }
}
