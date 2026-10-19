package org.telegram.ui;
public final class y61 implements Runnable {
    public final int f43349a;
    public final SessionsActivity f43350b;
    public final boolean f43351c;

    public y61(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f43349a = i10;
        this.f43350b = sessionsActivity;
        this.f43351c = z10;
    }

    @Override
    public final void run() {
        switch (this.f43349a) {
            case 0:
                this.f43350b.k0(this.f43351c);
                return;
            default:
                this.f43350b.k0(this.f43351c);
                return;
        }
    }
}
