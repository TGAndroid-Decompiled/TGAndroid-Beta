package org.telegram.ui;
public final class r21 implements Runnable {
    public final int f49251a;
    public final SessionsActivity f49252b;
    public final boolean f49253c;

    public r21(SessionsActivity sessionsActivity, boolean z9, int i7) {
        this.f49251a = i7;
        this.f49252b = sessionsActivity;
        this.f49253c = z9;
    }

    @Override
    public final void run() {
        switch (this.f49251a) {
            case 0:
                this.f49252b.p0(this.f49253c);
                return;
            default:
                this.f49252b.p0(this.f49253c);
                return;
        }
    }
}
