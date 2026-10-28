package ug;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.em0;
public final class i implements GestureDetector.OnGestureListener {
    public final int f49838a;
    public final n f49839b;

    public i(n nVar, int i10) {
        this.f49839b = nVar;
        this.f49838a = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        n nVar = this.f49839b;
        ValueAnimator valueAnimator = nVar.f49854c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            nVar.f49854c0.cancel();
            nVar.f49854c0 = null;
        }
        AnimatorSet animatorSet = nVar.f49855d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            nVar.f49855d0.cancel();
            nVar.f49855d0 = null;
        }
        AndroidUtilities.cancelRunOnUIThread(nVar.f49856e0);
        nVar.f49849a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f49839b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        int i10 = this.f49838a;
        n nVar = this.f49839b;
        if (i10 == 4) {
            g gVar = nVar.f49851b;
            gVar.d -= f7 * 0.5f;
            gVar.f49819i -= f10 * 0.05f;
            return true;
        }
        g gVar2 = nVar.f49851b;
        gVar2.d = (f7 * 0.5f) + gVar2.d;
        gVar2.f49819i = (f10 * 0.05f) + gVar2.f49819i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f49839b.getMeasuredWidth() / 2.0f;
        AndroidUtilities.runOnUIThread(new em0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
