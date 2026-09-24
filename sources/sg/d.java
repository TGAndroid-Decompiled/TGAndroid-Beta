package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d extends AnimatorListenerAdapter {
    public final int f43207a;
    public final e f43208b;

    public d(e eVar, int i10) {
        this.f43207a = i10;
        this.f43208b = eVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43207a) {
            case 0:
                super.onAnimationEnd(animator);
                e eVar = this.f43208b;
                eVar.f43211b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 1:
                super.onAnimationEnd(animator);
                e eVar2 = this.f43208b;
                eVar2.f43211b.d = 0.0f;
                eVar2.T = null;
                eVar2.h(eVar2.I);
                return;
            case 2:
                super.onAnimationEnd(animator);
                e eVar3 = this.f43208b;
                eVar3.f43211b.d = 0.0f;
                eVar3.T = null;
                eVar3.h(eVar3.I);
                return;
            default:
                super.onAnimationEnd(animator);
                e eVar4 = this.f43208b;
                eVar4.f43211b.d = 0.0f;
                eVar4.T = null;
                eVar4.h(eVar4.I);
                return;
        }
    }
}
