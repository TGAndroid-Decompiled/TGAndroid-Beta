package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class xi extends AnimatorListenerAdapter {
    public final int f44043a;
    public final zn f44044b;

    public xi(zn znVar, int i10) {
        this.f44043a = i10;
        this.f44044b = znVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        wj wjVar;
        switch (this.f44043a) {
            case 0:
                zn znVar = this.f44044b;
                org.telegram.ui.Components.y60 y60Var = znVar.f44717b3;
                if (y60Var != null) {
                    y60Var.setIsMessageTransition(false);
                    znVar.f44717b3.c(true);
                    znVar.f44717b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f44044b;
                znVar2.A9 = AndroidUtilities.dp(30.0f);
                znVar2.t9();
                return;
            case 2:
                zn znVar3 = this.f44044b;
                if (znVar3.fragmentView != null && (wjVar = znVar3.f44990x0) != null) {
                    wjVar.invalidate();
                    znVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f44044b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new cj(this, 4), 2000L);
                return;
            case 5:
                zn znVar4 = this.f44044b;
                if (animator.equals(znVar4.f44781g3)) {
                    znVar4.f44781g3 = null;
                    return;
                }
                return;
            case 6:
                zn znVar5 = this.f44044b;
                if (animator.equals(znVar5.f44781g3)) {
                    znVar5.f44781g3 = null;
                    return;
                }
                return;
            case 7:
                zn znVar6 = this.f44044b;
                if (animator.equals(znVar6.f44792h3)) {
                    znVar6.f44804i3 = 1.0f;
                    znVar6.pc();
                    znVar6.f44792h3 = null;
                    return;
                }
                return;
            case 8:
                zn znVar7 = this.f44044b;
                if (animator.equals(znVar7.f44792h3)) {
                    znVar7.f44804i3 = 0.0f;
                    znVar7.pc();
                    znVar7.f44792h3 = null;
                    return;
                }
                return;
            case 9:
                this.f44044b.T4 = null;
                return;
            case 10:
                zn znVar8 = this.f44044b;
                znVar8.Ea = 1.0f;
                znVar8.Y.setVisibility(4);
                znVar8.O0.setVisibility(4);
                znVar8.t9();
                return;
            default:
                zn znVar9 = this.f44044b;
                znVar9.Ea = 0.0f;
                znVar9.t9();
                return;
        }
    }
}
