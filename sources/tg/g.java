package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g extends AnimatorListenerAdapter {
    public final int f57266a;
    public final j f57267b;

    public g(j jVar, int i7) {
        this.f57266a = i7;
        this.f57267b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57266a) {
            case 0:
                j jVar = this.f57267b;
                if (animator == jVar.f57372b0) {
                    jVar.f57372b0 = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f57267b;
                if (animator == jVar2.f57374c0) {
                    jVar2.f57374c0 = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f57267b;
                if (animator == jVar3.Q) {
                    jVar3.Q = null;
                    jVar3.P = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f57267b;
                if (animator == jVar4.R) {
                    jVar4.R = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f57267b;
                if (!jVar5.m0) {
                    org.telegram.messenger.g0.E2(jVar5.I);
                    jVar5.I = null;
                    return;
                }
                return;
        }
    }
}
