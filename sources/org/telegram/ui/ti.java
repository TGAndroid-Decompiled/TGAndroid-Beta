package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ti extends AnimatorListenerAdapter {
    public final int f41545a;
    public final xn f41546b;

    public ti(xn xnVar, int i10) {
        this.f41545a = i10;
        this.f41546b = xnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qj qjVar;
        switch (this.f41545a) {
            case 0:
                xn xnVar = this.f41546b;
                dl dlVar = xnVar.Y2;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(false);
                    xnVar.Y2.h(true);
                    xnVar.Y2.setVisibility(4);
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f41546b;
                xnVar2.f43390x9 = AndroidUtilities.dp(30.0f);
                xnVar2.o9();
                return;
            case 2:
                xn xnVar3 = this.f41546b;
                if (xnVar3.fragmentView != null && (qjVar = xnVar3.f43340u0) != null) {
                    qjVar.invalidate();
                    xnVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f41546b.M.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new zi(this, 3), 2000L);
                return;
            case 5:
                xn xnVar4 = this.f41546b;
                if (animator.equals(xnVar4.f43133d3)) {
                    xnVar4.f43133d3 = null;
                    return;
                }
                return;
            case 6:
                xn xnVar5 = this.f41546b;
                if (animator.equals(xnVar5.f43133d3)) {
                    xnVar5.f43133d3 = null;
                    return;
                }
                return;
            case 7:
                xn xnVar6 = this.f41546b;
                if (animator.equals(xnVar6.f43147e3)) {
                    xnVar6.f43160f3 = 1.0f;
                    xnVar6.lc();
                    xnVar6.f43147e3 = null;
                    return;
                }
                return;
            case 8:
                xn xnVar7 = this.f41546b;
                if (animator.equals(xnVar7.f43147e3)) {
                    xnVar7.f43160f3 = 0.0f;
                    xnVar7.lc();
                    xnVar7.f43147e3 = null;
                    return;
                }
                return;
            case 9:
                this.f41546b.Q4 = null;
                return;
            case 10:
                xn xnVar8 = this.f41546b;
                xnVar8.Aa = 1.0f;
                xnVar8.V.setVisibility(4);
                xnVar8.L0.setVisibility(4);
                xnVar8.o9();
                return;
            default:
                xn xnVar9 = this.f41546b;
                xnVar9.Aa = 0.0f;
                xnVar9.o9();
                return;
        }
    }
}
