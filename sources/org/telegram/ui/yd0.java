package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;
import org.telegram.messenger.AndroidUtilities;
public final class yd0 extends ViewSwitcher {
    public final int f43601a;

    public yd0(Context context, int i10) {
        super(context);
        this.f43601a = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f43601a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                return;
        }
    }
}
