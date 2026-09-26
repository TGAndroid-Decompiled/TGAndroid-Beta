package org.telegram.ui;
public final class ta1 implements Runnable {
    public final int f38034a;
    public final StickersActivity f38035b;

    public ta1(StickersActivity stickersActivity, int i10) {
        this.f38034a = i10;
        this.f38035b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f38034a) {
            case 0:
                this.f38035b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f38035b;
                stickersActivity.f31798r--;
                return;
        }
    }
}
