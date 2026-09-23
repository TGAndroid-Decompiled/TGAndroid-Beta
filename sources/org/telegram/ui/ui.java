package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ui extends AnimatorListenerAdapter {
    public final int f38115a;
    public final xn f38116b;

    public ui(xn xnVar, int i10) {
        this.f38115a = i10;
        this.f38116b = xnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        rj rjVar;
        switch (this.f38115a) {
            case 0:
                xn xnVar = this.f38116b;
                dl dlVar = xnVar.f39325b3;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(false);
                    xnVar.f39325b3.h(true);
                    xnVar.f39325b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f38116b;
                xnVar2.A9 = AndroidUtilities.dp(30.0f);
                xnVar2.o9();
                return;
            case 2:
                xn xnVar3 = this.f38116b;
                if (xnVar3.fragmentView != null && (rjVar = xnVar3.f39596x0) != null) {
                    rjVar.invalidate();
                    xnVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f38116b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new aj(this, 3), 2000L);
                return;
            case 5:
                xn xnVar4 = this.f38116b;
                if (animator.equals(xnVar4.f39388g3)) {
                    xnVar4.f39388g3 = null;
                    return;
                }
                return;
            case 6:
                xn xnVar5 = this.f38116b;
                if (animator.equals(xnVar5.f39388g3)) {
                    xnVar5.f39388g3 = null;
                    return;
                }
                return;
            case 7:
                xn xnVar6 = this.f38116b;
                if (animator.equals(xnVar6.f39399h3)) {
                    xnVar6.f39411i3 = 1.0f;
                    xnVar6.lc();
                    xnVar6.f39399h3 = null;
                    return;
                }
                return;
            case 8:
                xn xnVar7 = this.f38116b;
                if (animator.equals(xnVar7.f39399h3)) {
                    xnVar7.f39411i3 = 0.0f;
                    xnVar7.lc();
                    xnVar7.f39399h3 = null;
                    return;
                }
                return;
            case 9:
                this.f38116b.T4 = null;
                return;
            case 10:
                xn xnVar8 = this.f38116b;
                xnVar8.Da = 1.0f;
                xnVar8.Y.setVisibility(4);
                xnVar8.O0.setVisibility(4);
                xnVar8.o9();
                return;
            default:
                xn xnVar9 = this.f38116b;
                xnVar9.Da = 0.0f;
                xnVar9.o9();
                return;
        }
    }
}
