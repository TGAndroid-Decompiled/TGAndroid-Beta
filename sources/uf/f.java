package uf;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.k;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f48209a;
    public float f48210b;
    public final h f48211c;

    public f(h hVar) {
        this.f48211c = hVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        h hVar = this.f48211c;
        if (hVar.f48222f && !hVar.f48223n) {
            k kVar = hVar.f48220c.f18800u;
            if ((f10 / 7.0f) + ((float) kVar.f18807i) >= hVar.getWidth() / 2.0f) {
                displayMetrics = hVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = hVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            kVar.f18807i = h.a(displayMetrics, f12);
            hVar.d.f18800u.f18807i = h.b(hVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) hVar.d.f18800u.f18807i));
            hVar.f48220c.f();
            hVar.d.f();
            hVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.f48211c;
        int i9 = hVar.B;
        if (!hVar.f48223n) {
            AndroidUtilities.cancelRunOnUIThread(hVar.f48224r);
        }
        if (!hVar.f48222f && (Math.abs(f10) >= i9 || Math.abs(f11) >= i9)) {
            this.f48209a = (float) hVar.f48220c.f18800u.f18807i;
            this.f48210b = (float) hVar.d.f18800u.f18807i;
            hVar.f48222f = true;
        }
        if (hVar.f48222f && !hVar.f48223n) {
            hVar.f48220c.f18800u.f18807i = (motionEvent2.getRawX() + this.f48209a) - motionEvent.getRawX();
            hVar.d.f18800u.f18807i = (motionEvent2.getRawY() + this.f48210b) - motionEvent.getRawY();
            hVar.f48220c.f();
            hVar.d.f();
        }
        return hVar.f48222f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h hVar = this.f48211c;
        if (!hVar.f48223n && !hVar.f48225s) {
            hVar.c(true);
            return true;
        }
        return false;
    }
}
