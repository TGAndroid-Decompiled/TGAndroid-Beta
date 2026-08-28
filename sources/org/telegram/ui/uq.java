package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class uq extends f2.n {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final jr G;

    public uq(jr jrVar) {
        this.G = jrVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f39563c.invalidate();
    }

    @Override
    public final void P(f2.q1 q1Var) {
        this.G.f39563c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f5450p.isEmpty();
        boolean isEmpty2 = this.f5452r.isEmpty();
        boolean isEmpty3 = this.f5453s.isEmpty();
        boolean isEmpty4 = this.f5451q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
