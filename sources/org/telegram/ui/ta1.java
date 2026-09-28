package org.telegram.ui;
public final class ta1 implements Runnable {
    public final int f38036a;
    public final StickersActivity f38037b;

    public ta1(StickersActivity stickersActivity, int i10) {
        this.f38036a = i10;
        this.f38037b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f38036a) {
            case 0:
                this.f38037b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f38037b;
                stickersActivity.f31800r--;
                return;
        }
    }
}
