package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class g extends AnimatorListenerAdapter {
    public final int f48206a;
    public final j f48207b;

    public g(j jVar, int i10) {
        this.f48206a = i10;
        this.f48207b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48206a) {
            case 0:
                j jVar = this.f48207b;
                if (animator == jVar.f48241a0) {
                    jVar.f48241a0 = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f48207b;
                if (animator == jVar2.f48243b0) {
                    jVar2.f48243b0 = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f48207b;
                if (animator == jVar3.P) {
                    jVar3.P = null;
                    jVar3.O = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f48207b;
                if (animator == jVar4.Q) {
                    jVar4.Q = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f48207b;
                if (!jVar5.f48255l0) {
                    AndroidUtilities.removeFromParent(jVar5.H);
                    jVar5.H = null;
                    return;
                }
                return;
        }
    }
}
