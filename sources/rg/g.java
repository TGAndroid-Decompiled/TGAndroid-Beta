package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class g extends AnimatorListenerAdapter {
    public final int f44014a;
    public final j f44015b;

    public g(j jVar, int i10) {
        this.f44014a = i10;
        this.f44015b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44014a) {
            case 0:
                j jVar = this.f44015b;
                if (animator == jVar.f44050a0) {
                    jVar.f44050a0 = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f44015b;
                if (animator == jVar2.f44052b0) {
                    jVar2.f44052b0 = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f44015b;
                if (animator == jVar3.P) {
                    jVar3.P = null;
                    jVar3.O = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f44015b;
                if (animator == jVar4.Q) {
                    jVar4.Q = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f44015b;
                if (!jVar5.f44064l0) {
                    AndroidUtilities.removeFromParent(jVar5.H);
                    jVar5.H = null;
                    return;
                }
                return;
        }
    }
}
