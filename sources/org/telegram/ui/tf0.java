package org.telegram.ui;
public final class tf0 extends ni.l {
    public Runnable W;

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        sf0 sf0Var = new sf0(this, 0);
        this.W = sf0Var;
        org.telegram.messenger.g0.h3(sf0Var);
    }

    @Override
    public final void W() {
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.r2.f25040a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        sf0 sf0Var = new sf0(this, 1);
        this.W = sf0Var;
        org.telegram.messenger.g0.h3(sf0Var);
    }

    @Override
    public final void F() {
    }
}
