package org.telegram.ui;
public final class ta1 implements Runnable {
    public final int f38145a;
    public final StickersActivity f38146b;

    public ta1(StickersActivity stickersActivity, int i10) {
        this.f38145a = i10;
        this.f38146b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f38145a) {
            case 0:
                this.f38146b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f38146b;
                stickersActivity.f31873r--;
                return;
        }
    }
}
