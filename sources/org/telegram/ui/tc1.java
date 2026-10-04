package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class tc1 implements org.telegram.ui.Components.xo0, org.telegram.ui.Components.m20 {
    public final rd1 f40787a;

    public tc1(rd1 rd1Var) {
        this.f40787a = rd1Var;
    }

    @Override
    public void Y(float f7, boolean z10) {
        rd1 rd1Var = this.f40787a;
        rd1Var.l1 = f7;
        rd1Var.k1();
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f40787a.f40038c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        rd1 rd1Var = this.f40787a;
        Scroller scroller = rd1Var.f40038c;
        if (scroller != null) {
            scroller.abortAnimation();
            rd1Var.f40038c.fling((int) rd1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) rd1Var.W1, 0, Integer.MAX_VALUE);
            rd1Var.f40094x0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        rd1 rd1Var = this.f40787a;
        Scroller scroller = rd1Var.f40038c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        rd1Var.X1 = Utilities.clamp(rd1Var.X1 + f7, rd1Var.W1, 0.0f);
        rd1Var.V0();
        rd1Var.f40094x0.invalidate();
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
