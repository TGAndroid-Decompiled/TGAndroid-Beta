package sh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class b3 extends g51 {
    public static final int f47404a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        c3 c3Var = (c3) view;
        CharSequence charSequence = h51Var.f27375l;
        CharSequence charSequence2 = h51Var.f27376m;
        c3Var.setText(charSequence);
        c3Var.f47413r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new c3(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
