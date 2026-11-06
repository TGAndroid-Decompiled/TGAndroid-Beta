package tg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import c8.j9;
public final class k1 extends GestureDetector.SimpleOnGestureListener {
    public float f55713a;
    public boolean f55714b;
    public float f55715c;
    public final m1 d;

    public k1(m1 m1Var) {
        this.d = m1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f10;
        m1 m1Var = this.d;
        boolean contains = m1Var.f55752e.contains(motionEvent.getX(), motionEvent.getY());
        if (m1Var.f55753f != contains) {
            m1Var.f55753f = contains;
            m1Var.invalidate();
            if (contains) {
                l1 l1Var = m1Var.K;
                if (l1Var != null) {
                    f10 = l1Var.get();
                } else {
                    f10 = m1Var.H.f55019c;
                }
                this.f55713a = f10;
                this.f55714b = false;
            }
        }
        return m1Var.f55753f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        m1 m1Var = this.d;
        if (m1Var.f55753f) {
            if (!this.f55714b) {
                this.f55715c = motionEvent.getY() - motionEvent2.getY();
                this.f55714b = true;
            }
            float f12 = this.f55713a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.f55715c) / m1Var.f55752e.height();
            float f13 = m1Var.G;
            float f14 = m1Var.F;
            float a10 = j9.a(com.google.android.recaptcha.internal.a.z(f13, f14, y10, f12), f14, f13);
            l1 l1Var = m1Var.K;
            if (l1Var != null) {
                l1Var.X(a10);
            } else {
                m1Var.H.f55019c = a10;
            }
            m1Var.f55758x.e(true, a10);
            Runnable runnable = m1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            m1Var.invalidate();
        }
        return m1Var.f55753f;
    }
}
