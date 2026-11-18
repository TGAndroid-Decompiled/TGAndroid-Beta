package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.sj0;
public final class h implements GestureDetector.OnGestureListener {
    public final int f59450a;
    public final m f59451b;

    public h(m mVar, int i7) {
        this.f59451b = mVar;
        this.f59450a = i7;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m mVar = this.f59451b;
        ValueAnimator valueAnimator = mVar.f59467d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            mVar.f59467d0.cancel();
            mVar.f59467d0 = null;
        }
        AnimatorSet animatorSet = mVar.f59469e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            mVar.f59469e0.cancel();
            mVar.f59469e0 = null;
        }
        g0.r(mVar.f59471f0);
        mVar.f59461a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f59451b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int i7 = this.f59450a;
        m mVar = this.f59451b;
        if (i7 == 4) {
            f fVar = mVar.f59463b;
            fVar.d -= f10 * 0.5f;
            fVar.f59431i -= f11 * 0.05f;
            return true;
        }
        f fVar2 = mVar.f59463b;
        fVar2.d = (f10 * 0.5f) + fVar2.d;
        fVar2.f59431i = (f11 * 0.05f) + fVar2.f59431i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f59451b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.f22777b;
        g0.h3(new sj0(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
