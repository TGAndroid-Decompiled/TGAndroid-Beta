package zf;

import android.view.GestureDetector;
import android.view.MotionEvent;

public final class u1 extends GestureDetector.SimpleOnGestureListener {

    public float f50720a;

    public boolean f50721b;

    public float f50722c;
    public final w1 d;

    public u1(w1 w1Var) {
        this.d = w1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        w1 w1Var = this.d;
        boolean zContains = w1Var.f50749e.contains(motionEvent.getX(), motionEvent.getY());
        if (w1Var.f50750f != zContains) {
            w1Var.f50750f = zContains;
            w1Var.invalidate();
            if (zContains) {
                v1 v1Var = w1Var.G;
                this.f50720a = v1Var != null ? v1Var.get() : w1Var.D.f50036c;
                this.f50721b = false;
            }
        }
        return w1Var.f50750f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        w1 w1Var = this.d;
        if (w1Var.f50750f) {
            if (!this.f50721b) {
                this.f50722c = motionEvent.getY() - motionEvent2.getY();
                this.f50721b = true;
            }
            float f12 = this.f50720a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.f50722c) / w1Var.f50749e.height();
            float f13 = w1Var.C;
            float f14 = w1Var.B;
            float fA = h7.n.a(com.google.android.recaptcha.internal.a.z(f13, f14, y10, f12), f14, f13);
            v1 v1Var = w1Var.G;
            if (v1Var != null) {
                v1Var.c0(fA);
            } else {
                w1Var.D.f50036c = fA;
            }
            w1Var.f50754w.d(fA, true);
            Runnable runnable = w1Var.E;
            if (runnable != null) {
                runnable.run();
            }
            w1Var.invalidate();
        }
        return w1Var.f50750f;
    }
}
