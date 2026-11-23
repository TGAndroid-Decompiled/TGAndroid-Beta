package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float f55730a;
    public float f55731b;
    public final i f55732c;

    public g(i iVar) {
        this.f55732c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        i iVar = this.f55732c;
        if (iVar.f55743f && !iVar.f55744n) {
            r1.h hVar = iVar.f55741c.f56446m;
            if ((f10 / 7.0f) + ((float) hVar.f56454i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            hVar.f56454i = i.a(displayMetrics, f12);
            iVar.d.f56446m.f56454i = i.b(iVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) iVar.d.f56446m.f56454i));
            iVar.f55741c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.f55732c;
        int i7 = iVar.G;
        if (!iVar.f55744n) {
            g0.r(iVar.f55745r);
        }
        if (!iVar.f55743f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.f55730a = (float) iVar.f55741c.f56446m.f56454i;
            this.f55731b = (float) iVar.d.f56446m.f56454i;
            iVar.f55743f = true;
        }
        if (iVar.f55743f && !iVar.f55744n) {
            iVar.f55741c.f56446m.f56454i = (motionEvent2.getRawX() + this.f55730a) - motionEvent.getRawX();
            iVar.d.f56446m.f56454i = (motionEvent2.getRawY() + this.f55731b) - motionEvent.getRawY();
            iVar.f55741c.h();
            iVar.d.h();
        }
        return iVar.f55743f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f55732c;
        if (!iVar.f55744n && !iVar.f55746s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
