package org.telegram.ui;
public final class wa1 implements Runnable {
    public final int f42019a;
    public final StickersActivity f42020b;

    public wa1(StickersActivity stickersActivity, int i10) {
        this.f42019a = i10;
        this.f42020b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f42019a) {
            case 0:
                this.f42020b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f42020b;
                stickersActivity.f34489r--;
                return;
        }
    }
}
