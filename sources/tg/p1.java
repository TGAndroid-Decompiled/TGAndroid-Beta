package tg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import c8.m9;
public final class p1 extends GestureDetector.SimpleOnGestureListener {
    public float f58169a;
    public boolean f58170b;
    public float f58171c;
    public final r1 d;

    public p1(r1 r1Var) {
        this.d = r1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f10;
        r1 r1Var = this.d;
        boolean contains = r1Var.f58202e.contains(motionEvent.getX(), motionEvent.getY());
        if (r1Var.f58203f != contains) {
            r1Var.f58203f = contains;
            r1Var.invalidate();
            if (contains) {
                q1 q1Var = r1Var.L;
                if (q1Var != null) {
                    f10 = q1Var.get();
                } else {
                    f10 = r1Var.I.f57337c;
                }
                this.f58169a = f10;
                this.f58170b = false;
            }
        }
        return r1Var.f58203f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        r1 r1Var = this.d;
        if (r1Var.f58203f) {
            if (!this.f58170b) {
                this.f58171c = motionEvent.getY() - motionEvent2.getY();
                this.f58170b = true;
            }
            float f12 = this.f58169a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.f58171c) / r1Var.f58202e.height();
            float f13 = r1Var.H;
            float f14 = r1Var.G;
            float a10 = m9.a(com.google.android.gms.internal.vision.e2.z(f13, f14, y10, f12), f14, f13);
            q1 q1Var = r1Var.L;
            if (q1Var != null) {
                q1Var.h2(a10);
            } else {
                r1Var.I.f57337c = a10;
            }
            r1Var.f58208x.e(true, a10);
            Runnable runnable = r1Var.J;
            if (runnable != null) {
                runnable.run();
            }
            r1Var.invalidate();
        }
        return r1Var.f58203f;
    }
}
