package sg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class c implements Runnable {
    public final int f43327a;
    public final e f43328b;

    public c(e eVar, int i10) {
        this.f43327a = i10;
        this.f43328b = eVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f43327a) {
            case 0:
                e eVar = this.f43328b;
                AnimatorSet animatorSet = eVar.T;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = eVar.S) != null && valueAnimator.isRunning())) {
                    eVar.h(eVar.I);
                    return;
                } else {
                    eVar.k();
                    return;
                }
            default:
                this.f43328b.i();
                return;
        }
    }
}
