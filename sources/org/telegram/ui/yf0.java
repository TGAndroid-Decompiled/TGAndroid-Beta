package org.telegram.ui;
public final class yf0 implements Runnable {
    public final int f52212a;
    public final zf0 f52213b;

    public yf0(zf0 zf0Var, int i7) {
        this.f52212a = i7;
        this.f52213b = zf0Var;
    }

    @Override
    public final void run() {
        switch (this.f52212a) {
            case 0:
                this.f52213b.W = null;
                if (org.telegram.messenger.r2.f25191a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f52213b.W = null;
                if (org.telegram.messenger.r2.f25191a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
