package sh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s61;
public final class o extends s61 {
    public static final int f48661a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        c10 c10Var = new c10(context, null);
        c10Var.setViewType(16);
        c10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return c10Var;
    }
}
