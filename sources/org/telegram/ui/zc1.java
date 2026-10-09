package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class zc1 implements org.telegram.ui.Components.jp0, org.telegram.ui.Components.z20 {
    public final xd1 f44550a;

    public zc1(xd1 xd1Var) {
        this.f44550a = xd1Var;
    }

    @Override
    public void X(float f7, boolean z10) {
        xd1 xd1Var = this.f44550a;
        xd1Var.l1 = f7;
        xd1Var.k1();
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
        Scroller scroller = this.f44550a.f43944c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        xd1 xd1Var = this.f44550a;
        Scroller scroller = xd1Var.f43944c;
        if (scroller != null) {
            scroller.abortAnimation();
            xd1Var.f43944c.fling((int) xd1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) xd1Var.W1, 0, Integer.MAX_VALUE);
            xd1Var.f44000x0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        xd1 xd1Var = this.f44550a;
        Scroller scroller = xd1Var.f43944c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        xd1Var.X1 = Utilities.clamp(xd1Var.X1 + f7, xd1Var.W1, 0.0f);
        xd1Var.V0();
        xd1Var.f44000x0.invalidate();
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
