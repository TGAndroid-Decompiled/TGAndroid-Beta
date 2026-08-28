package org.telegram.ui;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ti extends FrameLayout {
    public final qn f43009a;

    public ti(qn qnVar, Activity activity) {
        super(activity);
        this.f43009a = qnVar;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.f43009a.A7(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(300.0f));
        if (min == 0) {
            min = AndroidUtilities.dp(300.0f);
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE));
    }
}
