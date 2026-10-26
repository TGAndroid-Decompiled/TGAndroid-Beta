package org.telegram.ui;
public final class x91 implements Runnable {
    public final int f45708a;
    public final StickersActivity f45709b;

    public x91(StickersActivity stickersActivity, int i10) {
        this.f45708a = i10;
        this.f45709b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f45708a) {
            case 0:
                this.f45709b.n0();
                return;
            default:
                StickersActivity stickersActivity = this.f45709b;
                stickersActivity.f36227n--;
                return;
        }
    }
}
