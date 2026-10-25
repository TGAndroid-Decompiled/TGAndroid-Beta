package sg;

import a8.ee;
import android.view.GestureDetector;
import android.view.MotionEvent;
public final class w1 extends GestureDetector.SimpleOnGestureListener {
    public float f48547a;
    public boolean f48548b;
    public float f48549c;
    public final y1 d;

    public w1(y1 y1Var) {
        this.d = y1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f7;
        y1 y1Var = this.d;
        boolean contains = y1Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (y1Var.f48580f != contains) {
            y1Var.f48580f = contains;
            y1Var.invalidate();
            if (contains) {
                x1 x1Var = y1Var.K;
                if (x1Var != null) {
                    f7 = x1Var.get();
                } else {
                    f7 = y1Var.H.f47524c;
                }
                this.f48547a = f7;
                this.f48548b = false;
            }
        }
        return y1Var.f48580f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        y1 y1Var = this.d;
        if (y1Var.f48580f) {
            if (!this.f48548b) {
                this.f48549c = motionEvent.getY() - motionEvent2.getY();
                this.f48548b = true;
            }
            float f11 = this.f48547a;
            float y3 = ((motionEvent.getY() - motionEvent2.getY()) - this.f48549c) / y1Var.e.height();
            float f12 = y1Var.G;
            float f13 = y1Var.F;
            float a2 = ee.a(c3.h0.z(f12, f13, y3, f11), f13, f12);
            x1 x1Var = y1Var.K;
            if (x1Var != null) {
                x1Var.V(a2);
            } else {
                y1Var.H.f47524c = a2;
            }
            y1Var.f48584w.d(a2, true);
            Runnable runnable = y1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            y1Var.invalidate();
        }
        return y1Var.f48580f;
    }
}
