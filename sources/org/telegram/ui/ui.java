package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ui extends AnimatorListenerAdapter {
    public final int f38484a;
    public final wn f38485b;

    public ui(wn wnVar, int i10) {
        this.f38484a = i10;
        this.f38485b = wnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        rj rjVar;
        switch (this.f38484a) {
            case 0:
                wn wnVar = this.f38485b;
                org.telegram.ui.Components.i60 i60Var = wnVar.f39423b3;
                if (i60Var != null) {
                    i60Var.setIsMessageTransition(false);
                    wnVar.f39423b3.c(true);
                    wnVar.f39423b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                wn wnVar2 = this.f38485b;
                wnVar2.A9 = AndroidUtilities.dp(30.0f);
                wnVar2.o9();
                return;
            case 2:
                wn wnVar3 = this.f38485b;
                if (wnVar3.fragmentView != null && (rjVar = wnVar3.f39694x0) != null) {
                    rjVar.invalidate();
                    wnVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f38485b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new aj(this, 3), 2000L);
                return;
            case 5:
                wn wnVar4 = this.f38485b;
                if (animator.equals(wnVar4.f39486g3)) {
                    wnVar4.f39486g3 = null;
                    return;
                }
                return;
            case 6:
                wn wnVar5 = this.f38485b;
                if (animator.equals(wnVar5.f39486g3)) {
                    wnVar5.f39486g3 = null;
                    return;
                }
                return;
            case 7:
                wn wnVar6 = this.f38485b;
                if (animator.equals(wnVar6.f39497h3)) {
                    wnVar6.f39509i3 = 1.0f;
                    wnVar6.lc();
                    wnVar6.f39497h3 = null;
                    return;
                }
                return;
            case 8:
                wn wnVar7 = this.f38485b;
                if (animator.equals(wnVar7.f39497h3)) {
                    wnVar7.f39509i3 = 0.0f;
                    wnVar7.lc();
                    wnVar7.f39497h3 = null;
                    return;
                }
                return;
            case 9:
                this.f38485b.T4 = null;
                return;
            case 10:
                wn wnVar8 = this.f38485b;
                wnVar8.Da = 1.0f;
                wnVar8.Y.setVisibility(4);
                wnVar8.O0.setVisibility(4);
                wnVar8.o9();
                return;
            default:
                wn wnVar9 = this.f38485b;
                wnVar9.Da = 0.0f;
                wnVar9.o9();
                return;
        }
    }
}
