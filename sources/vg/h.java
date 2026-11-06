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
    public final int f57307a;
    public final m f57308b;

    public h(m mVar, int i7) {
        this.f57308b = mVar;
        this.f57307a = i7;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m mVar = this.f57308b;
        ValueAnimator valueAnimator = mVar.f57323c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            mVar.f57323c0.cancel();
            mVar.f57323c0 = null;
        }
        AnimatorSet animatorSet = mVar.f57324d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            mVar.f57324d0.cancel();
            mVar.f57324d0 = null;
        }
        g0.r(mVar.f57326e0);
        mVar.f57318a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f57308b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int i7 = this.f57307a;
        m mVar = this.f57308b;
        if (i7 == 4) {
            f fVar = mVar.f57320b;
            fVar.d -= f10 * 0.5f;
            fVar.f57288i -= f11 * 0.05f;
            return true;
        }
        f fVar2 = mVar.f57320b;
        fVar2.d = (f10 * 0.5f) + fVar2.d;
        fVar2.f57288i = (f11 * 0.05f) + fVar2.f57288i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f57308b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.f21331b;
        g0.i3(new fj0(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
