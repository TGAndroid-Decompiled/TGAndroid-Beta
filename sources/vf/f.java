package vf;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.k;
import org.telegram.messenger.AndroidUtilities;

public final class f extends GestureDetector.SimpleOnGestureListener {

    public float f48894a;

    public float f48895b;

    public final i f48896c;

    public f(i iVar) {
        this.f48896c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        i iVar = this.f48896c;
        if (!iVar.f48910f || iVar.f48911n) {
            return false;
        }
        k kVar = iVar.f48908c.f19147u;
        if ((f10 / 7.0f) + ((float) kVar.f19154i) >= iVar.getWidth() / 2.0f) {
            displayMetrics = iVar.getResources().getDisplayMetrics();
            f12 = 2.1474836E9f;
        } else {
            displayMetrics = iVar.getResources().getDisplayMetrics();
            f12 = -2.1474836E9f;
        }
        kVar.f19154i = i.a(displayMetrics, f12);
        iVar.d.f19147u.f19154i = i.b(iVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) iVar.d.f19147u.f19154i));
        iVar.f48908c.f();
        iVar.d.f();
        iVar.h = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.f48896c;
        int i10 = iVar.B;
        if (!iVar.f48911n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f48912r);
        }
        if (!iVar.f48910f && (Math.abs(f10) >= i10 || Math.abs(f11) >= i10)) {
            this.f48894a = (float) iVar.f48908c.f19147u.f19154i;
            this.f48895b = (float) iVar.d.f19147u.f19154i;
            iVar.f48910f = true;
        }
        if (iVar.f48910f && !iVar.f48911n) {
            iVar.f48908c.f19147u.f19154i = (motionEvent2.getRawX() + this.f48894a) - motionEvent.getRawX();
            iVar.d.f19147u.f19154i = (motionEvent2.getRawY() + this.f48895b) - motionEvent.getRawY();
            iVar.f48908c.f();
            iVar.d.f();
        }
        return iVar.f48910f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f48896c;
        if (iVar.f48911n || iVar.f48913s) {
            return false;
        }
        iVar.c(true);
        return true;
    }
}
