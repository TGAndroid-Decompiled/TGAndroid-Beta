package org.telegram.ui;
public final class ta1 implements Runnable {
    public final int f38018a;
    public final StickersActivity f38019b;

    public ta1(StickersActivity stickersActivity, int i10) {
        this.f38018a = i10;
        this.f38019b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f38018a) {
            case 0:
                this.f38019b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f38019b;
                stickersActivity.f31785r--;
                return;
        }
    }
}
