package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.mm0;
public final class p extends k61 {
    public static final int f44697a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        f10 f10Var = new f10(context, null);
        f10Var.setViewType(16);
        f10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return f10Var;
    }
}
