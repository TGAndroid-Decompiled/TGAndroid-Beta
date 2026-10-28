package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class g extends AnimatorListenerAdapter {
    public final int f48251a;
    public final j f48252b;

    public g(j jVar, int i10) {
        this.f48251a = i10;
        this.f48252b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48251a) {
            case 0:
                j jVar = this.f48252b;
                if (animator == jVar.f48279a0) {
                    jVar.f48279a0 = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f48252b;
                if (animator == jVar2.f48281b0) {
                    jVar2.f48281b0 = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f48252b;
                if (animator == jVar3.P) {
                    jVar3.P = null;
                    jVar3.O = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f48252b;
                if (animator == jVar4.Q) {
                    jVar4.Q = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f48252b;
                if (!jVar5.f48293l0) {
                    AndroidUtilities.removeFromParent(jVar5.H);
                    jVar5.H = null;
                    return;
                }
                return;
        }
    }
}
