package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class yn extends org.telegram.ui.ActionBar.j5 {
    public boolean M0;
    public final zn N0;

    public yn(zn znVar, Activity activity) {
        super(activity);
        this.N0 = znVar;
        this.M0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            zn znVar = this.N0;
            znVar.G2 = dp;
            NumberTextView numberTextView = znVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
