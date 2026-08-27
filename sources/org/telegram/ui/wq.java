package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;

public final class wq extends f2.l {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final lr G;

    public wq(lr lrVar) {
        this.G = lrVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f40185c.invalidate();
    }

    @Override
    public final void P(f2.o1 o1Var) {
        this.G.f40185c.invalidate();
    }

    @Override
    public final void m() {
        boolean zIsEmpty = this.f5738p.isEmpty();
        boolean zIsEmpty2 = this.f5740r.isEmpty();
        boolean zIsEmpty3 = this.f5741s.isEmpty();
        boolean zIsEmpty4 = this.f5739q.isEmpty();
        if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
