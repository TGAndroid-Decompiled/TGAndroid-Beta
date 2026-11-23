package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
public final class tu0 extends v4.k {
    public int F = -1;
    public final ProfileActivity G;

    public tu0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override
    public final void N() {
        org.telegram.messenger.g0.g3(new su0(this, 0));
    }

    @Override
    public final void P(v4.e1 e1Var) {
        RectF rectF = ProfileActivity.Z6;
        this.G.s5();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f59162p.isEmpty();
        boolean isEmpty2 = this.f59164r.isEmpty();
        boolean isEmpty3 = this.f59165s.isEmpty();
        boolean isEmpty4 = this.f59163q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a3(this, 24));
            ofFloat.setDuration(this.f59184e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().q(null, this.F, true);
        }
        super.m();
    }
}
