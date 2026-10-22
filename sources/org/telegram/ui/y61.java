package org.telegram.ui;
public final class y61 implements Runnable {
    public final int f43362a;
    public final SessionsActivity f43363b;
    public final boolean f43364c;

    public y61(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f43362a = i10;
        this.f43363b = sessionsActivity;
        this.f43364c = z10;
    }

    @Override
    public final void run() {
        switch (this.f43362a) {
            case 0:
                this.f43363b.k0(this.f43364c);
                return;
            default:
                this.f43363b.k0(this.f43364c);
                return;
        }
    }
}
