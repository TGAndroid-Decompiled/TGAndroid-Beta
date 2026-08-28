package yf;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class u1 extends GestureDetector.SimpleOnGestureListener {
    public float f50125a;
    public boolean f50126b;
    public float f50127c;
    public final w1 d;

    public u1(w1 w1Var) {
        this.d = w1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f10;
        w1 w1Var = this.d;
        boolean contains = w1Var.f50154e.contains(motionEvent.getX(), motionEvent.getY());
        if (w1Var.f50155f != contains) {
            w1Var.f50155f = contains;
            w1Var.invalidate();
            if (contains) {
                v1 v1Var = w1Var.G;
                if (v1Var != null) {
                    f10 = v1Var.get();
                } else {
                    f10 = w1Var.D.f49335c;
                }
                this.f50125a = f10;
                this.f50126b = false;
            }
        }
        return w1Var.f50155f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        w1 w1Var = this.d;
        if (w1Var.f50155f) {
            if (!this.f50126b) {
                this.f50127c = motionEvent.getY() - motionEvent2.getY();
                this.f50126b = true;
            }
            float f12 = this.f50125a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.f50127c) / w1Var.f50154e.height();
            float f13 = w1Var.C;
            float f14 = w1Var.B;
            float a2 = g7.n.a(e2.c.z(f13, f14, y10, f12), f14, f13);
            v1 v1Var = w1Var.G;
            if (v1Var != null) {
                v1Var.g0(a2);
            } else {
                w1Var.D.f49335c = a2;
            }
            w1Var.f50159w.d(a2, true);
            Runnable runnable = w1Var.E;
            if (runnable != null) {
                runnable.run();
            }
            w1Var.invalidate();
        }
        return w1Var.f50155f;
    }
}
