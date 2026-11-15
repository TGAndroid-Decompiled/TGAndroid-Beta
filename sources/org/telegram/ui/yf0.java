package org.telegram.ui;
public final class yf0 implements Runnable {
    public final int f53500a;
    public final zf0 f53501b;

    public yf0(zf0 zf0Var, int i7) {
        this.f53500a = i7;
        this.f53501b = zf0Var;
    }

    @Override
    public final void run() {
        switch (this.f53500a) {
            case 0:
                this.f53501b.W = null;
                if (org.telegram.messenger.r2.f26198a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f53501b.W = null;
                if (org.telegram.messenger.r2.f26198a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
