package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class rb1 implements org.telegram.ui.Components.zn0, org.telegram.ui.Components.e20 {
    public final qc1 f42029a;

    public rb1(qc1 qc1Var) {
        this.f42029a = qc1Var;
    }

    @Override
    public void W(float f9, boolean z10) {
        qc1 qc1Var = this.f42029a;
        qc1Var.f41648h1 = f9;
        qc1Var.k1();
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
        Scroller scroller = this.f42029a.f41630c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        qc1 qc1Var = this.f42029a;
        Scroller scroller = qc1Var.f41630c;
        if (scroller != null) {
            scroller.abortAnimation();
            qc1Var.f41630c.fling((int) qc1Var.T1, 0, Math.round(-f9), Math.round(f10), 0, (int) qc1Var.S1, 0, Integer.MAX_VALUE);
            qc1Var.f41672t0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        qc1 qc1Var = this.f42029a;
        Scroller scroller = qc1Var.f41630c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        qc1Var.T1 = Utilities.clamp(qc1Var.T1 + f9, qc1Var.S1, 0.0f);
        qc1Var.V0();
        qc1Var.f41672t0.invalidate();
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
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void v() {
    }
}
