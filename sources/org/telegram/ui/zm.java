package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;
public final class zm extends org.telegram.ui.ActionBar.j5 {
    public boolean N0;
    public final an O0;

    public zm(an anVar, Activity activity) {
        super(activity);
        this.O0 = anVar;
        this.N0 = true;
    }

    @Override
    public final void d(int i7) {
        super.d(i7);
        if (this.N0 && getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(4.0f) + getTextWidth();
            an anVar = this.O0;
            anVar.V2 = L;
            NumberTextView numberTextView = anVar.U2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
