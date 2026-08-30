package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
public final class zb1 extends ph.o6 {
    public zb1(Activity activity) {
        super(activity, 3);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
