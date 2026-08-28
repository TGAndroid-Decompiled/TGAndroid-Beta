package vg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.jh0;
public abstract class a extends i51 {
    public a(Context context, int i9, Utilities.Callback2 callback2, Utilities.Callback5 callback5, b6 b6Var) {
        super(context, i9, -1, false, callback2, callback5, null, b6Var, -1, 0);
        this.f34280v2 = true;
        setOverScrollMode(2);
    }

    public final void I1(View view) {
        int i9;
        if (view != null) {
            float dp = AndroidUtilities.dp(92.0f);
            float width = getWidth() - dp;
            float x10 = view.getX();
            float width2 = view.getWidth() + x10;
            if (x10 < dp) {
                i9 = (int) (x10 - dp);
            } else if (width2 > width) {
                i9 = (int) (width2 - width);
            } else {
                i9 = 0;
            }
            if (i9 != 0) {
                AndroidUtilities.doOnLayout(this, new jh0(this, view, i9, 16));
            }
        }
    }
}
