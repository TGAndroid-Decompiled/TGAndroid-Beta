package org.telegram.ui;
public final class r21 implements Runnable {
    public final int f51430a;
    public final SessionsActivity f51431b;
    public final boolean f51432c;

    public r21(SessionsActivity sessionsActivity, boolean z10, int i7) {
        this.f51430a = i7;
        this.f51431b = sessionsActivity;
        this.f51432c = z10;
    }

    @Override
    public final void run() {
        switch (this.f51430a) {
            case 0:
                this.f51431b.p0(this.f51432c);
                return;
            default:
                this.f51431b.p0(this.f51432c);
                return;
        }
    }
}
