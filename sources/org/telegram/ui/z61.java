package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class z61 implements org.telegram.ui.Components.zm0, org.telegram.ui.Components.m10 {
    public final x71 f54445a;

    public z61(x71 x71Var) {
        this.f54445a = x71Var;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void n(boolean z10, float f10) {
        x71 x71Var = this.f54445a;
        x71Var.n1 = f10;
        x71Var.p1();
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f54445a.f53645c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        x71 x71Var = this.f54445a;
        Scroller scroller = x71Var.f53645c;
        if (scroller != null) {
            scroller.abortAnimation();
            x71Var.f53645c.fling((int) x71Var.Z1, 0, Math.round(-f10), Math.round(f11), 0, (int) x71Var.Y1, 0, Integer.MAX_VALUE);
            x71Var.f53706z0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        x71 x71Var = this.f54445a;
        Scroller scroller = x71Var.f53645c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        x71Var.Z1 = Utilities.i(x71Var.Z1 + f10, x71Var.Y1, 0.0f);
        x71Var.a1();
        x71Var.f53706z0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public int r0() {
        return 0;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void C() {
    }

    @Override
    public void a1() {
    }
}
