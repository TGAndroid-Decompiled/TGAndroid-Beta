package org.telegram.ui;
public final class s91 implements Runnable {
    public final int f41043a;
    public final StickersActivity f41044b;

    public s91(StickersActivity stickersActivity, int i10) {
        this.f41043a = i10;
        this.f41044b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f41043a) {
            case 0:
                this.f41044b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f41044b;
                stickersActivity.f33846r--;
                return;
        }
    }
}
