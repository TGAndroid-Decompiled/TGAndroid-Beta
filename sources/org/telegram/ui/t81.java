package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class t81 extends org.telegram.ui.Components.u91 {
    public boolean V;
    public final w91 W;

    public t81(w91 w91Var, Activity activity) {
        super(activity, null);
        this.W = w91Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            w91 w91Var = this.W;
            if (w91Var.f45033j0 != null) {
                View currentView = getCurrentView();
                ke keVar = w91Var.f45033j0;
                if (currentView == keVar) {
                    boolean G = keVar.G(motionEvent.getX() - w91Var.f45033j0.getX(), motionEvent.getY() - w91Var.f45033j0.getY());
                    keVar.Q0 = G;
                    if (G && keVar.f40893a1.f39620b.canScrollHorizontally(-1)) {
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
        w91 w91Var = this.W;
        w91Var.l0(w91Var.f45031h0.getCurrentPosition(), true);
        w91Var.m0(0.0f, false);
    }

    @Override
    public final void w(boolean z10) {
        w91 w91Var = this.W;
        float positionAnimated = w91Var.f45031h0.getPositionAnimated();
        w91Var.m0(positionAnimated, !z10);
        if (!z10) {
            w91Var.l0(Math.round(positionAnimated), true);
        }
    }
}
