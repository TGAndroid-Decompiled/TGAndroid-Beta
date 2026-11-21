package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.uj0;
public final class h implements GestureDetector.OnGestureListener {
    public final int f59488a;
    public final m f59489b;

    public h(m mVar, int i7) {
        this.f59489b = mVar;
        this.f59488a = i7;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m mVar = this.f59489b;
        ValueAnimator valueAnimator = mVar.f59505d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            mVar.f59505d0.cancel();
            mVar.f59505d0 = null;
        }
        AnimatorSet animatorSet = mVar.f59507e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            mVar.f59507e0.cancel();
            mVar.f59507e0 = null;
        }
        g0.r(mVar.f59509f0);
        mVar.f59499a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f59489b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int i7 = this.f59488a;
        m mVar = this.f59489b;
        if (i7 == 4) {
            f fVar = mVar.f59501b;
            fVar.d -= f10 * 0.5f;
            fVar.f59469i -= f11 * 0.05f;
            return true;
        }
        f fVar2 = mVar.f59501b;
        fVar2.d = (f10 * 0.5f) + fVar2.d;
        fVar2.f59469i = (f11 * 0.05f) + fVar2.f59469i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f59489b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.f22805b;
        g0.h3(new uj0(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
