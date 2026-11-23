package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float f55617a;
    public float f55618b;
    public final i f55619c;

    public g(i iVar) {
        this.f55619c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        i iVar = this.f55619c;
        if (iVar.f55630f && !iVar.f55631n) {
            r1.h hVar = iVar.f55628c.f56333m;
            if ((f10 / 7.0f) + ((float) hVar.f56341i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            hVar.f56341i = i.a(displayMetrics, f12);
            iVar.d.f56333m.f56341i = i.b(iVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) iVar.d.f56333m.f56341i));
            iVar.f55628c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.f55619c;
        int i7 = iVar.G;
        if (!iVar.f55631n) {
            g0.r(iVar.f55632r);
        }
        if (!iVar.f55630f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.f55617a = (float) iVar.f55628c.f56333m.f56341i;
            this.f55618b = (float) iVar.d.f56333m.f56341i;
            iVar.f55630f = true;
        }
        if (iVar.f55630f && !iVar.f55631n) {
            iVar.f55628c.f56333m.f56341i = (motionEvent2.getRawX() + this.f55617a) - motionEvent.getRawX();
            iVar.d.f56333m.f56341i = (motionEvent2.getRawY() + this.f55618b) - motionEvent.getRawY();
            iVar.f55628c.h();
            iVar.d.h();
        }
        return iVar.f55630f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f55619c;
        if (!iVar.f55631n && !iVar.f55633s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
