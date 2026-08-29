package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class wq extends f2.l {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final jr G;

    public wq(jr jrVar) {
        this.G = jrVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f39624c.invalidate();
    }

    @Override
    public final void P(f2.n1 n1Var) {
        this.G.f39624c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f6405p.isEmpty();
        boolean isEmpty2 = this.f6407r.isEmpty();
        boolean isEmpty3 = this.f6408s.isEmpty();
        boolean isEmpty4 = this.f6406q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
