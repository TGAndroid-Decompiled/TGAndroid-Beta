package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.zl0;
public final class o extends f61 {
    public static final int f45491a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        w00 w00Var = new w00(context, null);
        w00Var.setViewType(16);
        w00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return w00Var;
    }
}
