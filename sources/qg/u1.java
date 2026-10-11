package qg;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class u1 extends GestureDetector.SimpleOnGestureListener {
    public float f46690a;
    public boolean f46691b;
    public float f46692c;
    public final w1 d;

    public u1(w1 w1Var) {
        this.d = w1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f7;
        w1 w1Var = this.d;
        boolean contains = w1Var.f46721e.contains(motionEvent.getX(), motionEvent.getY());
        if (w1Var.f46722f != contains) {
            w1Var.f46722f = contains;
            w1Var.invalidate();
            if (contains) {
                v1 v1Var = w1Var.K;
                if (v1Var != null) {
                    f7 = v1Var.get();
                } else {
                    f7 = w1Var.H.f45848c;
                }
                this.f46690a = f7;
                this.f46691b = false;
            }
        }
        return w1Var.f46722f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        w1 w1Var = this.d;
        if (w1Var.f46722f) {
            if (!this.f46691b) {
                this.f46692c = motionEvent.getY() - motionEvent2.getY();
                this.f46691b = true;
            }
            float f11 = this.f46690a;
            float y3 = ((motionEvent.getY() - motionEvent2.getY()) - this.f46692c) / w1Var.f46721e.height();
            float f12 = w1Var.G;
            float f13 = w1Var.F;
            float a2 = w7.o.a(com.google.android.gms.internal.vision.e2.y(f12, f13, y3, f11), f13, f12);
            v1 v1Var = w1Var.K;
            if (v1Var != null) {
                v1Var.q0(a2);
            } else {
                w1Var.H.f45848c = a2;
            }
            w1Var.f46726w.d(a2, true);
            Runnable runnable = w1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            w1Var.invalidate();
        }
        return w1Var.f46722f;
    }
}
