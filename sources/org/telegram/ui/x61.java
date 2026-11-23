package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class x61 implements org.telegram.ui.Components.zm0, org.telegram.ui.Components.k10 {
    public final v71 f53874a;

    public x61(v71 v71Var) {
        this.f53874a = v71Var;
    }

    @Override
    public int a0() {
        return 0;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void j(boolean z10, float f10) {
        v71 v71Var = this.f53874a;
        v71Var.n1 = f10;
        v71Var.p1();
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f53874a.f52853c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        v71 v71Var = this.f53874a;
        Scroller scroller = v71Var.f52853c;
        if (scroller != null) {
            scroller.abortAnimation();
            v71Var.f52853c.fling((int) v71Var.Z1, 0, Math.round(-f10), Math.round(f11), 0, (int) v71Var.Y1, 0, Integer.MAX_VALUE);
            v71Var.f52914z0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        v71 v71Var = this.f53874a;
        Scroller scroller = v71Var.f52853c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        v71Var.Z1 = Utilities.i(v71Var.Z1 + f10, v71Var.Y1, 0.0f);
        v71Var.a1();
        v71Var.f52914z0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void Q0() {
    }

    @Override
    public void w() {
    }
}
