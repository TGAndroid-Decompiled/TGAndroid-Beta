package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class s5 extends org.telegram.ui.Cells.x4 {
    public final int f41370f;

    public s5(Context context, int i10) {
        super(context);
        this.f41370f = i10;
    }

    @Override
    public final int getFullHeight() {
        switch (this.f41370f) {
            case 0:
                return AndroidUtilities.dp(50.0f);
            default:
                return AndroidUtilities.dp(50.0f);
        }
    }
}
