package org.telegram.ui;
public final class y61 implements Runnable {
    public final int f43363a;
    public final SessionsActivity f43364b;
    public final boolean f43365c;

    public y61(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f43363a = i10;
        this.f43364b = sessionsActivity;
        this.f43365c = z10;
    }

    @Override
    public final void run() {
        switch (this.f43363a) {
            case 0:
                this.f43364b.k0(this.f43365c);
                return;
            default:
                this.f43364b.k0(this.f43365c);
                return;
        }
    }
}
