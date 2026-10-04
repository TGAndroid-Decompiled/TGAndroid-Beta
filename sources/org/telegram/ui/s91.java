package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class s91 extends org.telegram.ui.Components.g91 {
    public boolean V;
    public final va1 W;

    public s91(va1 va1Var, Activity activity) {
        super(activity, null);
        this.W = va1Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            va1 va1Var = this.W;
            if (va1Var.f41659j0 != null) {
                View currentView = getCurrentView();
                me meVar = va1Var.f41659j0;
                if (currentView == meVar) {
                    boolean z02 = meVar.z0(motionEvent.getX() - va1Var.f41659j0.getX(), motionEvent.getY() - va1Var.f41659j0.getY());
                    meVar.T1 = z02;
                    if (z02 && meVar.f38551d2.f37406b.canScrollHorizontally(-1)) {
                        z10 = true;
                        this.V = z10;
                    }
                }
            }
            z10 = false;
            this.V = z10;
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
        va1 va1Var = this.W;
        va1Var.k0(va1Var.f41657h0.getCurrentPosition(), true);
        va1Var.l0(0.0f, false);
    }

    @Override
    public final void w(boolean z10) {
        va1 va1Var = this.W;
        float positionAnimated = va1Var.f41657h0.getPositionAnimated();
        va1Var.l0(positionAnimated, !z10);
        if (!z10) {
            va1Var.k0(Math.round(positionAnimated), true);
        }
    }
}
