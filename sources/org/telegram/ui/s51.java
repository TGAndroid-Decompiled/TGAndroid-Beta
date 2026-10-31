package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class s51 extends org.telegram.ui.Components.w71 {
    public boolean V;
    public final u61 W;

    public s51(u61 u61Var, Activity activity) {
        super(activity, null);
        this.W = u61Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u61 u61Var = this.W;
            if (u61Var.f42036j0 != null) {
                View currentView = getCurrentView();
                le leVar = u61Var.f42036j0;
                if (currentView == leVar) {
                    boolean G = leVar.G(motionEvent.getX() - u61Var.f42036j0.getX(), motionEvent.getY() - u61Var.f42036j0.getY());
                    leVar.Q0 = G;
                    if (G && leVar.f39192a1.f37903b.canScrollHorizontally(-1)) {
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
        u61 u61Var = this.W;
        u61Var.o0(u61Var.f42034h0.getCurrentPosition(), true);
        u61Var.p0(false, 0.0f);
    }

    @Override
    public final void w(boolean z10) {
        u61 u61Var = this.W;
        float positionAnimated = u61Var.f42034h0.getPositionAnimated();
        u61Var.p0(!z10, positionAnimated);
        if (!z10) {
            u61Var.o0(Math.round(positionAnimated), true);
        }
    }
}
