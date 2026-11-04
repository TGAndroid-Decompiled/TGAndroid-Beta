package ug;

import android.view.GestureDetector;
import android.view.MotionEvent;
import b8.be;
public final class j1 extends GestureDetector.SimpleOnGestureListener {
    public float f56098a;
    public boolean f56099b;
    public float f56100c;
    public final l1 d;

    public j1(l1 l1Var) {
        this.d = l1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f10;
        l1 l1Var = this.d;
        boolean contains = l1Var.f56133e.contains(motionEvent.getX(), motionEvent.getY());
        if (l1Var.f56134f != contains) {
            l1Var.f56134f = contains;
            l1Var.invalidate();
            if (contains) {
                k1 k1Var = l1Var.L;
                if (k1Var != null) {
                    f10 = k1Var.get();
                } else {
                    f10 = l1Var.I.f55188c;
                }
                this.f56098a = f10;
                this.f56099b = false;
            }
        }
        return l1Var.f56134f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        l1 l1Var = this.d;
        if (l1Var.f56134f) {
            if (!this.f56099b) {
                this.f56100c = motionEvent.getY() - motionEvent2.getY();
                this.f56099b = true;
            }
            float f12 = this.f56098a;
            float y9 = ((motionEvent.getY() - motionEvent2.getY()) - this.f56100c) / l1Var.f56133e.height();
            float f13 = l1Var.H;
            float f14 = l1Var.G;
            float a10 = be.a(com.google.android.recaptcha.internal.a.y(f13, f14, y9, f12), f14, f13);
            k1 k1Var = l1Var.L;
            if (k1Var != null) {
                k1Var.s(a10);
            } else {
                l1Var.I.f55188c = a10;
            }
            l1Var.f56139x.e(true, a10);
            Runnable runnable = l1Var.J;
            if (runnable != null) {
                runnable.run();
            }
            l1Var.invalidate();
        }
        return l1Var.f56134f;
    }
}
