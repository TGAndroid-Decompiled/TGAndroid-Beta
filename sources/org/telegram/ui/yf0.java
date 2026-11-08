package org.telegram.ui;
public final class yf0 implements Runnable {
    public final int f52211a;
    public final zf0 f52212b;

    public yf0(zf0 zf0Var, int i7) {
        this.f52211a = i7;
        this.f52212b = zf0Var;
    }

    @Override
    public final void run() {
        switch (this.f52211a) {
            case 0:
                this.f52212b.W = null;
                if (org.telegram.messenger.r2.f25212a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f52212b.W = null;
                if (org.telegram.messenger.r2.f25212a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
