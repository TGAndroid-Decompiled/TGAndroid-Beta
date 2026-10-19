package org.telegram.ui;
public final class y61 implements Runnable {
    public final int f43353a;
    public final SessionsActivity f43354b;
    public final boolean f43355c;

    public y61(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f43353a = i10;
        this.f43354b = sessionsActivity;
        this.f43355c = z10;
    }

    @Override
    public final void run() {
        switch (this.f43353a) {
            case 0:
                this.f43354b.k0(this.f43355c);
                return;
            default:
                this.f43354b.k0(this.f43355c);
                return;
        }
    }
}
