package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class wa0 implements View.OnLayoutChangeListener {
    public boolean f42429a;

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z4;
        if (i13 - i11 > i12 - i10) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 != this.f42429a) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jc(this, 26));
            this.f42429a = z4;
        }
    }
}
