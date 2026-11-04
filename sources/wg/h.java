package wg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.jj0;
public final class h implements GestureDetector.OnGestureListener {
    public final int f57653a;
    public final m f57654b;

    public h(m mVar, int i3) {
        this.f57654b = mVar;
        this.f57653a = i3;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m mVar = this.f57654b;
        ValueAnimator valueAnimator = mVar.f57670d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            mVar.f57670d0.cancel();
            mVar.f57670d0 = null;
        }
        AnimatorSet animatorSet = mVar.f57672e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            mVar.f57672e0.cancel();
            mVar.f57672e0 = null;
        }
        g0.r(mVar.f57674f0);
        mVar.f57664a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f57654b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int i3 = this.f57653a;
        m mVar = this.f57654b;
        if (i3 == 4) {
            f fVar = mVar.f57666b;
            fVar.d -= f10 * 0.5f;
            fVar.f57634i -= f11 * 0.05f;
            return true;
        }
        f fVar2 = mVar.f57666b;
        fVar2.d = (f10 * 0.5f) + fVar2.d;
        fVar2.f57634i = (f11 * 0.05f) + fVar2.f57634i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f57654b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.f21385b;
        g0.i3(new jj0(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
