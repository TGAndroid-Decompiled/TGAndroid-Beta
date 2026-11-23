package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class z31 extends org.telegram.ui.Components.k71 {
    public boolean W;
    public final b51 f54517a0;

    public z31(b51 b51Var, Activity activity) {
        super(activity, null);
        this.f54517a0 = b51Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            b51 b51Var = this.f54517a0;
            if (b51Var.f45939k0 != null) {
                View currentView = getCurrentView();
                xd xdVar = b51Var.f45939k0;
                if (currentView == xdVar) {
                    boolean G = xdVar.G(motionEvent.getX() - b51Var.f45939k0.getX(), motionEvent.getY() - b51Var.f45939k0.getY());
                    xdVar.R0 = G;
                    if (G && xdVar.f53921b1.f52363b.canScrollHorizontally(-1)) {
                        z10 = true;
                        this.W = z10;
                    }
                }
            }
            z10 = false;
            this.W = z10;
        }
        try {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                return dispatchTouchEvent;
            }
            this.W = false;
            return dispatchTouchEvent;
        } catch (Throwable th2) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.W = false;
            }
            throw th2;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.W && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.W && y(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void r() {
        b51 b51Var = this.f54517a0;
        b51Var.p0(b51Var.f45937i0.getCurrentPosition(), true);
        b51Var.q0(false, 0.0f);
    }

    @Override
    public final void t(boolean z10) {
        b51 b51Var = this.f54517a0;
        float positionAnimated = b51Var.f45937i0.getPositionAnimated();
        b51Var.q0(!z10, positionAnimated);
        if (!z10) {
            b51Var.p0(Math.round(positionAnimated), true);
        }
    }
}
