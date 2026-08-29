package yg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.u51;
import org.telegram.ui.ll0;
public abstract class a extends u51 {
    public a(Context context, int i10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, c6 c6Var) {
        super(context, i10, -1, false, callback2, callback5, null, c6Var, -1, 0);
        this.f29729v2 = true;
        setOverScrollMode(2);
    }

    public final void I1(View view) {
        int i10;
        if (view != null) {
            float dp = AndroidUtilities.dp(92.0f);
            float width = getWidth() - dp;
            float x4 = view.getX();
            float width2 = view.getWidth() + x4;
            if (x4 < dp) {
                i10 = (int) (x4 - dp);
            } else if (width2 > width) {
                i10 = (int) (width2 - width);
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                AndroidUtilities.doOnLayout(this, new ll0(this, view, i10, 18));
            }
        }
    }
}
