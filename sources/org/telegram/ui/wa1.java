package org.telegram.ui;
public final class wa1 implements Runnable {
    public final int f42011a;
    public final StickersActivity f42012b;

    public wa1(StickersActivity stickersActivity, int i10) {
        this.f42011a = i10;
        this.f42012b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f42011a) {
            case 0:
                this.f42012b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f42012b;
                stickersActivity.f34482r--;
                return;
        }
    }
}
