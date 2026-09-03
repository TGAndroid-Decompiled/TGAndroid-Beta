package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class xl extends ph.f3 {
    public final zn I0;

    public xl(zn znVar, Activity activity) {
        super(activity, 3);
        this.I0 = znVar;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.I0.f40828z1);
    }
}
