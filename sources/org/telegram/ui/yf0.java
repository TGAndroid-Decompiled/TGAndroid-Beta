package org.telegram.ui;
public final class yf0 implements Runnable {
    public final int f53504a;
    public final zf0 f53505b;

    public yf0(zf0 zf0Var, int i7) {
        this.f53504a = i7;
        this.f53505b = zf0Var;
    }

    @Override
    public final void run() {
        switch (this.f53504a) {
            case 0:
                this.f53505b.W = null;
                if (org.telegram.messenger.r2.f26206a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f53505b.W = null;
                if (org.telegram.messenger.r2.f26206a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
