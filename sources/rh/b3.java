package rh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class b3 extends h51 {
    public static final int f43537a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        c3 c3Var = (c3) view;
        CharSequence charSequence = i51Var.f25585l;
        CharSequence charSequence2 = i51Var.f25586m;
        c3Var.setText(charSequence);
        c3Var.f43545r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new c3(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
