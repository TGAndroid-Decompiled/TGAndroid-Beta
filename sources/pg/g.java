package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float f53611a;
    public float f53612b;
    public final j f53613c;

    public g(j jVar) {
        this.f53613c = jVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        j jVar = this.f53613c;
        if (jVar.f53627f && !jVar.f53628n) {
            r1.h hVar = jVar.f53625c.f54267m;
            if ((f10 / 7.0f) + ((float) hVar.f54275i) >= jVar.getWidth() / 2.0f) {
                displayMetrics = jVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = jVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            hVar.f54275i = j.a(displayMetrics, f12);
            jVar.d.f54267m.f54275i = j.b(jVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) jVar.d.f54267m.f54275i));
            jVar.f53625c.h();
            jVar.d.h();
            jVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        j jVar = this.f53613c;
        int i7 = jVar.F;
        if (!jVar.f53628n) {
            g0.r(jVar.f53629r);
        }
        if (!jVar.f53627f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.f53611a = (float) jVar.f53625c.f54267m.f54275i;
            this.f53612b = (float) jVar.d.f54267m.f54275i;
            jVar.f53627f = true;
        }
        if (jVar.f53627f && !jVar.f53628n) {
            jVar.f53625c.f54267m.f54275i = (motionEvent2.getRawX() + this.f53611a) - motionEvent.getRawX();
            jVar.d.f54267m.f54275i = (motionEvent2.getRawY() + this.f53612b) - motionEvent.getRawY();
            jVar.f53625c.h();
            jVar.d.h();
        }
        return jVar.f53627f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j jVar = this.f53613c;
        if (!jVar.f53628n && !jVar.f53630s) {
            jVar.c(true);
            return true;
        }
        return false;
    }
}
