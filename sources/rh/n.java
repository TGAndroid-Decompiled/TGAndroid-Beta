package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
public final class n extends f61 {
    public static final int f45774a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        b10 b10Var = new b10(context, null);
        b10Var.setViewType(16);
        b10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return b10Var;
    }
}
