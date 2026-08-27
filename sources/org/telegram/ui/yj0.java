package org.telegram.ui;

import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class yj0 extends org.telegram.ui.Cells.l8 {
    public ImageView M;

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int iDp = LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : (i12 - i10) - AndroidUtilities.dp(41.0f);
        int iX = org.telegram.messenger.rl.x(24.0f, i13 - i11, 2);
        this.M.layout(iDp, iX, AndroidUtilities.dp(24.0f) + iDp, AndroidUtilities.dp(24.0f) + iX);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.M.measure(i10, i11);
    }
}
