package org.telegram.ui;
public final class y71 implements Runnable {
    public final int f43569a;
    public final SessionsActivity f43570b;
    public final boolean f43571c;

    public y71(SessionsActivity sessionsActivity, boolean z4, int i10) {
        this.f43569a = i10;
        this.f43570b = sessionsActivity;
        this.f43571c = z4;
    }

    @Override
    public final void run() {
        switch (this.f43569a) {
            case 0:
                this.f43570b.k0(this.f43571c);
                return;
            default:
                this.f43570b.k0(this.f43571c);
                return;
        }
    }
}
