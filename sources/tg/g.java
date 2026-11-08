package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g extends AnimatorListenerAdapter {
    public final int f55664a;
    public final j f55665b;

    public g(j jVar, int i7) {
        this.f55664a = i7;
        this.f55665b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55664a) {
            case 0:
                j jVar = this.f55665b;
                if (animator == jVar.f55769a0) {
                    jVar.f55769a0 = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f55665b;
                if (animator == jVar2.f55771b0) {
                    jVar2.f55771b0 = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f55665b;
                if (animator == jVar3.P) {
                    jVar3.P = null;
                    jVar3.O = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f55665b;
                if (animator == jVar4.Q) {
                    jVar4.Q = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f55665b;
                if (!jVar5.f55784l0) {
                    org.telegram.messenger.g0.E2(jVar5.H);
                    jVar5.H = null;
                    return;
                }
                return;
        }
    }
}
