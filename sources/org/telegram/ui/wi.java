package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class wi extends AnimatorListenerAdapter {
    public final int f39350a;
    public final xn f39351b;

    public wi(xn xnVar, int i10) {
        this.f39350a = i10;
        this.f39351b = xnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        tj tjVar;
        switch (this.f39350a) {
            case 0:
                xn xnVar = this.f39351b;
                org.telegram.ui.Components.j60 j60Var = xnVar.f39705b3;
                if (j60Var != null) {
                    j60Var.setIsMessageTransition(false);
                    xnVar.f39705b3.c(true);
                    xnVar.f39705b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f39351b;
                xnVar2.A9 = AndroidUtilities.dp(30.0f);
                xnVar2.o9();
                return;
            case 2:
                xn xnVar3 = this.f39351b;
                if (xnVar3.fragmentView != null && (tjVar = xnVar3.f39977x0) != null) {
                    tjVar.invalidate();
                    xnVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f39351b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new cj(this, 3), 2000L);
                return;
            case 5:
                xn xnVar4 = this.f39351b;
                if (animator.equals(xnVar4.f39768g3)) {
                    xnVar4.f39768g3 = null;
                    return;
                }
                return;
            case 6:
                xn xnVar5 = this.f39351b;
                if (animator.equals(xnVar5.f39768g3)) {
                    xnVar5.f39768g3 = null;
                    return;
                }
                return;
            case 7:
                xn xnVar6 = this.f39351b;
                if (animator.equals(xnVar6.f39780h3)) {
                    xnVar6.f39792i3 = 1.0f;
                    xnVar6.lc();
                    xnVar6.f39780h3 = null;
                    return;
                }
                return;
            case 8:
                xn xnVar7 = this.f39351b;
                if (animator.equals(xnVar7.f39780h3)) {
                    xnVar7.f39792i3 = 0.0f;
                    xnVar7.lc();
                    xnVar7.f39780h3 = null;
                    return;
                }
                return;
            case 9:
                this.f39351b.T4 = null;
                return;
            case 10:
                xn xnVar8 = this.f39351b;
                xnVar8.Da = 1.0f;
                xnVar8.Y.setVisibility(4);
                xnVar8.O0.setVisibility(4);
                xnVar8.o9();
                return;
            default:
                xn xnVar9 = this.f39351b;
                xnVar9.Da = 0.0f;
                xnVar9.o9();
                return;
        }
    }
}
