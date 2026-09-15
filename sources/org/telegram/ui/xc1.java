package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class xc1 implements org.telegram.ui.Components.eo0, org.telegram.ui.Components.i20 {
    public final vd1 f39583a;

    public xc1(vd1 vd1Var) {
        this.f39583a = vd1Var;
    }

    @Override
    public void X(float f7, boolean z10) {
        vd1 vd1Var = this.f39583a;
        vd1Var.l1 = f7;
        vd1Var.k1();
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f39583a.f38520c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        vd1 vd1Var = this.f39583a;
        Scroller scroller = vd1Var.f38520c;
        if (scroller != null) {
            scroller.abortAnimation();
            vd1Var.f38520c.fling((int) vd1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) vd1Var.W1, 0, Integer.MAX_VALUE);
            vd1Var.f38575x0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        vd1 vd1Var = this.f39583a;
        Scroller scroller = vd1Var.f38520c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        vd1Var.X1 = Utilities.clamp(vd1Var.X1 + f7, vd1Var.W1, 0.0f);
        vd1Var.V0();
        vd1Var.f38575x0.invalidate();
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
