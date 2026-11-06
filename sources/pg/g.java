package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float f53494a;
    public float f53495b;
    public final j f53496c;

    public g(j jVar) {
        this.f53496c = jVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        j jVar = this.f53496c;
        if (jVar.f53510f && !jVar.f53511n) {
            r1.h hVar = jVar.f53508c.f54150m;
            if ((f10 / 7.0f) + ((float) hVar.f54158i) >= jVar.getWidth() / 2.0f) {
                displayMetrics = jVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = jVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            hVar.f54158i = j.a(displayMetrics, f12);
            jVar.d.f54150m.f54158i = j.b(jVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) jVar.d.f54150m.f54158i));
            jVar.f53508c.h();
            jVar.d.h();
            jVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        j jVar = this.f53496c;
        int i7 = jVar.F;
        if (!jVar.f53511n) {
            g0.r(jVar.f53512r);
        }
        if (!jVar.f53510f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.f53494a = (float) jVar.f53508c.f54150m.f54158i;
            this.f53495b = (float) jVar.d.f54150m.f54158i;
            jVar.f53510f = true;
        }
        if (jVar.f53510f && !jVar.f53511n) {
            jVar.f53508c.f54150m.f54158i = (motionEvent2.getRawX() + this.f53494a) - motionEvent.getRawX();
            jVar.d.f54150m.f54158i = (motionEvent2.getRawY() + this.f53495b) - motionEvent.getRawY();
            jVar.f53508c.h();
            jVar.d.h();
        }
        return jVar.f53510f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j jVar = this.f53496c;
        if (!jVar.f53511n && !jVar.f53513s) {
            jVar.c(true);
            return true;
        }
        return false;
    }
}
