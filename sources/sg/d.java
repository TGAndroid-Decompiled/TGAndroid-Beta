package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d extends AnimatorListenerAdapter {
    public final int f42929a;
    public final e f42930b;

    public d(e eVar, int i10) {
        this.f42929a = i10;
        this.f42930b = eVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42929a) {
            case 0:
                super.onAnimationEnd(animator);
                e eVar = this.f42930b;
                eVar.f42933b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 1:
                super.onAnimationEnd(animator);
                e eVar2 = this.f42930b;
                eVar2.f42933b.d = 0.0f;
                eVar2.T = null;
                eVar2.h(eVar2.I);
                return;
            case 2:
                super.onAnimationEnd(animator);
                e eVar3 = this.f42930b;
                eVar3.f42933b.d = 0.0f;
                eVar3.T = null;
                eVar3.h(eVar3.I);
                return;
            default:
                super.onAnimationEnd(animator);
                e eVar4 = this.f42930b;
                eVar4.f42933b.d = 0.0f;
                eVar4.T = null;
                eVar4.h(eVar4.I);
                return;
        }
    }
}
