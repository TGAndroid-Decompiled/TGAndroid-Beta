package org.telegram.ui;

import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class xj0 extends org.telegram.ui.Cells.p8 {
    public ImageView M;

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int dp;
        super.onLayout(z10, i9, i10, i11, i12);
        int i13 = i11 - i9;
        if (LocaleController.isRTL) {
            dp = AndroidUtilities.dp(17.0f);
        } else {
            dp = i13 - AndroidUtilities.dp(41.0f);
        }
        int y10 = org.telegram.messenger.ll.y(24.0f, i12 - i10, 2);
        this.M.layout(dp, y10, AndroidUtilities.dp(24.0f) + dp, AndroidUtilities.dp(24.0f) + y10);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.M.measure(i9, i10);
    }
}
