package qg;

import android.view.GestureDetector;
import android.view.MotionEvent;
public final class x1 extends GestureDetector.SimpleOnGestureListener {
    public float f41699a;
    public boolean f41700b;
    public float f41701c;
    public final z1 d;

    public x1(z1 z1Var) {
        this.d = z1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f7;
        z1 z1Var = this.d;
        boolean contains = z1Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (z1Var.f41733f != contains) {
            z1Var.f41733f = contains;
            z1Var.invalidate();
            if (contains) {
                y1 y1Var = z1Var.K;
                if (y1Var != null) {
                    f7 = y1Var.get();
                } else {
                    f7 = z1Var.H.f40968c;
                }
                this.f41699a = f7;
                this.f41700b = false;
            }
        }
        return z1Var.f41733f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        z1 z1Var = this.d;
        if (z1Var.f41733f) {
            if (!this.f41700b) {
                this.f41701c = motionEvent.getY() - motionEvent2.getY();
                this.f41700b = true;
            }
            float f11 = this.f41699a;
            float y3 = ((motionEvent.getY() - motionEvent2.getY()) - this.f41701c) / z1Var.e.height();
            float f12 = z1Var.G;
            float f13 = z1Var.F;
            float a2 = w7.p.a(com.google.android.gms.internal.vision.e2.z(f12, f13, y3, f11), f13, f12);
            y1 y1Var = z1Var.K;
            if (y1Var != null) {
                y1Var.l(a2);
            } else {
                z1Var.H.f40968c = a2;
            }
            z1Var.f41737w.d(a2, true);
            Runnable runnable = z1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            z1Var.invalidate();
        }
        return z1Var.f41733f;
    }
}
