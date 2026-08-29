package org.telegram.ui;

import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class uj0 extends org.telegram.ui.Cells.m8 {
    public ImageView M;

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (LocaleController.isRTL) {
            dp = AndroidUtilities.dp(17.0f);
        } else {
            dp = i14 - AndroidUtilities.dp(41.0f);
        }
        int x4 = b.x(24.0f, i13 - i11, 2);
        this.M.layout(dp, x4, AndroidUtilities.dp(24.0f) + dp, AndroidUtilities.dp(24.0f) + x4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.M.measure(i10, i11);
    }
}
