package zf;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.k;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f47486a;
    public float f47487b;
    public final h f47488c;

    public f(h hVar) {
        this.f47488c = hVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        h hVar = this.f47488c;
        if (hVar.f47497f && !hVar.f47498n) {
            k kVar = hVar.f47496c.f16178u;
            if ((f10 / 7.0f) + ((float) kVar.f16184i) >= hVar.getWidth() / 2.0f) {
                displayMetrics = hVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = hVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            kVar.f16184i = h.a(displayMetrics, f12);
            hVar.d.f16178u.f16184i = h.b(hVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) hVar.d.f16178u.f16184i));
            hVar.f47496c.f();
            hVar.d.f();
            hVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.f47488c;
        int i10 = hVar.C;
        if (!hVar.f47498n) {
            AndroidUtilities.cancelRunOnUIThread(hVar.f47499r);
        }
        if (!hVar.f47497f && (Math.abs(f10) >= i10 || Math.abs(f11) >= i10)) {
            this.f47486a = (float) hVar.f47496c.f16178u.f16184i;
            this.f47487b = (float) hVar.d.f16178u.f16184i;
            hVar.f47497f = true;
        }
        if (hVar.f47497f && !hVar.f47498n) {
            hVar.f47496c.f16178u.f16184i = (motionEvent2.getRawX() + this.f47486a) - motionEvent.getRawX();
            hVar.d.f16178u.f16184i = (motionEvent2.getRawY() + this.f47487b) - motionEvent.getRawY();
            hVar.f47496c.f();
            hVar.d.f();
        }
        return hVar.f47497f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h hVar = this.f47488c;
        if (!hVar.f47498n && !hVar.f47500s) {
            hVar.c(true);
            return true;
        }
        return false;
    }
}
