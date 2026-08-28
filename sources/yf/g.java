package yf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class g extends AnimatorListenerAdapter {
    public final int f49821a;
    public final j f49822b;

    public g(j jVar, int i9) {
        this.f49821a = i9;
        this.f49822b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49821a) {
            case 0:
                j jVar = this.f49822b;
                if (animator == jVar.T) {
                    jVar.T = null;
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f49822b;
                if (animator == jVar2.U) {
                    jVar2.U = null;
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f49822b;
                if (animator == jVar3.L) {
                    jVar3.L = null;
                    jVar3.K = 0.0f;
                    return;
                }
                return;
            case 3:
                j jVar4 = this.f49822b;
                if (animator == jVar4.M) {
                    jVar4.M = null;
                    return;
                }
                return;
            default:
                j jVar5 = this.f49822b;
                if (!jVar5.f49862h0) {
                    AndroidUtilities.removeFromParent(jVar5.D);
                    jVar5.D = null;
                    return;
                }
                return;
        }
    }
}
