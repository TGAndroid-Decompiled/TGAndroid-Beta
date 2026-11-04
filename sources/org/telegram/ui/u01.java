package org.telegram.ui;
public final class u01 implements Runnable {
    public final int f49935a;
    public final ai.z f49936b;

    public u01(ai.z zVar, int i3) {
        this.f49935a = i3;
        this.f49936b = zVar;
    }

    @Override
    public final void run() {
        switch (this.f49935a) {
            case 0:
                org.telegram.messenger.g0.K3(((yz0) this.f49936b.f1121a2).h);
                return;
            default:
                this.f49936b.requestFocus();
                return;
        }
    }
}
