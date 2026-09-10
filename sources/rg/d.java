package rg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class d implements Runnable {
    public final int f41479a;
    public final f f41480b;

    public d(f fVar, int i10) {
        this.f41479a = i10;
        this.f41480b = fVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f41479a) {
            case 0:
                f fVar = this.f41480b;
                AnimatorSet animatorSet = fVar.T;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = fVar.S) != null && valueAnimator.isRunning())) {
                    fVar.h(fVar.I);
                    return;
                } else {
                    fVar.k();
                    return;
                }
            default:
                this.f41480b.i();
                return;
        }
    }
}
