package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final int f49842a;
    public final n f49843b;

    public k(n nVar, int i10) {
        this.f49842a = i10;
        this.f49843b = nVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49842a) {
            case 0:
                super.onAnimationEnd(animator);
                n nVar = this.f49843b;
                nVar.f49851b.d = 0.0f;
                nVar.f49855d0 = null;
                nVar.j(nVar.L);
                return;
            case 1:
                super.onAnimationEnd(animator);
                n nVar2 = this.f49843b;
                nVar2.f49851b.d = 0.0f;
                nVar2.f49855d0 = null;
                nVar2.j(nVar2.L);
                return;
            case 2:
                super.onAnimationEnd(animator);
                n nVar3 = this.f49843b;
                nVar3.f49851b.d = 0.0f;
                nVar3.f49855d0 = null;
                nVar3.j(nVar3.L);
                return;
            default:
                super.onAnimationEnd(animator);
                n nVar4 = this.f49843b;
                nVar4.f49851b.d = 0.0f;
                nVar4.f49855d0 = null;
                nVar4.j(nVar4.L);
                return;
        }
    }
}
