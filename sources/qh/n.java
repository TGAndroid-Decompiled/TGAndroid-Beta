package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xl0;
public final class n extends v51 {
    public static final int f42078a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, d6 d6Var) {
        v00 v00Var = new v00(context, null);
        v00Var.setViewType(16);
        v00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return v00Var;
    }
}
