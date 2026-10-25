package org.telegram.ui;
public final class x91 implements Runnable {
    public final int f45705a;
    public final StickersActivity f45706b;

    public x91(StickersActivity stickersActivity, int i10) {
        this.f45705a = i10;
        this.f45706b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f45705a) {
            case 0:
                this.f45706b.n0();
                return;
            default:
                StickersActivity stickersActivity = this.f45706b;
                stickersActivity.f36224n--;
                return;
        }
    }
}
