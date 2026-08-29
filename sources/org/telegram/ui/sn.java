package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class sn extends org.telegram.ui.ActionBar.h5 {
    public boolean I0;
    public final tn J0;

    public sn(tn tnVar, Activity activity) {
        super(activity);
        this.J0 = tnVar;
        this.I0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.I0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            tn tnVar = this.J0;
            tnVar.C2 = dp;
            NumberTextView numberTextView = tnVar.B2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
