package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qy0 extends s4.l {
    public int F = -1;
    public final ProfileActivity G;

    public qy0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j10, long j11, long j12) {
        return 0L;
    }

    @Override
    public final void N() {
        AndroidUtilities.runOnUIThread(new my0(this, 1));
    }

    @Override
    public final void P(s4.e1 e1Var) {
        int i10 = ProfileActivity.R6;
        this.G.g5();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47785p.isEmpty();
        boolean isEmpty2 = this.f47787r.isEmpty();
        boolean isEmpty3 = this.f47788s.isEmpty();
        boolean isEmpty4 = this.f47786q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new b3(this, 25));
            ofFloat.setDuration(this.e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().setAnimationInProgress(this.F, null);
        }
        super.m();
    }
}
