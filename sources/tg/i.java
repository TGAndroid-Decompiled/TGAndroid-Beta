package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.am0;
public final class i implements GestureDetector.OnGestureListener {
    public final int f47088a;
    public final n f47089b;

    public i(n nVar, int i10) {
        this.f47089b = nVar;
        this.f47088a = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        n nVar = this.f47089b;
        ValueAnimator valueAnimator = nVar.f47104c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            nVar.f47104c0.cancel();
            nVar.f47104c0 = null;
        }
        AnimatorSet animatorSet = nVar.f47105d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            nVar.f47105d0.cancel();
            nVar.f47105d0 = null;
        }
        AndroidUtilities.cancelRunOnUIThread(nVar.f47106e0);
        nVar.f47099a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f47089b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        int i10 = this.f47088a;
        n nVar = this.f47089b;
        if (i10 == 4) {
            g gVar = nVar.f47101b;
            gVar.d -= f7 * 0.5f;
            gVar.f47069i -= f10 * 0.05f;
            return true;
        }
        g gVar2 = nVar.f47101b;
        gVar2.d = (f7 * 0.5f) + gVar2.d;
        gVar2.f47069i = (f10 * 0.05f) + gVar2.f47069i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f47089b.getMeasuredWidth() / 2.0f;
        AndroidUtilities.runOnUIThread(new am0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
