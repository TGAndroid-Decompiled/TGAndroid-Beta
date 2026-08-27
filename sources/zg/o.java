package zg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.zk0;

public final class o extends m41 {

    public static final int f50847a = 0;

    static {
        m41.setup(new o());
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        h00 h00Var = new h00(context, null);
        h00Var.setViewType(16);
        h00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return h00Var;
    }
}
