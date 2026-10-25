package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class rl extends fi.v3 {
    public final un L0;

    public rl(un unVar, Activity activity) {
        super(activity, 3);
        this.L0 = unVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.L0.O1);
    }
}
