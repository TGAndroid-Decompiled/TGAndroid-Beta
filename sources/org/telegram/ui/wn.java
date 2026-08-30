package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class wn extends org.telegram.ui.ActionBar.k5 {
    public boolean J0;
    public final xn K0;

    public wn(xn xnVar, Activity activity) {
        super(activity);
        this.K0 = xnVar;
        this.J0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.J0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            xn xnVar = this.K0;
            xnVar.D2 = dp;
            NumberTextView numberTextView = xnVar.C2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
