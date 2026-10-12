package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class g extends AnimatorListenerAdapter {
    public final int f46188a;
    public final j f46189b;

    public g(j jVar, int i10) {
        this.f46188a = i10;
        this.f46189b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46188a) {
            case 0:
                j jVar = this.f46189b;
                if (animator == jVar.f46220a0) {
                    jVar.f46220a0 = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f46189b;
                if (animator == jVar2.f46222b0) {
                    jVar2.f46222b0 = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f46189b;
                if (animator == jVar3.P) {
                    jVar3.P = null;
                    jVar3.O = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f46189b;
                if (animator == jVar4.Q) {
                    jVar4.Q = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f46189b;
                if (!jVar5.f46235l0) {
                    AndroidUtilities.removeFromParent(jVar5.H);
                    jVar5.H = null;
                    return;
                }
                return;
        }
    }
}
