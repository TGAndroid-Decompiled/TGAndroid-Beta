package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class wb1 implements org.telegram.ui.Components.lp0, org.telegram.ui.Components.t20 {
    public final vc1 f44628a;

    public wb1(vc1 vc1Var) {
        this.f44628a = vc1Var;
    }

    @Override
    public void U(float f7, boolean z10) {
        vc1 vc1Var = this.f44628a;
        vc1Var.f44283m1 = f7;
        vc1Var.l1();
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
        Scroller scroller = this.f44628a.f44253c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        vc1 vc1Var = this.f44628a;
        Scroller scroller = vc1Var.f44253c;
        if (scroller != null) {
            scroller.abortAnimation();
            vc1Var.f44253c.fling((int) vc1Var.Y1, 0, Math.round(-f7), Math.round(f10), 0, (int) vc1Var.X1, 0, Integer.MAX_VALUE);
            vc1Var.f44312y0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        vc1 vc1Var = this.f44628a;
        Scroller scroller = vc1Var.f44253c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        vc1Var.Y1 = Utilities.clamp(vc1Var.Y1 + f7, vc1Var.X1, 0.0f);
        vc1Var.W0();
        vc1Var.f44312y0.invalidate();
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
