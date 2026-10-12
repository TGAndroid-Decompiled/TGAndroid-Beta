package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f45729a;
    public final n f45730b;

    public j(n nVar, int i10) {
        this.f45729a = i10;
        this.f45730b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f45729a) {
            case 0:
                n nVar = this.f45730b;
                AnimatorSet animatorSet = nVar.f45739a0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.W) != null && valueAnimator.isRunning())) {
                    nVar.k(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f45730b.l();
                return;
        }
    }
}
