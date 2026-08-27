package org.telegram.ui;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class vi extends FrameLayout {

    public final rn f43466a;

    public vi(rn rnVar, Activity activity) {
        super(activity);
        this.f43466a = rnVar;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.f43466a.A7(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMin = Math.min(View.MeasureSpec.getSize(i11), AndroidUtilities.dp(300.0f));
        if (iMin == 0) {
            iMin = AndroidUtilities.dp(300.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE));
    }
}
