package rg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.gms.internal.cast.a6;
public final class u1 extends GestureDetector.SimpleOnGestureListener {
    public float f45683a;
    public boolean f45684b;
    public float f45685c;
    public final w1 d;

    public u1(w1 w1Var) {
        this.d = w1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f7;
        w1 w1Var = this.d;
        boolean contains = w1Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (w1Var.f45710f != contains) {
            w1Var.f45710f = contains;
            w1Var.invalidate();
            if (contains) {
                v1 v1Var = w1Var.K;
                if (v1Var != null) {
                    f7 = v1Var.get();
                } else {
                    f7 = w1Var.H.f44669c;
                }
                this.f45683a = f7;
                this.f45684b = false;
            }
        }
        return w1Var.f45710f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        w1 w1Var = this.d;
        if (w1Var.f45710f) {
            if (!this.f45684b) {
                this.f45685c = motionEvent.getY() - motionEvent2.getY();
                this.f45684b = true;
            }
            float f11 = this.f45683a;
            float y3 = ((motionEvent.getY() - motionEvent2.getY()) - this.f45685c) / w1Var.e.height();
            float f12 = w1Var.G;
            float f13 = w1Var.F;
            float a2 = w7.r.a(a6.x(f12, f13, y3, f11), f13, f12);
            v1 v1Var = w1Var.K;
            if (v1Var != null) {
                v1Var.U(a2);
            } else {
                w1Var.H.f44669c = a2;
            }
            w1Var.f45714w.d(a2, true);
            Runnable runnable = w1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            w1Var.invalidate();
        }
        return w1Var.f45710f;
    }
}
