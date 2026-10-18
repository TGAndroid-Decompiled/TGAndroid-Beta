package org.telegram.ui;
public final class s91 implements Runnable {
    public final int f41064a;
    public final StickersActivity f41065b;

    public s91(StickersActivity stickersActivity, int i10) {
        this.f41064a = i10;
        this.f41065b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f41064a) {
            case 0:
                this.f41065b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f41065b;
                stickersActivity.f33853r--;
                return;
        }
    }
}
