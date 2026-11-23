package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t11 extends EditTextBoldCursor {
    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !org.telegram.messenger.g0.I3(this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
