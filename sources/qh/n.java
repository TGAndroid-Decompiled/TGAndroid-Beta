package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.sm0;
public final class n extends q61 {
    public static final int f46783a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        k10 k10Var = new k10(context, null);
        k10Var.setViewType(16);
        k10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return k10Var;
    }
}
