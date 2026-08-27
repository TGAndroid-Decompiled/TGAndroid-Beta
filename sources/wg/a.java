package wg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.k51;
import org.telegram.ui.ol0;

public abstract class a extends k51 {
    public a(Context context, int i10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, c6 c6Var) {
        super(context, i10, -1, false, callback2, callback5, null, c6Var, -1, 0);
        this.f35297v2 = true;
        setOverScrollMode(2);
    }

    public final void I1(View view) {
        int i10;
        if (view == null) {
            return;
        }
        float fDp = AndroidUtilities.dp(92.0f);
        float width = getWidth() - fDp;
        float x8 = view.getX();
        float width2 = view.getWidth() + x8;
        if (x8 < fDp) {
            i10 = (int) (x8 - fDp);
        } else {
            i10 = width2 > width ? (int) (width2 - width) : 0;
        }
        if (i10 != 0) {
            AndroidUtilities.doOnLayout(this, new ol0(this, view, i10, 16));
        }
    }
}
