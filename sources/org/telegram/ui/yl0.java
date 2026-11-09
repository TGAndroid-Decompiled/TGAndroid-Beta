package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class yl0 extends org.telegram.ui.Cells.z9 {
    public final int H = 1;

    public yl0(Context context, org.telegram.ui.ActionBar.q4 q4Var, int i7) {
        super(context, q4Var, i7);
    }

    public static void b(yl0 yl0Var, Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.H) {
            case 0:
                if (canvas.isHardwareAccelerated()) {
                    super.draw(canvas);
                    return;
                } else {
                    bg.u0.a(canvas, this, new r3(this, 17));
                    return;
                }
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 1:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public yl0(Context context, org.telegram.ui.ActionBar.q4 q4Var, int i7, long j3, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, q4Var, i7, j3, g6Var);
    }
}
