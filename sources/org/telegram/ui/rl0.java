package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class rl0 extends org.telegram.ui.Cells.z9 {
    public final int I = 1;

    public rl0(Context context, org.telegram.ui.ActionBar.q4 q4Var, int i3) {
        super(context, q4Var, i3);
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.I) {
            case 0:
                if (canvas.isHardwareAccelerated()) {
                    super.draw(canvas);
                    return;
                } else {
                    cg.t0.a(canvas, this, new s3(this, 16));
                    return;
                }
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.I) {
            case 1:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public rl0(Context context, org.telegram.ui.ActionBar.q4 q4Var, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, q4Var, i3, j10, e6Var);
    }
}
