package rg;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class w1 extends GestureDetector.SimpleOnGestureListener {
    public float f45566a;
    public boolean f45567b;
    public float f45568c;
    public final y1 d;

    public w1(y1 y1Var) {
        this.d = y1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f7;
        y1 y1Var = this.d;
        boolean contains = y1Var.f45594e.contains(motionEvent.getX(), motionEvent.getY());
        if (y1Var.f45595f != contains) {
            y1Var.f45595f = contains;
            y1Var.invalidate();
            if (contains) {
                x1 x1Var = y1Var.K;
                if (x1Var != null) {
                    f7 = x1Var.get();
                } else {
                    f7 = y1Var.H.f44571c;
                }
                this.f45566a = f7;
                this.f45567b = false;
            }
        }
        return y1Var.f45595f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        y1 y1Var = this.d;
        if (y1Var.f45595f) {
            if (!this.f45567b) {
                this.f45568c = motionEvent.getY() - motionEvent2.getY();
                this.f45567b = true;
            }
            float f11 = this.f45566a;
            float y3 = ((motionEvent.getY() - motionEvent2.getY()) - this.f45568c) / y1Var.f45594e.height();
            float f12 = y1Var.G;
            float f13 = y1Var.F;
            float a2 = w7.p.a(com.google.android.gms.internal.vision.e2.z(f12, f13, y3, f11), f13, f12);
            x1 x1Var = y1Var.K;
            if (x1Var != null) {
                x1Var.H(a2);
            } else {
                y1Var.H.f44571c = a2;
            }
            y1Var.f45599w.d(a2, true);
            Runnable runnable = y1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            y1Var.invalidate();
        }
        return y1Var.f45595f;
    }
}
