package rg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.gms.internal.play_billing.k3;
public final class v1 extends GestureDetector.SimpleOnGestureListener {
    public float f46097a;
    public boolean f46098b;
    public float f46099c;
    public final x1 d;

    public v1(x1 x1Var) {
        this.d = x1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f7;
        x1 x1Var = this.d;
        boolean contains = x1Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (x1Var.f46128f != contains) {
            x1Var.f46128f = contains;
            x1Var.invalidate();
            if (contains) {
                w1 w1Var = x1Var.K;
                if (w1Var != null) {
                    f7 = w1Var.get();
                } else {
                    f7 = x1Var.H.f45067c;
                }
                this.f46097a = f7;
                this.f46098b = false;
            }
        }
        return x1Var.f46128f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        x1 x1Var = this.d;
        if (x1Var.f46128f) {
            if (!this.f46098b) {
                this.f46099c = motionEvent.getY() - motionEvent2.getY();
                this.f46098b = true;
            }
            float f11 = this.f46097a;
            float y3 = ((motionEvent.getY() - motionEvent2.getY()) - this.f46099c) / x1Var.e.height();
            float f12 = x1Var.G;
            float f13 = x1Var.F;
            float a2 = w7.r.a(k3.y(f12, f13, y3, f11), f13, f12);
            w1 w1Var = x1Var.K;
            if (w1Var != null) {
                w1Var.U(a2);
            } else {
                x1Var.H.f45067c = a2;
            }
            x1Var.f46132w.d(a2, true);
            Runnable runnable = x1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            x1Var.invalidate();
        }
        return x1Var.f46128f;
    }
}
