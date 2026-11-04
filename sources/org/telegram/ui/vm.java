package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;
public final class vm extends org.telegram.ui.ActionBar.k5 {
    public boolean N0;
    public final wm O0;

    public vm(wm wmVar, Activity activity) {
        super(activity);
        this.O0 = wmVar;
        this.N0 = true;
    }

    @Override
    public final void d(int i3) {
        super.d(i3);
        if (this.N0 && getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(4.0f) + getTextWidth();
            wm wmVar = this.O0;
            wmVar.V2 = L;
            NumberTextView numberTextView = wmVar.U2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
