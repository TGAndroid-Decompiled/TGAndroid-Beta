package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class vn extends org.telegram.ui.ActionBar.h5 {
    public boolean M0;
    public final wn N0;

    public vn(wn wnVar, Activity activity) {
        super(activity);
        this.N0 = wnVar;
        this.M0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            wn wnVar = this.N0;
            wnVar.G2 = dp;
            NumberTextView numberTextView = wnVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
