package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class n extends v51 {
    public static final int f42093a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        t00 t00Var = new t00(context, null);
        t00Var.setViewType(16);
        t00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return t00Var;
    }
}
