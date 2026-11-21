package tg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import c8.l9;
public final class l1 extends GestureDetector.SimpleOnGestureListener {
    public float f58040a;
    public boolean f58041b;
    public float f58042c;
    public final n1 d;

    public l1(n1 n1Var) {
        this.d = n1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        float f10;
        n1 n1Var = this.d;
        boolean contains = n1Var.f58075e.contains(motionEvent.getX(), motionEvent.getY());
        if (n1Var.f58076f != contains) {
            n1Var.f58076f = contains;
            n1Var.invalidate();
            if (contains) {
                m1 m1Var = n1Var.L;
                if (m1Var != null) {
                    f10 = m1Var.get();
                } else {
                    f10 = n1Var.I.f57261c;
                }
                this.f58040a = f10;
                this.f58041b = false;
            }
        }
        return n1Var.f58076f;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        n1 n1Var = this.d;
        if (n1Var.f58076f) {
            if (!this.f58041b) {
                this.f58042c = motionEvent.getY() - motionEvent2.getY();
                this.f58041b = true;
            }
            float f12 = this.f58040a;
            float y10 = ((motionEvent.getY() - motionEvent2.getY()) - this.f58042c) / n1Var.f58075e.height();
            float f13 = n1Var.H;
            float f14 = n1Var.G;
            float a10 = l9.a(com.google.android.gms.internal.vision.e2.z(f13, f14, y10, f12), f14, f13);
            m1 m1Var = n1Var.L;
            if (m1Var != null) {
                m1Var.y1(a10);
            } else {
                n1Var.I.f57261c = a10;
            }
            n1Var.f58081x.e(true, a10);
            Runnable runnable = n1Var.J;
            if (runnable != null) {
                runnable.run();
            }
            n1Var.invalidate();
        }
        return n1Var.f58076f;
    }
}
