package org.telegram.ui;
public final class u91 implements Runnable {
    public final int f43204a;
    public final StickersActivity f43205b;

    public u91(StickersActivity stickersActivity, int i10) {
        this.f43204a = i10;
        this.f43205b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f43204a) {
            case 0:
                this.f43205b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f43205b;
                stickersActivity.f36257r--;
                return;
        }
    }
}
