package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class zl0 extends org.telegram.ui.Cells.z9 {
    public final int H = 1;

    public zl0(Context context, org.telegram.ui.ActionBar.r4 r4Var, int i7) {
        super(context, r4Var, i7);
    }

    public static void b(zl0 zl0Var, Canvas canvas) {
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

    public zl0(Context context, org.telegram.ui.ActionBar.r4 r4Var, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, r4Var, i7, j3, h6Var);
    }
}
