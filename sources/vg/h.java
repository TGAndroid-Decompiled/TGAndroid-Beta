package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.kj0;
public final class h implements GestureDetector.OnGestureListener {
    public final int f58880a;
    public final m f58881b;

    public h(m mVar, int i7) {
        this.f58881b = mVar;
        this.f58880a = i7;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m mVar = this.f58881b;
        ValueAnimator valueAnimator = mVar.f58897d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            mVar.f58897d0.cancel();
            mVar.f58897d0 = null;
        }
        AnimatorSet animatorSet = mVar.f58899e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            mVar.f58899e0.cancel();
            mVar.f58899e0 = null;
        }
        g0.r(mVar.f58901f0);
        mVar.f58891a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f58881b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int i7 = this.f58880a;
        m mVar = this.f58881b;
        if (i7 == 4) {
            f fVar = mVar.f58893b;
            fVar.d -= f10 * 0.5f;
            fVar.f58861i -= f11 * 0.05f;
            return true;
        }
        f fVar2 = mVar.f58893b;
        fVar2.d = (f10 * 0.5f) + fVar2.d;
        fVar2.f58861i = (f11 * 0.05f) + fVar2.f58861i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f58881b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.f22414b;
        g0.i3(new kj0(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
