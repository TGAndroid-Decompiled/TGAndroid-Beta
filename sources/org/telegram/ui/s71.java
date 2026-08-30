package org.telegram.ui;
public final class s71 implements Runnable {
    public final int f38209a;
    public final SessionsActivity f38210b;
    public final boolean f38211c;

    public s71(SessionsActivity sessionsActivity, boolean z4, int i10) {
        this.f38209a = i10;
        this.f38210b = sessionsActivity;
        this.f38211c = z4;
    }

    @Override
    public final void run() {
        switch (this.f38209a) {
            case 0:
                this.f38210b.k0(this.f38211c);
                return;
            default:
                this.f38210b.k0(this.f38211c);
                return;
        }
    }
}
