package org.telegram.ui;
public final class yf0 implements Runnable {
    public final int f52231a;
    public final zf0 f52232b;

    public yf0(zf0 zf0Var, int i7) {
        this.f52231a = i7;
        this.f52232b = zf0Var;
    }

    @Override
    public final void run() {
        switch (this.f52231a) {
            case 0:
                this.f52232b.W = null;
                if (org.telegram.messenger.r2.f25199a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f52232b.W = null;
                if (org.telegram.messenger.r2.f25199a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
