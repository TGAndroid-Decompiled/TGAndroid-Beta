package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class x31 extends org.telegram.ui.Components.w61 {
    public boolean W;
    public final z41 f53088a0;

    public x31(z41 z41Var, Activity activity) {
        super(activity, null);
        this.f53088a0 = z41Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z41 z41Var = this.f53088a0;
            if (z41Var.f53822k0 != null) {
                View currentView = getCurrentView();
                xd xdVar = z41Var.f53822k0;
                if (currentView == xdVar) {
                    boolean G = xdVar.G(motionEvent.getX() - z41Var.f53822k0.getX(), motionEvent.getY() - z41Var.f53822k0.getY());
                    xdVar.R0 = G;
                    if (G && xdVar.f53178b1.f51556b.canScrollHorizontally(-1)) {
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
        if (!this.W && z(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void r() {
        z41 z41Var = this.f53088a0;
        z41Var.p0(z41Var.f53820i0.getCurrentPosition(), true);
        z41Var.q0(false, 0.0f);
    }

    @Override
    public final void t(boolean z10) {
        z41 z41Var = this.f53088a0;
        float positionAnimated = z41Var.f53820i0.getPositionAnimated();
        z41Var.q0(!z10, positionAnimated);
        if (!z10) {
            z41Var.p0(Math.round(positionAnimated), true);
        }
    }
}
