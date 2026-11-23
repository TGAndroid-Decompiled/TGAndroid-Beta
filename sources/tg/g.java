package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g extends AnimatorListenerAdapter {
    public final int f57854a;
    public final j f57855b;

    public g(j jVar, int i7) {
        this.f57854a = i7;
        this.f57855b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57854a) {
            case 0:
                j jVar = this.f57855b;
                if (animator == jVar.f57940b0) {
                    jVar.f57940b0 = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f57855b;
                if (animator == jVar2.f57942c0) {
                    jVar2.f57942c0 = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f57855b;
                if (animator == jVar3.Q) {
                    jVar3.Q = null;
                    jVar3.P = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f57855b;
                if (animator == jVar4.R) {
                    jVar4.R = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f57855b;
                if (!jVar5.m0) {
                    org.telegram.messenger.g0.E2(jVar5.I);
                    jVar5.I = null;
                    return;
                }
                return;
        }
    }
}
