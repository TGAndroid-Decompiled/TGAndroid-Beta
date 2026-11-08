package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float f53612a;
    public float f53613b;
    public final j f53614c;

    public g(j jVar) {
        this.f53614c = jVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        j jVar = this.f53614c;
        if (jVar.f53628f && !jVar.f53629n) {
            r1.h hVar = jVar.f53626c.f54268m;
            if ((f10 / 7.0f) + ((float) hVar.f54276i) >= jVar.getWidth() / 2.0f) {
                displayMetrics = jVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = jVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            hVar.f54276i = j.a(displayMetrics, f12);
            jVar.d.f54268m.f54276i = j.b(jVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) jVar.d.f54268m.f54276i));
            jVar.f53626c.h();
            jVar.d.h();
            jVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        j jVar = this.f53614c;
        int i7 = jVar.F;
        if (!jVar.f53629n) {
            g0.r(jVar.f53630r);
        }
        if (!jVar.f53628f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.f53612a = (float) jVar.f53626c.f54268m.f54276i;
            this.f53613b = (float) jVar.d.f54268m.f54276i;
            jVar.f53628f = true;
        }
        if (jVar.f53628f && !jVar.f53629n) {
            jVar.f53626c.f54268m.f54276i = (motionEvent2.getRawX() + this.f53612a) - motionEvent.getRawX();
            jVar.d.f54268m.f54276i = (motionEvent2.getRawY() + this.f53613b) - motionEvent.getRawY();
            jVar.f53626c.h();
            jVar.d.h();
        }
        return jVar.f53628f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j jVar = this.f53614c;
        if (!jVar.f53629n && !jVar.f53631s) {
            jVar.c(true);
            return true;
        }
        return false;
    }
}
