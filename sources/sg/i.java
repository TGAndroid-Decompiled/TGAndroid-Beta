package sg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.km0;
public final class i implements GestureDetector.OnGestureListener {
    public final int f48155a;
    public final n f48156b;

    public i(n nVar, int i10) {
        this.f48156b = nVar;
        this.f48155a = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        n nVar = this.f48156b;
        ValueAnimator valueAnimator = nVar.W;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            nVar.W.cancel();
            nVar.W = null;
        }
        AnimatorSet animatorSet = nVar.f48167a0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            nVar.f48167a0.cancel();
            nVar.f48167a0 = null;
        }
        AndroidUtilities.cancelRunOnUIThread(nVar.f48169b0);
        nVar.f48166a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f48156b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        int i10 = this.f48155a;
        n nVar = this.f48156b;
        if (i10 == 4) {
            g gVar = nVar.f48168b;
            gVar.d -= f7 * 0.5f;
            gVar.f48136i -= f10 * 0.05f;
            return true;
        }
        g gVar2 = nVar.f48168b;
        gVar2.d = (f7 * 0.5f) + gVar2.d;
        gVar2.f48136i = (f10 * 0.05f) + gVar2.f48136i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f48156b.getMeasuredWidth() / 2.0f;
        AndroidUtilities.runOnUIThread(new km0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
