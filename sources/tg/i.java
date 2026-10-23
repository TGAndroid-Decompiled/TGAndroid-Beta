package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.em0;
public final class i implements GestureDetector.OnGestureListener {
    public final int f47534a;
    public final n f47535b;

    public i(n nVar, int i10) {
        this.f47535b = nVar;
        this.f47534a = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        n nVar = this.f47535b;
        ValueAnimator valueAnimator = nVar.f47550c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            nVar.f47550c0.cancel();
            nVar.f47550c0 = null;
        }
        AnimatorSet animatorSet = nVar.f47551d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            nVar.f47551d0.cancel();
            nVar.f47551d0 = null;
        }
        AndroidUtilities.cancelRunOnUIThread(nVar.f47552e0);
        nVar.f47545a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f47535b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        int i10 = this.f47534a;
        n nVar = this.f47535b;
        if (i10 == 4) {
            g gVar = nVar.f47547b;
            gVar.d -= f7 * 0.5f;
            gVar.f47515i -= f10 * 0.05f;
            return true;
        }
        g gVar2 = nVar.f47547b;
        gVar2.d = (f7 * 0.5f) + gVar2.d;
        gVar2.f47515i = (f10 * 0.05f) + gVar2.f47515i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f47535b.getMeasuredWidth() / 2.0f;
        AndroidUtilities.runOnUIThread(new em0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
