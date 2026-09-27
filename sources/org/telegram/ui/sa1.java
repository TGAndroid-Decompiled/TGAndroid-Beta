package org.telegram.ui;
public final class sa1 implements Runnable {
    public final int f37381a;
    public final StickersActivity f37382b;

    public sa1(StickersActivity stickersActivity, int i10) {
        this.f37381a = i10;
        this.f37382b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f37381a) {
            case 0:
                this.f37382b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f37382b;
                stickersActivity.f31801r--;
                return;
        }
    }
}
