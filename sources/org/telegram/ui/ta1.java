package org.telegram.ui;
public final class ta1 implements Runnable {
    public final int f38035a;
    public final StickersActivity f38036b;

    public ta1(StickersActivity stickersActivity, int i10) {
        this.f38035a = i10;
        this.f38036b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f38035a) {
            case 0:
                this.f38036b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f38036b;
                stickersActivity.f31799r--;
                return;
        }
    }
}
