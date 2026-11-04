package qg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f53921a;
    public float f53922b;
    public final h f53923c;

    public f(h hVar) {
        this.f53923c = hVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        h hVar = this.f53923c;
        if (hVar.f53934f && !hVar.f53935n) {
            q1.h hVar2 = hVar.f53932c.f53653m;
            if ((f10 / 7.0f) + ((float) hVar2.f53661i) >= hVar.getWidth() / 2.0f) {
                displayMetrics = hVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = hVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            hVar2.f53661i = h.a(displayMetrics, f12);
            hVar.d.f53653m.f53661i = h.b(hVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) hVar.d.f53653m.f53661i));
            hVar.f53932c.h();
            hVar.d.h();
            hVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.f53923c;
        int i3 = hVar.G;
        if (!hVar.f53935n) {
            g0.r(hVar.f53936r);
        }
        if (!hVar.f53934f && (Math.abs(f10) >= i3 || Math.abs(f11) >= i3)) {
            this.f53921a = (float) hVar.f53932c.f53653m.f53661i;
            this.f53922b = (float) hVar.d.f53653m.f53661i;
            hVar.f53934f = true;
        }
        if (hVar.f53934f && !hVar.f53935n) {
            hVar.f53932c.f53653m.f53661i = (motionEvent2.getRawX() + this.f53921a) - motionEvent.getRawX();
            hVar.d.f53653m.f53661i = (motionEvent2.getRawY() + this.f53922b) - motionEvent.getRawY();
            hVar.f53932c.h();
            hVar.d.h();
        }
        return hVar.f53934f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h hVar = this.f53923c;
        if (!hVar.f53935n && !hVar.f53937s) {
            hVar.c(true);
            return true;
        }
        return false;
    }
}
