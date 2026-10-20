package org.telegram.ui;
public final class y61 implements Runnable {
    public final int f43359a;
    public final SessionsActivity f43360b;
    public final boolean f43361c;

    public y61(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f43359a = i10;
        this.f43360b = sessionsActivity;
        this.f43361c = z10;
    }

    @Override
    public final void run() {
        switch (this.f43359a) {
            case 0:
                this.f43360b.k0(this.f43361c);
                return;
            default:
                this.f43360b.k0(this.f43361c);
                return;
        }
    }
}
