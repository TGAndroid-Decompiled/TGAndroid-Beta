package org.telegram.ui;
public final class s81 implements Runnable {
    public final int f39996a;
    public final SessionsActivity f39997b;
    public final boolean f39998c;

    public s81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f39996a = i10;
        this.f39997b = sessionsActivity;
        this.f39998c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39996a) {
            case 0:
                this.f39997b.k0(this.f39998c);
                return;
            default:
                this.f39997b.k0(this.f39998c);
                return;
        }
    }
}
