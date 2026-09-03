package org.telegram.ui;
public final class z71 implements Runnable {
    public final int f40419a;
    public final SessionsActivity f40420b;
    public final boolean f40421c;

    public z71(SessionsActivity sessionsActivity, boolean z4, int i10) {
        this.f40419a = i10;
        this.f40420b = sessionsActivity;
        this.f40421c = z4;
    }

    @Override
    public final void run() {
        switch (this.f40419a) {
            case 0:
                this.f40420b.k0(this.f40421c);
                return;
            default:
                this.f40420b.k0(this.f40421c);
                return;
        }
    }
}
