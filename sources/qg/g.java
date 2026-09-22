package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class g extends AnimatorListenerAdapter {
    public final int f41360a;
    public final j f41361b;

    public g(j jVar, int i10) {
        this.f41360a = i10;
        this.f41361b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41360a) {
            case 0:
                j jVar = this.f41361b;
                if (animator == jVar.f41394a0) {
                    jVar.f41394a0 = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f41361b;
                if (animator == jVar2.f41396b0) {
                    jVar2.f41396b0 = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f41361b;
                if (animator == jVar3.P) {
                    jVar3.P = null;
                    jVar3.O = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f41361b;
                if (animator == jVar4.Q) {
                    jVar4.Q = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f41361b;
                if (!jVar5.f41408l0) {
                    AndroidUtilities.removeFromParent(jVar5.H);
                    jVar5.H = null;
                    return;
                }
                return;
        }
    }
}
