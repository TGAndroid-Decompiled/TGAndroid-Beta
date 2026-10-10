package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class xi extends AnimatorListenerAdapter {
    public final int f44087a;
    public final zn f44088b;

    public xi(zn znVar, int i10) {
        this.f44087a = i10;
        this.f44088b = znVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        wj wjVar;
        switch (this.f44087a) {
            case 0:
                zn znVar = this.f44088b;
                org.telegram.ui.Components.z60 z60Var = znVar.f44761b3;
                if (z60Var != null) {
                    z60Var.setIsMessageTransition(false);
                    znVar.f44761b3.c(true);
                    znVar.f44761b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f44088b;
                znVar2.A9 = AndroidUtilities.dp(30.0f);
                znVar2.t9();
                return;
            case 2:
                zn znVar3 = this.f44088b;
                if (znVar3.fragmentView != null && (wjVar = znVar3.f45034x0) != null) {
                    wjVar.invalidate();
                    znVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f44088b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new cj(this, 4), 2000L);
                return;
            case 5:
                zn znVar4 = this.f44088b;
                if (animator.equals(znVar4.f44825g3)) {
                    znVar4.f44825g3 = null;
                    return;
                }
                return;
            case 6:
                zn znVar5 = this.f44088b;
                if (animator.equals(znVar5.f44825g3)) {
                    znVar5.f44825g3 = null;
                    return;
                }
                return;
            case 7:
                zn znVar6 = this.f44088b;
                if (animator.equals(znVar6.f44836h3)) {
                    znVar6.f44848i3 = 1.0f;
                    znVar6.pc();
                    znVar6.f44836h3 = null;
                    return;
                }
                return;
            case 8:
                zn znVar7 = this.f44088b;
                if (animator.equals(znVar7.f44836h3)) {
                    znVar7.f44848i3 = 0.0f;
                    znVar7.pc();
                    znVar7.f44836h3 = null;
                    return;
                }
                return;
            case 9:
                this.f44088b.T4 = null;
                return;
            case 10:
                zn znVar8 = this.f44088b;
                znVar8.Ea = 1.0f;
                znVar8.Y.setVisibility(4);
                znVar8.O0.setVisibility(4);
                znVar8.t9();
                return;
            default:
                zn znVar9 = this.f44088b;
                znVar9.Ea = 0.0f;
                znVar9.t9();
                return;
        }
    }
}
