package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class yc1 implements org.telegram.ui.Components.eo0, org.telegram.ui.Components.i20 {
    public final wd1 f43078a;

    public yc1(wd1 wd1Var) {
        this.f43078a = wd1Var;
    }

    @Override
    public void X(float f7, boolean z10) {
        wd1 wd1Var = this.f43078a;
        wd1Var.l1 = f7;
        wd1Var.k1();
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public int l0() {
        return 0;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f43078a.f41921c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        wd1 wd1Var = this.f43078a;
        Scroller scroller = wd1Var.f41921c;
        if (scroller != null) {
            scroller.abortAnimation();
            wd1Var.f41921c.fling((int) wd1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) wd1Var.W1, 0, Integer.MAX_VALUE);
            wd1Var.f41977x0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        wd1 wd1Var = this.f43078a;
        Scroller scroller = wd1Var.f41921c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        wd1Var.X1 = Utilities.clamp(wd1Var.X1 + f7, wd1Var.W1, 0.0f);
        wd1Var.V0();
        wd1Var.f41977x0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void B() {
    }

    @Override
    public void b1() {
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }
}
