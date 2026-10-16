package org.telegram.ui;
public final class s81 implements Runnable {
    public final int f39720a;
    public final SessionsActivity f39721b;
    public final boolean f39722c;

    public s81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f39720a = i10;
        this.f39721b = sessionsActivity;
        this.f39722c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39720a) {
            case 0:
                this.f39721b.k0(this.f39722c);
                return;
            default:
                this.f39721b.k0(this.f39722c);
                return;
        }
    }
}
