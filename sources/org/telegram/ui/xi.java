package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class xi extends AnimatorListenerAdapter {
    public final int f42763a;
    public final co f42764b;

    public xi(co coVar, int i10) {
        this.f42763a = i10;
        this.f42764b = coVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        uj ujVar;
        switch (this.f42763a) {
            case 0:
                co coVar = this.f42764b;
                gl glVar = coVar.f35228b3;
                if (glVar != null) {
                    glVar.setIsMessageTransition(false);
                    coVar.f35228b3.h(true);
                    coVar.f35228b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                co coVar2 = this.f42764b;
                coVar2.A9 = AndroidUtilities.dp(30.0f);
                coVar2.o9();
                return;
            case 2:
                co coVar3 = this.f42764b;
                if (coVar3.fragmentView != null && (ujVar = coVar3.f35500x0) != null) {
                    ujVar.invalidate();
                    coVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f42764b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new dj(this, 3), 2000L);
                return;
            case 5:
                co coVar4 = this.f42764b;
                if (animator.equals(coVar4.f35292g3)) {
                    coVar4.f35292g3 = null;
                    return;
                }
                return;
            case 6:
                co coVar5 = this.f42764b;
                if (animator.equals(coVar5.f35292g3)) {
                    coVar5.f35292g3 = null;
                    return;
                }
                return;
            case 7:
                co coVar6 = this.f42764b;
                if (animator.equals(coVar6.f35303h3)) {
                    coVar6.f35315i3 = 1.0f;
                    coVar6.lc();
                    coVar6.f35303h3 = null;
                    return;
                }
                return;
            case 8:
                co coVar7 = this.f42764b;
                if (animator.equals(coVar7.f35303h3)) {
                    coVar7.f35315i3 = 0.0f;
                    coVar7.lc();
                    coVar7.f35303h3 = null;
                    return;
                }
                return;
            case 9:
                this.f42764b.T4 = null;
                return;
            case 10:
                co coVar8 = this.f42764b;
                coVar8.Da = 1.0f;
                coVar8.Y.setVisibility(4);
                coVar8.O0.setVisibility(4);
                coVar8.o9();
                return;
            default:
                co coVar9 = this.f42764b;
                coVar9.Da = 0.0f;
                coVar9.o9();
                return;
        }
    }
}
