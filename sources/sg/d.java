package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d extends AnimatorListenerAdapter {
    public final int f43256a;
    public final e f43257b;

    public d(e eVar, int i10) {
        this.f43256a = i10;
        this.f43257b = eVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43256a) {
            case 0:
                super.onAnimationEnd(animator);
                e eVar = this.f43257b;
                eVar.f43260b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 1:
                super.onAnimationEnd(animator);
                e eVar2 = this.f43257b;
                eVar2.f43260b.d = 0.0f;
                eVar2.T = null;
                eVar2.h(eVar2.I);
                return;
            case 2:
                super.onAnimationEnd(animator);
                e eVar3 = this.f43257b;
                eVar3.f43260b.d = 0.0f;
                eVar3.T = null;
                eVar3.h(eVar3.I);
                return;
            default:
                super.onAnimationEnd(animator);
                e eVar4 = this.f43257b;
                eVar4.f43260b.d = 0.0f;
                eVar4.T = null;
                eVar4.h(eVar4.I);
                return;
        }
    }
}
