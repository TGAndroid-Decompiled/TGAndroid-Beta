package sg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class c implements Runnable {
    public final int f43233a;
    public final e f43234b;

    public c(e eVar, int i10) {
        this.f43233a = i10;
        this.f43234b = eVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f43233a) {
            case 0:
                e eVar = this.f43234b;
                AnimatorSet animatorSet = eVar.T;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = eVar.S) != null && valueAnimator.isRunning())) {
                    eVar.h(eVar.I);
                    return;
                } else {
                    eVar.k();
                    return;
                }
            default:
                this.f43234b.i();
                return;
        }
    }
}
