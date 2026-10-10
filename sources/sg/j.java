package sg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f48111a;
    public final n f48112b;

    public j(n nVar, int i10) {
        this.f48111a = i10;
        this.f48112b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f48111a) {
            case 0:
                n nVar = this.f48112b;
                AnimatorSet animatorSet = nVar.f48121a0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.W) != null && valueAnimator.isRunning())) {
                    nVar.k(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f48112b.l();
                return;
        }
    }
}
