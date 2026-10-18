package rg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.gms.internal.play_billing.k3;
public final class u1 extends GestureDetector.SimpleOnGestureListener {
    public float f45655a;
    public boolean f45656b;
    public float f45657c;
    public final w1 d;

    public u1(w1 w1Var) {
        this.d = w1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f7;
        w1 w1Var = this.d;
        boolean contains = w1Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (w1Var.f45687f != contains) {
            w1Var.f45687f = contains;
            w1Var.invalidate();
            if (contains) {
                v1 v1Var = w1Var.K;
                if (v1Var != null) {
                    f7 = v1Var.get();
                } else {
                    f7 = w1Var.H.f44647c;
                }
                this.f45655a = f7;
                this.f45656b = false;
            }
        }
        return w1Var.f45687f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        w1 w1Var = this.d;
        if (w1Var.f45687f) {
            if (!this.f45656b) {
                this.f45657c = motionEvent.getY() - motionEvent2.getY();
                this.f45656b = true;
            }
            float f11 = this.f45655a;
            float y3 = ((motionEvent.getY() - motionEvent2.getY()) - this.f45657c) / w1Var.e.height();
            float f12 = w1Var.G;
            float f13 = w1Var.F;
            float a2 = w7.r.a(k3.y(f12, f13, y3, f11), f13, f12);
            v1 v1Var = w1Var.K;
            if (v1Var != null) {
                v1Var.U(a2);
            } else {
                w1Var.H.f44647c = a2;
            }
            w1Var.f45691w.d(a2, true);
            Runnable runnable = w1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            w1Var.invalidate();
        }
        return w1Var.f45687f;
    }
}
