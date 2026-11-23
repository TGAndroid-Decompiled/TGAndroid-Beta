package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f59459a;
    public final n f59460b;

    public j(n nVar, int i7) {
        this.f59459a = i7;
        this.f59460b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f59459a) {
            case 0:
                n nVar = this.f59460b;
                AnimatorSet animatorSet = nVar.f59476e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.f59474d0) != null && valueAnimator.isRunning())) {
                    nVar.j(nVar.M);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f59460b.l();
                return;
        }
    }
}
