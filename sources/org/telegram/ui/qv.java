package org.telegram.ui;

import android.graphics.Canvas;
import android.view.MotionEvent;
public final class qv extends org.telegram.ui.Components.x9 {
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
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
    }
}
