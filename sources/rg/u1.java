package rg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.gms.internal.play_billing.k3;
public final class u1 extends GestureDetector.SimpleOnGestureListener {
    public float f45669a;
    public boolean f45670b;
    public float f45671c;
    public final w1 d;

    public u1(w1 w1Var) {
        this.d = w1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f7;
        w1 w1Var = this.d;
        boolean contains = w1Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (w1Var.f45696f != contains) {
            w1Var.f45696f = contains;
            w1Var.invalidate();
            if (contains) {
                v1 v1Var = w1Var.K;
                if (v1Var != null) {
                    f7 = v1Var.get();
                } else {
                    f7 = w1Var.H.f44663c;
                }
                this.f45669a = f7;
                this.f45670b = false;
            }
        }
        return w1Var.f45696f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        w1 w1Var = this.d;
        if (w1Var.f45696f) {
            if (!this.f45670b) {
                this.f45671c = motionEvent.getY() - motionEvent2.getY();
                this.f45670b = true;
            }
            float f11 = this.f45669a;
            float y3 = ((motionEvent.getY() - motionEvent2.getY()) - this.f45671c) / w1Var.e.height();
            float f12 = w1Var.G;
            float f13 = w1Var.F;
            float a2 = w7.r.a(k3.y(f12, f13, y3, f11), f13, f12);
            v1 v1Var = w1Var.K;
            if (v1Var != null) {
                v1Var.U(a2);
            } else {
                w1Var.H.f44663c = a2;
            }
            w1Var.f45700w.d(a2, true);
            Runnable runnable = w1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            w1Var.invalidate();
        }
        return w1Var.f45696f;
    }
}
