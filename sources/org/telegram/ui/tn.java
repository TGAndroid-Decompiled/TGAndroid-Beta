package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;
public final class tn extends org.telegram.ui.ActionBar.b6 {
    public boolean M0;
    public final un N0;

    public tn(un unVar, Activity activity) {
        super(activity);
        this.N0 = unVar;
        this.M0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            un unVar = this.N0;
            unVar.S2 = dp;
            NumberTextView numberTextView = unVar.R2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
