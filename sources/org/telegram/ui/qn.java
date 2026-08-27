package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

public final class qn extends org.telegram.ui.ActionBar.h5 {
    public boolean I0;
    public final rn J0;

    public qn(rn rnVar, Activity activity) {
        super(activity);
        this.J0 = rnVar;
        this.I0 = true;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        if (this.I0 && getVisibility() == 0) {
            int iDp = AndroidUtilities.dp(4.0f) + getTextWidth();
            rn rnVar = this.J0;
            rnVar.C2 = iDp;
            NumberTextView numberTextView = rnVar.B2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(iDp);
            }
        }
    }
}
