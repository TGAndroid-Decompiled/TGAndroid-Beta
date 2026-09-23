package org.telegram.ui;
public final class sa1 implements Runnable {
    public final int f37224a;
    public final StickersActivity f37225b;

    public sa1(StickersActivity stickersActivity, int i10) {
        this.f37224a = i10;
        this.f37225b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f37224a) {
            case 0:
                this.f37225b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f37225b;
                stickersActivity.f31484r--;
                return;
        }
    }
}
