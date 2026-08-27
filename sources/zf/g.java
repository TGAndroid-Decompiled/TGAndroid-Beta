package zf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class g extends AnimatorListenerAdapter {

    public final int f50413a;

    public final j f50414b;

    public g(j jVar, int i10) {
        this.f50413a = i10;
        this.f50414b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50413a) {
            case 0:
                j jVar = this.f50414b;
                if (animator == jVar.T) {
                    jVar.T = null;
                }
                break;
            case 1:
                j jVar2 = this.f50414b;
                if (animator == jVar2.U) {
                    jVar2.U = null;
                }
                break;
            case 2:
                j jVar3 = this.f50414b;
                if (animator == jVar3.L) {
                    jVar3.L = null;
                    jVar3.K = 0.0f;
                }
                break;
            case 3:
                j jVar4 = this.f50414b;
                if (animator == jVar4.M) {
                    jVar4.M = null;
                }
                break;
            default:
                j jVar5 = this.f50414b;
                if (!jVar5.f50459h0) {
                    AndroidUtilities.removeFromParent(jVar5.D);
                    jVar5.D = null;
                }
                break;
        }
    }
}
