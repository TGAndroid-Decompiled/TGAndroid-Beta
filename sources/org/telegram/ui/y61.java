package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class y61 implements org.telegram.ui.Components.lm0, org.telegram.ui.Components.z00 {
    public final v71 f52146a;

    public y61(v71 v71Var) {
        this.f52146a = v71Var;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void l(boolean z9, float f10) {
        v71 v71Var = this.f52146a;
        v71Var.f50558m1 = f10;
        v71Var.p1();
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f52146a.f50528c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        v71 v71Var = this.f52146a;
        Scroller scroller = v71Var.f50528c;
        if (scroller != null) {
            scroller.abortAnimation();
            v71Var.f50528c.fling((int) v71Var.Y1, 0, Math.round(-f10), Math.round(f11), 0, (int) v71Var.X1, 0, Integer.MAX_VALUE);
            v71Var.f50586y0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        v71 v71Var = this.f52146a;
        Scroller scroller = v71Var.f50528c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        v71Var.Y1 = Utilities.i(v71Var.Y1 + f10, v71Var.X1, 0.0f);
        v71Var.a1();
        v71Var.f50586y0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public int q0() {
        return 0;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void D() {
    }

    @Override
    public void d1() {
    }
}
