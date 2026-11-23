package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.uj0;
public final class i implements GestureDetector.OnGestureListener {
    public final int f59457a;
    public final n f59458b;

    public i(n nVar, int i7) {
        this.f59458b = nVar;
        this.f59457a = i7;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        n nVar = this.f59458b;
        ValueAnimator valueAnimator = nVar.f59474d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            nVar.f59474d0.cancel();
            nVar.f59474d0 = null;
        }
        AnimatorSet animatorSet = nVar.f59476e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            nVar.f59476e0.cancel();
            nVar.f59476e0 = null;
        }
        g0.r(nVar.f59478f0);
        nVar.f59468a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f59458b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int i7 = this.f59457a;
        n nVar = this.f59458b;
        if (i7 == 4) {
            g gVar = nVar.f59470b;
            gVar.d -= f10 * 0.5f;
            gVar.f59438i -= f11 * 0.05f;
            return true;
        }
        g gVar2 = nVar.f59470b;
        gVar2.d = (f10 * 0.5f) + gVar2.d;
        gVar2.f59438i = (f11 * 0.05f) + gVar2.f59438i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f59458b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.f22772b;
        g0.h3(new uj0(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
