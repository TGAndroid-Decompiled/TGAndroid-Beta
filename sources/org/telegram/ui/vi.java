package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class vi extends AnimatorListenerAdapter {
    public final int f39115a;
    public final zn f39116b;

    public vi(zn znVar, int i10) {
        this.f39115a = i10;
        this.f39116b = znVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        sj sjVar;
        switch (this.f39115a) {
            case 0:
                zn znVar = this.f39116b;
                fl flVar = znVar.Y2;
                if (flVar != null) {
                    flVar.setIsMessageTransition(false);
                    znVar.Y2.h(true);
                    znVar.Y2.setVisibility(4);
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f39116b;
                znVar2.f40809x9 = AndroidUtilities.dp(30.0f);
                znVar2.o9();
                return;
            case 2:
                zn znVar3 = this.f39116b;
                if (znVar3.fragmentView != null && (sjVar = znVar3.f40759u0) != null) {
                    sjVar.invalidate();
                    znVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f39116b.M.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new bj(this, 3), 2000L);
                return;
            case 5:
                zn znVar4 = this.f39116b;
                if (animator.equals(znVar4.f40553d3)) {
                    znVar4.f40553d3 = null;
                    return;
                }
                return;
            case 6:
                zn znVar5 = this.f39116b;
                if (animator.equals(znVar5.f40553d3)) {
                    znVar5.f40553d3 = null;
                    return;
                }
                return;
            case 7:
                zn znVar6 = this.f39116b;
                if (animator.equals(znVar6.f40566e3)) {
                    znVar6.f40579f3 = 1.0f;
                    znVar6.lc();
                    znVar6.f40566e3 = null;
                    return;
                }
                return;
            case 8:
                zn znVar7 = this.f39116b;
                if (animator.equals(znVar7.f40566e3)) {
                    znVar7.f40579f3 = 0.0f;
                    znVar7.lc();
                    znVar7.f40566e3 = null;
                    return;
                }
                return;
            case 9:
                this.f39116b.Q4 = null;
                return;
            case 10:
                zn znVar8 = this.f39116b;
                znVar8.Aa = 1.0f;
                znVar8.V.setVisibility(4);
                znVar8.L0.setVisibility(4);
                znVar8.o9();
                return;
            default:
                zn znVar9 = this.f39116b;
                znVar9.Aa = 0.0f;
                znVar9.o9();
                return;
        }
    }
}
