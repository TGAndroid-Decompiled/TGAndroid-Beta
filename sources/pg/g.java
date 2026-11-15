package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float f55031a;
    public float f55032b;
    public final i f55033c;

    public g(i iVar) {
        this.f55033c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        i iVar = this.f55033c;
        if (iVar.f55044f && !iVar.f55045n) {
            r1.h hVar = iVar.f55042c.f55748m;
            if ((f10 / 7.0f) + ((float) hVar.f55756i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            hVar.f55756i = i.a(displayMetrics, f12);
            iVar.d.f55748m.f55756i = i.b(iVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) iVar.d.f55748m.f55756i));
            iVar.f55042c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.f55033c;
        int i7 = iVar.G;
        if (!iVar.f55045n) {
            g0.r(iVar.f55046r);
        }
        if (!iVar.f55044f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.f55031a = (float) iVar.f55042c.f55748m.f55756i;
            this.f55032b = (float) iVar.d.f55748m.f55756i;
            iVar.f55044f = true;
        }
        if (iVar.f55044f && !iVar.f55045n) {
            iVar.f55042c.f55748m.f55756i = (motionEvent2.getRawX() + this.f55031a) - motionEvent.getRawX();
            iVar.d.f55748m.f55756i = (motionEvent2.getRawY() + this.f55032b) - motionEvent.getRawY();
            iVar.f55042c.h();
            iVar.d.h();
        }
        return iVar.f55044f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f55033c;
        if (!iVar.f55045n && !iVar.f55047s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
