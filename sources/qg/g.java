package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class g extends AnimatorListenerAdapter {
    public final int f46251a;
    public final j f46252b;

    public g(j jVar, int i10) {
        this.f46251a = i10;
        this.f46252b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46251a) {
            case 0:
                j jVar = this.f46252b;
                if (animator == jVar.f46283a0) {
                    jVar.f46283a0 = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f46252b;
                if (animator == jVar2.f46285b0) {
                    jVar2.f46285b0 = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f46252b;
                if (animator == jVar3.P) {
                    jVar3.P = null;
                    jVar3.O = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f46252b;
                if (animator == jVar4.Q) {
                    jVar4.Q = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f46252b;
                if (!jVar5.f46298l0) {
                    AndroidUtilities.removeFromParent(jVar5.H);
                    jVar5.H = null;
                    return;
                }
                return;
        }
    }
}
