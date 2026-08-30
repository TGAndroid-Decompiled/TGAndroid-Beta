package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ti extends AnimatorListenerAdapter {
    public final int f38671a;
    public final xn f38672b;

    public ti(xn xnVar, int i10) {
        this.f38671a = i10;
        this.f38672b = xnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qj qjVar;
        switch (this.f38671a) {
            case 0:
                xn xnVar = this.f38672b;
                dl dlVar = xnVar.Y2;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(false);
                    xnVar.Y2.h(true);
                    xnVar.Y2.setVisibility(4);
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f38672b;
                xnVar2.f40243x9 = AndroidUtilities.dp(30.0f);
                xnVar2.o9();
                return;
            case 2:
                xn xnVar3 = this.f38672b;
                if (xnVar3.fragmentView != null && (qjVar = xnVar3.f40193u0) != null) {
                    qjVar.invalidate();
                    xnVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f38672b.M.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new zi(this, 3), 2000L);
                return;
            case 5:
                xn xnVar4 = this.f38672b;
                if (animator.equals(xnVar4.f39987d3)) {
                    xnVar4.f39987d3 = null;
                    return;
                }
                return;
            case 6:
                xn xnVar5 = this.f38672b;
                if (animator.equals(xnVar5.f39987d3)) {
                    xnVar5.f39987d3 = null;
                    return;
                }
                return;
            case 7:
                xn xnVar6 = this.f38672b;
                if (animator.equals(xnVar6.f40000e3)) {
                    xnVar6.f40013f3 = 1.0f;
                    xnVar6.lc();
                    xnVar6.f40000e3 = null;
                    return;
                }
                return;
            case 8:
                xn xnVar7 = this.f38672b;
                if (animator.equals(xnVar7.f40000e3)) {
                    xnVar7.f40013f3 = 0.0f;
                    xnVar7.lc();
                    xnVar7.f40000e3 = null;
                    return;
                }
                return;
            case 9:
                this.f38672b.Q4 = null;
                return;
            case 10:
                xn xnVar8 = this.f38672b;
                xnVar8.Aa = 1.0f;
                xnVar8.V.setVisibility(4);
                xnVar8.L0.setVisibility(4);
                xnVar8.o9();
                return;
            default:
                xn xnVar9 = this.f38672b;
                xnVar9.Aa = 0.0f;
                xnVar9.o9();
                return;
        }
    }
}
