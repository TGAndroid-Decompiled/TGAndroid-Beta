package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
public final class zc1 extends di.e8 {
    public zc1(Activity activity) {
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
