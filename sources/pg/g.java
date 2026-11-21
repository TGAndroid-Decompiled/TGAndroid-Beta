package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float f55648a;
    public float f55649b;
    public final i f55650c;

    public g(i iVar) {
        this.f55650c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        i iVar = this.f55650c;
        if (iVar.f55661f && !iVar.f55662n) {
            r1.h hVar = iVar.f55659c.f56364m;
            if ((f10 / 7.0f) + ((float) hVar.f56372i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            hVar.f56372i = i.a(displayMetrics, f12);
            iVar.d.f56364m.f56372i = i.b(iVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) iVar.d.f56364m.f56372i));
            iVar.f55659c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.f55650c;
        int i7 = iVar.G;
        if (!iVar.f55662n) {
            g0.r(iVar.f55663r);
        }
        if (!iVar.f55661f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.f55648a = (float) iVar.f55659c.f56364m.f56372i;
            this.f55649b = (float) iVar.d.f56364m.f56372i;
            iVar.f55661f = true;
        }
        if (iVar.f55661f && !iVar.f55662n) {
            iVar.f55659c.f56364m.f56372i = (motionEvent2.getRawX() + this.f55648a) - motionEvent.getRawX();
            iVar.d.f56364m.f56372i = (motionEvent2.getRawY() + this.f55649b) - motionEvent.getRawY();
            iVar.f55659c.h();
            iVar.d.h();
        }
        return iVar.f55661f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f55650c;
        if (!iVar.f55662n && !iVar.f55664s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
