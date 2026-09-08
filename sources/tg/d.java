package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d extends AnimatorListenerAdapter {
    public final int f46543a;
    public final e f46544b;

    public d(e eVar, int i10) {
        this.f46543a = i10;
        this.f46544b = eVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46543a) {
            case 0:
                super.onAnimationEnd(animator);
                e eVar = this.f46544b;
                eVar.f46547b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 1:
                super.onAnimationEnd(animator);
                e eVar2 = this.f46544b;
                eVar2.f46547b.d = 0.0f;
                eVar2.T = null;
                eVar2.h(eVar2.I);
                return;
            case 2:
                super.onAnimationEnd(animator);
                e eVar3 = this.f46544b;
                eVar3.f46547b.d = 0.0f;
                eVar3.T = null;
                eVar3.h(eVar3.I);
                return;
            default:
                super.onAnimationEnd(animator);
                e eVar4 = this.f46544b;
                eVar4.f46547b.d = 0.0f;
                eVar4.T = null;
                eVar4.h(eVar4.I);
                return;
        }
    }
}
