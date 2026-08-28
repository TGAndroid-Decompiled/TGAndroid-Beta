package yg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.wk0;
public final class n extends k41 {
    public static final int f50249a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        e00 e00Var = new e00(context, null);
        e00Var.setViewType(16);
        e00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return e00Var;
    }
}
