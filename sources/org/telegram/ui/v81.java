package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class v81 extends org.telegram.ui.Components.v91 {
    public boolean V;
    public final y91 W;

    public v81(y91 y91Var, Activity activity) {
        super(activity, null);
        this.W = y91Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            y91 y91Var = this.W;
            if (y91Var.f45921j0 != null) {
                View currentView = getCurrentView();
                ke keVar = y91Var.f45921j0;
                if (currentView == keVar) {
                    boolean G = keVar.G(motionEvent.getX() - y91Var.f45921j0.getX(), motionEvent.getY() - y91Var.f45921j0.getY());
                    keVar.Q0 = G;
                    if (G && keVar.f40755a1.f39597b.canScrollHorizontally(-1)) {
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
        y91 y91Var = this.W;
        y91Var.l0(y91Var.f45919h0.getCurrentPosition(), true);
        y91Var.m0(0.0f, false);
    }

    @Override
    public final void w(boolean z10) {
        y91 y91Var = this.W;
        float positionAnimated = y91Var.f45919h0.getPositionAnimated();
        y91Var.m0(positionAnimated, !z10);
        if (!z10) {
            y91Var.l0(Math.round(positionAnimated), true);
        }
    }
}
