package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class g extends AnimatorListenerAdapter {
    public final int f46295a;
    public final j f46296b;

    public g(j jVar, int i10) {
        this.f46295a = i10;
        this.f46296b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46295a) {
            case 0:
                j jVar = this.f46296b;
                if (animator == jVar.f46327a0) {
                    jVar.f46327a0 = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f46296b;
                if (animator == jVar2.f46329b0) {
                    jVar2.f46329b0 = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f46296b;
                if (animator == jVar3.P) {
                    jVar3.P = null;
                    jVar3.O = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f46296b;
                if (animator == jVar4.Q) {
                    jVar4.Q = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f46296b;
                if (!jVar5.f46342l0) {
                    AndroidUtilities.removeFromParent(jVar5.H);
                    jVar5.H = null;
                    return;
                }
                return;
        }
    }
}
