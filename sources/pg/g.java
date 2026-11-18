package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float f55607a;
    public float f55608b;
    public final i f55609c;

    public g(i iVar) {
        this.f55609c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        i iVar = this.f55609c;
        if (iVar.f55620f && !iVar.f55621n) {
            r1.h hVar = iVar.f55618c.f56323m;
            if ((f10 / 7.0f) + ((float) hVar.f56331i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            hVar.f56331i = i.a(displayMetrics, f12);
            iVar.d.f56323m.f56331i = i.b(iVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) iVar.d.f56323m.f56331i));
            iVar.f55618c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.f55609c;
        int i7 = iVar.G;
        if (!iVar.f55621n) {
            g0.r(iVar.f55622r);
        }
        if (!iVar.f55620f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.f55607a = (float) iVar.f55618c.f56323m.f56331i;
            this.f55608b = (float) iVar.d.f56323m.f56331i;
            iVar.f55620f = true;
        }
        if (iVar.f55620f && !iVar.f55621n) {
            iVar.f55618c.f56323m.f56331i = (motionEvent2.getRawX() + this.f55607a) - motionEvent.getRawX();
            iVar.d.f56323m.f56331i = (motionEvent2.getRawY() + this.f55608b) - motionEvent.getRawY();
            iVar.f55618c.h();
            iVar.d.h();
        }
        return iVar.f55620f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f55609c;
        if (!iVar.f55621n && !iVar.f55623s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
