package ph;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.vl0;
public final class o extends u51 {
    public static final int f40438a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        a10 a10Var = new a10(context, null);
        a10Var.setViewType(16);
        a10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return a10Var;
    }
}
