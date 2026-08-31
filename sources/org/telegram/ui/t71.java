package org.telegram.ui;
public final class t71 implements Runnable {
    public final int f41515a;
    public final SessionsActivity f41516b;
    public final boolean f41517c;

    public t71(SessionsActivity sessionsActivity, boolean z4, int i10) {
        this.f41515a = i10;
        this.f41516b = sessionsActivity;
        this.f41517c = z4;
    }

    @Override
    public final void run() {
        switch (this.f41515a) {
            case 0:
                this.f41516b.k0(this.f41517c);
                return;
            default:
                this.f41516b.k0(this.f41517c);
                return;
        }
    }
}
