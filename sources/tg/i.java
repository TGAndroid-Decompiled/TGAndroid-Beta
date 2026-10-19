package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.am0;
public final class i implements GestureDetector.OnGestureListener {
    public final int f47090a;
    public final n f47091b;

    public i(n nVar, int i10) {
        this.f47091b = nVar;
        this.f47090a = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        n nVar = this.f47091b;
        ValueAnimator valueAnimator = nVar.f47106c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            nVar.f47106c0.cancel();
            nVar.f47106c0 = null;
        }
        AnimatorSet animatorSet = nVar.f47107d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            nVar.f47107d0.cancel();
            nVar.f47107d0 = null;
        }
        AndroidUtilities.cancelRunOnUIThread(nVar.f47108e0);
        nVar.f47101a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f47091b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        int i10 = this.f47090a;
        n nVar = this.f47091b;
        if (i10 == 4) {
            g gVar = nVar.f47103b;
            gVar.d -= f7 * 0.5f;
            gVar.f47071i -= f10 * 0.05f;
            return true;
        }
        g gVar2 = nVar.f47103b;
        gVar2.d = (f7 * 0.5f) + gVar2.d;
        gVar2.f47071i = (f10 * 0.05f) + gVar2.f47071i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f47091b.getMeasuredWidth() / 2.0f;
        AndroidUtilities.runOnUIThread(new am0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
