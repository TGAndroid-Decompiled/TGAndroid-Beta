package org.telegram.ui;
public final class zf0 extends mi.l {
    public Runnable W;

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        yf0 yf0Var = new yf0(this, 0);
        this.W = yf0Var;
        org.telegram.messenger.g0.h3(yf0Var);
    }

    @Override
    public final void W() {
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.r2.f25212a) {
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
        yf0 yf0Var = new yf0(this, 1);
        this.W = yf0Var;
        org.telegram.messenger.g0.h3(yf0Var);
    }

    @Override
    public final void F() {
    }
}
