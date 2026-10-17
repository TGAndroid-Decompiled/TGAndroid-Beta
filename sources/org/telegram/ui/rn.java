package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class rn extends org.telegram.ui.ActionBar.j5 {
    public boolean M0;
    public final sn N0;

    public rn(sn snVar, Activity activity) {
        super(activity);
        this.N0 = snVar;
        this.M0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            sn snVar = this.N0;
            snVar.G2 = dp;
            NumberTextView numberTextView = snVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
