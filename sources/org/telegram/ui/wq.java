package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class wq extends s4.k {
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
        this.G.f38264c.invalidate();
    }

    @Override
    public final void P(s4.b1 b1Var) {
        this.G.f38264c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f45974p.isEmpty();
        boolean isEmpty2 = this.f45976r.isEmpty();
        boolean isEmpty3 = this.f45977s.isEmpty();
        boolean isEmpty4 = this.f45975q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
