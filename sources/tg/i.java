package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dm0;
public final class i implements GestureDetector.OnGestureListener {
    public final int f47533a;
    public final n f47534b;

    public i(n nVar, int i10) {
        this.f47534b = nVar;
        this.f47533a = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        n nVar = this.f47534b;
        ValueAnimator valueAnimator = nVar.f47549c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            nVar.f47549c0.cancel();
            nVar.f47549c0 = null;
        }
        AnimatorSet animatorSet = nVar.f47550d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            nVar.f47550d0.cancel();
            nVar.f47550d0 = null;
        }
        AndroidUtilities.cancelRunOnUIThread(nVar.f47551e0);
        nVar.f47544a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f47534b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        int i10 = this.f47533a;
        n nVar = this.f47534b;
        if (i10 == 4) {
            g gVar = nVar.f47546b;
            gVar.d -= f7 * 0.5f;
            gVar.f47514i -= f10 * 0.05f;
            return true;
        }
        g gVar2 = nVar.f47546b;
        gVar2.d = (f7 * 0.5f) + gVar2.d;
        gVar2.f47514i = (f10 * 0.05f) + gVar2.f47514i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f47534b.getMeasuredWidth() / 2.0f;
        AndroidUtilities.runOnUIThread(new dm0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
