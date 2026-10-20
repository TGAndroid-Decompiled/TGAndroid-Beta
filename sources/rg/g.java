package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class g extends AnimatorListenerAdapter {
    public final int f45355a;
    public final j f45356b;

    public g(j jVar, int i10) {
        this.f45355a = i10;
        this.f45356b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45355a) {
            case 0:
                j jVar = this.f45356b;
                if (animator == jVar.f45390a0) {
                    jVar.f45390a0 = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f45356b;
                if (animator == jVar2.f45392b0) {
                    jVar2.f45392b0 = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f45356b;
                if (animator == jVar3.P) {
                    jVar3.P = null;
                    jVar3.O = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f45356b;
                if (animator == jVar4.Q) {
                    jVar4.Q = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f45356b;
                if (!jVar5.f45404l0) {
                    AndroidUtilities.removeFromParent(jVar5.H);
                    jVar5.H = null;
                    return;
                }
                return;
        }
    }
}
