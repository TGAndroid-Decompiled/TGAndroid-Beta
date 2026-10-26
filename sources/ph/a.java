package ph;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.r71;
import org.telegram.ui.yx;
public abstract class a extends r71 {
    public a(Context context, int i10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, u6 u6Var) {
        super(context, i10, -1, false, callback2, callback5, null, u6Var, -1, 0);
        this.f30668y2 = true;
        setOverScrollMode(2);
    }

    public final void O1(View view) {
        int i10;
        if (view != null) {
            float dp = AndroidUtilities.dp(92.0f);
            float width = getWidth() - dp;
            float x9 = view.getX();
            float width2 = view.getWidth() + x9;
            if (x9 < dp) {
                i10 = (int) (x9 - dp);
            } else if (width2 > width) {
                i10 = (int) (width2 - width);
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                AndroidUtilities.doOnLayout(this, new yx(this, view, i10, 21));
            }
        }
    }
}
