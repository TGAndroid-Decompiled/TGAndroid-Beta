package xf;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class g extends GestureDetector.SimpleOnGestureListener {
    public float f50131a;
    public float f50132b;
    public final j f50133c;

    public g(j jVar) {
        this.f50133c = jVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        j jVar = this.f50133c;
        if (jVar.f50145f && !jVar.f50146n) {
            l lVar = jVar.f50143c.f19045u;
            if ((f9 / 7.0f) + ((float) lVar.f19052i) >= jVar.getWidth() / 2.0f) {
                displayMetrics = jVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = jVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f19052i = j.a(displayMetrics, f11);
            jVar.d.f19045u.f19052i = j.b(jVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) jVar.d.f19045u.f19052i));
            jVar.f50143c.f();
            jVar.d.f();
            jVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        j jVar = this.f50133c;
        int i10 = jVar.B;
        if (!jVar.f50146n) {
            AndroidUtilities.cancelRunOnUIThread(jVar.f50147r);
        }
        if (!jVar.f50145f && (Math.abs(f9) >= i10 || Math.abs(f10) >= i10)) {
            this.f50131a = (float) jVar.f50143c.f19045u.f19052i;
            this.f50132b = (float) jVar.d.f19045u.f19052i;
            jVar.f50145f = true;
        }
        if (jVar.f50145f && !jVar.f50146n) {
            jVar.f50143c.f19045u.f19052i = (motionEvent2.getRawX() + this.f50131a) - motionEvent.getRawX();
            jVar.d.f19045u.f19052i = (motionEvent2.getRawY() + this.f50132b) - motionEvent.getRawY();
            jVar.f50143c.f();
            jVar.d.f();
        }
        return jVar.f50145f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j jVar = this.f50133c;
        if (!jVar.f50146n && !jVar.f50148s) {
            jVar.c(true);
            return true;
        }
        return false;
    }
}
