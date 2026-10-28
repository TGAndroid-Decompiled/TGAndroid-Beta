package org.telegram.ui;
public final class z91 implements Runnable {
    public final int f46206a;
    public final StickersActivity f46207b;

    public z91(StickersActivity stickersActivity, int i10) {
        this.f46206a = i10;
        this.f46207b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f46206a) {
            case 0:
                this.f46207b.n0();
                return;
            default:
                StickersActivity stickersActivity = this.f46207b;
                stickersActivity.f36251n--;
                return;
        }
    }
}
