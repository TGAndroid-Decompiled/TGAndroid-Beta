package org.telegram.ui;
public final class r21 implements Runnable {
    public final int f51434a;
    public final SessionsActivity f51435b;
    public final boolean f51436c;

    public r21(SessionsActivity sessionsActivity, boolean z10, int i7) {
        this.f51434a = i7;
        this.f51435b = sessionsActivity;
        this.f51436c = z10;
    }

    @Override
    public final void run() {
        switch (this.f51434a) {
            case 0:
                this.f51435b.p0(this.f51436c);
                return;
            default:
                this.f51435b.p0(this.f51436c);
                return;
        }
    }
}
