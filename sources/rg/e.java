package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e extends AnimatorListenerAdapter {
    public final int f41481a;
    public final f f41482b;

    public e(f fVar, int i10) {
        this.f41481a = i10;
        this.f41482b = fVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41481a) {
            case 0:
                super.onAnimationEnd(animator);
                f fVar = this.f41482b;
                fVar.f41485b.d = 0.0f;
                fVar.T = null;
                fVar.h(fVar.I);
                return;
            case 1:
                super.onAnimationEnd(animator);
                f fVar2 = this.f41482b;
                fVar2.f41485b.d = 0.0f;
                fVar2.T = null;
                fVar2.h(fVar2.I);
                return;
            case 2:
                super.onAnimationEnd(animator);
                f fVar3 = this.f41482b;
                fVar3.f41485b.d = 0.0f;
                fVar3.T = null;
                fVar3.h(fVar3.I);
                return;
            default:
                super.onAnimationEnd(animator);
                f fVar4 = this.f41482b;
                fVar4.f41485b.d = 0.0f;
                fVar4.T = null;
                fVar4.h(fVar4.I);
                return;
        }
    }
}
