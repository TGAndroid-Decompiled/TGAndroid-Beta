package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s11 extends EditTextBoldCursor {
    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !org.telegram.messenger.g0.K3(this)) {
            clearFocus();
            requestFocus();
        }
        return super.onTouchEvent(motionEvent);
    }
}
