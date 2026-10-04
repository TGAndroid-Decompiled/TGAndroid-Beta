package org.telegram.ui;
public final class wa1 implements Runnable {
    public final int f42012a;
    public final StickersActivity f42013b;

    public wa1(StickersActivity stickersActivity, int i10) {
        this.f42012a = i10;
        this.f42013b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f42012a) {
            case 0:
                this.f42013b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f42013b;
                stickersActivity.f34483r--;
                return;
        }
    }
}
