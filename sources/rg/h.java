package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class h extends AnimatorListenerAdapter {
    public final int f45203a;
    public final k f45204b;

    public h(k kVar, int i10) {
        this.f45203a = i10;
        this.f45204b = kVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45203a) {
            case 0:
                k kVar = this.f45204b;
                if (animator == kVar.f45240a0) {
                    kVar.f45240a0 = null;
                    return;
                }
                return;
            case 1:
                k kVar2 = this.f45204b;
                if (animator == kVar2.f45242b0) {
                    kVar2.f45242b0 = null;
                    return;
                }
                return;
            case 2:
                k kVar3 = this.f45204b;
                if (animator == kVar3.P) {
                    kVar3.P = null;
                    kVar3.O = 0.0f;
                    return;
                }
                return;
            case 3:
                k kVar4 = this.f45204b;
                if (animator == kVar4.Q) {
                    kVar4.Q = null;
                    return;
                }
                return;
            default:
                k kVar5 = this.f45204b;
                if (!kVar5.f45255l0) {
                    AndroidUtilities.removeFromParent(kVar5.H);
                    kVar5.H = null;
                    return;
                }
                return;
        }
    }
}
