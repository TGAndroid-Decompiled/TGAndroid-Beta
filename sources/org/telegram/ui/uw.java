package org.telegram.ui;

import android.graphics.Canvas;
import android.view.MotionEvent;
public final class uw extends org.telegram.ui.Components.r9 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final int z1() {
        return org.telegram.messenger.i0.L(48.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
    }
}
