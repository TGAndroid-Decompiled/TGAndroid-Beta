package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class sb1 implements org.telegram.ui.Components.gp0, org.telegram.ui.Components.r20 {
    public final qc1 f41346a;

    public sb1(qc1 qc1Var) {
        this.f41346a = qc1Var;
    }

    @Override
    public void L(float f7, boolean z10) {
        qc1 qc1Var = this.f41346a;
        qc1Var.f40750m1 = f7;
        qc1Var.k1();
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
        Scroller scroller = this.f41346a.f40720c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        qc1 qc1Var = this.f41346a;
        Scroller scroller = qc1Var.f40720c;
        if (scroller != null) {
            scroller.abortAnimation();
            qc1Var.f40720c.fling((int) qc1Var.Y1, 0, Math.round(-f7), Math.round(f10), 0, (int) qc1Var.X1, 0, Integer.MAX_VALUE);
            qc1Var.f40779y0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        qc1 qc1Var = this.f41346a;
        Scroller scroller = qc1Var.f40720c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        qc1Var.Y1 = Utilities.clamp(qc1Var.Y1 + f7, qc1Var.X1, 0.0f);
        qc1Var.V0();
        qc1Var.f40779y0.invalidate();
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
