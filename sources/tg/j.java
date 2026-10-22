package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f47100a;
    public final n f47101b;

    public j(n nVar, int i10) {
        this.f47100a = i10;
        this.f47101b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f47100a) {
            case 0:
                n nVar = this.f47101b;
                AnimatorSet animatorSet = nVar.f47115d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.f47114c0) != null && valueAnimator.isRunning())) {
                    nVar.j(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f47101b.l();
                return;
        }
    }
}
