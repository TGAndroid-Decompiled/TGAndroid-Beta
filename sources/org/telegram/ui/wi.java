package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class wi extends AnimatorListenerAdapter {
    public final int f39175a;
    public final zn f39176b;

    public wi(zn znVar, int i10) {
        this.f39175a = i10;
        this.f39176b = znVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        tj tjVar;
        switch (this.f39175a) {
            case 0:
                zn znVar = this.f39176b;
                org.telegram.ui.Components.f60 f60Var = znVar.f40216b3;
                if (f60Var != null) {
                    f60Var.setIsMessageTransition(false);
                    znVar.f40216b3.d(true);
                    znVar.f40216b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f39176b;
                znVar2.A9 = AndroidUtilities.dp(30.0f);
                znVar2.o9();
                return;
            case 2:
                zn znVar3 = this.f39176b;
                if (znVar3.fragmentView != null && (tjVar = znVar3.f40488x0) != null) {
                    tjVar.invalidate();
                    znVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f39176b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new cj(this, 3), 2000L);
                return;
            case 5:
                zn znVar4 = this.f39176b;
                if (animator.equals(znVar4.f40279g3)) {
                    znVar4.f40279g3 = null;
                    return;
                }
                return;
            case 6:
                zn znVar5 = this.f39176b;
                if (animator.equals(znVar5.f40279g3)) {
                    znVar5.f40279g3 = null;
                    return;
                }
                return;
            case 7:
                zn znVar6 = this.f39176b;
                if (animator.equals(znVar6.f40291h3)) {
                    znVar6.f40303i3 = 1.0f;
                    znVar6.lc();
                    znVar6.f40291h3 = null;
                    return;
                }
                return;
            case 8:
                zn znVar7 = this.f39176b;
                if (animator.equals(znVar7.f40291h3)) {
                    znVar7.f40303i3 = 0.0f;
                    znVar7.lc();
                    znVar7.f40291h3 = null;
                    return;
                }
                return;
            case 9:
                this.f39176b.T4 = null;
                return;
            case 10:
                zn znVar8 = this.f39176b;
                znVar8.Da = 1.0f;
                znVar8.Y.setVisibility(4);
                znVar8.O0.setVisibility(4);
                znVar8.o9();
                return;
            default:
                zn znVar9 = this.f39176b;
                znVar9.Da = 0.0f;
                znVar9.o9();
                return;
        }
    }
}
