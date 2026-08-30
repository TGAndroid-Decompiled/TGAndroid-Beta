package zf;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.k;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f47414a;
    public float f47415b;
    public final i f47416c;

    public f(i iVar) {
        this.f47416c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        DisplayMetrics displayMetrics;
        float f12;
        i iVar = this.f47416c;
        if (iVar.f47426f && !iVar.f47427n) {
            k kVar = iVar.f47425c.f16198u;
            if ((f10 / 7.0f) + ((float) kVar.f16204i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f12 = -2.1474836E9f;
            }
            kVar.f16204i = i.a(displayMetrics, f12);
            iVar.d.f16198u.f16204i = i.b(iVar.getResources().getDisplayMetrics(), (f11 / 10.0f) + ((float) iVar.d.f16198u.f16204i));
            iVar.f47425c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.f47416c;
        int i10 = iVar.C;
        if (!iVar.f47427n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f47428r);
        }
        if (!iVar.f47426f && (Math.abs(f10) >= i10 || Math.abs(f11) >= i10)) {
            this.f47414a = (float) iVar.f47425c.f16198u.f16204i;
            this.f47415b = (float) iVar.d.f16198u.f16204i;
            iVar.f47426f = true;
        }
        if (iVar.f47426f && !iVar.f47427n) {
            iVar.f47425c.f16198u.f16204i = (motionEvent2.getRawX() + this.f47414a) - motionEvent.getRawX();
            iVar.d.f16198u.f16204i = (motionEvent2.getRawY() + this.f47415b) - motionEvent.getRawY();
            iVar.f47425c.f();
            iVar.d.f();
        }
        return iVar.f47426f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f47416c;
        if (!iVar.f47427n && !iVar.f47429s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}
