package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;
public final class zm extends org.telegram.ui.ActionBar.k5 {
    public boolean M0;
    public final an N0;

    public zm(an anVar, Activity activity) {
        super(activity);
        this.N0 = anVar;
        this.M0 = true;
    }

    @Override
    public final void d(int i7) {
        super.d(i7);
        if (this.M0 && getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(4.0f) + getTextWidth();
            an anVar = this.N0;
            anVar.U2 = L;
            NumberTextView numberTextView = anVar.T2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
