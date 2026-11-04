package org.telegram.ui;
public final class t41 implements Runnable {
    public final int f49697a;
    public final StickersActivity f49698b;

    public t41(StickersActivity stickersActivity, int i3) {
        this.f49697a = i3;
        this.f49698b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f49697a) {
            case 0:
                this.f49698b.r0();
                return;
            default:
                StickersActivity stickersActivity = this.f49698b;
                stickersActivity.f42002n--;
                return;
        }
    }
}
