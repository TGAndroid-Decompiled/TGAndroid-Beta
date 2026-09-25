package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ui extends AnimatorListenerAdapter {
    public final int f38486a;
    public final wn f38487b;

    public ui(wn wnVar, int i10) {
        this.f38486a = i10;
        this.f38487b = wnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        rj rjVar;
        switch (this.f38486a) {
            case 0:
                wn wnVar = this.f38487b;
                org.telegram.ui.Components.h60 h60Var = wnVar.f39425b3;
                if (h60Var != null) {
                    h60Var.setIsMessageTransition(false);
                    wnVar.f39425b3.c(true);
                    wnVar.f39425b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                wn wnVar2 = this.f38487b;
                wnVar2.A9 = AndroidUtilities.dp(30.0f);
                wnVar2.o9();
                return;
            case 2:
                wn wnVar3 = this.f38487b;
                if (wnVar3.fragmentView != null && (rjVar = wnVar3.f39696x0) != null) {
                    rjVar.invalidate();
                    wnVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f38487b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new aj(this, 3), 2000L);
                return;
            case 5:
                wn wnVar4 = this.f38487b;
                if (animator.equals(wnVar4.f39488g3)) {
                    wnVar4.f39488g3 = null;
                    return;
                }
                return;
            case 6:
                wn wnVar5 = this.f38487b;
                if (animator.equals(wnVar5.f39488g3)) {
                    wnVar5.f39488g3 = null;
                    return;
                }
                return;
            case 7:
                wn wnVar6 = this.f38487b;
                if (animator.equals(wnVar6.f39499h3)) {
                    wnVar6.f39511i3 = 1.0f;
                    wnVar6.lc();
                    wnVar6.f39499h3 = null;
                    return;
                }
                return;
            case 8:
                wn wnVar7 = this.f38487b;
                if (animator.equals(wnVar7.f39499h3)) {
                    wnVar7.f39511i3 = 0.0f;
                    wnVar7.lc();
                    wnVar7.f39499h3 = null;
                    return;
                }
                return;
            case 9:
                this.f38487b.T4 = null;
                return;
            case 10:
                wn wnVar8 = this.f38487b;
                wnVar8.Da = 1.0f;
                wnVar8.Y.setVisibility(4);
                wnVar8.O0.setVisibility(4);
                wnVar8.o9();
                return;
            default:
                wn wnVar9 = this.f38487b;
                wnVar9.Da = 0.0f;
                wnVar9.o9();
                return;
        }
    }
}
