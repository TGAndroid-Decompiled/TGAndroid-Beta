package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class zi extends AnimatorListenerAdapter {
    public final int f39352a;
    public final eo f39353b;

    public zi(eo eoVar, int i10) {
        this.f39352a = i10;
        this.f39353b = eoVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        wj wjVar;
        switch (this.f39352a) {
            case 0:
                eo eoVar = this.f39353b;
                il ilVar = eoVar.f32271b3;
                if (ilVar != null) {
                    ilVar.setIsMessageTransition(false);
                    eoVar.f32271b3.h(true);
                    eoVar.f32271b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                eo eoVar2 = this.f39353b;
                eoVar2.A9 = AndroidUtilities.dp(30.0f);
                eoVar2.o9();
                return;
            case 2:
                eo eoVar3 = this.f39353b;
                if (eoVar3.fragmentView != null && (wjVar = eoVar3.f32542x0) != null) {
                    wjVar.invalidate();
                    eoVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f39353b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new fj(this, 3), 2000L);
                return;
            case 5:
                eo eoVar4 = this.f39353b;
                if (animator.equals(eoVar4.f32334g3)) {
                    eoVar4.f32334g3 = null;
                    return;
                }
                return;
            case 6:
                eo eoVar5 = this.f39353b;
                if (animator.equals(eoVar5.f32334g3)) {
                    eoVar5.f32334g3 = null;
                    return;
                }
                return;
            case 7:
                eo eoVar6 = this.f39353b;
                if (animator.equals(eoVar6.f32345h3)) {
                    eoVar6.f32357i3 = 1.0f;
                    eoVar6.lc();
                    eoVar6.f32345h3 = null;
                    return;
                }
                return;
            case 8:
                eo eoVar7 = this.f39353b;
                if (animator.equals(eoVar7.f32345h3)) {
                    eoVar7.f32357i3 = 0.0f;
                    eoVar7.lc();
                    eoVar7.f32345h3 = null;
                    return;
                }
                return;
            case 9:
                this.f39353b.T4 = null;
                return;
            case 10:
                eo eoVar8 = this.f39353b;
                eoVar8.Da = 1.0f;
                eoVar8.Y.setVisibility(4);
                eoVar8.O0.setVisibility(4);
                eoVar8.o9();
                return;
            default:
                eo eoVar9 = this.f39353b;
                eoVar9.Da = 0.0f;
                eoVar9.o9();
                return;
        }
    }
}
