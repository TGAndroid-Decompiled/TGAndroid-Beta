package qg;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class v1 extends GestureDetector.SimpleOnGestureListener {
    public float f41995a;
    public boolean f41996b;
    public float f41997c;
    public final x1 d;

    public v1(x1 x1Var) {
        this.d = x1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f7;
        x1 x1Var = this.d;
        boolean contains = x1Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (x1Var.f42030f != contains) {
            x1Var.f42030f = contains;
            x1Var.invalidate();
            if (contains) {
                w1 w1Var = x1Var.K;
                if (w1Var != null) {
                    f7 = w1Var.get();
                } else {
                    f7 = x1Var.H.f41316c;
                }
                this.f41995a = f7;
                this.f41996b = false;
            }
        }
        return x1Var.f42030f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        x1 x1Var = this.d;
        if (x1Var.f42030f) {
            if (!this.f41996b) {
                this.f41997c = motionEvent.getY() - motionEvent2.getY();
                this.f41996b = true;
            }
            float f11 = this.f41995a;
            float y3 = ((motionEvent.getY() - motionEvent2.getY()) - this.f41997c) / x1Var.e.height();
            float f12 = x1Var.G;
            float f13 = x1Var.F;
            float a2 = w7.q.a(com.google.android.gms.internal.vision.e2.z(f12, f13, y3, f11), f13, f12);
            w1 w1Var = x1Var.K;
            if (w1Var != null) {
                w1Var.m(a2);
            } else {
                x1Var.H.f41316c = a2;
            }
            x1Var.f42034w.d(a2, true);
            Runnable runnable = x1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            x1Var.invalidate();
        }
        return x1Var.f42030f;
    }
}
