package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wm0;
public final class n extends t61 {
    public static final int f46653a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        m10 m10Var = new m10(context, null);
        m10Var.setViewType(16);
        m10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return m10Var;
    }
}
