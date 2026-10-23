package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
public final class n extends l61 {
    public static final int f46209a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        b10 b10Var = new b10(context, null);
        b10Var.setViewType(16);
        b10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return b10Var;
    }
}
