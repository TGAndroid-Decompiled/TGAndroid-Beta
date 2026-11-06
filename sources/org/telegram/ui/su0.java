package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
public final class su0 extends v4.k {
    public int F = -1;
    public final ProfileActivity G;

    public su0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override
    public final void N() {
        org.telegram.messenger.g0.h3(new ru0(this, 0));
    }

    @Override
    public final void P(v4.d1 d1Var) {
        RectF rectF = ProfileActivity.S6;
        this.G.p5();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f57008p.isEmpty();
        boolean isEmpty2 = this.f57010r.isEmpty();
        boolean isEmpty3 = this.f57011s.isEmpty();
        boolean isEmpty4 = this.f57009q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a3(this, 24));
            ofFloat.setDuration(this.f57024e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().q(null, this.F, true);
        }
        super.m();
    }
}
