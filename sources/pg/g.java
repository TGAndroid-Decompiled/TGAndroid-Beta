package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float f55652a;
    public float f55653b;
    public final i f55654c;

    public g(i iVar) {
        this.f55654c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        i iVar = this.f55654c;
        if (iVar.f55665f && !iVar.f55666n) {
            r1.h hVar = iVar.f55663c.f56368m;
            if ((f10 / 7.0f) + ((float) hVar.f56376i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            hVar.f56376i = i.a(displayMetrics, f12);
            iVar.d.f56368m.f56376i = i.b(iVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) iVar.d.f56368m.f56376i));
            iVar.f55663c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.f55654c;
        int i7 = iVar.G;
        if (!iVar.f55666n) {
            g0.r(iVar.f55667r);
        }
        if (!iVar.f55665f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.f55652a = (float) iVar.f55663c.f56368m.f56376i;
            this.f55653b = (float) iVar.d.f56368m.f56376i;
            iVar.f55665f = true;
        }
        if (iVar.f55665f && !iVar.f55666n) {
            iVar.f55663c.f56368m.f56376i = (motionEvent2.getRawX() + this.f55652a) - motionEvent.getRawX();
            iVar.d.f56368m.f56376i = (motionEvent2.getRawY() + this.f55653b) - motionEvent.getRawY();
            iVar.f55663c.h();
            iVar.d.h();
        }
        return iVar.f55665f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f55654c;
        if (!iVar.f55666n && !iVar.f55668s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
