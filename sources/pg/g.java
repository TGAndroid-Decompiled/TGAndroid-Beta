package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float f53518a;
    public float f53519b;
    public final j f53520c;

    public g(j jVar) {
        this.f53520c = jVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        j jVar = this.f53520c;
        if (jVar.f53534f && !jVar.f53535n) {
            r1.h hVar = jVar.f53532c.f54174m;
            if ((f10 / 7.0f) + ((float) hVar.f54182i) >= jVar.getWidth() / 2.0f) {
                displayMetrics = jVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = jVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            hVar.f54182i = j.a(displayMetrics, f12);
            jVar.d.f54174m.f54182i = j.b(jVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) jVar.d.f54174m.f54182i));
            jVar.f53532c.h();
            jVar.d.h();
            jVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        j jVar = this.f53520c;
        int i7 = jVar.F;
        if (!jVar.f53535n) {
            g0.r(jVar.f53536r);
        }
        if (!jVar.f53534f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.f53518a = (float) jVar.f53532c.f54174m.f54182i;
            this.f53519b = (float) jVar.d.f54174m.f54182i;
            jVar.f53534f = true;
        }
        if (jVar.f53534f && !jVar.f53535n) {
            jVar.f53532c.f54174m.f54182i = (motionEvent2.getRawX() + this.f53518a) - motionEvent.getRawX();
            jVar.d.f54174m.f54182i = (motionEvent2.getRawY() + this.f53519b) - motionEvent.getRawY();
            jVar.f53532c.h();
            jVar.d.h();
        }
        return jVar.f53534f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j jVar = this.f53520c;
        if (!jVar.f53535n && !jVar.f53537s) {
            jVar.c(true);
            return true;
        }
        return false;
    }
}
