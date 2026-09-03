package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class yn extends org.telegram.ui.ActionBar.k5 {
    public boolean J0;
    public final zn K0;

    public yn(zn znVar, Activity activity) {
        super(activity);
        this.K0 = znVar;
        this.J0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.J0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            zn znVar = this.K0;
            znVar.D2 = dp;
            NumberTextView numberTextView = znVar.C2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
