package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class z31 extends org.telegram.ui.Components.v61 {
    public boolean V;
    public final c51 W;

    public z31(c51 c51Var, Activity activity) {
        super(activity, null);
        this.W = c51Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c51 c51Var = this.W;
            if (c51Var.f44677j0 != null) {
                View currentView = getCurrentView();
                zd zdVar = c51Var.f44677j0;
                if (currentView == zdVar) {
                    boolean G = zdVar.G(motionEvent.getX() - c51Var.f44677j0.getX(), motionEvent.getY() - c51Var.f44677j0.getY());
                    zdVar.Q0 = G;
                    if (G && zdVar.f52529a1.f50700b.canScrollHorizontally(-1)) {
                        z9 = true;
                        this.V = z9;
                    }
                }
            }
            z9 = false;
            this.V = z9;
        }
        try {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                return dispatchTouchEvent;
            }
            this.V = false;
            return dispatchTouchEvent;
        } catch (Throwable th2) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.V = false;
            }
            throw th2;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.V && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.V && B(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void u() {
        c51 c51Var = this.W;
        c51Var.p0(c51Var.f44675h0.getCurrentPosition(), true);
        c51Var.q0(false, 0.0f);
    }

    @Override
    public final void w(boolean z9) {
        c51 c51Var = this.W;
        float positionAnimated = c51Var.f44675h0.getPositionAnimated();
        c51Var.q0(!z9, positionAnimated);
        if (!z9) {
            c51Var.p0(Math.round(positionAnimated), true);
        }
    }
}
