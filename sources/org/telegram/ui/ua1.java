package org.telegram.ui;
public final class ua1 implements Runnable {
    public final int f41196a;
    public final StickersActivity f41197b;

    public ua1(StickersActivity stickersActivity, int i10) {
        this.f41196a = i10;
        this.f41197b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f41196a) {
            case 0:
                this.f41197b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f41197b;
                stickersActivity.f34502r--;
                return;
        }
    }
}
