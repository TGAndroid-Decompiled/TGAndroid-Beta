package org.telegram.ui;
public final class za1 implements Runnable {
    public final int f40125a;
    public final StickersActivity f40126b;

    public za1(StickersActivity stickersActivity, int i10) {
        this.f40125a = i10;
        this.f40126b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f40125a) {
            case 0:
                this.f40126b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f40126b;
                stickersActivity.f31513r--;
                return;
        }
    }
}
