package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class u61 implements org.telegram.ui.Components.pm0, org.telegram.ui.Components.c10 {
    public final t71 f51810a;

    public u61(t71 t71Var) {
        this.f51810a = t71Var;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void l(boolean z10, float f10) {
        t71 t71Var = this.f51810a;
        t71Var.n1 = f10;
        t71Var.p1();
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f51810a.f51416c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        t71 t71Var = this.f51810a;
        Scroller scroller = t71Var.f51416c;
        if (scroller != null) {
            scroller.abortAnimation();
            t71Var.f51416c.fling((int) t71Var.Z1, 0, Math.round(-f10), Math.round(f11), 0, (int) t71Var.Y1, 0, Integer.MAX_VALUE);
            t71Var.f51477z0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        t71 t71Var = this.f51810a;
        Scroller scroller = t71Var.f51416c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        t71Var.Z1 = Utilities.i(t71Var.Z1 + f10, t71Var.Y1, 0.0f);
        t71Var.a1();
        t71Var.f51477z0.invalidate();
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
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void C() {
    }

    @Override
    public void a1() {
    }
}
