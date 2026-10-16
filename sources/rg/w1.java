package rg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.gms.internal.play_billing.k3;
public final class w1 extends GestureDetector.SimpleOnGestureListener {
    public float f44350a;
    public boolean f44351b;
    public float f44352c;
    public final y1 d;

    public w1(y1 y1Var) {
        this.d = y1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f7;
        y1 y1Var = this.d;
        boolean contains = y1Var.e.contains(motionEvent.getX(), motionEvent.getY());
        if (y1Var.f44379f != contains) {
            y1Var.f44379f = contains;
            y1Var.invalidate();
            if (contains) {
                x1 x1Var = y1Var.K;
                if (x1Var != null) {
                    f7 = x1Var.get();
                } else {
                    f7 = y1Var.H.f43287c;
                }
                this.f44350a = f7;
                this.f44351b = false;
            }
        }
        return y1Var.f44379f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        y1 y1Var = this.d;
        if (y1Var.f44379f) {
            if (!this.f44351b) {
                this.f44352c = motionEvent.getY() - motionEvent2.getY();
                this.f44351b = true;
            }
            float f11 = this.f44350a;
            float y3 = ((motionEvent.getY() - motionEvent2.getY()) - this.f44352c) / y1Var.e.height();
            float f12 = y1Var.G;
            float f13 = y1Var.F;
            float a2 = w7.r.a(k3.y(f12, f13, y3, f11), f13, f12);
            x1 x1Var = y1Var.K;
            if (x1Var != null) {
                x1Var.G0(a2);
            } else {
                y1Var.H.f43287c = a2;
            }
            y1Var.f44383w.d(a2, true);
            Runnable runnable = y1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            y1Var.invalidate();
        }
        return y1Var.f44379f;
    }
}
