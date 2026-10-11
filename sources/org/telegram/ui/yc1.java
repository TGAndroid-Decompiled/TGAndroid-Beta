package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class yc1 implements org.telegram.ui.Components.lp0, org.telegram.ui.Components.a30 {
    public final wd1 f44320a;

    public yc1(wd1 wd1Var) {
        this.f44320a = wd1Var;
    }

    @Override
    public void X(float f7, boolean z10) {
        wd1 wd1Var = this.f44320a;
        wd1Var.l1 = f7;
        wd1Var.k1();
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public int i0() {
        return 0;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f44320a.f43332c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        wd1 wd1Var = this.f44320a;
        Scroller scroller = wd1Var.f43332c;
        if (scroller != null) {
            scroller.abortAnimation();
            wd1Var.f43332c.fling((int) wd1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) wd1Var.W1, 0, Integer.MAX_VALUE);
            wd1Var.f43388x0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        wd1 wd1Var = this.f44320a;
        Scroller scroller = wd1Var.f43332c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        wd1Var.X1 = Utilities.clamp(wd1Var.X1 + f7, wd1Var.W1, 0.0f);
        wd1Var.V0();
        wd1Var.f43388x0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void W0() {
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void z() {
    }
}
