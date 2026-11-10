package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float f53623a;
    public float f53624b;
    public final j f53625c;

    public g(j jVar) {
        this.f53625c = jVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        j jVar = this.f53625c;
        if (jVar.f53639f && !jVar.f53640n) {
            r1.h hVar = jVar.f53637c.f54279m;
            if ((f10 / 7.0f) + ((float) hVar.f54287i) >= jVar.getWidth() / 2.0f) {
                displayMetrics = jVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = jVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            hVar.f54287i = j.a(displayMetrics, f12);
            jVar.d.f54279m.f54287i = j.b(jVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) jVar.d.f54279m.f54287i));
            jVar.f53637c.h();
            jVar.d.h();
            jVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        j jVar = this.f53625c;
        int i7 = jVar.F;
        if (!jVar.f53640n) {
            g0.r(jVar.f53641r);
        }
        if (!jVar.f53639f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.f53623a = (float) jVar.f53637c.f54279m.f54287i;
            this.f53624b = (float) jVar.d.f54279m.f54287i;
            jVar.f53639f = true;
        }
        if (jVar.f53639f && !jVar.f53640n) {
            jVar.f53637c.f54279m.f54287i = (motionEvent2.getRawX() + this.f53623a) - motionEvent.getRawX();
            jVar.d.f54279m.f54287i = (motionEvent2.getRawY() + this.f53624b) - motionEvent.getRawY();
            jVar.f53637c.h();
            jVar.d.h();
        }
        return jVar.f53639f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j jVar = this.f53625c;
        if (!jVar.f53640n && !jVar.f53642s) {
            jVar.c(true);
            return true;
        }
        return false;
    }
}
