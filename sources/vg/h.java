package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.fj0;
public final class h implements GestureDetector.OnGestureListener {
    public final int f57398a;
    public final m f57399b;

    public h(m mVar, int i7) {
        this.f57399b = mVar;
        this.f57398a = i7;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m mVar = this.f57399b;
        ValueAnimator valueAnimator = mVar.f57414c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            mVar.f57414c0.cancel();
            mVar.f57414c0 = null;
        }
        AnimatorSet animatorSet = mVar.f57415d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            mVar.f57415d0.cancel();
            mVar.f57415d0 = null;
        }
        g0.r(mVar.f57417e0);
        mVar.f57409a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f57399b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int i7 = this.f57398a;
        m mVar = this.f57399b;
        if (i7 == 4) {
            f fVar = mVar.f57411b;
            fVar.d -= f10 * 0.5f;
            fVar.f57379i -= f11 * 0.05f;
            return true;
        }
        f fVar2 = mVar.f57411b;
        fVar2.d = (f10 * 0.5f) + fVar2.d;
        fVar2.f57379i = (f11 * 0.05f) + fVar2.f57379i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f57399b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.f21334b;
        g0.i3(new fj0(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
