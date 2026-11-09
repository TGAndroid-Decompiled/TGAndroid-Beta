package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float f53624a;
    public float f53625b;
    public final j f53626c;

    public g(j jVar) {
        this.f53626c = jVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        j jVar = this.f53626c;
        if (jVar.f53640f && !jVar.f53641n) {
            r1.h hVar = jVar.f53638c.f54280m;
            if ((f10 / 7.0f) + ((float) hVar.f54288i) >= jVar.getWidth() / 2.0f) {
                displayMetrics = jVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = jVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            hVar.f54288i = j.a(displayMetrics, f12);
            jVar.d.f54280m.f54288i = j.b(jVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) jVar.d.f54280m.f54288i));
            jVar.f53638c.h();
            jVar.d.h();
            jVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        j jVar = this.f53626c;
        int i7 = jVar.F;
        if (!jVar.f53641n) {
            g0.r(jVar.f53642r);
        }
        if (!jVar.f53640f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.f53624a = (float) jVar.f53638c.f54280m.f54288i;
            this.f53625b = (float) jVar.d.f54280m.f54288i;
            jVar.f53640f = true;
        }
        if (jVar.f53640f && !jVar.f53641n) {
            jVar.f53638c.f54280m.f54288i = (motionEvent2.getRawX() + this.f53624a) - motionEvent.getRawX();
            jVar.d.f54280m.f54288i = (motionEvent2.getRawY() + this.f53625b) - motionEvent.getRawY();
            jVar.f53638c.h();
            jVar.d.h();
        }
        return jVar.f53640f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j jVar = this.f53626c;
        if (!jVar.f53641n && !jVar.f53643s) {
            jVar.c(true);
            return true;
        }
        return false;
    }
}
