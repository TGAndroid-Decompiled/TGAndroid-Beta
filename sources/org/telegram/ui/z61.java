package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class z61 implements org.telegram.ui.Components.mm0, org.telegram.ui.Components.z00 {
    public final w71 f52452a;

    public z61(w71 w71Var) {
        this.f52452a = w71Var;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void l(boolean z9, float f10) {
        w71 w71Var = this.f52452a;
        w71Var.f50940m1 = f10;
        w71Var.p1();
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f52452a.f50910c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        w71 w71Var = this.f52452a;
        Scroller scroller = w71Var.f50910c;
        if (scroller != null) {
            scroller.abortAnimation();
            w71Var.f50910c.fling((int) w71Var.Y1, 0, Math.round(-f10), Math.round(f11), 0, (int) w71Var.X1, 0, Integer.MAX_VALUE);
            w71Var.f50968y0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        w71 w71Var = this.f52452a;
        Scroller scroller = w71Var.f50910c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        w71Var.Y1 = Utilities.i(w71Var.Y1 + f10, w71Var.X1, 0.0f);
        w71Var.a1();
        w71Var.f50968y0.invalidate();
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
