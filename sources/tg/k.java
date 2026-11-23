package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final int f58009a;
    public final n f58010b;

    public k(n nVar, int i7) {
        this.f58009a = i7;
        this.f58010b = nVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f58009a) {
            case 0:
                n nVar = this.f58010b;
                if (animator == nVar.f58092c0) {
                    nVar.f58092c0 = null;
                    return;
                }
                return;
            case 1:
                n nVar2 = this.f58010b;
                if (animator == nVar2.f58093d0) {
                    nVar2.f58093d0 = null;
                    return;
                }
                return;
            case 2:
                n nVar3 = this.f58010b;
                if (animator == nVar3.R) {
                    nVar3.R = null;
                    nVar3.Q = 0.0f;
                    return;
                }
                return;
            case 3:
                n nVar4 = this.f58010b;
                if (animator == nVar4.S) {
                    nVar4.S = null;
                    return;
                }
                return;
            default:
                n nVar5 = this.f58010b;
                if (!nVar5.f58105n0) {
                    org.telegram.messenger.g0.E2(nVar5.J);
                    nVar5.J = null;
                    return;
                }
                return;
        }
    }
}
