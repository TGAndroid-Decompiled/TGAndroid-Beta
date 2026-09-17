package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class c implements Runnable {
    public final int f46514a;
    public final e f46515b;

    public c(e eVar, int i10) {
        this.f46514a = i10;
        this.f46515b = eVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f46514a) {
            case 0:
                e eVar = this.f46515b;
                AnimatorSet animatorSet = eVar.T;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = eVar.S) != null && valueAnimator.isRunning())) {
                    eVar.h(eVar.I);
                    return;
                } else {
                    eVar.k();
                    return;
                }
            default:
                this.f46515b.i();
                return;
        }
    }
}
