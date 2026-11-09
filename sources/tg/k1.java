package tg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import c8.j9;
public final class k1 extends GestureDetector.SimpleOnGestureListener {
    public float f55817a;
    public boolean f55818b;
    public float f55819c;
    public final m1 d;

    public k1(m1 m1Var) {
        this.d = m1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f10;
        m1 m1Var = this.d;
        boolean contains = m1Var.f55856e.contains(motionEvent.getX(), motionEvent.getY());
        if (m1Var.f55857f != contains) {
            m1Var.f55857f = contains;
            m1Var.invalidate();
            if (contains) {
                l1 l1Var = m1Var.K;
                if (l1Var != null) {
                    f10 = l1Var.get();
                } else {
                    f10 = m1Var.H.f55096c;
                }
                this.f55817a = f10;
                this.f55818b = false;
            }
        }
        return m1Var.f55857f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        m1 m1Var = this.d;
        if (m1Var.f55857f) {
            if (!this.f55818b) {
                this.f55819c = motionEvent.getY() - motionEvent2.getY();
                this.f55818b = true;
            }
            float f12 = this.f55817a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.f55819c) / m1Var.f55856e.height();
            float f13 = m1Var.G;
            float f14 = m1Var.F;
            float a10 = j9.a(com.google.android.recaptcha.internal.a.z(f13, f14, y10, f12), f14, f13);
            l1 l1Var = m1Var.K;
            if (l1Var != null) {
                l1Var.X(a10);
            } else {
                m1Var.H.f55096c = a10;
            }
            m1Var.f55862x.e(true, a10);
            Runnable runnable = m1Var.I;
            if (runnable != null) {
                runnable.run();
            }
            m1Var.invalidate();
        }
        return m1Var.f55857f;
    }
}
