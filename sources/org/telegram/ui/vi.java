package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class vi extends AnimatorListenerAdapter {
    public final int f41763a;
    public final yn f41764b;

    public vi(yn ynVar, int i10) {
        this.f41763a = i10;
        this.f41764b = ynVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        sj sjVar;
        switch (this.f41763a) {
            case 0:
                yn ynVar = this.f41764b;
                org.telegram.ui.Components.k60 k60Var = ynVar.Z2;
                if (k60Var != null) {
                    k60Var.setIsMessageTransition(false);
                    ynVar.Z2.c(true);
                    ynVar.Z2.setVisibility(4);
                    return;
                }
                return;
            case 1:
                yn ynVar2 = this.f41764b;
                ynVar2.f43580y9 = AndroidUtilities.dp(30.0f);
                ynVar2.o9();
                return;
            case 2:
                yn ynVar3 = this.f41764b;
                if (ynVar3.fragmentView != null && (sjVar = ynVar3.f43533v0) != null) {
                    sjVar.invalidate();
                    ynVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f41764b.N.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new bj(this, 3), 2000L);
                return;
            case 5:
                yn ynVar4 = this.f41764b;
                if (animator.equals(ynVar4.f43326e3)) {
                    ynVar4.f43326e3 = null;
                    return;
                }
                return;
            case 6:
                yn ynVar5 = this.f41764b;
                if (animator.equals(ynVar5.f43326e3)) {
                    ynVar5.f43326e3 = null;
                    return;
                }
                return;
            case 7:
                yn ynVar6 = this.f41764b;
                if (animator.equals(ynVar6.f43338f3)) {
                    ynVar6.f43350g3 = 1.0f;
                    ynVar6.kc();
                    ynVar6.f43338f3 = null;
                    return;
                }
                return;
            case 8:
                yn ynVar7 = this.f41764b;
                if (animator.equals(ynVar7.f43338f3)) {
                    ynVar7.f43350g3 = 0.0f;
                    ynVar7.kc();
                    ynVar7.f43338f3 = null;
                    return;
                }
                return;
            case 9:
                this.f41764b.R4 = null;
                return;
            case 10:
                yn ynVar8 = this.f41764b;
                ynVar8.Ba = 1.0f;
                ynVar8.W.setVisibility(4);
                ynVar8.M0.setVisibility(4);
                ynVar8.o9();
                return;
            default:
                yn ynVar9 = this.f41764b;
                ynVar9.Ba = 0.0f;
                ynVar9.o9();
                return;
        }
    }
}
