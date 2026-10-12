package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class r5 extends org.telegram.ui.Cells.y4 {
    public final int f39591f;

    public r5(Context context, int i10) {
        super(context);
        this.f39591f = i10;
    }

    @Override
    public final int getFullHeight() {
        switch (this.f39591f) {
            case 0:
                return AndroidUtilities.dp(50.0f);
            default:
                return AndroidUtilities.dp(50.0f);
        }
    }
}
