package tg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import c8.l9;
public final class k1 extends GestureDetector.SimpleOnGestureListener {
    public float f57984a;
    public boolean f57985b;
    public float f57986c;
    public final m1 d;

    public k1(m1 m1Var) {
        this.d = m1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f10;
        m1 m1Var = this.d;
        boolean contains = m1Var.f58019e.contains(motionEvent.getX(), motionEvent.getY());
        if (m1Var.f58020f != contains) {
            m1Var.f58020f = contains;
            m1Var.invalidate();
            if (contains) {
                l1 l1Var = m1Var.L;
                if (l1Var != null) {
                    f10 = l1Var.get();
                } else {
                    f10 = m1Var.I.f57220c;
                }
                this.f57984a = f10;
                this.f57985b = false;
            }
        }
        return m1Var.f58020f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        m1 m1Var = this.d;
        if (m1Var.f58020f) {
            if (!this.f57985b) {
                this.f57986c = motionEvent.getY() - motionEvent2.getY();
                this.f57985b = true;
            }
            float f12 = this.f57984a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.f57986c) / m1Var.f58019e.height();
            float f13 = m1Var.H;
            float f14 = m1Var.G;
            float a10 = l9.a(com.google.android.gms.internal.vision.e2.z(f13, f14, y10, f12), f14, f13);
            l1 l1Var = m1Var.L;
            if (l1Var != null) {
                l1Var.y1(a10);
            } else {
                m1Var.I.f57220c = a10;
            }
            m1Var.f58025x.e(true, a10);
            Runnable runnable = m1Var.J;
            if (runnable != null) {
                runnable.run();
            }
            m1Var.invalidate();
        }
        return m1Var.f58020f;
    }
}
