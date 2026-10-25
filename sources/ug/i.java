package ug;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dm0;
public final class i implements GestureDetector.OnGestureListener {
    public final int f49800a;
    public final n f49801b;

    public i(n nVar, int i10) {
        this.f49801b = nVar;
        this.f49800a = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        n nVar = this.f49801b;
        ValueAnimator valueAnimator = nVar.f49816c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            nVar.f49816c0.cancel();
            nVar.f49816c0 = null;
        }
        AnimatorSet animatorSet = nVar.f49817d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            nVar.f49817d0.cancel();
            nVar.f49817d0 = null;
        }
        AndroidUtilities.cancelRunOnUIThread(nVar.f49818e0);
        nVar.f49811a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f49801b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        int i10 = this.f49800a;
        n nVar = this.f49801b;
        if (i10 == 4) {
            g gVar = nVar.f49813b;
            gVar.d -= f7 * 0.5f;
            gVar.f49781i -= f10 * 0.05f;
            return true;
        }
        g gVar2 = nVar.f49813b;
        gVar2.d = (f7 * 0.5f) + gVar2.d;
        gVar2.f49781i = (f10 * 0.05f) + gVar2.f49781i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f49801b.getMeasuredWidth() / 2.0f;
        AndroidUtilities.runOnUIThread(new dm0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
