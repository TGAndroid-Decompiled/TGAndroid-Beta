package sh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.t61;
public final class n extends t61 {
    public static final int f48695a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        c10 c10Var = new c10(context, null);
        c10Var.setViewType(16);
        c10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return c10Var;
    }
}
