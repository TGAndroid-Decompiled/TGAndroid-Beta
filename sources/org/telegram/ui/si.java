package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class si extends AnimatorListenerAdapter {
    public final int f43342a;
    public final wn f43343b;

    public si(wn wnVar, int i10) {
        this.f43342a = i10;
        this.f43343b = wnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        rj rjVar;
        switch (this.f43342a) {
            case 0:
                wn wnVar = this.f43343b;
                org.telegram.ui.Components.u60 u60Var = wnVar.f45214n3;
                if (u60Var != null) {
                    u60Var.setIsMessageTransition(false);
                    wnVar.f45214n3.c(true);
                    wnVar.f45214n3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                wn wnVar2 = this.f43343b;
                wnVar2.Q9 = AndroidUtilities.dp(30.0f);
                wnVar2.A9();
                return;
            case 2:
                wn wnVar3 = this.f43343b;
                if (wnVar3.fragmentView != null && (rjVar = wnVar3.f45339x0) != null) {
                    rjVar.invalidate();
                    wnVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f43343b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new xi(this, 4), 2000L);
                return;
            case 5:
                wn wnVar4 = this.f43343b;
                if (animator.equals(wnVar4.f45276s3)) {
                    wnVar4.f45276s3 = null;
                    return;
                }
                return;
            case 6:
                wn wnVar5 = this.f43343b;
                if (animator.equals(wnVar5.f45276s3)) {
                    wnVar5.f45276s3 = null;
                    return;
                }
                return;
            case 7:
                wn wnVar6 = this.f43343b;
                if (animator.equals(wnVar6.f45289t3)) {
                    wnVar6.f45302u3 = 1.0f;
                    wnVar6.Cc();
                    wnVar6.f45289t3 = null;
                    return;
                }
                return;
            case 8:
                wn wnVar7 = this.f43343b;
                if (animator.equals(wnVar7.f45289t3)) {
                    wnVar7.f45302u3 = 0.0f;
                    wnVar7.Cc();
                    wnVar7.f45289t3 = null;
                    return;
                }
                return;
            case 9:
                this.f43343b.f45119f5 = null;
                return;
            case 10:
                wn wnVar8 = this.f43343b;
                wnVar8.Ua = 1.0f;
                wnVar8.Y.setVisibility(4);
                wnVar8.f45046a1.setVisibility(4);
                wnVar8.A9();
                return;
            default:
                wn wnVar9 = this.f43343b;
                wnVar9.Ua = 0.0f;
                wnVar9.A9();
                return;
        }
    }
}
