package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class xn extends org.telegram.ui.ActionBar.i5 {
    public boolean M0;
    public final yn N0;

    public xn(yn ynVar, Activity activity) {
        super(activity);
        this.N0 = ynVar;
        this.M0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            yn ynVar = this.N0;
            ynVar.E2 = dp;
            NumberTextView numberTextView = ynVar.D2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
