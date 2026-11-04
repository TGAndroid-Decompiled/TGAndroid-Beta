package org.telegram.ui;
public final class sf0 implements Runnable {
    public final int f49492a;
    public final tf0 f49493b;

    public sf0(tf0 tf0Var, int i3) {
        this.f49492a = i3;
        this.f49493b = tf0Var;
    }

    @Override
    public final void run() {
        switch (this.f49492a) {
            case 0:
                this.f49493b.W = null;
                if (org.telegram.messenger.r2.f25040a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f49493b.W = null;
                if (org.telegram.messenger.r2.f25040a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
