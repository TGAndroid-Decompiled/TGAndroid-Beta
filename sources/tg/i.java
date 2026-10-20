package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bm0;
public final class i implements GestureDetector.OnGestureListener {
    public final int f47095a;
    public final n f47096b;

    public i(n nVar, int i10) {
        this.f47096b = nVar;
        this.f47095a = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        n nVar = this.f47096b;
        ValueAnimator valueAnimator = nVar.f47111c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            nVar.f47111c0.cancel();
            nVar.f47111c0 = null;
        }
        AnimatorSet animatorSet = nVar.f47112d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            nVar.f47112d0.cancel();
            nVar.f47112d0 = null;
        }
        AndroidUtilities.cancelRunOnUIThread(nVar.f47113e0);
        nVar.f47106a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f47096b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        int i10 = this.f47095a;
        n nVar = this.f47096b;
        if (i10 == 4) {
            g gVar = nVar.f47108b;
            gVar.d -= f7 * 0.5f;
            gVar.f47076i -= f10 * 0.05f;
            return true;
        }
        g gVar2 = nVar.f47108b;
        gVar2.d = (f7 * 0.5f) + gVar2.d;
        gVar2.f47076i = (f10 * 0.05f) + gVar2.f47076i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f47096b.getMeasuredWidth() / 2.0f;
        AndroidUtilities.runOnUIThread(new bm0(this, ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth, 1), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
