package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class s91 extends org.telegram.ui.Components.g91 {
    public boolean U;
    public final va1 V;

    public s91(va1 va1Var, Activity activity) {
        super(activity, null);
        this.V = va1Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            va1 va1Var = this.V;
            if (va1Var.f41652j0 != null) {
                View currentView = getCurrentView();
                me meVar = va1Var.f41652j0;
                if (currentView == meVar) {
                    boolean z02 = meVar.z0(motionEvent.getX() - va1Var.f41652j0.getX(), motionEvent.getY() - va1Var.f41652j0.getY());
                    meVar.T1 = z02;
                    if (z02 && meVar.f38546d2.f37401b.canScrollHorizontally(-1)) {
                        z10 = true;
                        this.U = z10;
                    }
                }
            }
            z10 = false;
            this.U = z10;
        }
        try {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                return dispatchTouchEvent;
            }
            this.U = false;
            return dispatchTouchEvent;
        } catch (Throwable th2) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.U = false;
            }
            throw th2;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.U && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.U && B(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void u() {
        va1 va1Var = this.V;
        va1Var.k0(va1Var.f41650h0.getCurrentPosition(), true);
        va1Var.l0(0.0f, false);
    }

    @Override
    public final void w(boolean z10) {
        va1 va1Var = this.V;
        float positionAnimated = va1Var.f41650h0.getPositionAnimated();
        va1Var.l0(positionAnimated, !z10);
        if (!z10) {
            va1Var.k0(Math.round(positionAnimated), true);
        }
    }
}
