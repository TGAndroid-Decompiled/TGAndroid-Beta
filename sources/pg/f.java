package pg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.g0;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f53519a;
    public float f53520b;
    public final i f53521c;

    public f(i iVar) {
        this.f53521c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        i iVar = this.f53521c;
        if (iVar.f53535f && !iVar.f53536n) {
            r1.h hVar = iVar.f53533c.f54175m;
            if ((f10 / 7.0f) + ((float) hVar.f54183i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            hVar.f54183i = i.a(displayMetrics, f12);
            iVar.d.f54175m.f54183i = i.b(iVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) iVar.d.f54175m.f54183i));
            iVar.f53533c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.f53521c;
        int i7 = iVar.F;
        if (!iVar.f53536n) {
            g0.r(iVar.f53537r);
        }
        if (!iVar.f53535f && (Math.abs(f10) >= i7 || Math.abs(f11) >= i7)) {
            this.f53519a = (float) iVar.f53533c.f54175m.f54183i;
            this.f53520b = (float) iVar.d.f54175m.f54183i;
            iVar.f53535f = true;
        }
        if (iVar.f53535f && !iVar.f53536n) {
            iVar.f53533c.f54175m.f54183i = (motionEvent2.getRawX() + this.f53519a) - motionEvent.getRawX();
            iVar.d.f54175m.f54183i = (motionEvent2.getRawY() + this.f53520b) - motionEvent.getRawY();
            iVar.f53533c.h();
            iVar.d.h();
        }
        return iVar.f53535f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f53521c;
        if (!iVar.f53536n && !iVar.f53538s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
