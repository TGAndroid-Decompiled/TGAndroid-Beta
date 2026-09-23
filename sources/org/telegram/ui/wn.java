package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class wn extends org.telegram.ui.ActionBar.i5 {
    public boolean M0;
    public final xn N0;

    public wn(xn xnVar, Activity activity) {
        super(activity);
        this.N0 = xnVar;
        this.M0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            xn xnVar = this.N0;
            xnVar.G2 = dp;
            NumberTextView numberTextView = xnVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
