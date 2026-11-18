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
    public final int f59449a;
    public final m f59450b;

    public h(m mVar, int i7) {
        this.f59450b = mVar;
        this.f59449a = i7;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m mVar = this.f59450b;
        ValueAnimator valueAnimator = mVar.f59466d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            mVar.f59466d0.cancel();
            mVar.f59466d0 = null;
        }
        AnimatorSet animatorSet = mVar.f59468e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            mVar.f59468e0.cancel();
            mVar.f59468e0 = null;
        }
        g0.r(mVar.f59470f0);
        mVar.f59460a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f59450b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int i7 = this.f59449a;
        m mVar = this.f59450b;
        if (i7 == 4) {
            f fVar = mVar.f59462b;
            fVar.d -= f10 * 0.5f;
            fVar.f59430i -= f11 * 0.05f;
            return true;
        }
        f fVar2 = mVar.f59462b;
        fVar2.d = (f10 * 0.5f) + fVar2.d;
        fVar2.f59430i = (f11 * 0.05f) + fVar2.f59430i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f59450b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.f22780b;
        g0.h3(new sj0(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
