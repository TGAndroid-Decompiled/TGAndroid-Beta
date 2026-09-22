package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class xi extends AnimatorListenerAdapter {
    public final int f39615a;
    public final zn f39616b;

    public xi(zn znVar, int i10) {
        this.f39615a = i10;
        this.f39616b = znVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        uj ujVar;
        switch (this.f39615a) {
            case 0:
                zn znVar = this.f39616b;
                org.telegram.ui.Components.h60 h60Var = znVar.f40279b3;
                if (h60Var != null) {
                    h60Var.setIsMessageTransition(false);
                    znVar.f40279b3.c(true);
                    znVar.f40279b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f39616b;
                znVar2.A9 = AndroidUtilities.dp(30.0f);
                znVar2.o9();
                return;
            case 2:
                zn znVar3 = this.f39616b;
                if (znVar3.fragmentView != null && (ujVar = znVar3.f40551x0) != null) {
                    ujVar.invalidate();
                    znVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f39616b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new dj(this, 3), 2000L);
                return;
            case 5:
                zn znVar4 = this.f39616b;
                if (animator.equals(znVar4.f40342g3)) {
                    znVar4.f40342g3 = null;
                    return;
                }
                return;
            case 6:
                zn znVar5 = this.f39616b;
                if (animator.equals(znVar5.f40342g3)) {
                    znVar5.f40342g3 = null;
                    return;
                }
                return;
            case 7:
                zn znVar6 = this.f39616b;
                if (animator.equals(znVar6.f40354h3)) {
                    znVar6.f40366i3 = 1.0f;
                    znVar6.lc();
                    znVar6.f40354h3 = null;
                    return;
                }
                return;
            case 8:
                zn znVar7 = this.f39616b;
                if (animator.equals(znVar7.f40354h3)) {
                    znVar7.f40366i3 = 0.0f;
                    znVar7.lc();
                    znVar7.f40354h3 = null;
                    return;
                }
                return;
            case 9:
                this.f39616b.T4 = null;
                return;
            case 10:
                zn znVar8 = this.f39616b;
                znVar8.Da = 1.0f;
                znVar8.Y.setVisibility(4);
                znVar8.O0.setVisibility(4);
                znVar8.o9();
                return;
            default:
                zn znVar9 = this.f39616b;
                znVar9.Da = 0.0f;
                znVar9.o9();
                return;
        }
    }
}
