package qg;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class u1 extends GestureDetector.SimpleOnGestureListener {
    public float f45358a;
    public boolean f45359b;
    public float f45360c;
    public final w1 d;

    public u1(w1 w1Var) {
        this.d = w1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f7;
        w1 w1Var = this.d;
        boolean contains = w1Var.f45389e.contains(motionEvent.getX(), motionEvent.getY());
        if (w1Var.f45390f != contains) {
            w1Var.f45390f = contains;
            w1Var.invalidate();
            if (contains) {
                v1 v1Var = w1Var.K;
                if (v1Var != null) {
                    f7 = v1Var.get();
                } else {
                    f7 = w1Var.H.f44632c;
                }
                this.f45358a = f7;
                this.f45359b = false;
            }
        }
        return w1Var.f45390f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        w1 w1Var = this.d;
        if (w1Var.f45390f) {
            if (!this.f45359b) {
                this.f45360c = motionEvent.getY() - motionEvent2.getY();
                this.f45359b = true;
            }
            float f11 = this.f45358a;
            float y3 = ((motionEvent.getY() - motionEvent2.getY()) - this.f45360c) / w1Var.f45389e.height();
            float f12 = w1Var.G;
            float f13 = w1Var.F;
            float a2 = w7.q.a(com.google.android.gms.internal.vision.e2.z(f12, f13, y3, f11), f13, f12);
            v1 v1Var = w1Var.K;
            if (v1Var != null) {
                v1Var.E(a2);
            } else {
                w1Var.H.f44632c = a2;
            }
            w1Var.f45394w.d(a2, true);
            Runnable runnable = w1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            w1Var.invalidate();
        }
        return w1Var.f45390f;
    }
}
