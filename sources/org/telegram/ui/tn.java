package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;
public final class tn extends org.telegram.ui.ActionBar.u5 {
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
            int L = org.telegram.messenger.i0.L(4.0f) + getTextWidth();
            un unVar = this.N0;
            unVar.U2 = L;
            NumberTextView numberTextView = unVar.T2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
