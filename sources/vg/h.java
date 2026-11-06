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
    public final int f57282a;
    public final m f57283b;

    public h(m mVar, int i7) {
        this.f57283b = mVar;
        this.f57282a = i7;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m mVar = this.f57283b;
        ValueAnimator valueAnimator = mVar.f57298c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            mVar.f57298c0.cancel();
            mVar.f57298c0 = null;
        }
        AnimatorSet animatorSet = mVar.f57299d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            mVar.f57299d0.cancel();
            mVar.f57299d0 = null;
        }
        g0.r(mVar.f57301e0);
        mVar.f57293a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f57283b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int i7 = this.f57282a;
        m mVar = this.f57283b;
        if (i7 == 4) {
            f fVar = mVar.f57295b;
            fVar.d -= f10 * 0.5f;
            fVar.f57263i -= f11 * 0.05f;
            return true;
        }
        f fVar2 = mVar.f57295b;
        fVar2.d = (f10 * 0.5f) + fVar2.d;
        fVar2.f57263i = (f11 * 0.05f) + fVar2.f57263i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f57283b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.f21331b;
        g0.i3(new fj0(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
