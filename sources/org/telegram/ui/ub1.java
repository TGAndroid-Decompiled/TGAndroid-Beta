package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class ub1 implements org.telegram.ui.Components.kp0, org.telegram.ui.Components.t20 {
    public final tc1 f44086a;

    public ub1(tc1 tc1Var) {
        this.f44086a = tc1Var;
    }

    @Override
    public void U(float f7, boolean z10) {
        tc1 tc1Var = this.f44086a;
        tc1Var.f43770m1 = f7;
        tc1Var.l1();
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f44086a.f43740c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        tc1 tc1Var = this.f44086a;
        Scroller scroller = tc1Var.f43740c;
        if (scroller != null) {
            scroller.abortAnimation();
            tc1Var.f43740c.fling((int) tc1Var.Y1, 0, Math.round(-f7), Math.round(f10), 0, (int) tc1Var.X1, 0, Integer.MAX_VALUE);
            tc1Var.f43799y0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        tc1 tc1Var = this.f44086a;
        Scroller scroller = tc1Var.f43740c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        tc1Var.Y1 = Utilities.clamp(tc1Var.Y1 + f7, tc1Var.X1, 0.0f);
        tc1Var.W0();
        tc1Var.f43799y0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void a1() {
    }

    @Override
    public void y() {
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }
}
