package sg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class c implements Runnable {
    public final int f46814a;
    public final e f46815b;

    public c(e eVar, int i10) {
        this.f46814a = i10;
        this.f46815b = eVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f46814a) {
            case 0:
                e eVar = this.f46815b;
                AnimatorSet animatorSet = eVar.T;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = eVar.S) != null && valueAnimator.isRunning())) {
                    eVar.h(eVar.I);
                    return;
                } else {
                    eVar.k();
                    return;
                }
            default:
                this.f46815b.i();
                return;
        }
    }
}
