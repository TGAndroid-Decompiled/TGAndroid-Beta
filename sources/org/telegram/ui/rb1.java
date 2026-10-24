package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class rb1 implements org.telegram.ui.Components.fp0, org.telegram.ui.Components.p20 {
    public final pc1 f41088a;

    public rb1(pc1 pc1Var) {
        this.f41088a = pc1Var;
    }

    @Override
    public void L(float f7, boolean z10) {
        pc1 pc1Var = this.f41088a;
        pc1Var.f40479m1 = f7;
        pc1Var.k1();
    }

    @Override
    public int Y() {
        return 0;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f41088a.f40449c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        pc1 pc1Var = this.f41088a;
        Scroller scroller = pc1Var.f40449c;
        if (scroller != null) {
            scroller.abortAnimation();
            pc1Var.f40449c.fling((int) pc1Var.Y1, 0, Math.round(-f7), Math.round(f10), 0, (int) pc1Var.X1, 0, Integer.MAX_VALUE);
            pc1Var.f40508y0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        pc1 pc1Var = this.f41088a;
        Scroller scroller = pc1Var.f40449c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        pc1Var.Y1 = Utilities.clamp(pc1Var.Y1 + f7, pc1Var.X1, 0.0f);
        pc1Var.V0();
        pc1Var.f40508y0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void N0() {
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void v() {
    }
}
