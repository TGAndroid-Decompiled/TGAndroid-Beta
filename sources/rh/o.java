package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.z00;
public final class o extends k61 {
    public static final int f46209a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        z00 z00Var = new z00(context, null);
        z00Var.setViewType(16);
        z00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return z00Var;
    }
}
