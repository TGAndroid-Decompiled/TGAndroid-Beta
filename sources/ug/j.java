package ug;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f49840a;
    public final n f49841b;

    public j(n nVar, int i10) {
        this.f49840a = i10;
        this.f49841b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f49840a) {
            case 0:
                n nVar = this.f49841b;
                AnimatorSet animatorSet = nVar.f49855d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.f49854c0) != null && valueAnimator.isRunning())) {
                    nVar.j(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f49841b.l();
                return;
        }
    }
}
