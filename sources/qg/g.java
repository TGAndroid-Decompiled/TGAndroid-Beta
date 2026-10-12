package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class g extends AnimatorListenerAdapter {
    public final int f46196a;
    public final j f46197b;

    public g(j jVar, int i10) {
        this.f46196a = i10;
        this.f46197b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46196a) {
            case 0:
                j jVar = this.f46197b;
                if (animator == jVar.f46228a0) {
                    jVar.f46228a0 = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f46197b;
                if (animator == jVar2.f46230b0) {
                    jVar2.f46230b0 = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f46197b;
                if (animator == jVar3.P) {
                    jVar3.P = null;
                    jVar3.O = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f46197b;
                if (animator == jVar4.Q) {
                    jVar4.Q = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f46197b;
                if (!jVar5.f46243l0) {
                    AndroidUtilities.removeFromParent(jVar5.H);
                    jVar5.H = null;
                    return;
                }
                return;
        }
    }
}
