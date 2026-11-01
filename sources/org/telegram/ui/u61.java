package org.telegram.ui;
public final class u61 implements Runnable {
    public final int f41838a;
    public final StickersActivity f41839b;

    public u61(StickersActivity stickersActivity, int i10) {
        this.f41838a = i10;
        this.f41839b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f41838a) {
            case 0:
                this.f41839b.r0();
                return;
            default:
                StickersActivity stickersActivity = this.f41839b;
                stickersActivity.f34057n--;
                return;
        }
    }
}
