package org.telegram.ui;
public final class u91 implements Runnable {
    public final int f42354a;
    public final StickersActivity f42355b;

    public u91(StickersActivity stickersActivity, int i10) {
        this.f42354a = i10;
        this.f42355b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f42354a) {
            case 0:
                this.f42355b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f42355b;
                stickersActivity.f34164r--;
                return;
        }
    }
}
