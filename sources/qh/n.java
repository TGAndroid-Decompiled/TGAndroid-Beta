package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class n extends x51 {
    public static final int f42114a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        t00 t00Var = new t00(context, null);
        t00Var.setViewType(16);
        t00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return t00Var;
    }
}
