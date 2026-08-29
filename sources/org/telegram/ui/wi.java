package org.telegram.ui;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class wi extends FrameLayout {
    public final tn f44311a;

    public wi(tn tnVar, Activity activity) {
        super(activity);
        this.f44311a = tnVar;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.f44311a.A7(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i11), AndroidUtilities.dp(300.0f));
        if (min == 0) {
            min = AndroidUtilities.dp(300.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE));
    }
}
