package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class rc1 implements org.telegram.ui.Components.yo0, org.telegram.ui.Components.m20 {
    public final pd1 f40069a;

    public rc1(pd1 pd1Var) {
        this.f40069a = pd1Var;
    }

    @Override
    public void Y(float f7, boolean z10) {
        pd1 pd1Var = this.f40069a;
        pd1Var.l1 = f7;
        pd1Var.k1();
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f40069a.f39494c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        pd1 pd1Var = this.f40069a;
        Scroller scroller = pd1Var.f39494c;
        if (scroller != null) {
            scroller.abortAnimation();
            pd1Var.f39494c.fling((int) pd1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) pd1Var.W1, 0, Integer.MAX_VALUE);
            pd1Var.f39550x0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        pd1 pd1Var = this.f40069a;
        Scroller scroller = pd1Var.f39494c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        pd1Var.X1 = Utilities.clamp(pd1Var.X1 + f7, pd1Var.W1, 0.0f);
        pd1Var.V0();
        pd1Var.f39550x0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public int p0() {
        return 0;
    }

    @Override
    public void B() {
    }

    @Override
    public void d1() {
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }
}
