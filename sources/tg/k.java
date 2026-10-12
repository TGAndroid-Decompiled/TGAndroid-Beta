package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final int f45731a;
    public final n f45732b;

    public k(n nVar, int i10) {
        this.f45731a = i10;
        this.f45732b = nVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45731a) {
            case 0:
                super.onAnimationEnd(animator);
                n nVar = this.f45732b;
                nVar.f45740b.d = 0.0f;
                nVar.f45739a0 = null;
                nVar.k(nVar.L);
                return;
            case 1:
                super.onAnimationEnd(animator);
                n nVar2 = this.f45732b;
                nVar2.f45740b.d = 0.0f;
                nVar2.f45739a0 = null;
                nVar2.k(nVar2.L);
                return;
            case 2:
                super.onAnimationEnd(animator);
                n nVar3 = this.f45732b;
                nVar3.f45740b.d = 0.0f;
                nVar3.f45739a0 = null;
                nVar3.k(nVar3.L);
                return;
            default:
                super.onAnimationEnd(animator);
                n nVar4 = this.f45732b;
                nVar4.f45740b.d = 0.0f;
                nVar4.f45739a0 = null;
                nVar4.k(nVar4.L);
                return;
        }
    }
}
