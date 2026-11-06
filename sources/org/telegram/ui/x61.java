package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class x61 implements org.telegram.ui.Components.lm0, org.telegram.ui.Components.y00 {
    public final u71 f51783a;

    public x61(u71 u71Var) {
        this.f51783a = u71Var;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void l(boolean z9, float f10) {
        u71 u71Var = this.f51783a;
        u71Var.f50303m1 = f10;
        u71Var.p1();
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f51783a.f50273c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        u71 u71Var = this.f51783a;
        Scroller scroller = u71Var.f50273c;
        if (scroller != null) {
            scroller.abortAnimation();
            u71Var.f50273c.fling((int) u71Var.Y1, 0, Math.round(-f10), Math.round(f11), 0, (int) u71Var.X1, 0, Integer.MAX_VALUE);
            u71Var.f50331y0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        u71 u71Var = this.f51783a;
        Scroller scroller = u71Var.f50273c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        u71Var.Y1 = Utilities.i(u71Var.Y1 + f10, u71Var.X1, 0.0f);
        u71Var.a1();
        u71Var.f50331y0.invalidate();
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
