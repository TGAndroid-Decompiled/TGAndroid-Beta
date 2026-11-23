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
    public final int f59492a;
    public final m f59493b;

    public h(m mVar, int i7) {
        this.f59493b = mVar;
        this.f59492a = i7;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m mVar = this.f59493b;
        ValueAnimator valueAnimator = mVar.f59509d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            mVar.f59509d0.cancel();
            mVar.f59509d0 = null;
        }
        AnimatorSet animatorSet = mVar.f59511e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            mVar.f59511e0.cancel();
            mVar.f59511e0 = null;
        }
        g0.r(mVar.f59513f0);
        mVar.f59503a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f59493b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int i7 = this.f59492a;
        m mVar = this.f59493b;
        if (i7 == 4) {
            f fVar = mVar.f59505b;
            fVar.d -= f10 * 0.5f;
            fVar.f59473i -= f11 * 0.05f;
            return true;
        }
        f fVar2 = mVar.f59505b;
        fVar2.d = (f10 * 0.5f) + fVar2.d;
        fVar2.f59473i = (f11 * 0.05f) + fVar2.f59473i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f59493b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.f22808b;
        g0.h3(new uj0(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
