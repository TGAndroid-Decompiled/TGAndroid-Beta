package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.rm0;
public final class n extends p61 {
    public static final int f46752a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, e6 e6Var) {
        k10 k10Var = new k10(context, null);
        k10Var.setViewType(16);
        k10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return k10Var;
    }
}
