package org.telegram.ui;
public final class s21 implements Runnable {
    public final int f49629a;
    public final SessionsActivity f49630b;
    public final boolean f49631c;

    public s21(SessionsActivity sessionsActivity, boolean z9, int i7) {
        this.f49629a = i7;
        this.f49630b = sessionsActivity;
        this.f49631c = z9;
    }

    @Override
    public final void run() {
        switch (this.f49629a) {
            case 0:
                this.f49630b.p0(this.f49631c);
                return;
            default:
                this.f49630b.p0(this.f49631c);
                return;
        }
    }
}
